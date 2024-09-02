package com.xworkz.playstore.Runner;

import java.time.LocalDate;

import com.xworkz.playstore.Dto.PlayStoreDto;
import com.xworkz.playstore.Service.PlayStoreServices;
import com.xworkz.playstore.constants.AppNameConstants;
import com.xworkz.playstore.constants.AppTypeConstants;

public class PlayStoreRunner {

	public static void main(String[] args) {
	
		PlayStoreDto Ecomm = new PlayStoreDto(AppNameConstants.Amazon.toString(),"100Mb",AppTypeConstants.Ecomm.toString(),LocalDate.now(),LocalDate.now());
		PlayStoreDto Game = new PlayStoreDto(AppNameConstants.Bgmi.toString(),"2.5Gb",AppTypeConstants.Game.toString(),LocalDate.of(2024, 5, 25),LocalDate.now());
		PlayStoreDto Game1 = new PlayStoreDto(AppNameConstants.Ludo.toString(),"65Mb",AppTypeConstants.Game.toString(),LocalDate.of(2024, 12, 29),LocalDate.now());
		PlayStoreServices playser = new PlayStoreServices();
		playser.Onsave(Ecomm);
		playser.Onsave(Game);
		playser.Onsave(Game1);
		System.out.println("---------------------");
		playser.ReadApps();
		System.out.println("---------------------");
		playser.SearchApps("Amazon");
		System.out.println("---------------------");
		playser.SearchAppsByType("Game");
		System.out.println("---------------------");
		playser.SearchAppsBySize("2.5Gb");
		System.out.println("---------------------");
        playser.SearchAppsByRdate("2024-12-29");
        System.out.println("---------------------");
        System.out.println("---------------------");
        playser.updateByName("Amazon", "Flipkart");
        System.out.println("........................");
        playser.SearchApps("Flipkart");
		System.out.println("---------------------");
		playser.SearchApps("Amazon");
	}

}
