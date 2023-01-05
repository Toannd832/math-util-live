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
        
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY-CODE LÊN SERVER 4:32PM 4/1/2023
        System.out.println(" Expect 1!= 1; actual: " + MathUtil.getfactorial(1));
        System.out.println(" Expect 3!= 6; actual: " + MathUtil.getfactorial(3));

    }

}
