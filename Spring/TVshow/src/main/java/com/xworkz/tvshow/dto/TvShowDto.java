package com.xworkz.tvshow.dto;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class TvShowDto {
	
	private int channelNo;
	private String channelName;
	private int channelAmount;
	private String showName;
	private String showHost;
	private int rating ;
	private String createdBy;
	private LocalDateTime createdOn;
	

}
