package com.xworkz.bill.runner;

import java.time.LocalDate;
import java.time.LocalTime;
import com.xworkz.bill.dto.BillDto;
import com.xworkz.bill.service.BillService;

import java.util.Scanner;

public class BillRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BillDto dto = new BillDto();

		System.out.println("Enter Array Size:");
		int arraysize = scanner.nextInt();
		BillService billser = new BillService(arraysize);
		for (int i = 0; i < arraysize; i++) {
			System.out.println("Enter name:");
			dto.setName(scanner.next());

			System.out.println("Enter Type of bill:");
			dto.setTypeOfBill(scanner.next());

			System.out.println("Enter amount:");
			dto.setAmount(scanner.nextInt());

			System.out.println("Enter Gst%:");
			dto.setGST(scanner.nextFloat());

			System.out.println("Enter GST Type:");
			dto.setGstType(scanner.next());

			System.out.println("Date:" + LocalDate.now());
			dto.setDate(LocalDate.now());

			System.out.println("Bill is Generated?");
			dto.setBillGenareted(scanner.nextBoolean());

			System.out.println("Time:" + LocalTime.now());
			dto.setTime(LocalTime.now());

			billser.Onsave(dto);

			System.out.println(dto);

		}

		scanner.close();
	}

}
