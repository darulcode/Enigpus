package com.enigmacamp.enigpus;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EnigPusFile {
    public static void main(String[] args) {
        createFile();
    }

    private static String FILE_NAME = "EnigPus.csv";
    private static File file = new File(FILE_NAME);

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

    public static void deleteLine() {
        List<Book> book = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            while (true){
                String personString = br.readLine();
                if (personString == null) break;
                String[] personArray = personString.split("\n");
                Person person = new Person(
                        Integer.parseInt(personArray[0]),
                        personArray[1],
                        Integer.parseInt(personArray[2])
                );
                persons.add(person);
            }
            br.close();
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
        return persons;
    }

}
