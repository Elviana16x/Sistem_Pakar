package com.PenangananPenyakit;
import DataSistemPakar.DataAritmia;
import DataSistemPakar.DataKardiomiopati;
import DataSistemPakar.DataEndokarditis;
import DataSistemPakar.DataJantungKoroner;
import DataSistemPakar.DataJantungBawaan;
class PenangananAritmia extends DataAritmia {}
class PenangananKardiomiopati extends DataKardiomiopati {}
class PenangananEndokarditis extends DataEndokarditis {}
class PenangananJantungKoroner extends DataJantungKoroner {}
class PenangananJantungBawaan extends DataJantungBawaan {}
public class DataPenangananPenyakit {
    public static void PencegahanAritmia() {
        PenangananAritmia pencegahan_aritmia = new PenangananAritmia();
        pencegahan_aritmia.Pencegahan();
    }
    public static void PengobatanAritmia() {
        PenangananAritmia pengobatan_aritmia = new PenangananAritmia();
        pengobatan_aritmia.Pengobatan();
    }
    public static void PencegahanKardiomiopati() {
        PenangananKardiomiopati pencegahan_kardiomiopati = new PenangananKardiomiopati();
        pencegahan_kardiomiopati.Pencegahan();
    }
    public static void PengobatanKardiomiopati() {
        PenangananKardiomiopati pengobatan_kardiomiopati = new PenangananKardiomiopati();
        pengobatan_kardiomiopati.Pengobatan();
    }
    public static void PencegahanEndokarditis() {
        PenangananEndokarditis pencegahan_endokarditis = new PenangananEndokarditis();
        pencegahan_endokarditis.Pencegahan();
    }
    public static void PengobatanEndokarditis() {
        PenangananEndokarditis pengobatan_endokarditis = new PenangananEndokarditis();
        pengobatan_endokarditis.Pengobatan();
    }
    public static void PencegahanJantungKoroner() {
        PenangananJantungKoroner pencegahan_jantung_koroner = new PenangananJantungKoroner();
        pencegahan_jantung_koroner.Pencegahan();
    }
    public static void PengobatanJantungKoroner() {
        PenangananJantungKoroner pengobatan_jantung_koroner = new PenangananJantungKoroner();
        pengobatan_jantung_koroner.Pengobatan();
    }
    public static void PencegahanJantungBawaan() {
        PenangananJantungBawaan pencegahan_jantung_bawaan = new PenangananJantungBawaan();
        pencegahan_jantung_bawaan.Pengobatan();
    }
    public static void PengobatanJantungBawaan() {
        PenangananJantungBawaan pengobatan_jantung_bawaan = new PenangananJantungBawaan();
        pengobatan_jantung_bawaan.Pengobatan();
    }
}
