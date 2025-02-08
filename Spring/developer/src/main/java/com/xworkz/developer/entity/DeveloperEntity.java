package com.xworkz.developer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@Entity
@Table(name="D_Details")
@NamedQuery(name="find",query = "select e from DeveloperEntity e")
@NamedQuery(name="search",query = "select e from DeveloperEntity e where name=:dName")
//@NamedQuery(name="update", query="update DeveloperEntity e SET e.name = :name, e.contact = :contact, e.role = :role, e.pay = :pay WHERE e.id = :id")


public class DeveloperEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int contact;
	private String email;
	private String role;
	private int pay;
}
