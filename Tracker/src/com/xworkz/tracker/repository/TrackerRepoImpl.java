package com.xworkz.tracker.repository;

import java.util.Arrays;

import com.xworkz.tracker.dto.TrackerDto;

public class TrackerRepoImpl implements TrackerRepo {

	private TrackerDto[] listOfDto;
	private Integer index = 0;

	@Override
	public boolean setArraySize(int arraySize) {
		listOfDto = new TrackerDto[arraySize];
		if (arraySize == listOfDto.length) {
			System.out.println("Array Size is Matched");
			return true;
		} else {
			System.out.println("Array Size is not Matched");
		}

		return false;

	}

	@Override
	public boolean Onsave(TrackerDto tDto) {

		if (tDto != null) {
			System.out.println("1");
			

				if (this.index < listOfDto.length) {
					listOfDto[index] = tDto;
					index++;
					System.out.println("saved");
					return true;
				}
			}
		
		System.out.println("not saved");
		return false;
	}

	@Override
	public void readElement() {
		if (listOfDto != null) {
			for (int i = 0; i < this.listOfDto.length; i++) {
				System.out.println(listOfDto[i]);

			}
		}
	}
@Override
	public boolean Delete(String element) {
		int i, j;
		if (element != null) {
			for (i = 0, j = 0; i < this.listOfDto.length; i++) {
				if (listOfDto[i]!=null && listOfDto[i].getProduct_Name().equals(element)) {
					listOfDto[j++] = listOfDto[i];
				}
			}
			listOfDto = Arrays.copyOf(listOfDto, j);
			return true;
		}
		return false;
	}

}
