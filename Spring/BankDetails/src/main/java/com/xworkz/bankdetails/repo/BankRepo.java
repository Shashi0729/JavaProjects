package com.xworkz.bankdetails.repo;

import com.xworkz.bankdetails.entity.BankEntity;


public interface BankRepo {
	public boolean onSave(BankEntity entity);
}
