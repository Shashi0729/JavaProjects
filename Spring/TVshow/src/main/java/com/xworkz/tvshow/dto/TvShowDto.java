package com.xworkz.tvshow.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class TvShowDto {
	private int id;
	private int channelNo;
	private String channelName;
	private int channelAmount;
	private String showName;
	private String showHost;
	private int rating ;
	private String createdBy;
	private LocalDateTime createdOn;
	

}
