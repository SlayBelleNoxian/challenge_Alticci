package org.acme;

public class Functions {

    public static int a(int n){
        //Default Values
        if( n == 0 ) return 0;
        if( n == 1 || n == 2) return 1;

        //Recursive Function
        return a(n-3) + a(n-2);
    }
}
