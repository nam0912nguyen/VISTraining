package CuPhapCoBan;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("Nhap vao chieu cao tam giac: ");
        height = sc.nextInt();
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}