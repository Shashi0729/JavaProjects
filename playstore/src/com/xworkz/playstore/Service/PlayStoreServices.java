package com.xworkz.playstore.Service;

import com.xworkz.playstore.Dto.PlayStoreDto;
import com.xworkz.playstore.util.PlayStoreUtil;

public class PlayStoreServices {

	public PlayStoreDto listOfApps[] = new PlayStoreDto[3];
	private int index = 0;

	// create

	public String Onsave(PlayStoreDto dto) {
		if (dto == null) {
			System.out.println("dto is null, cant save");
			return "not saved";

		} else {
			boolean duplicateResult = PlayStoreUtil.CheckDuplicates(listOfApps, dto);
			if (duplicateResult == false) {
				if (this.index < listOfApps.length) {

					listOfApps[index] = dto;
					index++;
					System.out.println("saved");
					return "Saved Sucessfully";

				}
			}
		}
		System.out.println("not saved");
		return "not saved";
	}

	public void ReadApps() {

		for (PlayStoreDto Appsdto : listOfApps) {
			System.out.println(Appsdto);
		}
	}

	public PlayStoreDto SearchApps(String AppName) {

		for (PlayStoreDto dto : listOfApps) {
			if (dto != null && dto.getApplicationName().equals(AppName)) {

				System.out.println(dto);
			}
		}

		return null;
	}

	public PlayStoreDto SearchAppsByType(String AppType) {

		for (PlayStoreDto dto : listOfApps) {
			if (dto != null && dto.getApplicationType().equals(AppType)) {

				System.out.println(dto);
			}
		}

		return null;
	}

	public PlayStoreDto SearchAppsBySize(String AppSize) {

		for (PlayStoreDto dto : listOfApps) {
			if (dto != null && dto.getApplicationSize().equals(AppSize)) {

				System.out.println(dto);
			}
		}

		return null;
	}

	public PlayStoreDto SearchAppsByRdate(String AppRdate) {

		for (PlayStoreDto dto : listOfApps) {
			if (dto != null && dto.getApplicationRdate().toString().equals(AppRdate)) {

				System.out.println(dto);
			}
		}

		return null;
	}
	
	public PlayStoreDto updateByName(String oldName,String newName) {

		for (PlayStoreDto dto : listOfApps) {
			if (dto != null && dto.getApplicationName().equals(oldName)) {

				dto.setApplicationName(newName);
				System.out.println(dto);
				System.out.println("Updated DTO");
				
			}
		}

		return null;
	}
	
}
