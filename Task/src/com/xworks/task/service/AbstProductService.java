package com.xworks.task.service;

import com.xworks.task.dto.ProductDto;

public abstract class AbstProductService {
	
	public abstract void SaveProduct(ProductDto productdto);
	public abstract void ReadProduct();
	public abstract void UpdateProduct(String oldName,String newName);
	public abstract void DeleteProduct(int element);
	public abstract void SearchProduct(String ProductName);

}
