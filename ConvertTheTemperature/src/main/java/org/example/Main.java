package org.example;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sicaklik;
        double kelvin;
        double fahrenheit;
        double [] dizi = new double[2];

        System.out.print("Sıcaklık Değerini Girin: ");
        Scanner sc = new Scanner(System.in);
        sicaklik = sc.nextDouble();

        kelvin = sicaklik + 273.15;
        fahrenheit = sicaklik * 1.80 + 32.00;

        dizi[0] = kelvin;
        dizi[1] = fahrenheit;

        System.out.println(Arrays.toString(dizi));
        System.out.println("Girilen sıcaklık: " + sicaklik);
        System.out.println("Girilen sıcaklığın Kelvin dönüşümü: " + kelvin);
        System.out.println("Girilen sıcaklığın Fahrenheit dönüşümü: " + fahrenheit);

    }
}