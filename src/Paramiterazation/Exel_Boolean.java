package Paramiterazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel_Boolean {

	public static void main(String[] args) throws Exception {
			FileInputStream file=new FileInputStream("C:\\Users\\jadha\\OneDrive\\Documents\\ashu.xlsx");
			
			boolean bln = WorkbookFactory.create(file).getSheet("S1").getRow(1).getCell(2).getBooleanCellValue();
			System.out.println(bln);
			
	}

}
