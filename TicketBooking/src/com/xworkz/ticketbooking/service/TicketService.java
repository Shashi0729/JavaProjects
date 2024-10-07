package com.xworkz.ticketbooking.service;

import com.xworkz.ticketbooking.dto.RailwayStation;
import com.xworkz.ticketbooking.repository.TicketRepository;
import com.xworkz.ticketbooking.repository.TicketRepositoryInterface;

public class TicketService implements TicketServiceInterface {
	TicketRepositoryInterface trepo=new TicketRepository();


	@Override
	public void onSave(RailwayStation dto) {
		if(dto!=null) {
			trepo.onsave(dto);
		}
		
	}


	@Override
	public void read() {
		trepo.read();
		
	}

}
