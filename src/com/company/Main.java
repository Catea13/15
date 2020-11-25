package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<Acvarium> acvarium = new ArrayList<Acvarium>();//Am pus datele in Collectia ArrayList
        acvarium.add(new Acvarium());
        acvarium.add(new Acvarium(5, "Oval", 200, 20, 20));
        acvarium.add(new Acvarium(10, "Oval", 600, 40, 20));
        acvarium.add(new Acvarium(20, "Oval", 800, "50", "20"));
        for (Acvarium acvarium1 : acvarium) {
            System.out.println(acvarium1);//Afiseaza datelor
        }
        /**Comporare**/
        if (acvarium.get(1).vetuitoare > acvarium.get(2).vetuitoare) {
            System.out.println("1 acvarium are mai mult veturitoare decit acvarium 2");
        } else {
            System.out.println("2 acvarium are mai mult veturitoare decit acvarium 1");

            if (acvarium.get(1).vetuitoare > acvarium.get(2).vetuitoare) {
                acvarium.get(2).setVetuitoare(30);
            } else {
                acvarium.get(1).setVetuitoare(30);
            }
            System.out.println("After change" + acvarium);
            //adaugare 2 obiecte
            int n = acvarium.get(0).vetuitoare + acvarium.get(1).getVetuitoare();
            acvarium.get(3).setVetuitoare(n);
            System.out.println(acvarium.get(0));

            Scanner vetuitoare = new Scanner(System.in);
            System.out.println("Vetuitoare");//Introduceti vetuitoare

            Integer pr = vetuitoare.nextInt();


            Scanner forma = new Scanner(System.in);//Intreduceti forma
            System.out.println("forma");
            String formas = forma.nextLine();


            Scanner pretul = new Scanner(System.in);
            System.out.println("pretul");
            Integer pretului = pretul.nextInt();


            Scanner dimensiunea = new Scanner(System.in);
            System.out.println("dimensiunea");
            Integer dim = dimensiunea.nextInt();

            Scanner volumul = new Scanner(System.in);
            System.out.println("Dati volumul");
            Integer volum = volumul.nextInt();
            System.out.println(pr + formas + pretului + dim + volum);


            System.out.println("-------------------------------------------------------------------------");
            System.out.println("URRRRRRRRRRRRRRRRRAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
            /*Salvare datelor in fisier*/
            PrintWriter out = null;
            try {
                out = new PrintWriter("acvarium.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            out.println(acvarium);
            out.close();
        }
    }


}
