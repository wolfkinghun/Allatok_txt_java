package com.company;

import java.awt.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public class Adat{
        public String allatfaj;
        public Integer magassag;
        public Integer suly;
        public Integer eletkor;
        public Adat(String sor){
            String[] s = sor.split(";");
            allatfaj = s[0];
            magassag = Integer.parseInt(s[1]);
            suly = Integer.parseInt(s[2]);
            eletkor = Integer.parseInt(s[3]);
        }
    }
    ArrayList<Adat> adatok = new ArrayList();

    public Main (){
        betolt("allatok.csv");
        System.out.printf(" 0) Összesen %d féle állatfajta adata beolvasva",adatok.size());
        //1.feladat
        String legmagasabb_nev = "";
        int legmagasabb = adatok.get(0).magassag;
        for (Adat x:adatok
             ) {
            if(legmagasabb<x.magassag){
                legmagasabb_nev=x.allatfaj;
                legmagasabb = x.magassag;
            }

        }
        System.out.println("\n1) A legmagasabb állatfajta: "+legmagasabb_nev+", "+legmagasabb+"cm");
        //2.feladat
        float atlag = 0;
        Integer count = 0;
        for (Adat x:adatok
        ) {
            if(20<x.suly){
                atlag+=x.eletkor;
                count++;
            }
        }
        System.out.printf("2) A húsz kilónál nehezebb fajták átlagéletkora: %.2f év \n", atlag / count);
        // 3. feladat
        int sulyOsszeg = 0; for (Adat a : adatok) sulyOsszeg += a.suly;
        int sulyAtlag = sulyOsszeg / adatok.size();

        Adat atlagos = adatok.get(0);

        for (Adat a : adatok) if (Math.abs(a.suly-sulyAtlag) < Math.abs(atlagos.suly-sulyAtlag)) atlagos = a;
        System.out.printf("3) Az átlagsúlyhoz (%dkg) legközelebbi fajta: %s (%dkg)\n", sulyAtlag, atlagos.allatfaj, atlagos.suly);
        //4.feladat
        System.out.printf("4) Kettős betű van a fajta nevében:\n");
        for (Adat a : adatok) {
            boolean dupla = false;
            for (int i = 0; i < a.allatfaj.length() - 1; i++)
                if (a.allatfaj.charAt(i) == a.allatfaj.charAt(i + 1)) dupla = true;
            if (dupla) System.out.printf("   * %s\n", a.allatfaj);
        }
        //5 feladat
        TreeMap<Integer, Integer> magasDb = new TreeMap();
        for (Adat x:adatok){
            int kat = x.magassag/50;
            if(!magasDb.containsKey(kat)){
                magasDb.put(kat,1);
            }else{
                magasDb.put(kat,magasDb.get(kat)+1);
            }
        }
        System.out.printf("5) Magasság kategórák (50cm):\n");
        ArrayList<Integer> magasKat = new ArrayList();
        for (Integer k : magasDb.keySet()) {
            magasKat.add(k);
            //System.out.println(k);
            System.out.printf("   * %03d-%03dcm: %d darab\n", k*50, k*50+49, magasDb.get(k));
        }

        // 6. feladat
        int v = magasKat.get((int)(Math.random()*magasKat.size()));
        System.out.printf("6) Ebből egy véletlen kategóriába (%d-%dcm) eső állatok:\n   * ", v*50, v*50+49);
        String vesszo = "";
        for (Adat a : adatok) {
            if (a.magassag >= v*50 && a.magassag <= v*50+49) { System.out.printf(vesszo + "%s", a.allatfaj); vesszo = ", "; }
        }

        // 7. feladat
        PrintWriter ki = null;
        try {
            ki = new PrintWriter(new File("kicsi.csv"), "utf-8");
            for (Adat a : adatok) {
                if (a.magassag < 100) ki.printf("%s;%d;%d;%d\r\n", a.allatfaj, a.magassag, a.suly, a.eletkor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ki != null) ki.close();
        }

    }
    public void betolt(String file){
        Scanner be = null;
        try{
            be = new Scanner(new File(file),"utf-8");
            be.nextLine();
            while(be.hasNextLine()){
                adatok.add(new Adat(be.nextLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(be!=null){
                be.close();
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
