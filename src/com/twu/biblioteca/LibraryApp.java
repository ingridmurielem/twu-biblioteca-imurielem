package com.twu.biblioteca;

import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.repository.UserRepository;
import com.twu.biblioteca.service.LibraryService;
import com.twu.biblioteca.service.SessionService;

import java.util.List;
import java.util.Scanner;

public class LibraryApp {

    private static final String MESSAGE = "Welcome Library!";
    private static final String MESSAGEALERT = "Select a valid option!";


    public static void main(String[] args) {
        SessionService sessionService = new SessionService(new UserRepository());
        LibraryService service = new LibraryService(new BookRepository(), new MovieRepository());
        int option;
        Boolean loggedUser;
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
            loggedUser = sessionService.login(userName, password);
            if (!loggedUser) {
                System.out.println("Invalid User");
            }
        } while (!loggedUser);

        if (loggedUser) {

            do {
                Scanner input = new Scanner(System.in);
                menuOptions();
                option = input.nextInt();
                switch (option) {
                    case 0:
                        LibraryApp.printNameEmailPhoneAtUser(sessionService.getUserInformation());
                        break;
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

    private static void menuOptions() {
        System.out.println("                  ==========================");
        System.out.println("                  |     0 - Inf User        |");
        System.out.println("                  |     1 - List Books      |");
        System.out.println("                  |     2 - List Movies     |");
        System.out.println("                  |     3 - Check In Book   |");
        System.out.println("                  |     4 - Return Book     |");
        System.out.println("                  |     5 - Check In Movie  |");
        System.out.println("                  |     6 - Quit            |");
        System.out.println("                  |     Option:             |");
        System.out.println("                  =========================\n");
    }

    private static void printNameEmailPhoneAtUser(User user){
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneNumber());
    }


}