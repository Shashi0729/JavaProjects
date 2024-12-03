package com.xworkz.kelasa.service;

import java.util.List;

import com.xworkz.kelasa.dto.KelasaDto;
import com.xworkz.kelasa.repo.KelasaRepo;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class KelasaServiceImp implements KelasaService {
	private KelasaRepo repo;

	@Override
	public String save(KelasaDto dto) {
		if(dto!=null) {
			System.out.println("dto is not null");
			if(repo.save(dto)) {
				System.out.println("data is saved");
			}
		}
		return "Saved";
	}

	@Override
	public List<KelasaDto> read() {
		
		return repo.read();
	}

	@Override
	public String delete(int id) {
		if(repo.delete(id)) {
			System.out.println("deleted");
		}
		return null;
	}

	@Override
	public KelasaDto searchById(int id) {
		return repo.searchById(id);
	}

	@Override
	public String updatebyId(int id, KelasaDto dto) {
		return "update"+repo.updatebyName(id, dto);
	}

}
