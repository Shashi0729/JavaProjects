package com.xworkz.tracker.service;

import java.util.Arrays;

import com.xworkz.tracker.dto.TrackerDto;
import com.xworkz.tracker.repository.TrackerRepo;
import com.xworkz.tracker.repository.TrackerRepoImpl;

public class TrackerServiceImplementation implements TrackerService {

	@Override
	public boolean setArraySize(int arraySize) {
		if (arraySize > 0) {
			System.out.println("Given value is valid");
			if(trackerrepoimpl.setArraySize(arraySize)) {
		} else {
			System.out.println("Given value is not valid");

		}
		}
		return false;

	}

	TrackerRepo trackerrepoimpl = new TrackerRepoImpl();

	@Override
	public boolean validateandSave(TrackerDto tDto) {
		if (tDto != null) {
			System.out.println("Dto is not null");
			if(trackerrepoimpl.Onsave(tDto)) {
				System.out.println("Saved ");
			}
		}
		return false;
	}

	@Override
	public void read() {
		trackerrepoimpl.readElement();
		
	}

	
	@Override
	public boolean delete(String element) {
		if(element!=null) {
			if(trackerrepoimpl.Delete(element)) {
			System.out.println("Deleted");
		}
		}
		return false;
	}

	
	

}
