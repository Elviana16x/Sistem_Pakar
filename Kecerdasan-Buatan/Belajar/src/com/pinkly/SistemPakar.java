package com.pinkly;
import java.util.Scanner;
import com.KenaliPenyakit.DataKenaliPenyakit;
import com.DiagnosaPenyakit.DataDiagnosaPenyakit;
class KenaliPenyakit extends DataKenaliPenyakit {}
class DiagnosaPenyakit extends DataDiagnosaPenyakit {}
public class SistemPakar {
    static void KenaliPenyakitAritmia() {
        KenaliPenyakit.PenyakitAritmia();
    }
    static void KenaliPenyakitKardiomiopati() {
        KenaliPenyakit.PenyakitKardiomiopati();
    }
    static void KenaliPenyakitEnokarditis() {
        KenaliPenyakit.PenyakitEndokarditis();
    }
    static void KenaliPenyakitJantungKoroner() {
        KenaliPenyakit.PenyakitJantungKoroner();
    }
    public static void KenaliPenyakitJantungBawaan() {
        KenaliPenyakit.PenyakitJantungBawaan();
    }
    static void DiagnosaPenyakitJantung() {
        DiagnosaPenyakit.DiagnosaPenyakitJantung();
    }
    static Scanner Input = new Scanner(System.in);
    static Scanner Pilih = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan, kenali;
        String pilih, lihat, input;
        System.out.println("\n" + "\t" + "\t" + "PROGRAM BY : PINKLY" + "\n");
        System.out.println("\t" + "SISTEM PAKAR DALAM KECERDASAN BUATAN" + "\n");
        System.out.println("DATA DI PAKAR PENYAKIT JANTUNG :" + "\n");
        do {
            System.out.println("daftar menu :" + "\n");
            System.out.println("1.  kenali penyakit pada jantung");
            System.out.println("2.  diagnosa penyakit");
            System.out.println("3.  exit" + "\n");
            System.out.print("pilih menu [1-3] ? : ");
            pilihan = Pilih.nextInt();
            switch (pilihan) {
                case 1 :
                    do {
                        System.out.print("\n");
                        System.out.println("penyakit pada jantung : \n" + "\n" +
                        "1. aritmia \n" +
                        "2. kardiomiopati \n" +
                        "3. endokarditis \n" +
                        "4. jantung koroner \n" +
                        "5. jantung bawaan \n");
                        System.out.println("pilihlah penyakit yang ingin anda kenali [1-5] ?");
                        System.out.print("masukan input [1-5] ? : ");
                        kenali = Pilih.nextInt();
                        System.out.print("\n");
                        if (kenali == 1) {
                            KenaliPenyakitAritmia();
                        } else if (kenali == 2) {
                            KenaliPenyakitKardiomiopati();
                        } else if (kenali == 3) {
                            KenaliPenyakitEnokarditis();
                        } else if (kenali == 4) {
                            KenaliPenyakitJantungKoroner();
                        } else if (kenali == 5) {
                            KenaliPenyakitJantungBawaan();
                        } else {
                            System.out.println("maaf daftar yang anda pilih tidak ada");
                        }
                        System.out.println("apakah anda ingin mengenali penyakit yang lain ?");
                        System.out.print("masukan input [y/t] ? : ");
                        lihat = Input.nextLine();
                        System.out.print("\n");
                    } while (lihat.equals("y") || lihat.equals("y"));
                break;
                case 2 :
                    do {
                        DiagnosaPenyakitJantung();
                        System.out.println("apakah anda ingin diagnosa penyakit lagi ?");
                        System.out.print("masukan input [y/t] ? : ");
                        input = Input.nextLine();
                        System.out.print("\n");
                    } while (input.equals("y") || input.equals("y"));
                break;
                case 3 : 
                    System.out.println("\n" + "\t" + "\t" + "PROGRAM SELESAI" + "\n");
                    System.exit(0);
                break;
                default : {
                    System.out.println("maaf daftar yang anda pilih tidak ada");
                }
            }
            System.out.println("apakah anda ingin memilih daftar lagi ?");
            System.out.print("masukan input [y/t] ? : ");
            pilih = Input.nextLine();
            System.out.print("\n");
        } while (pilih.equals("y") || pilih.equals("y"));
        if (pilih.equals("t")) {
            System.out.println("\t" + "\t" + "PROGRAM SELESAI" + "\n");
            System.exit(0);
        }
    }
}
