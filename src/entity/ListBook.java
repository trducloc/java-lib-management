package entity;

import java.util.Scanner;

public class ListBook {
    private Book[] listBook;

    public void inputBookList() {

        System.out.println("Nhập số lượng đầu sách mới:");
        int inputNumber = new Scanner(System.in).nextInt();

        if (listBook == null) {
            listBook = new Book[inputNumber];
        } else {
            int currentSize = listBook.length;
            int newSize = currentSize + inputNumber;

            Book[] newArray = new Book[newSize];

            for (int i = 0; i < currentSize; i++) {
                newArray[i] = listBook[i];
            }
            listBook = newArray;
        }

        // Nhập thông tin cho các đầu sách mới
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] == null) {
                System.out.print("Nhập đầu sách thứ : "+ (i + 1));
                listBook[i] = new Book();
                listBook[i].inputBookInfo();
            }
        }
    }

}
