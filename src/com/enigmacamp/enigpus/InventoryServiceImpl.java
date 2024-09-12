package com.enigmacamp.enigpus;

import java.util.ArrayList;
import java.util.List;

public class InventoryServiceImpl implements InventoryService {
    private List<Book> books= new ArrayList<>();
    
    @Override
    public void addBook() {
        ConsoleDisplay.headerSubMenu("Menambahkan Buku");
        ConsoleDisplay.listTypeBook();
        Integer input = Utility.inputInteger("Pilih jenis buku : ");
        if (input == 1) {
            String title = Utility.inputString("Masukan Judul Novel : ");
            String publisher = Utility.inputString("Masukan nama penerbit : ");
            String author = Utility.inputString("Masukan penulis novel : ");
            Book book = new Novel(title, publisher, author);
            books.add(book);
        } else if (input == 2) {
            String title = Utility.inputString("Masukan Judul Majalah : ");
            String period = Utility.inputString("Periode terbit (Mingguan, bulanan) : ");
            Book book = new Magazine(title, period);
            books.add(book);
        } else {
            System.out.println("Pilih antara 1 atau 2 saja ");
            addBook();
        }
    }

    @Override
    public void searchBookByTitle() {
        ConsoleDisplay.headerSubMenu("Mencari Buku Berdasarkan Judul Buku");
        String input = Utility.inputString("Masukan Judul Buku : ");
        for (Book book : books) {
            if (book.getTitle().equals(input)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Kode Buku Tidak Sesuai Dengan buku manapun.");
    }

    @Override
    public void searchBookByCode() {
        ConsoleDisplay.headerSubMenu("Mencari Buku Berdasarkan Kode Buku");
        String input = Utility.inputString("Masukan Kode Buku : ");
        for (Book book : books) {
            if (book.getCode().equals(input)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Kode Buku Tidak Sesuai Dengan buku manapun.");
    }

    @Override
    public void deleteBookByCode() {
        ConsoleDisplay.headerSubMenu("Menghapus Buku Berdasarkan Kode Buku");
        String input = Utility.inputString("Masukan Kode Buku : ");
        for (Book book : books) {
            if(book.getCode().equals(input)) {
                books.remove(book);
                System.out.println("Buku Berhasil Dihapus");
                return;
            }
        }
        System.out.println("Kode Buku Tidak Sesuai Dengan buku manapun.");
    }

    @Override
    public void getAllBook() {
        ConsoleDisplay.headerSubMenu("Daftar Buku Di Perpustakaan");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
