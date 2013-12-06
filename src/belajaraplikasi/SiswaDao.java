/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaraplikasi;

import java.util.List;

/**
 *
 * @author saddam
 */

public interface SiswaDao {
    public void insertSiswa(Siswa siswa);
    public List<Siswa> getSiswaSemua();
}
