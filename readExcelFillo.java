import Exception.FilloException;
import Fillo.Connection;
import Fillo.Fillo;
import Fillo.Recordset;
public class readExcelFillo
{
    public static void setTestDataToExcelFile(String strvalue, String colnNamepar) throws FilloException {
        Fillo fillo = new Fillo();
        Connection conn1 = fillo.getConnection("C:\\Users\\Admin\\Documents\\test.xlsx");
        /*String strQuery = "INSERT INTO Sheet1(ColName2,ColName3) VALUES ('WRITE1','WRITE2').WHERE" +
                "(ColName='test2')" ;*/
        String strQuery = "Update Sheet1 Set ColName2='testupdate',ColName3='testupdate' WHERE ColName='test2'" ;
        String strQuery1 = "Update Sheet1 Set ColName2='testupdate1',ColName3='testupdate2' WHERE "+colnNamepar+"= "+"'"+strvalue+"'";
        //String strQuery1=(“INSERT INTO vasista(status) VALUES(‘evan’).where(name =’pk’)”);
        Recordset rs;
        conn1.executeUpdate(strQuery1);
        }
    public static void getTestDataFromExcel() throws FilloException {
        Fillo fillo = new Fillo();
        Connection conn1 = fillo.getConnection("C:\\Users\\Admin\\Documents\\test.xlsx");
        String strQuery = "Select * from Sheet1" ;
        Recordset rs;
        rs = conn1.executeQuery(strQuery);
        while(rs.next()) {
            System.out.println("Print :" + rs.getField("ColName"));
        /*    List testList= rs.getFieldNames();
            System.out.println(testList.get(0));*/
          /*  for (String strColumn:rs.getFieldNames()) {
                System.out.println(strColumn);
           //     System.out.println(rs.getField(strColumn));
        }*/
        }
        rs.close();
       conn1.close();

    }
    public static void main(String[] args) {
        System.out.println("Hellow world");
        try {
            readExcelFillo.getTestDataFromExcel();
            String colnName="ColName";
            String strvalue="test3";
            readExcelFillo.setTestDataToExcelFile(strvalue,colnName);
        } catch (FilloException e) {
            e.printStackTrace();
        }

    }


}
