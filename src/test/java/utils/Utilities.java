package utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Utilities {
    public void readData() throws Exception {
        File src = new File("\"C:\\Users\\sraba\\Downloads\\testdata.xlsx\"");
        FileInputStream fis = new FileInputStream(src);
        Workbook xsf = new XSSFWorkbook(fis);
        //XSSFSheet sheet = xsf.getSheetAt(0);
    }
}
