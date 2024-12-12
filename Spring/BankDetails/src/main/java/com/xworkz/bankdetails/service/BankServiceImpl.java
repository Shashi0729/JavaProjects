package com.xworkz.bankdetails.service;

import org.springframework.stereotype.Component;

import com.xworkz.bankdetails.dto.BankDto;
@Component
public class BankServiceImpl implements BankService  {

	@Override
	public String onSave(BankDto dto) {
		if(dto!=null) {
			if(dto.getBankName()!=null) {
			}
			if(dto.getBankIFSC()>=3) {
			
			}
			System.out.println("Saved succesfully");
		}else {
			System.out.println("Not Saved");
		}
			return "Saved";
	
	}

}
