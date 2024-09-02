package com.xworkz.playstore.Dto;

import java.time.LocalDate;

public class PlayStoreDto {

	private String applicationName;
	private String applicationSize;
	private String applicationType;
	private LocalDate applicationRdate;
	private LocalDate applicationUdate;
	
	public PlayStoreDto() {
		System.out.println("no Args Constructor");
	}
	public PlayStoreDto(String applicationName, String applicationSize, String applicationType,
			LocalDate applicationRdate, LocalDate applicationUdate) {
		super();
		this.applicationName = applicationName;
		this.applicationSize = applicationSize;
		this.applicationType = applicationType;
		this.applicationRdate = applicationRdate;
		this.applicationUdate = applicationUdate;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getApplicationSize() {
		return applicationSize;
	}
	public void setApplicationSize(String applicationSize) {
		this.applicationSize = applicationSize;
	}
	public String getApplicationType() {
		return applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	public LocalDate getApplicationRdate() {
		return applicationRdate;
	}
	public void setApplicationRdate(LocalDate applicationRdate) {
		this.applicationRdate = applicationRdate;
	}
	public LocalDate getApplicationUdate() {
		return applicationUdate;
	}
	public void setApplicationUdate(LocalDate applicationUdate) {
		this.applicationUdate = applicationUdate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationName == null) ? 0 : applicationName.hashCode());
		result = prime * result + ((applicationRdate == null) ? 0 : applicationRdate.hashCode());
		result = prime * result + ((applicationSize == null) ? 0 : applicationSize.hashCode());
		result = prime * result + ((applicationType == null) ? 0 : applicationType.hashCode());
		result = prime * result + ((applicationUdate == null) ? 0 : applicationUdate.hashCode());
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
		PlayStoreDto other = (PlayStoreDto) obj;
		if (applicationName == null) {
			if (other.applicationName != null)
				return false;
		} else if (!applicationName.equals(other.applicationName))
			return false;
		if (applicationRdate == null) {
			if (other.applicationRdate != null)
				return false;
		} else if (!applicationRdate.equals(other.applicationRdate))
			return false;
		if (applicationSize == null) {
			if (other.applicationSize != null)
				return false;
		} else if (!applicationSize.equals(other.applicationSize))
			return false;
		if (applicationType == null) {
			if (other.applicationType != null)
				return false;
		} else if (!applicationType.equals(other.applicationType))
			return false;
		if (applicationUdate == null) {
			if (other.applicationUdate != null)
				return false;
		} else if (!applicationUdate.equals(other.applicationUdate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "playStoreDto [applicationName=" + applicationName + ", applicationSize=" + applicationSize
				+ ", applicationType=" + applicationType + ", applicationRdate=" + applicationRdate
				+ ", applicationUdate=" + applicationUdate + "]";
	}
	
	
	
}
