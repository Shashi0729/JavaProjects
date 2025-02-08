package com.xworkz.game.repo;

import com.xworkz.game.entity.GameEntity;

public interface GameRepo {
	public boolean onSave(GameEntity entity);
}
