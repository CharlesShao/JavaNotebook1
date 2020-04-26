package com.komorebishao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            String[] s = str.split(" ");
            int len = str.length();
            for (int i = s.length -1; i >= 0; i--){
                stringBuilder.append(s[i] + " ");
            }
            System.out.println(stringBuilder.substring(0,len));
        }
    }
}
