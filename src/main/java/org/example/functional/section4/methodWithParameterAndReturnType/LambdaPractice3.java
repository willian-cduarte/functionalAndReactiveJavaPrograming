package org.example.functional.section4.methodWithParameterAndReturnType;

public class LambdaPractice3 {

    public static void main(String[] args) {

        LengthOfString len = str -> {

            int l = str.length();

            System.out.println("The length of the given String is "+ l);

            return l;

        };

        int length = len.length("BasicsStrong");
        System.out.println(length);

        System.out.println(len.length("will"));

    }
}
