package com.arnabb.unit2;

public class MethodReferenceEx1 {
    public static void main(String[] args) {
        Thread t = new Thread(MethodReferenceEx1::printMsg);
        t.start();
    }

    public static void printMsg()
    {
        System.out.println("Method Reference Example 1");
    }
}
