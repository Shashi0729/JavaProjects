package com.xworkz.cricket.runner;

import com.xworkz.cricket.dto.PlayersDto;
import com.xworkz.cricket.repository.PlayerRepo;
import com.xworkz.cricket.repository.PlayerRepoImp;

public class PlayersRunner {

	public static void main(String[] args) {
		PlayersDto pdto=new PlayersDto("Virat",18,55.0,26942,533);
		PlayersDto rohit=new PlayersDto("rohit",45,45.0,19234,483);
		PlayersDto abd=new PlayersDto("ABD",17,52.0,20014,420);
		PlayersDto kl=new PlayersDto("KL rahul",1,49.0,7979,199);
		 PlayerRepo pRepo=new  PlayerRepoImp();
		 pRepo.onSave(pdto);
		 pRepo.onSave(rohit);
		 pRepo.onSave(abd);
		 pRepo.onSave(kl);
		 pRepo.read();
	//	 pRepo.delete(17);
		 pRepo.update(45, kl);
		 pRepo.read();
		 pRepo.runRate(1);
		 pRepo.runRate(45);
		 pRepo.runRate(18);
		 pRepo.runRate(17);
		 pRepo.moreMatches();

	}

}
