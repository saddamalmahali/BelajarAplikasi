/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adam.test;

import belajaraplikasi.adam.generik.OrderedPair;
import belajaraplikasi.adam.generik.Pair;
import belajaraplikasi.adam.generik.Penambahan;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author saddam
 */
@RunWith(JUnit4.class)
public class PairTest {
    
    @Test
    public void testPenjumlahan(){
        Penambahan tambah = new Penambahan();
        assertEquals("Apabila dimasukan nilai1 5 dan nilai2 10 maka hasilnya akan 50", 15, tambah.tambah(10, 5));
    }
    
}
