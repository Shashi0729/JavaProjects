package com.xworkz.file.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xworkz.file.dto.City;

public class FileOperationRunner {
	public static void main(String[] args) {
		City city = new City("Bengaluru",100000000);
		File file = new File("sg.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File is created");
				add(city, file);
				print(file);
			} catch (Exception e) {
				System.out.println("File is not created");

			}
		}
		if (file.exists()) {
			System.out.println("file is already exist");
			try {
				add(city, file);
				
			} catch (Exception e) {
				System.out.println("Exception");

			}
			Object ob=print(file);
			System.out.println(ob);
		}

	}

	private static void add(City city, File file)  {
		try (FileOutputStream out = new FileOutputStream(file); ObjectOutputStream in = new ObjectOutputStream(out)) {
			try {
				in.writeObject(city);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("file not found");

		} 
	}

	private static Object print(File file) {
		try (FileInputStream in = new FileInputStream(file);
				ObjectInputStream oIn = new ObjectInputStream(in)) {
			
			return	oIn.readObject();
			} catch (IOException |ClassNotFoundException e) {

				e.printStackTrace();
			}
		return file; 

		}
		}

	

