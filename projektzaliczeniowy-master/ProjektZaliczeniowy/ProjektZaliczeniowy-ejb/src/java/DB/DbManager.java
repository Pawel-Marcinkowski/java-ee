package DB;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DbManager {

    public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public static final String JDBC_URL = "jdbc:derby://localhost:1527/BazaDanych";
    public static final String QUERY = "select * from app.pliki";
    private static java.sql.Connection conn;

    private DbManager() {
    }

    public static boolean Connect() throws ClassNotFoundException, SQLException {
        conn = DriverManager.getConnection(JDBC_URL, "Student", "wcy");
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
        wiersz = wiersz.concat("<br />");
        while (rs.next()) {
            System.out.println("");
            for (int i = 1; i <= colCount; i++) {
                wiersz = wiersz.concat(rs.getString(i) + " \t| ");
            }
            wiersz = wiersz.concat("<br />");
        }
        if (stat != null) {
            stat.close();
        }
        return wiersz;
    }

    public static void insertData(String id, File plik, String algorytm) throws SQLException {
        try {
            byte[] byteFile = Files.readAllBytes(plik.toPath());
            FileInputStream inputStream = new FileInputStream(plik);
            Date date = new Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            PreparedStatement stat = conn.prepareStatement("INSERT INTO app.PLIKI VALUES (?, ?, ?, ?)");
            stat.setInt(1, Integer.parseInt(id));
            stat.setBlob(2, inputStream);
            stat.setDate(3, sqlDate);
            stat.setString(4, algorytm);
            stat.executeUpdate();
            stat.close();
        } catch (IOException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static byte[] getFile(String id) throws SQLException {
        String SQL = "Select plik from app.pliki where id = " + id;
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(SQL);
        ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        byte[] bity = null;
        while (rs.next()) {
           
            for (int i = 1; i <= colCount; i++) {
                bity = rs.getBytes(i);
            }
        }
        if (stat != null) {
            stat.close();
        }
        return bity;
    }
    
    public static void deleteData(String id) throws SQLException {
        Statement stat = conn.createStatement();
        String sql = String.format("DELETE FROM app.pliki WHERE id = " + id);
        stat.executeUpdate(sql);
        stat.close();
    }


}
