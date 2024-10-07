package com.xworkz.tracker.repository;

import com.xworkz.tracker.dto.TrackerDto;

public interface TrackerRepo {
	
	public boolean setArraySize(int arraySize);
	
	public boolean Delete(String element);

	void readElement();

	boolean Onsave(TrackerDto tDto);

}
