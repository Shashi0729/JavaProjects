package com.xworks.airport.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
@Table(name="Airport")
public class AirportEntity {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String fullName;
	private String emailAddress;
	private String role;
	private String password;
}
