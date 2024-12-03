package com.xworkz.agency.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AgencyCustomerDetails")
@NamedQuery(name="read",query="Select e from AgencyEntity e")
public class AgencyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private int password;
	@Column(name = "company_name")
	private String company_name;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private long phone;
	@Column(name = "product_name")
	private String product_name;
	@Column(name = "description")
	private String description;

}
