/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajaraplikasi.adam.generik;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author saddam
 * @param <T>
 * @param <PK>
 */
public interface GenericDao<T, PK extends Serializable> {
    PK create(T newInstances);
    T read(PK id);
    
    void update(T transientObject);
    
    void delete(T persistenceObject);
}
