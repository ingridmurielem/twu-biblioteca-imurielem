package com.twu.biblioteca;

import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.repository.UserRepository;
import com.twu.biblioteca.service.LibraryService;
import com.twu.biblioteca.service.SystemService;

import java.util.Scanner;

public class BibliotecaApp {

    private static final String MESSAGE = "Welcome Library!";
    private static final String MESSAGEALERT = "Select a valid option!";


    public static void main(String[] args) {
        LibraryService service = new LibraryService(new BookRepository(), new MovieRepository());
        SystemService loginService = new SystemService(new UserRepository());
        int option, validUser = 0;
        String selectBook;
        String selectMovie;
        String userName;
        String password;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("                    " + MESSAGE + "                 \n ");
            System.out.println("                  ==========================");
            System.out.println("                  |       User Name:       |");
            System.out.println("                  =========================\n");
            userName = input.nextLine();
            System.out.println("                  ==========================");
            System.out.println("                  |       Password:        |");
            System.out.println("                  =========================\n");
            password = input.nextLine();
            validUser = loginService.userValidation(userName, password);
        }while (validUser != 1  );

        if ( validUser == 1) {

            do {
                Scanner input = new Scanner(System.in);
                menuOptions();
                option = input.nextInt();
                switch (option) {
                    case 1:
                        service.printNameBooks();
                        break;
                    case 2:
                        service.printNameMovies();
                        break;
                    case 3:
                        service.printAvalaibleBooks();
                        System.out.println("Name Book:");
                        input = new Scanner(System.in);
                        selectBook = input.nextLine();
                        System.out.println(service.checkInBook(selectBook));
                        break;
                    case 4:
                        System.out.println("Name Book:");
                        input = new Scanner(System.in);
                        selectBook = input.nextLine();
                        System.out.println(service.checkOutBook(selectBook));
                        break;
                    case 5:
                        System.out.println("Name Movie:");
                        input = new Scanner(System.in);
                        selectMovie = input.nextLine();
                        System.out.println(service.checkInMovie(selectMovie));
                    case 6:
                        break;
                    default:
                        System.out.println(MESSAGEALERT);
                        break;

                }
            } while (option != 6);

        }

    }
    public static void menuOptions () {

        System.out.println("                  ==========================");
        System.out.println("                  |     1 - List Books      |");
        System.out.println("                  |     2 - List Movies     |");
        System.out.println("                  |     3 - Check In Book   |");
        System.out.println("                  |     4 - Return Book     |");
        System.out.println("                  |     5 - Check In Movie  |");
        System.out.println("                  |     6 - Quit            |");
        System.out.println("                  |     Option:             |");
        System.out.println("                  =========================\n");

    }


}