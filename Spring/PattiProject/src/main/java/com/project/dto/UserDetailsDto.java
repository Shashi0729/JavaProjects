package com.project.dto;
import lombok.Data;
@Data
public class UserDetailsDto {
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
