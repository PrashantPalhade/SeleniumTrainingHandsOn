import Exception.FilloException;
import Fillo.Recordset;
import Fillo.*;
import Fillo.Fillo;
public class updateExelRecord {
    public static void setTestDataToExcelFile(String strvalue, String colnNamepar,String scrShotName,String exeStatus) throws FilloException {
        Fillo fillo = new Fillo();
        Connection conn1 = fillo.getConnection("E:\\Selinium\\readExcel\\src\\main\\resources\\TestSheet.xlsx");
        /*String strQuery = "INSERT INTO Sheet1(ColName2,ColName3) VALUES ('WRITE1','WRITE2').WHERE" +
                "(ColName='test2')" ;*/
        String strQuery = "Update Sheet1 Set ColName2='testupdate',ColName3='testupdate' WHERE ColName='test2'";
        String strQuery1 = "Update Sheet1 Set Status=" + exeStatus +",Screenshot=" + scrShotName +""+
                                " WHERE " + colnNamepar + "= " + "'" + strvalue + "'";

        String strQuery2 = "Update Sheet1 Set Status='Pass',Screenshot='ScreenShot1'" +
                                    " WHERE " + colnNamepar + "= " + "'" + strvalue + "'";

        //String strQuery1=(“INSERT INTO vasista(status) VALUES(‘evan’).where(name =’pk’)”);
        Recordset rs;
        conn1.executeUpdate(strQuery2);
    }
    public static void getDataFromExcel() throws FilloException {
        Fillo fillo = new Fillo();
        Connection conn1 = fillo.getConnection("E:\\Selinium\\readExcel\\src\\main\\resources\\TestSheet.xlsx");
        String strQuery = "Select * from Sheet1";
        Recordset rs;
        rs = conn1.executeQuery(strQuery);
        System.out.println("Total Columns :"+rs.getFieldNames().size());
        System.out.println("Total Rows :"+rs.getCount());
        while (rs.next()) {
            System.out.println("Print :" + rs.getField("AutomationScriptName")+"\t"+rs.getField("ALM_TestCasesName"));
        }
        rs.close();
        conn1.close();
    }
    public static void main(String[] args) {
     //   System.out.println("Hellow world");
        try {
            updateExelRecord.getDataFromExcel();
            String colnName = "AutomationScriptName";
            String strvalue = "ICRM_AddPatnerindividualPart";
            String scrShotName ="ICRM_AddPartner_BasePage_Scr1.png";
            String exeStatus ="Passed";
            updateExelRecord.setTestDataToExcelFile(strvalue, colnName,scrShotName,exeStatus);
        } catch (FilloException e) {
            e.printStackTrace();
        }
    }
}
