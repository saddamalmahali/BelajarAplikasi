/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adam.string;

/**
 *
 * @author saddam
 */
public class FileName {
    
    private String fullPath;
    private char pathSeparator, extensionSeparator;

    public FileName(String str, char sep, char ext) {
        fullPath = str;
        this.pathSeparator = sep;
        this.extensionSeparator = ext;
    }
    
    public String extension(){
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot);
    }
    
    public String fileName(){
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep+1, dot);
    }
    
    public String path(){
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
    
}


