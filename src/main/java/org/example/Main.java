package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

    public static void moveFirstMElementsToEnd(int[] A, int m) {
        reverse(A, 0, A.length - 1);
        reverse(A, 0, m - 1);
        reverse(A, m, A.length - 1);
    }
}