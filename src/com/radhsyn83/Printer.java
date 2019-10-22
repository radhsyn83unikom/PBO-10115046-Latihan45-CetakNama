package com.radhsyn83;

public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        System.out.println("Nama Anda : " + nama);
    }

    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak : ");
        for (int i = 0; i < jmlCetak; i++) {
            int no = i+1;
            System.out.println(no+". "+nama);
        }
    }
}
