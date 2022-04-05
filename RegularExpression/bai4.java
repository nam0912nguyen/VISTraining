package RegularExpression;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            String emailPattern = "\\w+@\\w+[.]\\w+";
            System.out.print("Nhap email");
            String input = sc.next();
            flag = input.matches(emailPattern);
            if (!flag) System.out.println("Email khong dung dinh dang");
        } while (!flag);
        System.out.println("Email dung dinh dang");
    }
}