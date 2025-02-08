package com.xworkz.bankdetails.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BankDto {
	private int id;

	private String bankName;
	private long bankContactNo;
	private int bankIFSC;
	private String bankAddress;
	private String createdBy;
	private LocalDateTime createdOn;

	

}
