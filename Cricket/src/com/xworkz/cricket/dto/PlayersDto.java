package com.xworkz.cricket.dto;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PlayersDto {
private String playerName;
private int jerseyNumber;
private double strikerate;
private int score;
private int matchesPlayed;
}
