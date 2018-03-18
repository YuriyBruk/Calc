package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Calc calculator = new Calc();
        String s = input("Введите число: ");
        String operation = input("Введите операцию: ");
        String w = input("Введите число: ");
        int a = 0;
        try {
            a = Integer.parseInt(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        calculator.add(a);
        int r = Integer.parseInt(w);
        byte var7 = -1;
        switch (operation.hashCode()) {
            case 42:
                if (operation.equals("*")) {
                    var7 = 3;
                }
                break;
            case 43:
                if (operation.equals("+")) {
                    var7 = 0;
                }
            case 44:
            case 46:
            default:
                break;
            case 45:
                if (operation.equals("-")) {
                    var7 = 1;
                }
                break;
            case 47:
                if (operation.equals("/")) {
                    var7 = 2;
                }
        }

        switch (var7) {
            case 0:
                calculator.add(r);
                break;
            case 1:
                calculator.deduct(r);
                break;
            case 2:
                calculator.divide(r);
                break;
            case 3:
                calculator.multiple(r);
                break;
            default:
                System.out.println("Данная операция отсутсвует");
        }

        System.out.println("Результат: " + calculator.getResult());
    }

    public static String input(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        return reader.readLine();
    }
}
