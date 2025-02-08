package com.project.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="UserDetails")

public class UserDetailsEntity {
@GeneratedValue(strategy=GenerationType.AUTO)
@Id
private int id;

private String userName;
private String email;
private String password;
private Long contactNo;
private String dob;
private String nationality;
private String state;
private String city;
private String localAddress;
private int localAddressPincode;
private String permanentAddress;
private String permanentAddressPincode;
}
