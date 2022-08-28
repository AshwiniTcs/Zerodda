package Paramiterazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel_Numeric {
	public static void main(String[] args) throws Exception {
	
		//create the object of the FileInputStream class
		
		FileInputStream file=new FileInputStream("C:\\Users\\jadha\\OneDrive\\Documents\\ashu.xlsx");
		//open excel sheet using create method
		Thread.sleep(2000);
		   double data = WorkbookFactory.create(file).getSheet("s1").getRow(1).getCell(1).getNumericCellValue();
		//print data in ecel sheet
		System.out.println(data);
		
	}

}