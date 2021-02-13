package DB;

import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;

@Stateful
public class DBAccessBean implements DBAccessBeanRemote {

    private boolean polaczenie = false;
    private String data;

    @Override
    public boolean isPolaczenie() {
        return polaczenie;
    }

    @Override
    public void setPolaczenie(boolean polaczenie) {
        this.polaczenie = polaczenie;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getDataFromDb() {
        try {
            polaczenie = DbManager.Connect();
            if (polaczenie) {
                data = DbManager.getData();
                polaczenie = DbManager.Disconnect();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAccessBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public void uploadFile(String id, File plik, String algorytm) {
        try {
            polaczenie = DbManager.Connect();
            if (polaczenie) {
                DbManager.insertData(id, plik, algorytm);
                polaczenie = DbManager.Disconnect();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAccessBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void polacz() {
        try {
            polaczenie = DbManager.Connect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAccessBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public byte[] pobierz(String id){
        byte[] bity = null;
        try {
            polaczenie = DbManager.Connect();
            if (polaczenie) {
                bity = DbManager.getFile(id);
                polaczenie = DbManager.Disconnect();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAccessBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bity;
    }
    
    @Override
    public void deleteData(String id) {
        try {
            polaczenie = DbManager.Connect();
            if (polaczenie) {
                DbManager.deleteData(id);
                polaczenie = DbManager.Disconnect();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAccessBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
