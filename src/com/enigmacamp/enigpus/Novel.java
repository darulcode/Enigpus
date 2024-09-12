package com.enigmacamp.enigpus;
import java.util.Objects;

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

    private void inputIntoFile() {

    }

    public void setCodeBook(String code) {
        this.codeBook = code;
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


    public String stringFIle() {
        return "Jenis Buku : Novel," +
                "Kode Buku : " + codeBook +
                 ",Judul Buku : " + title +
                ",Penerbit : " + publisher +
                ",Tahun terbit : " + publishDate +
                ",Penulis : " + author;
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
