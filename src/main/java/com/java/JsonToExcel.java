package com.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class JsonToExcel {
    List<StudentInfo> infoList;
    XSSFWorkbook xssfWorkbook;
    public void jsonReader() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        infoList = List.of(objectMapper.readValue(Paths.get("C:\\Users\\Udhayakumar\\IdeaProjects\\json2excel\\src\\final.json").toFile(), StudentInfo[].class));
        System.out.println(infoList);
    }
    public void writeExcel(){
        String []column = {"RollNo","Name","Age","Mark"};
        xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet= xssfWorkbook.createSheet("Student1");
        Row row = xssfSheet.createRow(0);
        for(int clm = 0 ; clm<column.length;clm++){
         Cell cell = row.createCell(clm);
         cell.setCellValue(column[clm]);
         int rowIndex=1;
            for (StudentInfo data:infoList) {
                XSSFRow xssfRow = xssfSheet.createRow(rowIndex++);
                xssfRow.createCell(0).setCellValue(data.getRollNum());
                xssfRow.createCell(1).setCellValue(data.getName());
                xssfRow.createCell(2).setCellValue(data.getAge());
                xssfRow.createCell(3).setCellValue(data.getMark());

            }

            }
        }
        public void Excel(){
            File file;
            Scanner scan = new Scanner(System.in);
            System.out.println("Name Your File with .xlsx");
            String filename = scan.nextLine();
            String directory = System.getProperty("user.dir");
            String path;
            path = directory + File.separator + filename;
            System.out.println("Filepath is " + path);
            file = new File(path);
        try{
            FileOutputStream fileOutput = new FileOutputStream(file);
            xssfWorkbook.write(fileOutput);
            fileOutput.close();
            xssfWorkbook.close();
            System.out.println("File is created and path is\n  " +path);

        }catch(Exception e){
            System.out.println("File not Found");
        }}
    }
