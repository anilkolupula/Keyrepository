package Testscripts;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import keyword.keyword;
public class logickwdf {
public static void main(String[] args) throws Exception
{
	FileInputStream fis=new FileInputStream("C:\\Users\\kolupa3\\Desktop\\TestInformatio.xlsx");
	Workbook wb=WorkbookFactory.create(fis);		
	Sheet s=wb.getSheet("sheet1");		
	int rc=s.getLastRowNum();
	for (int i = 0; i<= rc; i++) 
	{
		Row r=s.getRow(i+1);
		Cell c=r.getCell(2);
		String flag=c.getStringCellValue();
		if (flag.equals("Y"))
		{
		c=r.getCell(1);
		String kword=c.getStringCellValue();
		Method a=keyword.class.getMethod(kword);
		a.invoke(a);
		}
		else
		{
		System.out.println("*********************************");
		}
		}

		}
}



