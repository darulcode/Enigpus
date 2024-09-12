package com.enigmacamp.enigpus;

public class EnigPus {
    private static InventoryServiceImpl inventoryServiceImpl = new InventoryServiceImpl();
    public static void enterEnigPus(){
        while(true){
            ConsoleDisplay.menuList();
            Integer input = Utility.inputInteger("Pilih menu (1-6) : ");
            switch (input){
                case 1:
                    //TODO: add books
                    inventoryServiceImpl.addBook();
                    break;
                case 2:
                    //TODO: Mencari buku berdasarkan kode buku
                    inventoryServiceImpl.searchBookByCode();
                    break;
                case 3:
                    //TODO: Mencari buku berdasarkan judul buku
                    inventoryServiceImpl.searchBookByTitle();
                    break;
                case 4:
                    //TODO: Menghapus buku berdasarkan kode
                    inventoryServiceImpl.deleteBookByCode();
                    break;
                case 5:
                    //TODO: Menampilkan semua buku
                    inventoryServiceImpl.getAllBook();
                    break;
                case 6:
                    return;
            }
        }
    }



}
