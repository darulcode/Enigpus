package com.enigmacamp.enigpus;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Utility {
    public static Integer currentYear() {
        Date date = new Date();
        return date.getYear() + 1900;
    }

    public static String generateNovelCode() {
        String year = String.valueOf(currentYear());
        String uuid = UUID.randomUUID().toString();
        String shortUUID = uuid.substring(0,4);
        return year + "-A-" + shortUUID;
    }

    public static String generateMagazineCode(){
        Date getCurrentDate = new Date();
        String year = String.valueOf(getCurrentDate.getYear() + 1900);
        String uuid = UUID.randomUUID().toString();
        String shortUUID = uuid.substring(0,4);
        return year + "-B-" + shortUUID;
    }

    public static String inputString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    public static Integer inputInteger(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        Integer value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }



}

