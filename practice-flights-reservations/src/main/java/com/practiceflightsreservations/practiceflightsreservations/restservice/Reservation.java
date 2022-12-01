package com.practiceflightsreservations.practiceflightsreservations.restservice;

public class Reservation {
	private long id;
	private String flightNumber;
	private String fromTo;
	private String firstName;
	private String lastName;
	private int age;
	private String departureTime;
	private String arrivalTime;
	private String company;
	private boolean scales;
	
	public Reservation(long id, String flightNumber, String fromTo, String firstName, String lastName, int age, String departureTime, String arrivalTime, String company, boolean scales) {
		this.id = id;
		this.flightNumber = flightNumber;
		this.fromTo = fromTo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.company = company;
		this.scales = scales;
	}

	public long getId() {
		return id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getFromTo() {
		return fromTo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public String getCompany() {
		return company;
	}

	public boolean isScales() {
		return scales;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setScales(boolean scales) {
		this.scales = scales;
	}
}
