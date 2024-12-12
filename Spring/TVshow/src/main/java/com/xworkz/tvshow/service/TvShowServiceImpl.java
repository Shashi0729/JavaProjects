package com.xworkz.tvshow.service;

import org.springframework.stereotype.Component;

import com.xworkz.tvshow.dto.TvShowDto;
@Component
public class TvShowServiceImpl implements TvShowService {

	@Override
	public String Onsave(TvShowDto dto) {
		if(dto != null) {
			if(dto.getChannelNo()!=0 && dto.getChannelAmount()>10) {
				 
					System.out.println("saved");
				}else {
					System.out.println("not saved");
				}
			}
		
		return "saved";
	}

}
