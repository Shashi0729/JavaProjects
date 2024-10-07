package com.xworkz.ticketbooking.repository;

import com.xworkz.ticketbooking.dto.RailwayStation;

public class TicketRepository implements TicketRepositoryInterface {

	private RailwayStation[] listOfDto = new RailwayStation[2];
	private int index = 0;

	@Override
	public void onsave(RailwayStation dto) {
		if (dto != null) {

			if (this.index < listOfDto.length) {
				listOfDto[index] = dto;
				index++;
				System.out.println("saved");

			}else {
				System.out.println("not saved");
				
			}
			
		}

		

	}

	@Override
	public void read() {
		for(int i=0;i<listOfDto.length;i++) {
			System.out.println(listOfDto[i]);
		}
		
	}

}
