package com.xworkz.tracker.dto;
import java.time.LocalDateTime;


import lombok.*;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class TrackerDto {
	private Integer trackingid;//null,0
	private String product_Name;
	private LocalDateTime deliverydate;
	private LocalDateTime dispatchdate;
	private String location_From;
	private String location_To;

	

}
