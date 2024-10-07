package com.xworkz.ticketbooking.dto;

import com.xworkz.ticketbooking.constant.Location;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class RailwayStation {
private	String stationName;
private String trainNo;
private	int flatForm;
private	String departure;
private	Location location;
private	int pincode;
private PersonDetails person;
}
