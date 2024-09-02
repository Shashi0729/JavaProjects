package com.xworkz.playstore.util;

import com.xworkz.playstore.Dto.PlayStoreDto;

public class PlayStoreUtil {
	
	public static boolean CheckDuplicates(PlayStoreDto[] listOfApps, PlayStoreDto Dto) {
		System.out.println("Duplicate Check");
		for(PlayStoreDto Playdto:listOfApps) {
			if(Playdto !=null && Playdto.equals(Dto)) {
				return true;
			}
			
			
		}
		return false;
	}

}
