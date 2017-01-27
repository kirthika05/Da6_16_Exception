package com.kirthika;

import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int n=0;
        try{
            n=Integer.parseInt(S);
            System.out.printf("%d",n);
        }

        catch(NumberFormatException e){
            System.out.printf("Bad String");
        }
    }
}
