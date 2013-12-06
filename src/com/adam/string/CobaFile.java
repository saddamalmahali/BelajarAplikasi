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
public class CobaFile {
    public static void main(String[]args){
        String searchMe = "saddam irham and manda";
        String findMe = "irham";
        int searchMeLenth = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;
        System.out.println(searchMeLenth);
        System.out.println(findMeLength);
        for(int i=0; i<(searchMeLenth-findMeLength); i++){
            if(searchMe.regionMatches(i, findMe, 0, findMeLength)){
                foundIt = true;
                System.out.println(searchMe.substring(i, i+findMeLength));
                break;
            }
            
            if(!foundIt){
                System.out.println("No Match found!");
            }
        }
    }
}
