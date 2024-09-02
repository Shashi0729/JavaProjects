package com.xworkz.application.Dto;

public class CosmaticsDto {
private String brandName;
private String cosmaticName;
private String price;
private double rating;

public CosmaticsDto() {
	System.out.println("No Arguement Constructor");
}
public CosmaticsDto(String brandName, String cosmaticName, String price, double rating) {
	super();
	this.brandName = brandName;
	this.cosmaticName = cosmaticName;
	this.price = price;
	this.rating = rating;
}
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public String getCosmaticName() {
	return cosmaticName;
}
public void setCosmaticName(String cosmaticName) {
	this.cosmaticName = cosmaticName;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
	result = prime * result + ((cosmaticName == null) ? 0 : cosmaticName.hashCode());
	result = prime * result + ((price == null) ? 0 : price.hashCode());
	long temp;
	temp = Double.doubleToLongBits(rating);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CosmaticsDto other = (CosmaticsDto) obj;
	if (brandName == null) {
		if (other.brandName != null)
			return false;
	} else if (!brandName.equals(other.brandName))
		return false;
	if (cosmaticName == null) {
		if (other.cosmaticName != null)
			return false;
	} else if (!cosmaticName.equals(other.cosmaticName))
		return false;
	if (price == null) {
		if (other.price != null)
			return false;
	} else if (!price.equals(other.price))
		return false;
	if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
		return false;
	return true;
}
@Override
public String toString() {
	return "CosmaticsDto [brandName=" + brandName + ", cosmaticName=" + cosmaticName + ", price=" + price + ", rating="
			+ rating + "]";
}

}
