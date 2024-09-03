package com.xworkz.bill.util;

import com.xworkz.bill.dto.BillDto;

public class CheckDuplicate {
	public static boolean CheckDuplicates(BillDto[] listOfBill, BillDto Dto) {
		System.out.println("Duplicate Check method");
		for (BillDto Playdto : listOfBill) {
			if (Playdto != null && Playdto.equals(Dto)) {
				System.out.println("Duplicate values found");
				return true;

			}

		}
		return false;
	}

}
