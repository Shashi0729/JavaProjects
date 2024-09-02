package com.xworks.task.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworks.task.constants.BrandConst;
import lombok.*;
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Setter
@ToString

public class ProductDto {

	int id;
	long sku;
	String name;
	LocalDate releaseDate;
	LocalDateTime lastUpdated;
	BrandConst brand;

}
