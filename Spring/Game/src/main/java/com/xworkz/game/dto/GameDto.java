package com.xworkz.game.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class GameDto {
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
