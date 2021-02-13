package tjee.marcinkowski_pawel_lab1;

import java.io.File;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;

public class Marcinkowski_pawel_lab1 {

    public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    public static final String JDBC_URL = "jdbc:derby:C:\\Users\\thelu\\Documents\\NetBeansProjects\\marcinkowski_pawel_lab1\\db\\marcinkowski_pawel_db";
    public static final String QUERY = "select * from APP.MARCINKOWSKI_PAWEL_SPIS_PRACOWNIKOW_TB";

    private static java.sql.Connection conn;

    public static boolean Connect() throws ClassNotFoundException, SQLException {
        conn = DriverManager.getConnection(JDBC_URL);
        if (conn == null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean Disconnect() throws SQLException {
        if (conn == null) {
            return false;
        } else {
            conn.close();
            return true;
        }
    }

    public static String getData() throws SQLException {
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(QUERY);
        ResultSetMetaData rsmd = rs.getMetaData();
        String wiersz = new String();
        int colCount = rsmd.getColumnCount();
        for (int i = 1; i <= colCount; i++) {
            wiersz = wiersz.concat(rsmd.getColumnName(i) + " \t| ");
        }
        wiersz = wiersz.concat("\r\n");
        while (rs.next()) {
            System.out.println("");
            for (int i = 1; i <= colCount; i++) {
                wiersz = wiersz.concat(rs.getString(i) + " \t| ");
            }
            wiersz = wiersz.concat("\r\n");
        }
        if (stat != null) {
            stat.close();
        }
        return wiersz;
    }

    public static void insertData(String id, String pracownik, String stanowisko, String nrPokoju, String dataZatrudnienia, boolean czyZdalnie, boolean czyUrlop) throws SQLException {
        Statement stat = conn.createStatement();
        String sql = String.format("INSERT INTO APP.MARCINKOWSKI_PAWEL_SPIS_PRACOWNIKOW_TB VALUES (" + id + ", '" + pracownik + "', '" + stanowisko + "', " + nrPokoju + ", '" + dataZatrudnienia +"', " + czyZdalnie +", " + czyUrlop +") ");
        stat.executeUpdate(sql);
        stat.close();

    }
    
    public static void deleteData(String id) throws SQLException {
        Statement stat = conn.createStatement();
        String sql = String.format("DELETE FROM APP.MARCINKOWSKI_PAWEL_SPIS_PRACOWNIKOW_TB WHERE ID_PRACOWNIKA = " + id);
        stat.executeUpdate(sql);
        stat.close();

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
    
}
