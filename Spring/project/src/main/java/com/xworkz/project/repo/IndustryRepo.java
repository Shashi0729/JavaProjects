package com.xworkz.project.repo;

import com.xworkz.project.entity.IndustryEntity;

public interface IndustryRepo {
	String onSave(IndustryEntity entity);

	public IndustryEntity getemail(String email);
	
	public IndustryEntity getid(int id);
	
	public IndustryEntity getemailInActive(String email);

	public boolean getgst(Long gst);

	public boolean getcontact(Long contactNo);

	public IndustryEntity update(IndustryEntity entity);

}
