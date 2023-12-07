package com.ebanking.master;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Instance Class
		
		Library Lb=new Library();
		
		Lb.OpenApp("http://103.211.39.246/ranford2");
		Lb.AdminLgn("Admin","Mindq@Sel");
		
		// To get Test Data Excel File
		
		FileInputStream FIS=new FileInputStream("D:\\OnlinePrjNovBatch\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
	
		           // Work book
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		           //Sheet
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		// Row Count
		
		    int Rc=WS.getLastRowNum();
		    
		    //Multiple Iterations --- Loop
		    
		    for (int i=1;i<=Rc;i++)
		    {
				//Row
		    	
		    	XSSFRow WR =WS.getRow(i);
		    	
		    	//Cell
		    	
		    	XSSFCell WC=WR.getCell(0);
		    	XSSFCell WC1=WR.getCell(1);
		    	
		    	XSSFCell WC2=WR.createCell(2);
		    	
		    	//Cell Values
		    	
		    	String Rn=WC.getStringCellValue();
		    	String Rt=WC1.getStringCellValue();
		    	
		    	Lb.Role(Rn,Rt);
		    	}
		    
		  }

}
