/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adam.model;

import java.util.Objects;

/**
 *
 * @author saddam
 */
public class Santri {
    private int idSantri;
    private String namaDepan;
    private String namaBelakang;

    public Santri() {
    }

    public Santri(int idSantri, String namaDepan, String namaBelakang) {
        this.idSantri = idSantri;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }    
    
    
    public int getIdSantri() {
        return idSantri;
    }

    public void setIdSantri(int idSantri) {
        this.idSantri = idSantri;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idSantri;
        hash = 97 * hash + Objects.hashCode(this.namaDepan);
        hash = 97 * hash + Objects.hashCode(this.namaBelakang);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Santri other = (Santri) obj;
        if (this.idSantri != other.idSantri) {
            return false;
        }
        if (!Objects.equals(this.namaDepan, other.namaDepan)) {
            return false;
        }
        if (!Objects.equals(this.namaBelakang, other.namaBelakang)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
