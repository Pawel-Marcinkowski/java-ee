package Solution;

//SELECT MAX(ID_klienta) FROM app.KLIENCI;

import Lab2.Serwlety.Wypisywanie;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.Instant;
import java.sql.Timestamp;

public final class DbManager {
public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
public static final String JDBC_URL = "jdbc:derby://localhost:1527/db";
public static final String QUERY = "select * from app.klienci";
private static java.sql.Connection conn;

private DbManager() {
}

public static boolean Connect() throws ClassNotFoundException, SQLException {
    conn = DriverManager.getConnection(JDBC_URL, "Student", "wcy");
    if (conn == null) {
        return false;
    } else {
        return true;
} }

public static boolean Disconnect() throws SQLException {
    if (conn == null) {
        return false;
    } else {
        conn.close();
        return true;
} }

public static String getData() throws SQLException {
    Statement stat = conn.createStatement();
    ResultSet rs = stat.executeQuery(QUERY);
    ResultSetMetaData rsmd = rs.getMetaData();
    String wiersz = new String();
    int colCount = rsmd.getColumnCount();
    
    wiersz = wiersz.concat("<table><tr>");
    for (int i = 1; i <= colCount; i++) {
        wiersz = wiersz.concat(" <td><b> " + rsmd.getColumnName(i) + "</b></td> ");
    }
    wiersz = wiersz.concat("</tr>");
    
    while (rs.next()) {
        wiersz = wiersz.concat("<tr>");
        for (int i = 1; i <= colCount; i++) {
            wiersz = wiersz.concat(" <td> " + rs.getString(i) + " </td> ");
    }
        
    wiersz = wiersz.concat("</tr>");
    }
    
    wiersz = wiersz.concat("</table>");
    if (stat != null) {
        stat.close();
    }
    return wiersz;
} 

public static void insertData(String id, String nazwa, String adres, String nip, boolean znizka, boolean osoba) throws SQLException {
        Statement stat = conn.createStatement();
        Date date= new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        String sql = String.format("INSERT INTO app.klienci VALUES (" + id + ", '" + nazwa + "', '" + adres + "', '" + nip + "', '" + ts + "', " + znizka +", " + osoba +") ");
        stat.executeUpdate(sql);
        stat.close();
        
        int idZmiany = getID() + 1;
        
        Statement stat2 = conn.createStatement();
        String comment = "Dodano osobe " + id + " " + nazwa + ".";
        String sql2 = String.format("INSERT INTO app.historia values (" + idZmiany + ", '" + ts + "', '" + comment +"', " + true +") ");
        stat2.executeUpdate(sql2);
        stat2.close();
    }

public static void deleteData(String id) throws SQLException {
        Statement stat = conn.createStatement();
        String sql = String.format("DELETE FROM app.klienci WHERE ID_KLIENTA = " + id);
        stat.executeUpdate(sql);
        stat.close();
        
        Date date= new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        int idZmiany = getID() + 1;
        
        Statement stat2 = conn.createStatement();
        String comment = "Usunięto osobe " + id + ".";
        String sql2 = String.format("INSERT INTO app.historia values (" + idZmiany + ", '" + ts + "', '" + comment +"', " + true +") ");
        stat2.executeUpdate(sql2);
        stat2.close();

    }

public static void saveData() throws SQLException {
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(QUERY);
        ResultSetMetaData rsmd = rs.getMetaData();
        String wiersz = new String();
        int colCount = rsmd.getColumnCount();
        for (int i = 1; i <= colCount; i++) {
            wiersz = wiersz.concat(rsmd.getColumnName(i) + "; ");
        }
        wiersz = wiersz.concat("\r\n");
        while (rs.next()) {
            System.out.println("");
            for (int i = 1; i <= colCount; i++) {
                wiersz = wiersz.concat(rs.getString(i) + "; ");
            }
            wiersz = wiersz.concat("\r\n");
        }
        if (stat != null) {
            stat.close();
        }
        
        try {
            File myObj = new File("danezbazy.csv");
            if (myObj.createNewFile()) {
                System.out.println("Stworzono plik: " + myObj.getName());
            } else {
                System.out.println("Plik już istnieje.");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }
  
        
        try {
            FileWriter myWriter = new FileWriter("danezbazy.csv");
            myWriter.write(wiersz);
            myWriter.close();
            System.out.println("Pomyślnie zapisano dane do pliku.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }
        
    }

public static int getID() throws SQLException {
    Statement stat = conn.createStatement();
    ResultSet rs = stat.executeQuery("SELECT MAX(ID_zmiany) FROM app.historia");
    ResultSetMetaData rsmd = rs.getMetaData();
    String wiersz = new String();
    int colCount = rsmd.getColumnCount();
    while (rs.next()) {
    for (int i = 1; i <= colCount; i++) {
    wiersz = wiersz.concat(rs.getString(i));
    }
    }
    if (stat != null) {
    stat.close();
    }
    int idZmiany = Integer.parseInt(wiersz);
    System.out.println(idZmiany);
    return idZmiany;

    }

public static String getHistoryData() throws SQLException {
    Statement stat = conn.createStatement();
    ResultSet rs = stat.executeQuery("select * from app.historia");
    ResultSetMetaData rsmd = rs.getMetaData();
    String wiersz = new String();
    int colCount = rsmd.getColumnCount();
    
    wiersz = wiersz.concat("<table><tr>");
    for (int i = 1; i <= colCount; i++) {
        wiersz = wiersz.concat(" <td><b> " + rsmd.getColumnName(i) + "</b></td> ");
    }
    wiersz = wiersz.concat("</tr>");
    
    while (rs.next()) {
        wiersz = wiersz.concat("<tr>");
        for (int i = 1; i <= colCount; i++) {
            wiersz = wiersz.concat(" <td> " + rs.getString(i) + " </td> ");
    }
        
    wiersz = wiersz.concat("</tr>");
    }
    
    wiersz = wiersz.concat("</table>");
    if (stat != null) {
        stat.close();
    }
    return wiersz;
} 

}
