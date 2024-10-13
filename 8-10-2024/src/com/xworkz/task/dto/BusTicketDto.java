package com.xworkz.task.dto;

	import lombok.*;

	@AllArgsConstructor
	@NoArgsConstructor
	@Setter
	@Getter
	@ToString
	@EqualsAndHashCode

	public class BusTicketDto {

		private String startingPoint;
		private String destination;
		private int ticketPrice;

	}

