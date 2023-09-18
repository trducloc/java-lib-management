import entity.Book;
import entity.ManagerBorrowsBooks;
import entity.Reader;
import entity.borrowBook;


import java.util.ArrayList;
import java.util.Scanner;

import static entity.borrowBook.findbyName;
import static entity.borrowBook.sortByName;

public class Main {
    private static Reader[] readers = new Reader[100];
    private static Book[] books = new Book[100];

    public static void main(String[] args) {
        while(true){
            printMenu();
            int functionChoice = chooseFunction();

            switch (functionChoice) {
                case 1:
                    inputReader();
                    
                    break;
                case 2:
                    showReader();
                    break;
                case 3:
                    inputBook();
                    break;
                case 4:
                    showBook();
                    break;
                case 5:
                    //....
                    break;
                case 6:
                    //....
                    break;
                case 7:
                    menuChild();
                    break;
                case 8:
                    findbyName();
                    break;
                case 9:
                    return;
            }
        }
    }



    private static void showBook() {
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null){
                System.out.println(books[i]);
            }
        }
    }
    private static void inputReader() {
        System.out.print("Có bao nhiêu bạn đọc muốn thêm mới: ");
        int readerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNumber; i++) {
            System.out.println("Nhập thông tin cho bạn đọc thứ: "+ (i + 1));
            Reader reader = new Reader();
            reader.inputReaderInfo();
            saveReader(reader);
        }
    }
    private static void inputBook() {
        System.out.print("Có bao nhiêu đầu sách muốn thêm mới: ");
        int bookNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < bookNumber; i++) {
            System.out.println("Nhập thông tin cho đầu sách thứ: "+ (i + 1));
            Book book = new Book();
            book.inputBookInfo();
            saveBook(book);
        }
    }
    private static void showReader() {
        for (int i = 0; i < readers.length; i++) {
            if(readers[i] != null){
                System.out.println(readers[i]);
            }
        }
    }
    private static void saveBook(Book book) {
        for (int j = 0; j < books.length; j++) {
            if(books[j] == null){
                books[j] = book;
                break;
            }
        }
    }
    private static void saveReader(Reader reader) {
        for (int j = 0; j < readers.length; j++) {
            if(readers[j] == null){
                readers[j] = reader;
                break;
            }
        }
    }
    private static int chooseFunction() {
        System.out.print("Xin mời lựa chọn chức năng: ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 9) {
                break;
            }
            System.out.print("Chức năng không hợp lệ, vui lòng chọn lại: ");

        } while (true);
        return functionChoice;
    }
    public static void menuChild() {
        System.out.println("_______________Các lựa chọn sắp xếp_______________");
        int x = 0;
        do {
            System.out.println("1. Sắp xếp theo tên bạn đọc(A-Z)");
            System.out.println("2. Sắp xếp theo tổng số lượng mượn(Giảm dần)");
            System.out.println("0. Trở lại menu chính.");
            System.out.print("Bạn chọn: ");
            x = new Scanner(System.in).nextInt();
            if (x == 0) {
                break;
            }
            switch (x){
                case 1:
                    sortByName();
                    break;
                case 2:
                    // sap xep theo so luong muon
                    break;
            }

        } while (true);
    }
    private static void printMenu() {
        System.out.println("------Library Management System-----");
        System.out.println("1. Nhập bạn đọc mới");
        System.out.println("2. In danh sách bạn đọc");
        System.out.println("3. Nhập sách mới");
        System.out.println("4. In danh sách các cuốn sách");
        System.out.println("5. Lập bảng mượn sách");
        System.out.println("6. In danh sách mượn sách");
        System.out.println("7. Sắp xếp danh sách mượn sách");
        System.out.println("8. Tìm kiếm trong danh sách mượn sách");
        System.out.println("9. Thoát");
    }
}
