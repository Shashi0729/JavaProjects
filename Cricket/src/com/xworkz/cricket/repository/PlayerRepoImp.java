package com.xworkz.cricket.repository;

import java.util.Arrays;

import com.xworkz.cricket.dto.PlayersDto;

public class PlayerRepoImp implements PlayerRepo {
	public int index = 0;
	public PlayersDto[] listOfPlayers = new PlayersDto[11];

	@Override
	public boolean onSave(PlayersDto pDto) {
		if (pDto != null) {
			if (this.index < listOfPlayers.length) {
				listOfPlayers[index] = pDto;
				index++;
				System.out.println("Saved");
				return true;
			}
		}

		System.out.println("not saved");
		return false;

	}

	@Override
	public boolean read() {
		if (listOfPlayers != null) {
			for (int i = 0; i < listOfPlayers.length; i++) {
				System.out.println(listOfPlayers[i]);

			}
		}
		return false;

	}

	@Override
	public boolean delete(int jNo) {
		int i, j;
		if (jNo != 0) {
			System.out.println("Delete is running");
			for (i = 0, j = 0; i < this.listOfPlayers.length; i++) {
				if (!(listOfPlayers[i].getJerseyNumber() == (jNo))) {
					listOfPlayers[j++] = listOfPlayers[i];
				}

			}
			listOfPlayers = Arrays.copyOf(listOfPlayers, j);
			System.out.println("Deleted");

		}

		return false;
	}

	@Override
	public boolean update(int jNo, PlayersDto element) {
		if (jNo != 0 && element != null) {
			for (int index = 0; index < listOfPlayers.length; index++) {
				if (listOfPlayers[index] != null && listOfPlayers[index].getJerseyNumber() == (jNo)) {
					listOfPlayers[index] = element;
				}
			}
		}
		return false;
	}

	@Override
	public boolean runRate(int jNo) {
		if (jNo != 0) {
			for (int index = 0; index < listOfPlayers.length; index++) {
				if (listOfPlayers[index] != null && listOfPlayers[index].getJerseyNumber() == (jNo)) {

					double strikerate = listOfPlayers[index].getScore() / listOfPlayers[index].getMatchesPlayed();
					System.out.println("Strikerate of " + listOfPlayers[index].getPlayerName() + ":" + strikerate);
				}
			}

		}
		return false;
	}

	@Override
	public boolean moreMatches() {
		
		int mostMatches=0;
		for(int i=0;i<listOfPlayers.length;i++) {
		if(listOfPlayers[i].getMatchesPlayed()>mostMatches) {
			mostMatches=listOfPlayers[i].getMatchesPlayed();
			return true;
		}
		System.out.println(listOfPlayers[i].getPlayerName());
	}
		
		return false;
	}
}
