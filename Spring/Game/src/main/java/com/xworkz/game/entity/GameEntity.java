package com.xworkz.game.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Entity
@Component
public class GameEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
