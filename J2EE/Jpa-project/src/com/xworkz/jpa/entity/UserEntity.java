package com.xworkz.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
@Data
@Entity
@Table
public class UserEntity implements Serializable {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	@Id
	private String name;
    
	private String Phone;
}
