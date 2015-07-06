package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //Membuat Liga
        Liga sekber = new Liga("Sekber League");
        Liga jungle = new Liga("League of Jungle");

        //Divisi sekber
        Divisi utama = new Divisi("Sekber Premiere League",sekber);
        Divisi satu = new Divisi("Sekber Champions League",sekber);
        //Set divisi
        sekber.setDaftarDivisi(utama);
        sekber.setDaftarDivisi(satu);

        //Divisi Jungle
        Divisi primary = new Divisi("King of Jungle",jungle);
        Divisi second = new Divisi("Master of Jungle",jungle);
        //set divisi
        jungle.setDaftarDivisi(primary);
        jungle.setDaftarDivisi(second);

        //Club sekber
        Club lpm = new Club("LPM Kompen",utama,sekber);
        Club or = new Club("Sportifor",utama,sekber);
        Club seni = new Club("Theatrisic",utama,sekber);
        Club gg = new Club("OPA GG FC",satu,sekber);
        Club hmi = new Club("Informatics FC",satu,sekber);
        Club hmm = new Club("Solidarity FC",satu,sekber);
        //set club sekber
        utama.setDaftarClub(lpm);
        utama.setDaftarClub(or);
        utama.setDaftarClub(seni);
        satu.setDaftarClub(gg);
        satu.setDaftarClub(hmi);
        satu.setDaftarClub(hmm);

        //Club Jungle
        Club lion = new Club("Angel Lions FC",primary,jungle);
        Club tiger = new Club("White Tiger FC",primary,jungle);
        Club snake = new Club("The Vipers FC",primary,jungle);
        Club whale = new Club("The Whales Blue",second,jungle);
        Club shark = new Club("Shark Knight",second,jungle);
        Club crab = new Club("The Krusty Crabs",second,jungle);
        //set club jungle
        primary.setDaftarClub(lion);
        primary.setDaftarClub(tiger);
        primary.setDaftarClub(snake);
        second.setDaftarClub(whale);
        second.setDaftarClub(shark);
        second.setDaftarClub(crab);

        System.out.println("Nomer 1");
        System.out.println("    Divisi dari 'Sekber League' adalah : ");
        sekber.getDaftarDivisi("Sekber League");
        System.out.println("    Divisi dari Liga Jungle ");
        jungle.getDaftarDivisi("League of Jungle");
        System.out.println();

        System.out.println("Nomer 2");
        System.out.println("    Club dari 'Sekber League'");
        utama.getDaftarClubbyLiga("Sekber League");
        System.out.println();
        System.out.println("    Club dari 'League of Jungle'");
        primary.getDaftarClubbyLiga("League of Jungle");
        System.out.println();

        System.out.println("Nomer 3");
        System.out.println("   Club dari Divisi 'Sekber Premiere League'");
        utama.getDaftarClubbyDivisi("Sekber Premiere League");
        System.out.println("   Club dari Divisi 'Master of Jungle'");
        primary.getDaftarClubbyDivisi("Master of Jungle");
        System.out.println();

        System.out.println("Nomer 4");
        System.out.println("    Club 'LPM Kompen' berada di Divisi");
        lpm.getDivisi("LPM Kompen");
        System.out.println("    Club 'Shark Knight' berada di Divisi");
        shark.getDivisi("Shark Knight");
        System.out.println();

        System.out.println("Nomer 5");
        System.out.println("    Club 'Theatrisic' berada di Liga");
        seni.getLiga("Theatrisic");
        System.out.println("    Club 'Angel Lions FC' berada di Liga");
        lion.getLiga("Angel Lions FC");
        System.out.println();

        System.out.println("Sekian Tugas Dari Saya Wassalamualaikum Wr. Wb. :)");
        System.out.println("    Achmad Fauzi Makharim");
        System.out.println("    1431140076");
        System.out.println("    Manajemen Informatika 1D");
    }
}
