package com.company;

public class Main {

    public static void main(String[] args) {
        String palindrom = "abba";
        String nova = "";
        for (int i = 0; i <palindrom.length() ; i++) {
            nova+=palindrom.charAt(palindrom.length()-1-i);


        }
        System.out.println(nova);
        System.out.println(palindrom.equals(nova));
        nova = "";
        System.out.println("--------------------------------");
        for (int i = palindrom.length()-1; i >= 0 ; i--) {
            nova += palindrom.charAt(i);

        }
        System.out.println(nova);
    }
}
