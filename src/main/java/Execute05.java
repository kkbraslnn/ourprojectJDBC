import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static utilities.DataBaseUtilities.*;
import static utilities.DataBaseUtilities.executeQuery;

public class Execute05 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        createConnection();


        String sql1="select * from isciler";
        System.out.println("sutun isimleri: "+ getColumnNames(sql1));
        System.out.println(getColumnData(sql1, "isim"));
        System.out.println(getColumnData(sql1, "sehir"));
        System.out.println(getColumnData(sql1, "maas"));
        System.out.println(getColumnData(sql1, "sirket"));

        closeConnection();

    }
}