package com.practiceflightsreservations.practiceflightsreservations.reservationscontroller;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practiceflightsreservations.practiceflightsreservations.restservice.Reservation;

@RestController
public class ReservationsController {
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/reservations")
	public ArrayList<Reservation> reservation(@RequestParam(value="flightNumber", defaultValue="TP0039") String flightNumber, @RequestParam(value="fromTo", defaultValue="Spain/Brazil") String fromTo, @RequestParam(value="firstName", defaultValue="Fernando") String firstName, @RequestParam(value="lastName", defaultValue="Silva") String lastName, @RequestParam(value="age",defaultValue="32") int age, @RequestParam(value="departureTime", defaultValue="14:30") String departureTime, @RequestParam(value="arrivalTime", defaultValue="18:30") String arrivalTime, @RequestParam(value="company", defaultValue="TAP") String company, @RequestParam(value="scales", defaultValue="false") boolean scales) {
		ArrayList<Reservation> reservationArray = new ArrayList<>();
		
		Reservation reservation1 = new Reservation(counter.incrementAndGet(), flightNumber, fromTo, firstName, lastName, age, departureTime, arrivalTime, company, scales);
		Reservation reservation2 = new Reservation(counter.incrementAndGet(), "TP1016", "Norway/China", "Manel", "Couve", 20, "10:00", "18:30", "Emirates", true);
		
		reservationArray.add(reservation1);
		reservationArray.add(reservation2);
		
		return reservationArray;
	}
}
