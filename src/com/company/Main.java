package com.company;

public class Main
{
    public static void main(String[] args) {
        int n = 0;
        boolean found = false;

        while (!found) {
            if ((n * n * n + 91) % 47 == 0) {
                System.out.println(n);
                found = true;
            }
            n+=1;
        }
    }
}