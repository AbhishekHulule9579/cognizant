package Ori;

import java.util.Scanner;

public class MinimumDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime Q12");
        System.out.println("Enter total number of item");
        int n = scanner.nextInt(); 
        String[] items = new String[n];
        System.out.println("Enter name of product,price,discount offered");
        for (int i = 0; i < n; i++) {
            items[i] = scanner.next();
        }

        int minDiscount = Integer.MAX_VALUE;
        String minDiscountItem = "";

        for (String item : items) {
            String[] parts = item.split(",");
            int price = Integer.parseInt(parts[1]);
            int discount = Integer.parseInt(parts[2]);

            int discountAmount = (price * discount) / 100;
            if (discountAmount < minDiscount) {
                minDiscount = discountAmount;
                minDiscountItem = parts[0];
            } else if (discountAmount == minDiscount) {
                minDiscountItem += ", " + parts[0];
            }
        }

        System.out.println(minDiscountItem);
    }
}