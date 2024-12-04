package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class PaperDto {
    @Value("A4")
    private String size;
    @Value("80")
    private int gsm; 
    @Value("White")
    private String color;
    @Value("500")
    private int sheets;
    @Value("50")
    private int price; 
    @Value("Text")
    private String type;

}
