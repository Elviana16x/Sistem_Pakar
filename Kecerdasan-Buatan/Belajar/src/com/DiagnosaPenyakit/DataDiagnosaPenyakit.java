package com.DiagnosaPenyakit;
import java.util.Scanner;
import com.PenangananPenyakit.DataPenangananPenyakit;
class PenangananPenyakit extends DataPenangananPenyakit {}
public class DataDiagnosaPenyakit {
    static void PencegahanPenyakitAritmia() {
        PenangananPenyakit.PencegahanAritmia();
    }
    static void PencegahanPenyakitKardiomiopati() {
        PenangananPenyakit.PencegahanKardiomiopati();
    }
    static void PencegahanPenyakitEndokarditis() {
        PenangananPenyakit.PencegahanEndokarditis();
    }
    static void PencegahanPenyakitJantungKoroner() {
        PenangananPenyakit.PencegahanJantungKoroner();
    }
    static void PencegahanPenyakitJantungBawaan() {
        PenangananPenyakit.PencegahanJantungBawaan();
    }
    static void PengobataPenyakitAritmia() {
        PenangananPenyakit.PengobatanAritmia();
    }
    static void PengobatanPenyakitKardiomiopati() {
        PenangananPenyakit.PengobatanKardiomiopati();
    }
    static void PengobatanPenyakitEndokarditis() {
        PenangananPenyakit.PengobatanEndokarditis();
    }
    static void PengobatanPenyakitJantungKoroner() {
        PenangananPenyakit.PengobatanJantungKoroner();
    }
    static void PengobatanPenyakitJantungBawaan() {
        PenangananPenyakit.PengobatanJantungBawaan();
    }
    static Scanner Tanya = new Scanner(System.in);
    public static void DiagnosaPenyakitJantung() {
        String data_gejala[] = new String[42];
        char diagnosa[] = new char[42];
        boolean boolean_data_gejala[] = new boolean[42];
        int[] increment_aritmia = {0};
        int[] increment_kardiomiopati = {0};
        int[] increment_endokarditis = {0};
        int[] increment_jantung_koroner = {0};
        int[] increment_jantung_bawaan = {0};
        int[] increment_gejala = {0};
        System.out.println("jawablah pertanyaan dengan [y = ya / t = tidak]");
        System.out.println("jawablah sesuai gejala yang andarasakan : " + "\n");
        System.out.println("apakah anda pusing ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[0] = Tanya.next().charAt(0);
        if (diagnosa[0] == 'y') { 
            data_gejala[0] = "pusing";
            boolean_data_gejala[0] = true;
            increment_gejala[0] += 1; 
            increment_aritmia[0] += 1;
            increment_kardiomiopati[0] += 1;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah anda merasa Cepat lelah ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[1] = Tanya.next().charAt(0);
        if (diagnosa[1] == 'y') { 
            data_gejala[1] = "cepat lelah";
            boolean_data_gejala[1] = true;
            increment_gejala[0] += 1;
            increment_aritmia[0] += 1;
        }
        System.out.println("apakah anda sesak napas ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[2] = Tanya.next().charAt(0);
        if (diagnosa[2] == 'y') {
            data_gejala[2] = "sesak napas";
            boolean_data_gejala[2] = true;
            increment_gejala[0] += 1;
            increment_aritmia[0] += 1;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah anda mudah pingsan atau kehilangan kesadaran?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[3] = Tanya.next().charAt(0);
        if (diagnosa[3] == 'y') {
            data_gejala[3] = "mudah pingsan atau kehilangan kesadaran";
            boolean_data_gejala[3] = true;
            increment_gejala[0] += 1;
            increment_aritmia[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        System.out.println("apakah anda merasakan nyeri di dada ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[4] = Tanya.next().charAt(0);
        if (diagnosa[4] == 'y') { 
            data_gejala[4] = "nyeri di dada";
            boolean_data_gejala[4] = true;
            increment_gejala[0] += 1;
            increment_aritmia[0] += 1;
            increment_kardiomiopati[0] += 1;
        }
        System.out.println("apakah anda merasakan Jantung berdetak lebih lambat dari normal ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[5] = Tanya.next().charAt(0);
        if (diagnosa[5] == 'y') {
            data_gejala[5] = "jantung berdetak lebih lambat dari normal";
            boolean_data_gejala[5] = true;
            increment_gejala[0] += 1;
            increment_aritmia[0] += 1;
        }
        System.out.println("apakah anda merasakan Jantung berdetak lebih cepat dari normal ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[6] = Tanya.next().charAt(0);
        if (diagnosa[6] == 'y') {
            data_gejala[6] = "jantung berdetak lebih cepat dari normal";
            boolean_data_gejala[6] = true;
            increment_gejala[0] += 1;
            increment_aritmia[0] += 1;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah anda merasakan napas pendek terutama setelah melakukan aktivitas ?");
        System.out.print("massukan input [y/t] ? : ");
        diagnosa[7] = Tanya.next().charAt(0);
        if (diagnosa[7] == 'y') { 
            data_gejala[7] = "napas pendek terutama setelah melakukan aktivitas";
            boolean_data_gejala[7] = true;
            increment_gejala[0] += 1;
            increment_kardiomiopati[0] += 1;
        }
        System.out.println("apakah tungkai membengkak ?");
        System.out.print("massukan input [y/t] ? : ");
        diagnosa[8] = Tanya.next().charAt(0);
        if (diagnosa[8] == 'y') {
            data_gejala[8] = "tungkai membengkak";
            boolean_data_gejala[8] = true;
            increment_gejala[0] += 1;
            increment_kardiomiopati[0] += 1;
        }
        System.out.println("apakah anda mudah lelah dan letih ?");
        System.out.print("massukan input [y/t] ? : ");
        diagnosa[9] = Tanya.next().charAt(0);
        if (diagnosa[9] == 'y') {
            data_gejala[9] = "mudah lelah dan letih";
            boolean_data_gejala[9] = true;
            increment_gejala[0] += 1;
            increment_kardiomiopati[0] += 1;
        }
        System.out.println("apakah anda merasakan denyut jantung yang tidak teratur ?");
        System.out.print("massukan input [y/t] ? : ");
        diagnosa[10] = Tanya.next().charAt(0);
        if (diagnosa[10] == 'y') { 
            data_gejala[10] = "denyut jantung yang tidak teratur";
            boolean_data_gejala[10] = true;
            increment_gejala[0] += 1;
            increment_kardiomiopati[0] += 1;
        }
        System.out.println("apakah pengelihatan anda berkunang-kunag ?");
        System.out.print("massukan input [y/t] ? : ");
        diagnosa[11] = Tanya.next().charAt(0);
        if (diagnosa[11] == 'y') {
            data_gejala[11] = "pengelihatan berkunang-kunag";
            boolean_data_gejala[11] = true;
            increment_gejala[0] += 1;
            increment_kardiomiopati[0] += 1;
        }
        System.out.println("apakah anda merasakan jantung berdebar-debar ?");
        System.out.print("massukan input [y/t] ? : ");
        diagnosa[12] = Tanya.next().charAt(0);
        if (diagnosa[12] == 'y') {
            data_gejala[12] = "jantung berdebar-debar";
            boolean_data_gejala[12] = true;
            increment_gejala[0] += 1;
            increment_kardiomiopati[0] += 1;
        }
        System.out.println("apakah anda batuk terutama saat tidur terlentag ?");
        System.out.print("massukan input [y/t] ? : ");
        diagnosa[13] = Tanya.next().charAt(0);
        if (diagnosa[13] == 'y') { 
            data_gejala[13] = "batuk terutama saat tidur terlentang";
            boolean_data_gejala[13] = true;
            increment_gejala[0] += 1;
            increment_kardiomiopati[0] += 1;
        }
        System.out.println("apakah anda demam ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[14] = Tanya.next().charAt(0);
        if (diagnosa[14] == 'y') {
            data_gejala[14] = "demam";
            boolean_data_gejala[14] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda menggigil ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[15] = Tanya.next().charAt(0);
        if (diagnosa[15] == 'y') {
            data_gejala[15] = "menggigil";
            boolean_data_gejala[15] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda merasa lemas ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[16] = Tanya.next().charAt(0);
        if (diagnosa[16] == 'y') {
            data_gejala[16] = "lemas";
            boolean_data_gejala[16] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah anda merasakan nyeri otot ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[17] = Tanya.next().charAt(0);
        if (diagnosa[17] == 'y') {
            data_gejala[17] = "nyeri otot";
            boolean_data_gejala[17] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda merasakan sakit kepala ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[18] = Tanya.next().charAt(0);
        if (diagnosa[18] == 'y') {
            data_gejala[18] = "sakit kepala";
            boolean_data_gejala[18] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda berkeringat di malam hari ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[19] = Tanya.next().charAt(0);
        if (diagnosa[19] == 'y') { 
            data_gejala[19] = "berkeringat di malam hari";
            boolean_data_gejala[19] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah nafsu makan anda menurun ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[20] = Tanya.next().charAt(0);
        if (diagnosa[20] == 'y') {
            data_gejala[20] = "nafsu makan menurun";
            boolean_data_gejala[20] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda merasakan nyeri dada terutama saat bernapas ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[21] = Tanya.next().charAt(0);
        if (diagnosa[21] == 'y') {
            data_gejala[21] = "nyeri dada terutama saat bernapas";
            boolean_data_gejala[21] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda sesak napas terutama saat beraktivitas ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[22] = Tanya.next().charAt(0);
        if (diagnosa[22] == 'y') { 
            data_gejala[22] = "sesak napas terutama saat beraktivitas";
            boolean_data_gejala[22] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda batuk ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[23] = Tanya.next().charAt(0);
        if (diagnosa[23] == 'y') {
            data_gejala[23] = "batuk";
            boolean_data_gejala[23] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda merasakan bising jantung ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[24] = Tanya.next().charAt(0);
        if (diagnosa[24] == 'y') {
            data_gejala[24] = "bising jantung";
            boolean_data_gejala[24] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah kulit anda pucat ?");
        System.out.print("masukan input [y/t] : ");
        diagnosa[25] = Tanya.next().charAt(0);
        if (diagnosa[25] == 'y') { 
            data_gejala[25] = "kulit pucat";
            boolean_data_gejala[25] = true;
            increment_gejala[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda merasakan nyeri di bagian dada, tulang rusuk bagian bawah, dan lengan \n"
        + "yang menjalar hingga ke leher, rahang, bahu, sampai punggung ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[26] = Tanya.next().charAt(0);
        if (diagnosa[26] == 'y') {
            data_gejala[26] = "nyeri di bagian dada, tulang rusuk bagian bawah, dan lengan \n"
            + "   yang menjalar hingga ke leher, rahang, bahu, sampai punggung";
            boolean_data_gejala[26] = true;
            increment_gejala[0] += 1;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah anda mual dan muntah ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[27] = Tanya.next().charAt(0);
        if (diagnosa[27] == 'y') {
            data_gejala[27] = "mual dan muntah";
            boolean_data_gejala[27] = true;
            increment_gejala[0] += 1;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah anda merasakan nyeri di bagian perut atau ulu hati ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[28] = Tanya.next().charAt(0);
        if (diagnosa[28] == 'y') { 
            data_gejala[28] = "nyeri dibagian perut atau ulu hati";
            boolean_data_gejala[28] = true;
            increment_gejala[0] += 1;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah anda merasakan keringat berlebihan ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[29] = Tanya.next().charAt(0);
        if (diagnosa[29] == 'y') {
            data_gejala[29] = "keringat berlebihan";
            boolean_data_gejala[29] = true;
            increment_gejala[0] += 1;;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah perut anda kembung ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[30] = Tanya.next().charAt(0);
        if (diagnosa[30] == 'y') {
            data_gejala[30] = "perut kembung";
            boolean_data_gejala[30] = true;
            increment_gejala[0] += 1;
            increment_jantung_koroner[0] += 1;
        }
        System.out.println("apakah tampak semburat kebiruan atau kehitaman pada bibir, kulit atau jari-jari anda ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[31] = Tanya.next().charAt(0);
        if (diagnosa[31] == 'y') { 
            data_gejala[31] = "tampak semburat kebiruan atau kehitaman pada bibir, kulit atau jari-jari";
            boolean_data_gejala[31] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        System.out.println("apakah anda kesulitan bernapas ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[32] = Tanya.next().charAt(0);
        if (diagnosa[32] == 'y') {
            data_gejala[32] = "kesulitan bernapas";
            boolean_data_gejala[32] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        System.out.println("apakah anda memiliki berat badan rendah ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[33] = Tanya.next().charAt(0);
        if (diagnosa[33] == 'y') {
            data_gejala[33] = "berat badan rendah";
            boolean_data_gejala[33] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        System.out.println("apakah anda merasakan pertumbuhan terhambat ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[34] = Tanya.next().charAt(0);
        if (diagnosa[34] == 'y') { 
            data_gejala[34] = "merasakan pertumbuhan terhambat";
            boolean_data_gejala[34] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        System.out.println("apakah terjadi pembengkakan pada tungkai, perut atau sekitar mata anda ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[35] = Tanya.next().charAt(0);
        if (diagnosa[35] == 'y') {
            data_gejala[35] = "pembengkakan pada tungkai, perut atau sekitar mata";
            boolean_data_gejala[35] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
            increment_endokarditis[0] += 1;
        }
        System.out.println("apakah anda sering berkeringat dingin ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[36] = Tanya.next().charAt(0);
        if (diagnosa[36] == 'y') {
            data_gejala[36] = "sering berkeringat dingin";
            boolean_data_gejala[36] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        System.out.println("apakah anda merasakan detak jantung tidak beraturan ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[37] = Tanya.next().charAt(0);
        if (diagnosa[37] == 'y') { 
            data_gejala[37] = "detak jantung tidak beraturan";
            boolean_data_gejala[37] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        System.out.println("apakah anda pusing dan sering merasa kelelahan terutama saat berolahraga ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[38] = Tanya.next().charAt(0);
        if (diagnosa[38] == 'y') {
            data_gejala[38] = "pusing dan sering merasa kelelahan terutama saat berolahraga";
            boolean_data_gejala[38] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        System.out.println("apakah terjadi pembengkakan di kaki, pergelangan kaki atau tangan anda ?");
        System.out.print("masukan input [y/t] ? : ");
        diagnosa[39] = Tanya.next().charAt(0);
        System.out.print("\n");
        if (diagnosa[39] == 'y') {
            data_gejala[39] = "pembengkakan di kaki, pergelangan kaki atau tangan";
            boolean_data_gejala[39] = true;
            increment_gejala[0] += 1;
            increment_jantung_bawaan[0] += 1;
        }
        if (increment_gejala[0] >= 20) {
            System.out.println("dari hasil diagnosa terlalu banyak gejala yang anda rasakan");
            System.out.println("anda mengalami gejala sebanyak " + increment_gejala[0] + " gejala");
            System.out.println("gejala yang anda rasakan yaitu :" + "\n");
            if (boolean_data_gejala[0] == true) System.out.println("-> " + data_gejala[0]);
            if (boolean_data_gejala[1] == true) System.out.println("-> " + data_gejala[1]);
            if (boolean_data_gejala[2] == true) System.out.println("-> " + data_gejala[2]);
            if (boolean_data_gejala[3] == true) System.out.println("-> " + data_gejala[3]);
            if (boolean_data_gejala[4] == true) System.out.println("-> " + data_gejala[4]);
            if (boolean_data_gejala[5] == true) System.out.println("-> " + data_gejala[5]);
            if (boolean_data_gejala[6] == true) System.out.println("-> " + data_gejala[6]);
            if (boolean_data_gejala[7] == true) System.out.println("-> " + data_gejala[7]);
            if (boolean_data_gejala[8] == true) System.out.println("-> " + data_gejala[8]);
            if (boolean_data_gejala[9] == true) System.out.println("-> " + data_gejala[9]);
            if (boolean_data_gejala[10] == true) System.out.println("-> " + data_gejala[10]);
            if (boolean_data_gejala[11] == true) System.out.println("-> " + data_gejala[11]);
            if (boolean_data_gejala[12] == true) System.out.println("-> " + data_gejala[12]);
            if (boolean_data_gejala[13] == true) System.out.println("-> " + data_gejala[13]);
            if (boolean_data_gejala[14] == true) System.out.println("-> " + data_gejala[14]);
            if (boolean_data_gejala[15] == true) System.out.println("-> " + data_gejala[15]);
            if (boolean_data_gejala[16] == true) System.out.println("-> " + data_gejala[16]);
            if (boolean_data_gejala[17] == true) System.out.println("-> " + data_gejala[17]);
            if (boolean_data_gejala[18] == true) System.out.println("-> " + data_gejala[18]);
            if (boolean_data_gejala[19] == true) System.out.println("-> " + data_gejala[19]);
            if (boolean_data_gejala[20] == true) System.out.println("-> " + data_gejala[20]);
            if (boolean_data_gejala[21] == true) System.out.println("-> " + data_gejala[21]);
            if (boolean_data_gejala[22] == true) System.out.println("-> " + data_gejala[22]);
            if (boolean_data_gejala[23] == true) System.out.println("-> " + data_gejala[23]);
            if (boolean_data_gejala[24] == true) System.out.println("-> " + data_gejala[24]);
            if (boolean_data_gejala[25] == true) System.out.println("-> " + data_gejala[25]);
            if (boolean_data_gejala[26] == true) System.out.println("-> " + data_gejala[26]);
            if (boolean_data_gejala[27] == true) System.out.println("-> " + data_gejala[27]);
            if (boolean_data_gejala[28] == true) System.out.println("-> " + data_gejala[28]);
            if (boolean_data_gejala[29] == true) System.out.println("-> " + data_gejala[29]);
            if (boolean_data_gejala[30] == true) System.out.println("-> " + data_gejala[30]);
            if (boolean_data_gejala[31] == true) System.out.println("-> " + data_gejala[31]);
            if (boolean_data_gejala[32] == true) System.out.println("-> " + data_gejala[32]);
            if (boolean_data_gejala[33] == true) System.out.println("-> " + data_gejala[33]);
            if (boolean_data_gejala[34] == true) System.out.println("-> " + data_gejala[34]);
            if (boolean_data_gejala[35] == true) System.out.println("-> " + data_gejala[35]);
            if (boolean_data_gejala[36] == true) System.out.println("-> " + data_gejala[36]);
            if (boolean_data_gejala[37] == true) System.out.println("-> " + data_gejala[37]);
            if (boolean_data_gejala[38] == true) System.out.println("-> " + data_gejala[38]);
            if (boolean_data_gejala[39] == true) System.out.println("-> " + data_gejala[39]);
            System.out.println("\n" + "jika anda mengalami gejala sebanyak " + increment_gejala[0] + " gejala");
            System.err.println("seharusnya tidak lama lagi anda akan tewas,, (>_<)" + "\n");
        } else if (increment_gejala[0] < 20 && increment_aritmia[0] >= 4
                && increment_aritmia[0] > increment_kardiomiopati[0] 
                && increment_aritmia[0] > increment_endokarditis[0]
                && increment_aritmia[0] > increment_jantung_koroner[0]
                && increment_aritmia[0] > increment_jantung_bawaan[0]) {
            if (increment_aritmia[0] > 5) {
                System.out.println("dari hasil diagnosa kemungkinan besar anda menderita penyakit aritmia" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu :" + "\n");
                if (boolean_data_gejala[0] != false) System.out.println("-> " + data_gejala[0]);
                if (boolean_data_gejala[1] != false) System.out.println("-> " + data_gejala[1]);
                if (boolean_data_gejala[2] != false) System.out.println("-> " + data_gejala[2]);
                if (boolean_data_gejala[3] != false) System.out.println("-> " + data_gejala[3]);
                if (boolean_data_gejala[4] != false) System.out.println("-> " + data_gejala[4]);
                if (boolean_data_gejala[5] != false) System.out.println("-> " + data_gejala[5]);
                if (boolean_data_gejala[6] != false) System.out.println("-> " + data_gejala[6]);
                System.out.println("\n" + "berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah aritmia");
                System.out.println("anda harus segra melakukan pengobatan aritmia" + "\n");
                PengobataPenyakitAritmia();
            } else {
                System.out.println("dari hasil diagnosa kecil kemungkinan anda menderita penyakit aritmia" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu :" + "\n");
                if (boolean_data_gejala[0] != false) System.out.println("-> " + data_gejala[0]);
                if (boolean_data_gejala[1] != false) System.out.println("-> " + data_gejala[1]);
                if (boolean_data_gejala[2] != false) System.out.println("-> " + data_gejala[2]);
                if (boolean_data_gejala[3] != false) System.out.println("-> " + data_gejala[3]);
                if (boolean_data_gejala[4] != false) System.out.println("-> " + data_gejala[4]);
                if (boolean_data_gejala[5] != false) System.out.println("-> " + data_gejala[5]);
                if (boolean_data_gejala[6] != false) System.out.println("-> " + data_gejala[6]);
                System.out.println("\n" + "berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah aritmia");
                System.out.println("sebaiknya anda cegah gejala aritmia" + "\n");
                PencegahanPenyakitAritmia();
            }
        } else if (increment_gejala[0] < 20 && increment_kardiomiopati[0] >= 4
                && increment_kardiomiopati[0] > increment_aritmia[0] 
                && increment_kardiomiopati[0] > increment_endokarditis[0]
                && increment_kardiomiopati[0] > increment_jantung_koroner[0]
                && increment_kardiomiopati[0] > increment_jantung_bawaan[0]) {
            if (increment_kardiomiopati[0] >= 7) {
                System.out.println("dari hasil diagnosa kemungkinan besar anda menderita penyakit kardiomiopati" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu :" + "\n");
                if (boolean_data_gejala[0] != false) System.out.println("-> " + data_gejala[0]);
                if (boolean_data_gejala[4] != false) System.out.println("-> " + data_gejala[4]);
                if (boolean_data_gejala[7] != false) System.out.println("-> " + data_gejala[7]);
                if (boolean_data_gejala[8] != false) System.out.println("-> " + data_gejala[8]);
                if (boolean_data_gejala[9] != false) System.out.println("-> " + data_gejala[9]);
                if (boolean_data_gejala[10] != false) System.out.println("-> " + data_gejala[10]);
                if (boolean_data_gejala[11] != false) System.out.println("-> " + data_gejala[11]);
                if (boolean_data_gejala[12] != false) System.out.println("-> " + data_gejala[12]);
                if (boolean_data_gejala[13] != false) System.out.println("-> " + data_gejala[13]);
                System.out.println("\n" + "berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah kardiomiopati");
                System.out.println("anda harus segra melakukan pengobatan aritmia" + "\n");
                PengobatanPenyakitKardiomiopati();
            } else {
                System.out.println("dari hasil diagnosa kecil kemungkinan anda menderita penyakit kardiomiopati" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu :" + "\n");
                if (boolean_data_gejala[0] != false) System.out.println("-> " + data_gejala[0]);
                if (boolean_data_gejala[4] != false) System.out.println("-> " + data_gejala[4]);
                if (boolean_data_gejala[7] != false) System.out.println("-> " + data_gejala[7]);
                if (boolean_data_gejala[8] != false) System.out.println("-> " + data_gejala[8]);
                if (boolean_data_gejala[9] != false) System.out.println("-> " + data_gejala[9]);
                if (boolean_data_gejala[10] != false) System.out.println("-> " + data_gejala[10]);
                if (boolean_data_gejala[11] != false) System.out.println("-> " + data_gejala[11]);
                if (boolean_data_gejala[12] != false) System.out.println("-> " + data_gejala[12]);
                if (boolean_data_gejala[13] != false) System.out.println("-> " + data_gejala[13]);
                System.out.println("berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah kardiomiopati");
                System.out.println("sebaiknya anda cegah gejala kardiomiopati" + "\n");
                PencegahanPenyakitKardiomiopati();
            }
        } else if (increment_gejala[0] < 20 && increment_endokarditis[0] >= 4
                && increment_endokarditis[0] > increment_aritmia[0]
                && increment_endokarditis[0] > increment_kardiomiopati[0]
                && increment_endokarditis[0] > increment_jantung_koroner[0]
                && increment_endokarditis[0] > increment_jantung_bawaan[0]) {
            if (increment_endokarditis[0] >= 9) {
                System.out.println("dari hasil diagnosa kemungkinan besar anda menderita penyakit endokarditis" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu : " + "\n");
                if (boolean_data_gejala[14] != false) System.out.println("-> " + data_gejala[14]);
                if (boolean_data_gejala[15] != false) System.out.println("-> " + data_gejala[15]);
                if (boolean_data_gejala[16] != false) System.out.println("-> " + data_gejala[16]);
                if (boolean_data_gejala[17] != false) System.out.println("-> " + data_gejala[17]);
                if (boolean_data_gejala[18] != false) System.out.println("-> " + data_gejala[18]);
                if (boolean_data_gejala[19] != false) System.out.println("-> " + data_gejala[19]);
                if (boolean_data_gejala[20] != false) System.out.println("-> " + data_gejala[20]);
                if (boolean_data_gejala[21] != false) System.out.println("-> " + data_gejala[21]);
                if (boolean_data_gejala[22] != false) System.out.println("-> " + data_gejala[22]);
                if (boolean_data_gejala[23] != false) System.out.println("-> " + data_gejala[23]);
                if (boolean_data_gejala[24] != false) System.out.println("-> " + data_gejala[24]);
                if (boolean_data_gejala[25] != false) System.out.println("-> " + data_gejala[25]);
                if (boolean_data_gejala[35] != false) System.out.println("-> " + data_gejala[35]);
                System.out.println("\n" + "berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah endokarditis");
                System.out.println("anda harus segra melakukan pengobatan endokarditis" + "\n");
                PengobatanPenyakitEndokarditis();
            } else {
                System.out.println("dari hasil diagnosa kecil kemungkinan anda menderita penyakit endokarditis" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu : " + "\n");
                if (boolean_data_gejala[14] != false) System.out.println("-> " + data_gejala[14]);
                if (boolean_data_gejala[15] != false) System.out.println("-> " + data_gejala[15]);
                if (boolean_data_gejala[16] != false) System.out.println("-> " + data_gejala[16]);
                if (boolean_data_gejala[17] != false) System.out.println("-> " + data_gejala[17]);
                if (boolean_data_gejala[18] != false) System.out.println("-> " + data_gejala[18]);
                if (boolean_data_gejala[19] != false) System.out.println("-> " + data_gejala[19]);
                if (boolean_data_gejala[20] != false) System.out.println("-> " + data_gejala[20]);
                if (boolean_data_gejala[21] != false) System.out.println("-> " + data_gejala[21]);
                if (boolean_data_gejala[22] != false) System.out.println("-> " + data_gejala[22]);
                if (boolean_data_gejala[23] != false) System.out.println("-> " + data_gejala[23]);
                if (boolean_data_gejala[24] != false) System.out.println("-> " + data_gejala[24]);
                if (boolean_data_gejala[25] != false) System.out.println("-> " + data_gejala[25]);
                if (boolean_data_gejala[35] != false) System.out.println("-> " + data_gejala[35]);
                System.out.println("\n" + "berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah endokarditis");
                System.out.println("sebaiknya anda cegah gejala endokarditis" + "\n");
                PencegahanPenyakitEndokarditis();
            }
        } else if (increment_gejala[0] < 20 && increment_jantung_koroner[0] >= 4
                && increment_jantung_koroner[0] > increment_aritmia[0]
                && increment_jantung_koroner[0] > increment_kardiomiopati[0]
                && increment_jantung_koroner[0] > increment_endokarditis[0]
                && increment_jantung_koroner[0] > increment_jantung_bawaan[0]) {
            if (increment_jantung_koroner[0] >= 7) {
                System.out.println("dari hasil diagnosa kemungkinan besar anda menderita penyakit jantung koroner" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu : " + "\n");
                if (boolean_data_gejala[0] != false) System.out.println("-> " + data_gejala[0]);
                if (boolean_data_gejala[2] != false) System.out.println("-> " + data_gejala[2]);
                if (boolean_data_gejala[6] != false) System.out.println("-> " + data_gejala[6]);
                if (boolean_data_gejala[16] != false) System.out.println("-> " + data_gejala[16]);
                if (boolean_data_gejala[26] != false) System.out.println("-> " + data_gejala[26]);
                if (boolean_data_gejala[27] != false) System.out.println("-> " + data_gejala[27]);
                if (boolean_data_gejala[28] != false) System.out.println("-> " + data_gejala[28]);
                if (boolean_data_gejala[29] != false) System.out.println("-> " + data_gejala[29]);
                if (boolean_data_gejala[35] != false) System.out.println("-> " + data_gejala[35]);
                System.out.println("\n" + "berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah jantung koroner");
                System.out.println("anda harus segra melakukan pengobatan jantung koroner" + "\n");
                PengobatanPenyakitJantungKoroner();
            } else {
                System.out.println("dari hasil diagnosa kecil kemungkinan anda menderita penyakit jantung koroner" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu : " + "\n");
                if (boolean_data_gejala[0] != false) System.out.println("-> " + data_gejala[0]);
                if (boolean_data_gejala[2] != false) System.out.println("-> " + data_gejala[2]);
                if (boolean_data_gejala[6] != false) System.out.println("-> " + data_gejala[6]);
                if (boolean_data_gejala[16] != false) System.out.println("-> " + data_gejala[16]);
                if (boolean_data_gejala[26] != false) System.out.println("-> " + data_gejala[26]);
                if (boolean_data_gejala[27] != false) System.out.println("-> " + data_gejala[27]);
                if (boolean_data_gejala[28] != false) System.out.println("-> " + data_gejala[28]);
                if (boolean_data_gejala[29] != false) System.out.println("-> " + data_gejala[29]);
                if (boolean_data_gejala[35] != false) System.out.println("-> " + data_gejala[35]);
                System.out.println("\n" + "berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah jantung koroner");
                System.out.println("sebaiknya anda cegah gejala jantung koroner" + "\n");
                PencegahanPenyakitJantungKoroner();
            }
        } else if (increment_gejala[0] < 20 && increment_jantung_bawaan[0] >= 4
                && increment_jantung_bawaan[0] > increment_aritmia[0]
                && increment_jantung_bawaan[0] > increment_kardiomiopati[0]
                && increment_jantung_bawaan[0] > increment_endokarditis[0]
                && increment_jantung_bawaan[0] > increment_jantung_koroner[0]) {
            if (increment_jantung_bawaan[0] >= 8) {
                System.out.println("dari hasil diagnosa kemungkinan besar anda menderita penyakit jantung bbawaan" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu :" + "\n");
                if (boolean_data_gejala[3] != false) System.out.println("-> " + data_gejala[3]);
                if (boolean_data_gejala[31] != false) System.out.println("-> " + data_gejala[31]);
                if (boolean_data_gejala[32] != false) System.out.println("-> " + data_gejala[32]);
                if (boolean_data_gejala[33] != false) System.out.println("-> " + data_gejala[33]);
                if (boolean_data_gejala[34] != false) System.out.println("-> " + data_gejala[34]);
                if (boolean_data_gejala[35] != false) System.out.println("-> " + data_gejala[35]);
                if (boolean_data_gejala[36] != false) System.out.println("-> " + data_gejala[36]);
                if (boolean_data_gejala[37] != false) System.out.println("-> " + data_gejala[37]);
                if (boolean_data_gejala[38] != false) System.out.println("-> " + data_gejala[38]);
                if (boolean_data_gejala[39] != false) System.out.println("-> " + data_gejala[39]);
                System.out.println("\n" + "berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah jantung bawaan");
                System.out.println("anda harus segra melakukan pengobatan jantung bawaan" + "\n");
                PengobatanPenyakitJantungBawaan();
            } else {
                System.out.println("dari hasil diagnosa kecil kemungkinan anda menderita penyakit jantung bawaan" + "\n");
                System.out.println("HASIL DIAGNOSA : ");
                System.out.println("gejala yang anda rasakan yaitu : " + "\n");
                if (boolean_data_gejala[3] != false) System.out.println("-> " + data_gejala[3]);
                if (boolean_data_gejala[31] != false) System.out.println("-> " + data_gejala[31]);
                if (boolean_data_gejala[32] != false) System.out.println("-> " + data_gejala[32]);
                if (boolean_data_gejala[33] != false) System.out.println("-> " + data_gejala[33]);
                if (boolean_data_gejala[34] != false) System.out.println("-> " + data_gejala[34]);
                if (boolean_data_gejala[35] != false) System.out.println("-> " + data_gejala[35]);
                if (boolean_data_gejala[36] != false) System.out.println("-> " + data_gejala[36]);
                if (boolean_data_gejala[37] != false) System.out.println("-> " + data_gejala[37]);
                if (boolean_data_gejala[38] != false) System.out.println("-> " + data_gejala[38]);
                if (boolean_data_gejala[39] != false) System.out.println("-> " + data_gejala[39]);
                System.out.println("berdasarkan gejala yang anda rasakan penyakit yang anda derita adalah jantung bawaan");
                System.out.println("sebaiknya anda cegah gejala jantung bawaan" + "\n");
                PencegahanPenyakitJantungBawaan();
            }
        } else if (increment_gejala[0] >= 1 && increment_gejala[0] < 4) {
                System.out.println("dari hasil diagnosa degan gejala nyang anda rasakan saat ini");
                System.out.println("anda tidak menderita penyakit pada jantung");
                System.out.println("karena anda hanya mengalami " + increment_gejala[0] + " gejala saja");
                System.out.println("mungkin anda hanya kelelahan sebaiknya anda banyak istirahat" + "\n");
        } else if (increment_gejala[0] > 3 && increment_gejala[0] < 20
            && increment_aritmia[0] < 4 && increment_aritmia[0] >= 1
            || increment_kardiomiopati[0] < 4 && increment_kardiomiopati[0] >= 1
            || increment_endokarditis[0] < 4 && increment_endokarditis[0] >= 1
            || increment_jantung_koroner[0] < 4 && increment_jantung_koroner[0] >= 1
            || increment_jantung_bawaan[0] < 4 && increment_jantung_bawaan[0] >= 1) {
                System.out.println("dari hasil diagnosa gejala yang anda rasakan sangat aneh");
                System.out.println("anda mengalami gejala beberapa jenis penyakit pada jantung");
                System.out.println("jenis penyakit dengan gejala yang anda rasakan yaitu : " + "\n");
            if (increment_aritmia[0] < 4 && increment_aritmia[0] >= 1) {
                System.out.println("-> aritmia : dengan gejala : " + "\n");
                if (boolean_data_gejala[0] == true) System.out.println("\t" + "- " + data_gejala[0]);
                if (boolean_data_gejala[1] == true) System.out.println("\t" + "- " + data_gejala[1]);
                if (boolean_data_gejala[2] == true) System.out.println("\t" + "- " + data_gejala[2]);
                if (boolean_data_gejala[3] == true) System.out.println("\t" + "- " + data_gejala[3]);
                if (boolean_data_gejala[4] == true) System.out.println("\t" + "- " + data_gejala[4]);
                if (boolean_data_gejala[5] == true) System.out.println("\t" + "- " + data_gejala[5]);
                if (boolean_data_gejala[6] == true) System.out.println("\t" + "- " + data_gejala[6]);
                System.out.print("\n");
            }
            if (increment_kardiomiopati[0] < 4 && increment_kardiomiopati[0] >= 1) {
                System.out.println("-> kardiomiopati : dengan gejala : " + "\n");
                if (boolean_data_gejala[0] == true) System.out.println("\t" + "- " + data_gejala[0]);
                if (boolean_data_gejala[4] == true) System.out.println("\t" + "- " + data_gejala[4]);
                if (boolean_data_gejala[7] == true) System.out.println("\t" + "- " + data_gejala[7]);
                if (boolean_data_gejala[8] == true) System.out.println("\t" + "- " + data_gejala[8]);
                if (boolean_data_gejala[9] == true) System.out.println("\t" + "- " + data_gejala[9]);
                if (boolean_data_gejala[10] == true) System.out.println("\t" + "- " + data_gejala[10]);
                if (boolean_data_gejala[11] == true) System.out.println("\t" + "- " + data_gejala[11]);
                if (boolean_data_gejala[12] == true) System.out.println("\t" + "- " + data_gejala[12]);
                if (boolean_data_gejala[13] == true) System.out.println("\t" + "- " + data_gejala[13]);
                System.out.print("\n");
            }
            if (increment_endokarditis[0] < 4 && increment_endokarditis[0] >= 1) {
                System.out.println("-> endokarditis : dengan gejala : " + "\n");
                if (boolean_data_gejala[14] == true) System.out.println("\t" + "- " + data_gejala[14]);
                if (boolean_data_gejala[15] == true) System.out.println("\t" + "- " + data_gejala[15]);
                if (boolean_data_gejala[16] == true) System.out.println("\t" + "- " + data_gejala[16]);
                if (boolean_data_gejala[17] == true) System.out.println("\t" + "- " + data_gejala[17]);
                if (boolean_data_gejala[18] == true) System.out.println("\t" + "- " + data_gejala[18]);
                if (boolean_data_gejala[19] == true) System.out.println("\t" + "- " + data_gejala[19]);
                if (boolean_data_gejala[20] == true) System.out.println("\t" + "- " + data_gejala[20]);
                if (boolean_data_gejala[21] == true) System.out.println("\t" + "- " + data_gejala[21]);
                if (boolean_data_gejala[22] == true) System.out.println("\t" + "- " + data_gejala[22]);
                if (boolean_data_gejala[23] == true) System.out.println("\t" + "- " + data_gejala[23]);
                if (boolean_data_gejala[24] == true) System.out.println("\t" + "- " + data_gejala[24]);
                if (boolean_data_gejala[25] == true) System.out.println("\t" + "- " + data_gejala[25]);
                if (boolean_data_gejala[35] == true) System.out.println("\t" + "- " + data_gejala[35]);
                System.out.print("\n");
            }
            if (increment_jantung_koroner[0] < 4 && increment_jantung_koroner[0] >= 1) {
                System.out.println("-> jantung kooroner : dengan gejala : " + "\n");
                if (boolean_data_gejala[0] == true) System.out.println("\t" + "- " + data_gejala[0]);
                if (boolean_data_gejala[2] == true) System.out.println("\t" + "- " + data_gejala[2]);
                if (boolean_data_gejala[6] == true) System.out.println("\t" + "- " + data_gejala[6]);
                if (boolean_data_gejala[16] == true) System.out.println("\t" + "- " + data_gejala[16]);
                if (boolean_data_gejala[26] == true) System.out.println("\t" + "- " + data_gejala[26]);
                if (boolean_data_gejala[27] == true) System.out.println("\t" + "- " + data_gejala[27]);
                if (boolean_data_gejala[28] == true) System.out.println("\t" + "- " + data_gejala[28]);
                if (boolean_data_gejala[29] == true) System.out.println("\t" + "- " + data_gejala[29]);
                if (boolean_data_gejala[35] == true) System.out.println("\t" + "- " + data_gejala[35]);
                System.out.print("\n");
            }
            if (increment_jantung_bawaan[0] < 4 && increment_jantung_bawaan[0] >= 1) {
                System.out.println("-> jantung bawaan : degan gejala : " + "\n");
                if (boolean_data_gejala[3] == true) System.out.println("\t" + "- " + data_gejala[3]);
                if (boolean_data_gejala[31] == true) System.out.println("\t" + "- " + data_gejala[31]);
                if (boolean_data_gejala[32] == true) System.out.println("\t" + "- " + data_gejala[32]);
                if (boolean_data_gejala[33] == true) System.out.println("\t" + "- " + data_gejala[33]);
                if (boolean_data_gejala[34] == true) System.out.println("\t" + "- " + data_gejala[34]);
                if (boolean_data_gejala[35] == true) System.out.println("\t" + "- " + data_gejala[35]);
                if (boolean_data_gejala[36] == true) System.out.println("\t" + "- " + data_gejala[36]);
                if (boolean_data_gejala[37] == true) System.out.println("\t" + "- " + data_gejala[37]);
                if (boolean_data_gejala[38] == true) System.out.println("\t" + "- " + data_gejala[38]);
                if (boolean_data_gejala[39] == true) System.out.println("\t" + "- " + data_gejala[39]);
                System.out.print("\n");
            }
        } else {
            System.out.println("dari hasil diagnosa anda tidak mangalami gejala apapun");
            System.out.println("good luck, hidup seperti larry,, (>_<)" + "\n");
        }
    }
}
