package com.example.mylibrary;

public class JNITools {
    static {
        System.loadLibrary("mylibrary");
    }
    public static native int addNumber(int a, int b);
    public static native int subNumber(int a, int b);
    public static native int mulNumber(int a, int b);
    public static native int divNumber(int a, int b);
}
