package com.programs.testreturn;

class ArrayProvider {
    byte[] getByteArray() {
        byte[] byteArray = {10, 20, 30, 40, 50};
        return byteArray;
    }
}

public class Prog8 {
    public static void main(String[] args) {
        ArrayProvider provider = new ArrayProvider();
        byte[] byteArray = provider.getByteArray();
        
        System.out.print("The byte array is: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
    }
}

