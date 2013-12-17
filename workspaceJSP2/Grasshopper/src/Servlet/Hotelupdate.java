package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import swe2013.dao.LocationDAO;
import swe2013.dao.SqlLocationDAO;
import swe2013.dao.SqlUserDAO;
import swe2013.dao.UserDAO;
import swe2013.location.Hotel;
import swe2013.user.Hotellier;

/**
 * Servlet implementation class Hotelupdate
 */
@WebServlet("/Hotelupdate")
public class Hotelupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hotelupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try
		{	
			System.out.println("Hotelupdate");
			HttpSession session = request.getSession();
			long hotellierID = (Long) session.getAttribute("UserID");
			System.out.println(hotellierID);
			
			int[] rooms 		= new int[2];
			double[] cost 		= new double[2];
			System.out.println("arrayspassn");
			//String 	password	= "";
			String 	name 		= request.getParameter("hotelname");
			String 	email		= request.getParameter("email");
			String 	telephone	= request.getParameter("telephone");
			rooms[0]= Integer.valueOf(request.getParameter("oneBedRoom"));
			rooms[1]= Integer.valueOf(request.getParameter("twoBedRoom"));
			cost[0]	= Double.valueOf(request.getParameter("priceOneBedRoom"));
			cost[1]	= Double.valueOf(request.getParameter("priceTwoBedRoom"));
			System.out.println("passt a nu");
			String 	street		= request.getParameter("street");
			int 	zipCode		= Integer.valueOf(request.getParameter("zipCode"));
			String 	city		= request.getParameter("city");
			String 	country		= request.getParameter("country");
			System.out.println("passt a nu 2");
			String newPW = request.getParameter("newPW");
			String oldPW = request.getParameter("oldPW");
			String repeatPW = request.getParameter("repeatPW");
			
			if (!newPW.equals(repeatPW))
				throw new IllegalArgumentException("Passwords do not match!");
			
			System.out.println("passt");
			
			LocationDAO ldao = new SqlLocationDAO();
			UserDAO udao = new SqlUserDAO();
			Hotellier hotellier = (Hotellier) udao.getUserbyID(hotellierID);
			/*if (!password.equals(hotellier.getPassword()))
				throw new IllegalArgumentException ("Password Incorrect");*/
			String password = hotellier.getPassword();
			Hotellier user	= new Hotellier(hotellier.getUsername(), hotellier.getFirstName(), 
					hotellier.getLastName(), email, telephone, zipCode, street, city, country, 
					hotellier.getSex(), password, null);
			udao.updateUser(user);
			Hotel updatedHotel=new Hotel(name);
			ldao.updateHotel(updatedHotel, ldao.getHotelbyOwner(hotellierID).getHotelID());
			
			request.setAttribute("name", name);
			request.setAttribute("rooms[0]", rooms[0]);
			request.setAttribute("rooms[1]", rooms[1]);
			request.setAttribute("cost[0]", cost[0]);
			request.setAttribute("cost[1]", cost[1]);
			request.setAttribute("email", email);
			request.setAttribute("telephone", telephone);
			request.setAttribute("street", street);
			request.setAttribute("zipCode", zipCode);
			request.setAttribute("city", city);
			request.setAttribute("country", country);

			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/Hotellieransichtdetail.jsp");
			dispatcher.forward(request, response);
			
		}
		catch (Throwable theException) 	    
			{
				System.out.println(theException); 
			}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}