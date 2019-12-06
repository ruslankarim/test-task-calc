package com.company.ruslan_karimov;

import java.util.HashMap;
import java.util.Map;

class ConvertNums {

    private static int numbers[]  = {1, 4, 5, 9, 10, 40, 50, 90, 100,};
    private String n;

    ConvertNums (){

    }

    private static Map<Integer, String> createMapRoman(){
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "I");
        hashMap.put(4, "IV");
        hashMap.put(5, "V");
        hashMap.put(9, "IX");
        hashMap.put(10, "X");
        hashMap.put(40, "XL");
        hashMap.put(50, "L");
        hashMap.put(90, "XC");
        hashMap.put(100, "C");
        return hashMap;
    }

    ConvertNums (String num) {
        n = num;
    }
    int convert () {
        if (this.n.equals("I")) {
            return 1;
        }else if (this.n.equals("II")) {
            return 2;
        }else if (this.n.equals("III")) {
            return 3;
        }else if (this.n.equals("IV")) {
            return 4;
        }else if (this.n.equals("V")) {
            return 5;
        }else if (this.n.equals("VI")) {
            return 6;
        }else if (this.n.equals("VII")) {
            return 7;
        }else if (this.n.equals("VIII")) {
            return 8;
        }else if (this.n.equals("IX")) {
            return 9;
        }else if (this.n.equals("X")) {
            return 10;
        }else {
            return 0;
        }
    }

    String inverseConvert(int n){
        String roman = "";
        if (n <= 0){
            return roman = "В римской системе счисления отсутствует ноль и отрицательные числа";
        }
        Map<Integer, String> hashMap = ConvertNums.createMapRoman();
        int i = numbers.length - 1;
        StringBuilder sb = new StringBuilder();
        while ((n > 0) && (i < hashMap.size())) {

            if(numbers[i] <= n){
                sb.append(hashMap.get(numbers[i]));
                n -= numbers[i];
            }else {
                i--;
            }
        }
        return sb.toString();
    }
}
