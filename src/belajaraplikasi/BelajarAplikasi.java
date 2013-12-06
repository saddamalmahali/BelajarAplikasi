/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaraplikasi;



/**
 *
 * @author saddam
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
public class BelajarAplikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException, SQLException, Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BelajarAplikasiPU");
        
        SiswaJpaController controller = new SiswaJpaController(emf);
        Siswa siswa = new Siswa();
        siswa.setId(2);
        siswa.setNama("Irham");
        siswa.setAlamat("Nangewer");
        controller.create(siswa);
        
    }
}
