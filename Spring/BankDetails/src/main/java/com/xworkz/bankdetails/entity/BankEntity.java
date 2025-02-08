package com.xworkz.bankdetails.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Entity
@Component
public class BankEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bankName;
	private long bankContactNo;
	private int bankIFSC;
	private String bankAddress;
	private String createdBy;
	private LocalDateTime createdOn;
}
