/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;



/**
 *
 * @author toan0
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        long result = MathUtil.getfactorial(5);
        System.out.println("Expect 5!= 120; actual: " + result);
        System.out.println(" Expect 6!= 720; actual: " + MathUtil.getfactorial(6));
        System.out.println(" Expect 0!= 1; actual: " + MathUtil.getfactorial(0));
    }
    
}
