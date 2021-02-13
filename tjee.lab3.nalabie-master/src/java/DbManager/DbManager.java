package DbManager;

import Person.Person;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public final class DbManager {
    public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public static final String JDBC_URL = "jdbc:derby://localhost:1527/L3db";
    public static final String QUERY = "SELECT * FROM APP.Ludzie";

    private static java.sql.Connection conn;

    private DbManager() {
    }

    public static boolean Connect() throws ClassNotFoundException, SQLException {
        conn = DriverManager.getConnection(JDBC_URL, "student", "wcy");
        if (conn == null) {
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean getConnection(){
        if(conn == null){
            return false;
        } else {
            return true;
        }
    }

    public static boolean Disconnect() throws SQLException {
        conn = DriverManager.getConnection(JDBC_URL, "student", "wcy");
        if (conn == null) {
            return false;
        } else {
            conn.close();
            return true;
        }
    }
    
    public static ArrayList<Person> getData() throws SQLException {
        PreparedStatement stat = conn.prepareStatement(QUERY);
        ResultSet rs = stat.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        ArrayList<Person> personList = new ArrayList<Person>();
        while(rs.next()){
            Person tmp = new Person(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            personList.add(tmp);
        }
        return personList;
    }

}
