package com.twu.biblioteca;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.service.LibraryService;
import java.util.Scanner;

public class BibliotecaApp {

    private static final String MESSAGE = "Welcome Library!";
    private static final String MESSAGEALERT = "Select a valid option!";
    private static final String MESSAGECHEKOUTSUCESS = "Thank you! Enjoy the book";



    public static void main(String[] args) {
        LibraryService service = new LibraryService(new BookRepository());
        int option;
        Scanner input = new Scanner(System.in);
        do {
            menuOptions();
            option = input.nextInt();
            switch (option){
            case 1:
                 service.printNameBooks();

                break;
            case 2:
                break;
            default:
                System.out.println(MESSAGEALERT);
                break;
        }}while (option != 2);

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
