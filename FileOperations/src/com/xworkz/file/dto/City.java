package com.xworkz.file.dto;


import java.io.Serializable;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

 public class City implements Serializable{
    private String name;
    private int population; 
}
