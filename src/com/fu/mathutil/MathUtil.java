package com.fu.mathutil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toan0
 */
//Ta viết Class để cung cấp cái tiện ích ch onoi71 khác xài
// Ta ko cần nhớ cái gì
// cho ring6 ta , hàm STATIC giúp làm điều này
public class MathUtil {
    //Quy ước o! 1! = 1
    //Ko tính giai thừa cho sối âm
    //20! là vừa khớp kiểu long, tối đa 18 số 0

    public static long getfactorial(int n) {
        // chơi 0-20! thôi

        //Nếu đưa vào âm hoặc lớn hơn 20 
        // bắn ngoại lệ đéo tính được
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0-20");
            //hàm dừng liền éo cần return

        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // n=2...20 
        //for hoặc đệ quy
        long product = 1; //tích khởi đầu = 1 
        for (int i = 2; i <= n; i++) {
            product *= i;

        }
        return product;
    }
}
