package SeleniumSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.excel.lib.util.Xls_Reader;

public class ExcelUtilTest {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/lib/util/TestingData.xlsx");
        String sheetName ="login";
        
        String data = reader.getCellData(sheetName, 0, 3);
        System.out.println(data);
        
       int rowCount= reader.getRowCount(sheetName);
       System.out.println("Total rows: " + rowCount);
       
      // reader.addColumn(sheetName, "Status");
      // reader.addSheet("Registration");
       if(!reader.isSheetExist("address")){
    	   reader.addSheet("address"); 
       }
       
      // reader.setCellData(sheetName, "Status", 2, "Pass");
       System.out.println(reader.getCellData(sheetName, "UserName", 2));
       System.out.println(reader.getColumnCount(sheetName));
       
       
       
       
	}

}
