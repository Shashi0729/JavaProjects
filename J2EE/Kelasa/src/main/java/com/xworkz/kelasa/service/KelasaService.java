package com.xworkz.kelasa.service;

import java.util.List;

import com.xworkz.kelasa.dto.KelasaDto;

public interface KelasaService {

	public String save(KelasaDto dto);
	
	public List<KelasaDto> read();
	
	public String delete(int id);
	
	KelasaDto searchById(int id);
	String updatebyId(int id,KelasaDto dto);
}
