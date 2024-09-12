package com.enigmacamp.enigpus;

public interface InventoryService {
    void addBook();
    void searchBookByTitle(String title);
    void searchBookByCode(String code);
    void deleteBookByCode(String code);
    void getAllBook();
}
