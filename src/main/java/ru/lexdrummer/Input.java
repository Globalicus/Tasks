package main.java.ru.lexdrummer;

import java.io.InputStream;
import java.util.Scanner;

public class Input {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int x = s.nextInt();
        System.out.println(27+x);
    }
}
