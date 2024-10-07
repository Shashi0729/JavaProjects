package com.xworkz.ticketbooking.runner;

import com.xworkz.ticketbooking.constant.Location;
import com.xworkz.ticketbooking.dto.PersonDetails;
import com.xworkz.ticketbooking.dto.RailwayStation;
import com.xworkz.ticketbooking.repository.TicketRepository;
import com.xworkz.ticketbooking.service.TicketService;

public class TicketRunner {

	public static void main(String[] args) {
		PersonDetails pdto = new PersonDetails();
		pdto.setName("rajesh");
		pdto.setAge(25);
		pdto.setPnumber(123456789l);
		pdto.setAdharno(124578124578l);
		pdto.setAmount(400);
		RailwayStation rdto= new RailwayStation("KSR", "12458", 2, "Bengaluru",Location.KSR, 506006, pdto);
		TicketService tser= new TicketService();
		TicketRepository trepo = new TicketRepository();
		tser.onSave(rdto);
		tser.read();
		

	}

}
