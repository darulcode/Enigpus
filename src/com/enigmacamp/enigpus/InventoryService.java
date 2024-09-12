package com.enigmacamp.enigpus;

public interface InventoryService {
    void addBook();
    void searchBookByTitle();
    void searchBookByCode();
    void deleteBookByCode(String code);
    void getAllBook();
}
