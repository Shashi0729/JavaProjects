package com.xworkz.bill.service;

import com.xworkz.bill.dto.BillDto;
import com.xworkz.bill.util.CheckDuplicate;
import lombok.NoArgsConstructor;
@NoArgsConstructor

public class BillService extends AbstBillService {

	public BillDto[] billDto;
	public int index = 0;

	public BillService(int arraySize) {
		this.billDto = new BillDto[arraySize];
	}

	@Override
	public void Onsave(BillDto dto) {
		
		boolean duplicateresult =	CheckDuplicate.CheckDuplicates(billDto, dto);
		if (dto != null && !duplicateresult ) {
		

			if (this.index < billDto.length) {
				billDto[index] = dto;
				index++;
				System.out.println("saved");

			} else {
				System.out.println("not saved");
			}
		}else {
			System.out.println("not saved");
		}

	}
}
