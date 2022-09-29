package com.entity;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
	private int reservationId;
	private String username;
	private Room room;
	private Date startDate;
	private Date endDate;
	
	

	public Reservation(int reservationId, String username, Room room, Date startDate, Date endDate) {
		super();
		this.reservationId = reservationId;
		this.username = username;
		this.room = room;
		this.startDate = startDate;
		this.endDate = endDate;
		
	}

	public int getReservationId() {
		return reservationId;
	}



	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public Room getRoom() {
		return room;
	}



	public void setRoom(Room room) {
		this.room = room;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", username=" + username + ", room=" + room
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}}

	