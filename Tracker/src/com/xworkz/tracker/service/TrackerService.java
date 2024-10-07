package com.xworkz.tracker.service;

import com.xworkz.tracker.dto.TrackerDto;

public interface TrackerService {
	public boolean setArraySize(int arraySize);
	public boolean validateandSave(TrackerDto tDto);
	public void read();
	public boolean delete(String element);
	

}
