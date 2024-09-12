package com.enigmacamp.enigpus;

public class ConsoleDisplay {
    public static void menuList() {
        System.out.println("-".repeat(20));
        System.out.println("Daftar Menu");
        System.out.println("-".repeat(20));
        System.out.println("1. Menambahkan Buku");
        System.out.println("2. Mencari Buku Berdasarkan Kode Buku");
        System.out.println("3. Mencari Buku Berdasarkan Judul Buku");
        System.out.println("4. Menghapus Buku Berdasarkan Kode");
        System.out.println("5. Menampilkan Semua Buku");
        System.out.println("6. Keluar");
    }

    public static void listTypeBook(){
        System.out.println("Pilih jenis buku");
        System.out.println("1. Novel");
        System.out.println("2. Majalah");
    }

    public static void headerSubMenu(String header){
        System.out.println("-".repeat(20));
        System.out.println(header);
        System.out.println("-".repeat(20));
    }
}
