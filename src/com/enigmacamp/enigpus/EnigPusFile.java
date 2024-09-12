package com.enigmacamp.enigpus;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EnigPusFile {
    private static String FILE_NAME = "EnigPus.csv";
    private static File file = new File(FILE_NAME);

    public static void main(String[] args) {
        importBooksFromFIle();
    }

    public static List<Book> importBooksFromFIle(){
        List<Book> newBooks = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            List<String> collectLines = new ArrayList<>();
            List<String> books = new ArrayList<>();

            for (String line:lines){
                for (String book: line.split(",")){
                    collectLines.add(book);
                }
                for (String book: collectLines){
                    String[] keyVal = book.split(":", 2);
                    if (keyVal.length == 2) {
                        String value = keyVal[1].trim();
                        books.add(value);
                    }
                }
                collectLines.clear();
                if (books.size() == 6){
                    String codeBook =books.get(1);
                    String title = books.get(2);
                    String publisher = books.get(3);
                    Integer year = Integer.parseInt(books.get(4));
                    String author = books.get(5);
                    Book newBook = new Novel(title,publisher,author,year);
                    newBooks.add(newBook);
                    if (newBook instanceof Novel) {
                        ((Novel) newBook).setCodeBook(codeBook);
                    }
                }
                if (books.size() == 5){
                    String codeBook =books.get(1);
                    String title = books.get(2);
                    String period = books.get(3);
                    Integer year = Integer.parseInt(books.get(4));
                    Book newBook = new Magazine(title,period,year);
                    newBooks.add(newBook);
                    if (newBook instanceof Magazine) {
                        ((Magazine) newBook).setCodeBook(codeBook);
                    }
                }
                books.clear();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return newBooks;
    }

    public static void createFile() {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            // FileOutputStream wajib ditutup agar tidak ada terjadi data corrupt memory
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void writeFile(String str , Boolean bool) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, bool);
            fw.write(str);
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteLine(String codeBook) {
        try {
            List<String> line = Files.readAllLines(Paths.get(FILE_NAME));

            List<String> updateLine = new ArrayList<>(); // List untuk menampung string baru

            for (String s : line) {
                if (!s.contains(codeBook)) {
                    updateLine.add(s);
                }
            }
            Files.write(Paths.get(FILE_NAME),updateLine);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
