package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        Printer p = new Printer();

        System.out.println("======Aplikasi Pencetak Nama======");
        System.out.print("Masukkan Nama Anda : ");
        p.setNama(s.nextLine());
        System.out.print("Mau cetak nama berapa kali?  : ");
        p.setJmlCetak(s.nextInt());
        p.cetak(p.getNama());
        p.cetak(p.getJmlCetak(), p.getNama());

    }
}
