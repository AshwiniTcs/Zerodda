package Paramiterazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel_String {

	public static void main(String[] args) throws Exception {
		FileInputStream  file=new FileInputStream("C:\\Users\\jadha\\OneDrive\\Documents\\ashu.xlsx");
		
	String str = WorkbookFactory.create(file).getSheet("S1").getRow(2).getCell(2).getStringCellValue();
	System.out.println(str);
	}

}
