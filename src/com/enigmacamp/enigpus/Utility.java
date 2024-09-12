package com.enigmacamp.enigpus;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Utility {
    public static Integer currentYear() {
        Date date = new Date();
        return date.getYear() + 1900;
    }

    public static String generateNovelCode() {
        String uuid = UUID.randomUUID().toString();
        String shortUUID = uuid.substring(0,4);
        return "-A-" + shortUUID;
    }

    public static String generateMagazineCode(){
        String uuid = UUID.randomUUID().toString();
        String shortUUID = uuid.substring(0,4);
        return "-B-" + shortUUID;
    }

    public static String inputString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    public static Integer inputInteger(String message)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        Integer value = null;
        try {
            value = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Inputan harus angka");
        }
        scanner.nextLine();
        if ( value == null) {
            return inputInteger(message);
        }
        return value;
    }

    public static String validationInputTitle(){
        Boolean counter = true;
        String title = "";
        while(counter){
            title = Utility.inputString("Masukan Judul Buku (min 3 karakter, dan maksimal 50 karakter) : ");
            if(title.length() < 3 || title.length() > 50){
                System.out.println("Judul Buku minimal 3 karakter atau maksimal 50 karakter.");
            } else counter = false;
        }
        return title;
    }
    public static String validationInputPublisher(){
        Boolean counter = true;
        String publisher = "";
        while(counter){
            publisher = Utility.inputString("Masukan Nama Penerbit (min 3 karakter, dan maksimal 20 karakter) : ");
            if(publisher.length() < 3 || publisher.length() > 20){
                System.out.println("Nama penerbit minimal 3 karakter atau maksimal 20 karakter.");
            } else counter = false;
        }
        return publisher;
    }

    public static String validationInputAuthor() {
        Boolean counter = true;
        String author = "";
        while(counter){
            author = Utility.inputString("Masukan Nama Penulis (min 3 karakter, dan maksimal 20 karakter) : ");
            if(author.length() < 3 || author.length() > 20){
                System.out.println("Nama penulis minimal 3 karakter atau maksimal 20 karakter.");
            } else counter = false;
        }
        return author;
    }

    public static String validationInputPeriod(){
        Boolean counter = true;
        String period = "";
        while(counter){
            period = Utility.inputString("Periode terbit (Mingguan, bulanan) : ");
            if(!period.equals("Mingguan") || !period.equals("bulanan")){
                counter = false;
            } else
                System.out.println("Periode terbit hanya Mingguan dan Bulanan.");
        }
        return period;
    }

    public static Integer validationInputYear(){
        Boolean counter = true;
        Integer year = 0;
        while(counter){
            year = inputInteger("Masukan Tahun Terbit Buku : ");
            if (year > 2024){
                System.out.println("Masukan Tahun Terbit Buku maksimal 2024.");
            } else counter = false;
        }
        return year;
    }


}

