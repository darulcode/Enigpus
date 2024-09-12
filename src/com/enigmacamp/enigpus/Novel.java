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

    public Novel(String title, String publisher, String author) {
        this.codeBook = Utility.generateNovelCode();
        this.title = title;
        this.publisher = publisher;
        this.publishDate = Utility.currentYear();
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

    public Integer getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Integer publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
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
