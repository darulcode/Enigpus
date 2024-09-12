package com.enigmacamp.enigpus;

import java.util.Objects;

public class Magazine extends Book{
    private String codeBook;
    private String title;
    private String periodPublish;
    private Integer publishYear;

    public Magazine(String title, String periodPublish) {
        this.codeBook = Utility.generateMagazineCode();
        this.title = title;
        this.periodPublish = periodPublish;
        this.publishYear = Utility.currentYear();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPeriodPublish() {
        return periodPublish;
    }

    public void setPeriodPublish(String periodPublish) {
        this.periodPublish = periodPublish;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "\nJenis Buku : Majalah\n" +
                "Kode Buku : " + codeBook +
                "\nJudul Buku : " + title +
                "\nPeriode Terbit : " + periodPublish +
                "\nTahun terbit : " + publishYear + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(codeBook, magazine.codeBook) && Objects.equals(title, magazine.title) && Objects.equals(periodPublish, magazine.periodPublish) && Objects.equals(publishYear, magazine.publishYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeBook, title, periodPublish, publishYear);
    }

    @Override
    String getCode() {
        return "";
    }

    @Override
    String getTitle() {
        return "";
    }
}
