package com.KenaliPenyakit;
import DataSistemPakar.DataAritmia;
import DataSistemPakar.DataKardiomiopati;
import DataSistemPakar.DataEndokarditis;
import DataSistemPakar.DataJantungKoroner;
import DataSistemPakar.DataJantungBawaan;
class Aritmia extends DataAritmia {}
class Kardiomiopati extends DataKardiomiopati {}
class Endokarditis extends DataEndokarditis {}
class JantungKoroner extends DataJantungKoroner {}
class JantungBawaan extends DataJantungBawaan {}
public class DataKenaliPenyakit {
    public static void PenyakitAritmia() {
        Aritmia pengertian_aritmia = new Aritmia();
        pengertian_aritmia.Pengertian();
        Aritmia penyebab_aritmia = new Aritmia();
        penyebab_aritmia.Penyebab();
        Aritmia komplikasi_aritmia = new Aritmia();
        komplikasi_aritmia.Komplikasi();
        Aritmia gejala_aritmia = new Aritmia();
        gejala_aritmia.Gejala();
    }
    public static void PenyakitKardiomiopati() {
        Kardiomiopati pengertian_kardiomiopati = new Kardiomiopati();
        pengertian_kardiomiopati.Pengertian();
        Kardiomiopati faktor_Kardiomiopati = new Kardiomiopati();
        faktor_Kardiomiopati.Faktor();
        Kardiomiopati penyebab_Kardiomiopati = new Kardiomiopati();
        penyebab_Kardiomiopati.Penyebab();
        Kardiomiopati komplikasi_kKardiomiopati = new Kardiomiopati();
        komplikasi_kKardiomiopati.Komplikasi();
        Kardiomiopati gejala_kKardiomiopati = new Kardiomiopati();
        gejala_kKardiomiopati.Gejala();
    }
    public static void PenyakitEndokarditis() {
        Endokarditis pengertian_endokarditis = new Endokarditis();
        pengertian_endokarditis.Pengertian();
        Endokarditis faktor_endokarditis = new Endokarditis();
        faktor_endokarditis.Faktor();
        Endokarditis penyebab_endokarditis = new Endokarditis();
        penyebab_endokarditis.Penyebab();
        Endokarditis komplikasi_endokarditis = new Endokarditis();
        komplikasi_endokarditis.Komplikasi();
        Endokarditis gejala_endokarditis = new Endokarditis();
        gejala_endokarditis.Gejala();
    }
    public static void PenyakitJantungKoroner() {
        JantungKoroner pengertian_jantung_koroner = new JantungKoroner();
        pengertian_jantung_koroner.Pengertian();
        JantungKoroner penyebab_jantung_koroner = new JantungKoroner();
        penyebab_jantung_koroner.Penyebab();
        JantungKoroner komplikasi_jantung_koroner = new JantungKoroner();
        komplikasi_jantung_koroner.Komplikasi();
        JantungKoroner gejala_jantung_koroner = new JantungKoroner();
        gejala_jantung_koroner.Gejala();
    }
    public static void PenyakitJantungBawaan() {
        JantungBawaan pengertian_jantung_bawaan = new JantungBawaan();
        pengertian_jantung_bawaan.Pengertian();
        JantungBawaan faktor_jantung_bawaan = new JantungBawaan();
        faktor_jantung_bawaan.Faktor();
        JantungBawaan penyebab_jantung_bawaan = new JantungBawaan();
        penyebab_jantung_bawaan.Penyebab();
        JantungBawaan komplikasi_jantung_bawaan = new JantungBawaan();
        komplikasi_jantung_bawaan.Komplikasi();
        JantungBawaan gejala_jantung_bawaan = new JantungBawaan();
        gejala_jantung_bawaan.Gejala();
    }
}
