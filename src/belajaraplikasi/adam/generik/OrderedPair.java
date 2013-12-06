/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajaraplikasi.adam.generik;

/**
 *
 * @author saddam
 */
public class OrderedPair<K, V> implements Pair<K, V>{
    
    private K key;
    private V value;

    public OrderedPair() {
    }
    
    
    
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }    
    
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
    
}
