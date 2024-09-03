package com.xworkz.bill.dto;

import java.time.LocalDate;

import java.time.LocalTime;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class BillDto {

	private boolean billGenareted;
	private LocalDate date;
	private LocalTime time;
	private String name;
	private String typeOfBill;
	private int amount;
	private String GstType;
	private float GST;
	private LocalDate payDate;

}
