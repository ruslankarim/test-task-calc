package com.company.ruslan_karimov;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws NumberFormatException {
	    Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String [] parts = str.split(" ");
        int[] arr = new ParseStr().parse(parts);
        int res = new Calculate().execute(arr, parts[1]);
        if (ParseStr.isRoman){
            String string = new ConvertNums().inverseExecute(res);
            System.out.println(string);
        }else {
            System.out.println(res);
        }
    }
}
