package com.xworkz.tvshow.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Entity
@Data
@Table(name="TvShow")
public class TvShowEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
