package com.xworks.task.util;

import com.xworks.task.dto.ProductDto;


public class ProductUtil {
	
	public static boolean CheckDuplicates(ProductDto[] listOfProduct, ProductDto Dto) {
		System.out.println("Duplicate Check");
		for(ProductDto Playdto:listOfProduct) {
			if(Playdto !=null && Playdto.equals(Dto)) {
				return true;
			}
			
			
		}
		return false;
	}
	
	
	public static boolean checkName(String name) {
		char[] ch=name.toCharArray();
		
		if(name!= null && ch.length>=3 && Character.isUpperCase(name.charAt(0)) ) {
			return true;
		}
		return false;
	}
	
	public static boolean checkId(int Id) {
		if(Id != 0 && Id>199 && Id<301 )  {
			return true;
		}
		return false;
	}

}
