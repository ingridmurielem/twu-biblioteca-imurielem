package com.twu.biblioteca;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.service.LibraryService;
import java.util.Scanner;

public class BibliotecaApp {

    private static final String MESSAGE = "Welcome Library!";
    private static final String MESSAGEALERT = "Select a valid option!";


    public static void main(String[] args) {
        menuOptions();
        int option;
        Scanner input = new Scanner(System.in);
        option=input.nextInt();
        LibraryService service = new LibraryService(new BookRepository());
      //  for (String name: service.printBooks()) {System.out.println("Book Name: " + name);}
    }
    public static void menuOptions () {
        System.out.println("                    " +MESSAGE +"                 \n ");
        System.out.println("                  ==========================");
        System.out.println("                  |     1 - List Books      |");
        System.out.println("                  |     2 - Quit            |");
        System.out.println("                  |     Option:             |");
        System.out.println("                  =========================\n");

    }

}
