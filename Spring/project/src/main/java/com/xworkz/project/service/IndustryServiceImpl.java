package com.xworkz.project.service;

import java.security.SecureRandom;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.project.dto.IndustryDto;
import com.xworkz.project.entity.IndustryEntity;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.repo.IndustryRepo;
import com.xworkz.project.util.ProjectUtil;
import com.xworkz.project.util.mailutil.MailSender;
@Component
public class IndustryServiceImpl implements IndustryService {
	@Autowired
	IndustryRepo repo;
	@Autowired
	MailSender emailsender;

	@Override
	public boolean onSave(IndustryDto dto) {
		if (dto != null) {
			IndustryEntity entity = ProjectUtil.convertDtoToEntity(dto);
			entity.setCreatedBy(dto.getUserName());
			entity.setCreatedOn(LocalDateTime.now());
			entity.setActive(true);
			repo.onSave(entity);
			emailsender.sendWelComeMessage(entity.getEmail());
			System.out.println("saved");
		}	
		return false;
	}

	@Override
	public boolean signIn(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getemail(String email) {
		if (email != null) {
			if (repo.getemail(email) != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getGST(String Gst) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getcontact(Long contactNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IndustryDto findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndustryDto findByEmailInActive(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateByEmail(IndustryDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByEmail(IndustryDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int generateOTP() {
		SecureRandom random = new SecureRandom();
		return 100000 + random.nextInt(900000);
	}

	@Override
	public boolean sendOTP(String email) {
		IndustryEntity entity = repo.getemail(email);
	    int OTP = generateOTP();
		entity.setOtp(OTP);
		repo.update(entity);
		emailsender.sendOtp(OTP, entity.getEmail(), entity.getUserName());
		return false;
	}

	@Override
	public boolean validateOTP(int OTP, String email) {
		IndustryEntity entity = repo.getemail(email);
		if(entity.getOtp()==OTP) {
		return	true;
		}
		return false;
	}

}
