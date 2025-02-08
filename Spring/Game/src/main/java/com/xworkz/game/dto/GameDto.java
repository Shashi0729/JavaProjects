package com.xworkz.game.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class GameDto {
	private int id;
private String gameName;
private String genre;
private String platform;
private String releaseDate;
private int rating;
private String developer;
private String publisher;
private String description;
private String createdBy;
private LocalDateTime createdOn;

}
