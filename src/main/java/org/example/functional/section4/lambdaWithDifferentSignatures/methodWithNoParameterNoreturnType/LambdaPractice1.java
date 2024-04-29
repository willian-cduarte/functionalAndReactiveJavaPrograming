package org.example.functional.section4.lambdaWithDifferentSignatures.methodWithNoParameterNoreturnType;

public class LambdaPractice1 {

    public static void main(String[] args) {

        Name name = () -> System.out.println("Willian");
        name.myName();

    }

    public void myName() {
        System.out.println("Willian");
    }
}
