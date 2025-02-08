package com.xworkz.game.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.game.dto.GameDto;
import com.xworkz.game.entity.GameEntity;
import com.xworkz.game.repo.GameRepo;

@Component
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepo repo; 
	@Override
	public String onSave(GameDto dto) {
		GameEntity entity =new GameEntity();
		if (dto != null) {
			if (dto.getGameName() != null && dto.getRating() >= 3) {
				BeanUtils.copyProperties(dto, entity);
                repo.onSave(entity);
				System.out.println("Saved succesfully");
			} else {
				System.out.println("Not Saved");
			}
			return "Saved";

		}
		return null;

	}
}
