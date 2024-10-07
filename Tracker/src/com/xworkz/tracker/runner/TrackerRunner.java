package com.xworkz.tracker.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.xworkz.tracker.dto.TrackerDto;
import com.xworkz.tracker.repository.TrackerRepo;
import com.xworkz.tracker.repository.TrackerRepoImpl;
import com.xworkz.tracker.service.TrackerService;
import com.xworkz.tracker.service.TrackerServiceImplementation;

public class TrackerRunner {

	public static void main(String[] args) {

		TrackerDto trackerDto = new TrackerDto();
		trackerDto.setTrackingid(123);
		trackerDto.setProduct_Name("Samsung S22");
		trackerDto.setDispatchdate(LocalDateTime.of(2024, 9, 25, 12, 24));
		trackerDto.setDeliverydate(LocalDateTime.now().plusDays(7));
		trackerDto.setLocation_From("Belagavi");
		trackerDto.setLocation_To("Bengaluru");

		TrackerService trackerSer = new TrackerServiceImplementation();
		TrackerRepo trepo = new TrackerRepoImpl();
		System.out.println("enter array size:");
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		trackerSer.setArraySize(arraySize);
		trackerSer.validateandSave(trackerDto);
		trackerSer.read();
		System.out.println("enter id to delete:");
		int id = scanner.nextInt();
		trackerSer.delete("Samsung S22");
		trackerSer.read();

	}

}
