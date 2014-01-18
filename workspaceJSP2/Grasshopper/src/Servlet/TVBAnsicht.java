package Servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import swe2013.location.City;
import swe2013.location.Hotel;
import swe2013.location.Room;
import swe2013.location.Statistic;
import swe2013.dao.LocationDAO;
import swe2013.dao.RoomDAO;
import swe2013.dao.SqlLocationDAO;
import swe2013.dao.SqlRoomDAO;
import swe2013.dao.SqlUserDAO;
import swe2013.location.Review;
import swe2013.user.TourismAssociation;
import swe2013.user.User;

/**
 * Servlet implementation class TVBAnsicht
 */
@SuppressWarnings("unused")
@WebServlet("/TVBAnsicht")
public class TVBAnsicht extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TVBAnsicht() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("UserID")==null){
			response.sendRedirect("notvb.jsp");
			return;
		}
		
		int userclass=0;
		if(session.getAttribute("UserClass")==null){
			response.sendRedirect("notvb.jsp");
			return;
		}
		else
		{
			userclass = (Integer) session.getAttribute("UserClass");
		}
		
		if(userclass!=3){
			response.sendRedirect("notvb.jsp");
			return;
		}
		else
		{
		System.out.println(userclass);
		
		long taID = (Long) session.getAttribute("UserID");
		System.out.println(taID);
			
		LocationDAO dao = new SqlLocationDAO();
		
		City city = dao.getCityByAssignedTA(taID);
		System.out.println(city);
		String cityname = city.getName();
		System.out.println(cityname);
		String countryname = city.getCountry();
		System.out.println(countryname);
		
		Review review = Review.getReviewsForCity(cityname, countryname);
		//System.out.println(review);
		String reviewtext = review.getReviewText();
		System.out.println(reviewtext);
		
		
		int hotelanzahl = city.getHotels().size();
		System.out.println(hotelanzahl);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		
		String statistic = null;
		Date bd = null;
		Date ed = null;
		int bookings = 0;
		
		request.setAttribute("cityname", cityname);
		request.setAttribute("countryname", countryname);
		request.setAttribute("reviewtext", reviewtext);
		request.setAttribute("hotelanzahl", hotelanzahl);
		request.setAttribute("bookings", bookings);
		request.setAttribute("bd", bd);
		request.setAttribute("ed", ed);
		request.setAttribute("statistic", statistic);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/TVBansichtdetail.jsp");
		dispatcher.forward(request, response);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	}
	
}
