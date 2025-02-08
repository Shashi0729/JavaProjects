package com.xworkz.bankdetails.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bankdetails.dto.BankDto;
import com.xworkz.bankdetails.entity.BankEntity;
import com.xworkz.bankdetails.repo.BankRepo;
@Component
public class BankServiceImpl implements BankService  {
	@Autowired
	private BankRepo repo;

	@Override
	public String onSave(BankDto dto) {
		BankEntity entity =new BankEntity();
		if(dto!=null) {
			if(dto.getBankName()!=null && dto.getBankIFSC()>=3) {
			BeanUtils.copyProperties(dto, entity);
			repo.onSave(entity);
			System.out.println("Saved succesfully");
		}else {
			System.out.println("Not Saved");
		}
			
	
	}
		return null;

}
}
