package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class PlanDto {
    @Value("Business Plan")
    private String planType;
    @Value("2024-2025")
    private String duration;
    @Value("50000")
    private int budget;
    @Value("10")
    private int teamSize;
    @Value("Yes")
    private String approvedStatus;
    @Value("Marketing")
    private String department;

}
