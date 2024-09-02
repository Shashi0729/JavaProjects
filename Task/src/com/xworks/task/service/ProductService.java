package com.xworks.task.service;

import java.util.Arrays;

import com.xworks.task.dto.ProductDto;
import com.xworks.task.util.ProductUtil;



public class ProductService extends AbstProductService {
	public ProductDto[] listOfProductDto = new ProductDto[3];
	public int index = 0;
	
	

	@Override
	public void SaveProduct(ProductDto productdto) {
		System.out.println("Onsave is Running");

		if (productdto != null) {
			boolean checkduplicate = ProductUtil.CheckDuplicates(listOfProductDto, productdto);
			
			boolean checkname= ProductUtil.checkName(productdto.getName());
			boolean checkid=  ProductUtil.checkId(productdto.getId());
			if (checkduplicate == false && checkname == true && checkid == true ) {

				if (this.index < listOfProductDto.length) {
					listOfProductDto[index] = productdto;
					index++;

					System.out.println("Saved Sucessfully");

				} else {
					System.out.println(" not Saved");
				}
				

			}else {System.out.println("Duplicate data found,not saved...");}
			
		} else {
			System.out.println("Null");
			
		}
	}



	@Override
	public void UpdateProduct(String oldName,String newName) {
		for (ProductDto dto : listOfProductDto) {
			if (dto != null && dto.getName().equals(oldName)) {

				dto.setName(newName);
				System.out.println(dto);
				System.out.println("Updated DTO");
				
			}
		}

		return;

	}

	@Override
	public void DeleteProduct(int element) {
		int i, j;
		if (element != 0) {
			System.out.println("Delete is running");
			for (i = 0, j = 0; i < this.listOfProductDto.length; i++) {
				if (!(listOfProductDto[i].getId()==(element))) {
					listOfProductDto[j++] = listOfProductDto[i];
				}
			}
			listOfProductDto = Arrays.copyOf(listOfProductDto, j);
		}

	}

	@Override
	public void SearchProduct(String Name) {
		for (ProductDto dto : listOfProductDto) {
			if (Name != null && dto.getName().equals(Name)) {

				System.out.println(dto);
			}else {
				System.out.println("Not Found");
			}
			
		}
		

		return;

	}

	@Override
	public void ReadProduct() {
		for(ProductDto dto:listOfProductDto) {
			System.out.println(dto);
		}
		}

	}


