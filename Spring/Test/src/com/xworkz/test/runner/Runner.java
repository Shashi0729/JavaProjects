package com.xworkz.test.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.xworkz.test.constants.ProductType;
import com.xworkz.test.dto.AddressDto;
import com.xworkz.test.dto.BrandDto;
import com.xworkz.test.dto.ProductDto;

public class Runner {

	public static void main(String[] args) {
		ArrayList<ProductDto> list =new ArrayList<ProductDto>();
		AddressDto Adto=new AddressDto(1,11,"BTM","Bengaluru","Karnataka",560076);
		AddressDto Adto1=new AddressDto(2,12,"Banashankari","Bengaluru","Karnataka",560076);
		AddressDto Adto2=new AddressDto(3,13,"Rajajinagar","Bengaluru","Karnataka",560076);
		AddressDto Adto3=new AddressDto(4,14,"Jayanagar","Bengaluru","Karnataka",560076);
		AddressDto Adto4=new AddressDto(5,15,"JPNagar","Bengaluru","Karnataka",560076);
		AddressDto Adto5=new AddressDto(6,16,"Vadagavi","Belagavi","Karnataka",590009);
		AddressDto Adto6=new AddressDto(7,17,"Khasbhag","Belagavi","Karnataka",590009);
		AddressDto Adto7=new AddressDto(8,18,"ChannammaNagar","Belagavi","Karnataka",560009);
		AddressDto Adto8=new AddressDto(9,19,"SilkBoard","Bengaluru","Karnataka",560078);
		AddressDto Adto9=new AddressDto(10,20,"Peenya","Bengaluru","Karnataka",560001);

		BrandDto Bdto=new BrandDto(1,"Puma",Adto,1000);
		BrandDto Bdto1=new BrandDto(2,"Nike",Adto1,2000);
		BrandDto Bdto2=new BrandDto(3,"Adidas",Adto2,4000);
		BrandDto Bdto3=new BrandDto(4,"Netplay",Adto3,500);
		BrandDto Bdto4=new BrandDto(5,"Zudio",Adto4,499);
		BrandDto Bdto5=new BrandDto(6,"PeterEngland",Adto5,10000);
		BrandDto Bdto6=new BrandDto(7,"AllenSholy",Adto6,1588);
		BrandDto Bdto7=new BrandDto(8,"Raymond",Adto7,12599);
		BrandDto Bdto8=new BrandDto(9,"Highlander",Adto8,999);
		BrandDto Bdto9=new BrandDto(10,"Abibas",Adto9,111);

		ProductDto Pdto =new ProductDto(1,"T-Shirt",Bdto,ProductType.Cotton,30);
		ProductDto Pdto1 =new ProductDto(2,"Shirt",Bdto1,ProductType.Linen,60);
		ProductDto Pdto2 =new ProductDto(3,"Shoes",Bdto2,ProductType.Rubber,220);
		ProductDto Pdto3 =new ProductDto(4,"Shirt",Bdto3,ProductType.Polyester,3330);
		ProductDto Pdto4 =new ProductDto(5,"Chappal",Bdto4,ProductType.Plastic,3550);
		ProductDto Pdto5 =new ProductDto(6,"Pant",Bdto5,ProductType.Wool,305);
		ProductDto Pdto6 =new ProductDto(7,"T-Shirt",Bdto6,ProductType.Silk,530);
		ProductDto Pdto7 =new ProductDto(8,"Shervani",Bdto7,ProductType.Polyester,530);
		ProductDto Pdto8 =new ProductDto(9,"BaggyPant",Bdto8,ProductType.Cotton,308);
		ProductDto Pdto9 =new ProductDto(10,"Crocs",Bdto9,ProductType.Rubber,309);
		
		list.add(Pdto);
		list.add(Pdto1);
		list.add(Pdto2);
		list.add(Pdto3);
		list.add(Pdto4);
		list.add(Pdto5);
		list.add(Pdto6);
		list.add(Pdto7);
		list.add(Pdto8);
		list.add(Pdto9);
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
       System.out.println("Finding productDto by Pincode");
        int pincodeToSearch = 560076;
		 list.stream().filter(p -> p.getBrand().getAddress().getPincode() == pincodeToSearch).forEach(p -> System.out.println(p));
		 
		 System.out.println("Finding AddressDto by productName");
	        String productname = "Shirt";
	        list.stream().filter(p -> p.getProductName().equals(productname)).map(p->p.getBrand().getAddress()).forEach(System.out::println);
			
	        System.out.println("Finding BrandDto by ProductId");
	       int productid = 5; 
	        list.stream().filter(p -> p.getId()==(productid)).map(p -> p.getBrand())
	                .forEach(System.out::println);
	        
	        System.out.println("Finding AddressDto by brand name");
		       String brandName = "Puma"; 
		        list.stream().filter(p -> p.getBrand().getBrandName().equals(brandName)).map(p -> p.getBrand().getAddress())
		                .forEach(System.out::println);

		
		        System.out.println("Finding all product Max Price");
   
		        int maxPrice =4000;
		        
		        
		        Map<ProductType, List<ProductDto>> productsByType = list.stream()
		                .collect(Collectors.groupingBy(ProductDto::getType));
		        productsByType.forEach((type, products) -> {
		            System.out.println("Product Type: " + type);
		            products.stream()
		                    .sorted(Comparator.comparingInt(BrandDto::getPrice)).forEach(product -> System.out.println(product.getName() + " - Price: " + product.getPrice()));
		            System.out.println();
		        });
                       

		        
		
		
	}

}
