package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelReaderUtility {
    public static String[][] getData() throws IOException {
        File fileObj = new File("c:/BMITestData.xls");
        FileInputStream fis = new FileInputStream(fileObj);


        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        HSSFSheet sheet = workbook.getSheet("BMITestData");

        int rowNum = sheet.getLastRowNum() + 1;
        // System.out.println(rowNum);
        int colNum = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNum][colNum];
        for (int i = 0; i < rowNum; i++) {
            HSSFRow row = sheet.getRow(i);
            for (int j = 0; j < colNum; j++) {
                HSSFCell cell = row.getCell(j);
                String value = cellToString(cell);
                data[i][j] = value;
            }
        }
        return data;
    }

    public static String cellToString(HSSFCell cell) {
        CellType type = cell.getCellTypeEnum();
        Object result;
        switch (type) {
            case NUMERIC:
                result = cell.getNumericCellValue();
                break;
            case STRING:
                result = cell.getStringCellValue();
                break;
            default:
                throw new RuntimeException("Sorry");
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        String [][]data = ExcelReaderUtility.getData();
        for (String[] datum : data) {
            for (String s : datum) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }
    }
}
