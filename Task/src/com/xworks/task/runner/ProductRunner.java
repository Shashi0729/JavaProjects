package com.xworks.task.runner;

import com.xworks.task.constants.BrandConst;
import com.xworks.task.dto.ProductDto;
import com.xworks.task.service.AbstProductService;
import com.xworks.task.service.ProductService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductRunner {

	public static void main(String[] args) {
		ProductDto apple=new ProductDto(252,124578557L,"Apple 15 Pro max",LocalDate.of(2023, 9, 15),LocalDateTime.of(2024, 8, 25, 11, 11),BrandConst.APPLE);
		ProductDto samsung=new ProductDto(253,124578557L,"Samsung S22 ultra",LocalDate.of(2023, 9, 15),LocalDateTime.of(2024, 8, 25, 11, 11),BrandConst.SAMSUNG);
		ProductDto Google=new ProductDto(254,124578557L,"Google pixel 9 pro",LocalDate.of(2023, 9, 15),LocalDateTime.of(2024, 8, 25, 11, 11),BrandConst.GOOGLE);

		AbstProductService pSer=new ProductService();
		pSer.SaveProduct(apple);
		pSer.SaveProduct(samsung);
		pSer.SaveProduct(Google);
		System.out.println("----------reading--------");
		pSer.ReadProduct();
		System.out.println("----------updating--------");
		pSer.UpdateProduct("Apple 15 Pro max", "iphone 12");
		System.out.println("----------deleting--------");
		pSer.DeleteProduct(252);
		pSer.ReadProduct();
		System.out.println("----------searching--------");
		pSer.SearchProduct("Samsung S22 ultra");
		
		

	}

}
