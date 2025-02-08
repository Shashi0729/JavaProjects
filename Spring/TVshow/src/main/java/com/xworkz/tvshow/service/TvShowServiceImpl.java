package com.xworkz.tvshow.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xworkz.tvshow.dto.TvShowDto;
import com.xworkz.tvshow.entity.TvShowEntity;
import com.xworkz.tvshow.repo.TvShowRepo;
@Component
public class TvShowServiceImpl implements TvShowService {
	@Autowired
	private TvShowRepo repo;
@Bean
	@Override
	public String Onsave(TvShowDto dto) {
		  TvShowEntity entity =new TvShowEntity();
		if(dto != null) {
			if(dto.getChannelNo()!=0 && dto.getChannelAmount()>10) {
				BeanUtils.copyProperties(dto, entity);
				  repo.onSave(entity);
					System.out.println("saved");
				}else {
					System.out.println("not saved");
				}
			}
		
		return "saved";
	}

}
