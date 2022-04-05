package CuPhapCoBan;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }

        }
        System.out.println("Tong N so nguyen to dau la:" + sum);
    }

public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i =2; i <= Math.sqrt(n); i++){
            if (n % i == 0 ) return false;
        }
        return true;
}
}