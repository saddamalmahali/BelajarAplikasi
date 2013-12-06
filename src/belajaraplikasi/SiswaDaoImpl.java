/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaraplikasi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saddam
 */

public class SiswaDaoImpl implements SiswaDao{
    List<Siswa> listSiswa = new  ArrayList<Siswa>();
    
    
    @Override
    public void insertSiswa(Siswa siswa) {
        
        listSiswa.add(siswa);
        System.out.println("Siswa Ditambahkan... :)");
    }

    @Override
    public List<Siswa> getSiswaSemua() {
        List<Siswa> siswa = new ArrayList<>();
        siswa = listSiswa;
        return siswa;
    }
    
    
    
}
