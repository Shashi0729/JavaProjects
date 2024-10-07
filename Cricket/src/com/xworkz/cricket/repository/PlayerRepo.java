package com.xworkz.cricket.repository;

import com.xworkz.cricket.dto.PlayersDto;

public interface PlayerRepo {
	
	public boolean onSave(PlayersDto pDto);
	public boolean delete(int jNo);
	public boolean read();
	public boolean update(int jNo,PlayersDto element);
	public boolean runRate(int jNo);
	public boolean moreMatches();

}
