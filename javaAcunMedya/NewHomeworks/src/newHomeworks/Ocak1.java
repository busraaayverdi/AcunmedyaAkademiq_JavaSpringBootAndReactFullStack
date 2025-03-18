package newHomeworks;

import java.util.Scanner;

public class Ocak1 {
    public static void main(String[] args) {
//        Java Nedir? Nerelerde Kullanılır?
//        Java, nesne yönelimli, platformdan bağımsız, çok amaçlı bir programlama dilidir.
//        "Bir kere yaz, her yerde çalıştır" (WORA) prensibiyle geliştirilmiş olup, JVM (Java Virtual Machine) sayesinde farklı işletim sistemlerinde çalışabilir.

//        Kullanım Alanları:
//
//        Web geliştirme (Spring, Java EE)
//        Mobil uygulamalar (Android)
//        Oyun geliştirme
//        Büyük veri ve yapay zeka uygulamaları
//        Gömülü sistemler

//        Java’nın Bileşenleri:
//
//        JDK (Java Development Kit): Java uygulamaları geliştirmek için gerekli olan araç setidir. İçinde JRE ve geliştirme araçları bulunur.
//        JRE (Java Runtime Environment): Java programlarını çalıştırmak için gerekli olan ortamdır. JVM ve temel kütüphaneleri içerir.
//        JVM (Java Virtual Machine): Java kodlarını makine koduna çevirerek çalıştıran sanal makinedir. JVM, platform bağımsızlığı sağlar.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();


    }
}