package MODUL1;

import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    list<Menu> listMenu = new ArrayList<>()

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu menu){
        listMenu.add(menu)
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        System.out.println("Menu");
    }

    // TODO Create Method to Search Menu from Database
    public void searchMenu() { 
        System.out.print("Sistem pencarian");  
    }

}

