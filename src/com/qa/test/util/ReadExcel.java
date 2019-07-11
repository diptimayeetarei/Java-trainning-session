package com.qa.test.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
 

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/**
 * A dirty simple program that reads an Excel file.
 * @author cutieDipti
 *
 */
public class ReadExcel {
     
    public static void main(String[] args) throws IOException {
       // String excelFilePath = "F:/naveenAuto/JavaTrainningSession/src/com/qa/testdata/EbayRegistrationData.xlsx";
        FileInputStream inputStream = new FileInputStream(new File("F:/naveenAuto/JavaTrainningSession/src/com/qa/testdata/EbayRegistrationData.xlsx"));
         
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();
         
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
             
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                 
                               FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
                
                switch(formulaEvaluator.evaluateInCell(cell).getCellTypeEnum())
                {
                case NUMERIC:
                    System.out.print(cell.getNumericCellValue() + "\t");
                    break;
                case STRING:
                    System.out.print(cell.getStringCellValue() + "\t");
                    break;
                default:
                    break;

                }
                System.out.print(" - ");
            }
            System.out.println();
        }
         
        workbook.close();
        inputStream.close();
    }
 
}