
import pojos.IsciAdi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Execute04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/isciler",
                "postgres",
                "cimkent96kz");


        Statement st = con.createStatement();

        // SORU: Urunler adında bir tablo olusturalım (id int, isim varchar(10), fiyat int)
        //String sql01 = "create table urunler (id int, isim varchar(10), fiyat int)";
        //st.execute(sql01);


        List<IsciAdi> isciler = new ArrayList<>();
        isciler.add(new IsciAdi("Mehmet", "Ankara", 3000, "AFD"));
        isciler.add(new IsciAdi("Mehmet", "Ankara", 3000, "AFD"));
        isciler.add(new IsciAdi("Ahmet", "izmir", 3000, "bfd"));
        isciler.add(new IsciAdi("selim", "almaty", 5000, "naturella"));
        isciler.add(new IsciAdi("Ali", "istanbul", 3000, "cfd"));
        isciler.add(new IsciAdi("Veli", "Ankara", 3000, "dFD"));
        st.executeBatch();

        PreparedStatement tablo = con.prepareStatement("insert into isciler values(?,?,?,?)");
        for (IsciAdi w : isciler) {
            tablo.setString(1, w.getIsim());
            tablo.setString(2, w.getSehir());
            tablo.setInt(3,w.getMaas());
            tablo.setString(4,w.getSirket());
            tablo.addBatch();
        }
        tablo.executeUpdate();
        tablo.executeBatch();
        con.close();


    }
}























