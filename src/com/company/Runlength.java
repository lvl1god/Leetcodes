package com.company;

import java.util.Scanner;

public class Runlength {
    public static String RunLength(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            int count = 1;
           while(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
               count++;
               i++;
           }
            sb.append(count);
            sb.append(str.charAt(i));
        }
        str = sb.toString();

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(RunLength(s.nextLine()));
    }

}
