package com.xworkz.lenovo.excel;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.lenovo.dto.*;

public class WriteDataToExcel {

    public void saveToExcel(LenovoDto dto) {
        // File path where the Excel will be saved
        String filePath = "D:\\excel\\excel.xlsx";

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("User Details");

        // Create header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("User ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Email");
       

        
        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue(dto.getId()); // Assuming user ID is set if needed
        dataRow1.createCell(1).setCellValue(dto.getName());   
        dataRow1.createCell(3).setCellValue(dto.getEmail());
     

        // Write to Excel file
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            System.out.println("Excel file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
