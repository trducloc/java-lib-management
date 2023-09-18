package entity;

import java.util.Scanner;

public class ListReader {
    private Reader reader;
    private Reader[] listReader;


    public void inputReaderList() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng bạn đọc mới:");
        int inputNumber = scanner.nextInt();

        // Kiểm tra nếu readerList là null
        if (listReader == null) {
            listReader = new Reader[inputNumber];
        } else {
            int currentSize = listReader.length;
            int newSize = currentSize + inputNumber;

            // Tạo một mảng mới có kích thước mới
            Reader[] newArray = new Reader[newSize];

            // Sao chép dữ liệu từ readerList cũ vào mảng mới
            for (int i = 0; i < currentSize; i++) {
                newArray[i] = listReader[i];
            }

            // Gán mảng mới vào readerList
            listReader = newArray;
        }

        // Nhập thông tin cho các bạn đọc mới
        for (int i = 0; i < listReader.length; i++) {
            if (listReader[i] == null) {
                System.out.print("Nhập bạn đọc thứ: " + (i + 1));
                listReader[i] = new Reader();
                listReader[i].inputReaderInfo();
            }
        }
    }

}
