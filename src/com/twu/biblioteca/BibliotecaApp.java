package com.twu.biblioteca;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.service.LibraryService;
import java.util.Scanner;

public class BibliotecaApp {

    private static final String MESSAGE = "Welcome Library!";
    private static final String MESSAGEALERT = "Select a valid option!";



    public static void main(String[] args) {
        LibraryService service = new LibraryService(new BookRepository());
        int option;
        String selectBook;
        Scanner input = new Scanner(System.in);
        Scanner input2= new Scanner(System.in);

        do {
            menuOptions();
            option = input.nextInt();
            switch (option){
                case 1:
                    service.printNameBooks();
                    break;

                case 2:
                    service.printNameBooks();
                    selectBook =  input2.nextLine();
                    System.out.println(service.checkIn(selectBook));
                    break;
                case 3:
                    input2 = new Scanner(System.in);
                        selectBook =  input2.nextLine();
                        System.out.println(service.checkOut(selectBook));
                    break;
                case 4:
                    break;
                default:
                    System.out.println(MESSAGEALERT);
                    break;

        }}while (option != 4);

    }
    public static void menuOptions () {

        System.out.println("                    " +MESSAGE +"                 \n ");
        System.out.println("                  ==========================");
        System.out.println("                  |     1 - List Books      |");
        System.out.println("                  |     2 - Check In        |");
        System.out.println("                  |     3- Return Book      |");
        System.out.println("                  |     4 - Quit            |");
        System.out.println("                  |     Option:             |");
        System.out.println("                  =========================\n");

    }


}
