package com.xworkz.ticketbooking.repository;

import com.xworkz.ticketbooking.dto.RailwayStation;

public interface TicketRepositoryInterface {
 public void onsave(RailwayStation dto);
 public void read();
}
