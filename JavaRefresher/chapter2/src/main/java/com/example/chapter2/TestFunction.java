package com.example.chapter2;

public class TestFunction {

    public static void main(String[] args) {
        System.out.println(add(2,45));

        MyClass ob = new MyClass();
        ob.TestPrint();


    }

    public static int add(int a , int b){

        return a+b;

    }
}
