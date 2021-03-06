package swe2013.management;

import java.util.ArrayList;
import java.util.Date;

import swe2013.dao.SqlBookingDAO;
import swe2013.dao.SqlRoomDAO;
import swe2013.location.*;
  
/**
 * CustomerManagement
 * Class for managing customer related activities
 * @author Anreiter Simon, Moser Victoria Dorothy, Kocman Andreas
 */
public class CustomerManagement extends UserManagement{	
	Hotel chosenHotel;
	Room chosenRoom;
	Date chosenBeginDate;
	Date chosenEndDate;
	
	/**
	 * adds a review for a specific hotel
	 * @param hotel the hotel to review
	 * @param stars the stars of the review (1-5)
	 * @param reviewText the text of the review
	 */
	public void reviewHotel(Hotel hotel, int stars, String reviewText){
		Review.reviewHotel(this.session.getUserID(), hotel.getHotelID(), reviewText, stars);
	}
	
	/**
	 * books a specific hotel room for a given time frame and hotel
	 * @param hotel the hotel to book a room in
	 * @param beginDate date of arrival
	 * @param endDate date of departure
	 * @return the room number of the room that has been booked
	 */
	public Long bookRoomForTimeFrame(Hotel hotel, Date beginDate, Date endDate){
		SqlRoomDAO roomDAO = new SqlRoomDAO();
		ArrayList<Room> rooms = roomDAO.getRoomsForHotel(hotel.getHotelID());
		
		Room chosenRoom;
		int i=0;
		
		while(i<rooms.size()){
			chosenRoom = rooms.get(i++);
			if(chosenRoom.getBookings().freeForTimeFrame(beginDate, endDate)){
				SqlBookingDAO bookingDAO = new SqlBookingDAO();
				bookingDAO.saveBooking(hotel.getHotelID(), chosenRoom.getRoomNumber(), this.session.getUserID(), beginDate, endDate);
				return chosenRoom.getRoomNumber();
			}
		}
		return null;
	}
}
