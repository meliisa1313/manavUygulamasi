package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        //Formül
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double toplamTutar;
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.00;
        Scanner input=new Scanner(System.in);
        System.out.println("armut kac kg aldiniz");
        armutKg= input.nextDouble();
        System.out.println("elma kac kg aldiniz");
        elmaKg=input.nextDouble();
        System.out.println("domates kac kg aldiniz");
        domatesKg= input.nextDouble();
        System.out.println("muz kac kg aldiniz");
        muzKg=input.nextDouble();
        System.out.println("kac kg patlican aldiniz");
        patlicanKg=input.nextDouble();
        toplamTutar=(armutFiyat*armutKg)+(elmaFiyat*elmaKg)+(domatesFiyat*domatesKg)+(muzFiyat*muzKg)+(patlicanFiyat*patlicanKg);
        System.out.println(toplamTutar);






        }






    }

