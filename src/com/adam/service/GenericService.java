/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adam.service;

import java.util.List;

/**
 *
 * @author saddam
 */
public abstract class GenericService<T, K> {

    public abstract void save(T t);
    public abstract void delete(T t);
    public abstract T findById(K id);
    public abstract List<T> findAll();
    
}
