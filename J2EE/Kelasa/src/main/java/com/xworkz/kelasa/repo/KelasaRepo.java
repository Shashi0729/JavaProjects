package com.xworkz.kelasa.repo;

import java.util.List;

import com.xworkz.kelasa.dto.KelasaDto;

public interface KelasaRepo {
	
    List<KelasaDto> read();
	
	public boolean save(KelasaDto dto);
	
	public boolean delete(int id);
	
	KelasaDto searchById(int id);
	
	String updatebyName(int id,KelasaDto dto);

	

}
