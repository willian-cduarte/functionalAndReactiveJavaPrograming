package org.example.functional.section4.methodWithParameterAndReturnType;

public class LambdaPractice4 {

    public static void main(String[] args) {

        LengthOfString len = str -> { return str.length(); };
        int length = len.length("BasicsStrong");
        System.out.println(length);
    }
}
