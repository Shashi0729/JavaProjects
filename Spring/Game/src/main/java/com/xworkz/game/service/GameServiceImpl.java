package com.xworkz.game.service;

import org.springframework.stereotype.Component;

import com.xworkz.game.dto.GameDto;
@Component
public class GameServiceImpl implements GameService {

	@Override
	public String onSave(GameDto dto) {
		if(dto!=null) {
			if(dto.getGameName()!=null) {
			}
			if(dto.getRating()>=3) {
			
			}
			System.out.println("Saved succesfully");
		}else {
			System.out.println("Not Saved");
		}
			return "Saved";
	
	
	}

	
}
