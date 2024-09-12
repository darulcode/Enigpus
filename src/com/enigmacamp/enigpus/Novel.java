package com.enigmacamp.enigpus;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Novel extends Book{
    private String codeBook;
    private String title;
    private String publisher;
    private Integer publishDate;
    private String author;

    public Novel(String title, String publisher, String author, Integer year) {
        this.codeBook = year + Utility.generateNovelCode();
        this.title = title;
        this.publisher = publisher;
        this.publishDate = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Jenis Buku : Novel\n" +
                "Kode Buku : " + codeBook +
                 "\nJudul Buku : " + title +
                "\nPenerbit : " + publisher +
                "\nTahun terbit : " + publishDate +
                "\nPenulis : " + author + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return Objects.equals(codeBook, novel.codeBook) && Objects.equals(title, novel.title) && Objects.equals(publisher, novel.publisher) && Objects.equals(publishDate, novel.publishDate) && Objects.equals(author, novel.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeBook, title, publisher, publishDate, author);
    }

    @Override
    String getCode() {
        return this.codeBook;
    }

    @Override
    String getTitle() {
        return this.title;
    }

}
