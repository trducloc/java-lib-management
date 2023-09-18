package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class borrowBook extends Person {

    private Reader reader;
    private List<Book> listBorrowBook;
    private static int totalBorrow;
    private entity.Person Person;


    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public List<Book> getListBorrowBook() {
        return listBorrowBook;
    }

    public void setListBorrowBook(List<Book> listBorrowBook) {
        this.listBorrowBook = listBorrowBook;
    }

    public int getTotalBorrow() {
        return totalBorrow;
    }

    public void setTotalBorrow(int totalBorrow) {
        this.totalBorrow = totalBorrow;
    }

    public borrowBook(Reader reader) {
        this.reader = reader;
        this.listBorrowBook = new ArrayList<>();

    }

    public borrowBook(String name, int totalBorrow) {
    }

    public void borrowBook(Book book) {
        if (listBorrowBook.size() >= 5) {
            System.out.println("Bạn đọc đã mượn đầy 5 đầu sách. Không thể mượn thêm.");
            return;
        }

        int totalBorrow = 0;
        for (Book s : listBorrowBook) {
            if (s.getIdBook() == book.getIdBook()) {
                totalBorrow++;
            }
        }

        if (totalBorrow >= 3) {
            System.out.println("Bạn đọc đã mượn đủ 3 cuốn sách này. Không thể mượn thêm.");
            return;
        }

        listBorrowBook.add(book);
        book.setStatus("Đã được mượn");

        System.out.println("Bạn đọc " + reader.getId() + " đã mượn sách " + book.getNameBook());
    }


    public void printListBorrowBook() {
        System.out.println("Danh sách sách đang mượn:");
        for (Book sach : listBorrowBook) {
            System.out.println("- " + sach.getNameBook());
        }
    }

    public static void inThongTin() {
        System.out.println("Tên bạn đọc: " + entity.Person.getName() + ", Số lượng sách mượn: " + totalBorrow);
    }

    public static boolean sortByName() {

        List<borrowBook> danhSachQuanLyMuonSach = new ArrayList<>();


        // Nhập danh sách quản lý mượn sách từ người dùng
        System.out.println("Nhập danh sách quản lý mượn sách (nhập 'q' để hoàn tất):");
        boolean continueEntering = true;
        while (continueEntering) {
            System.out.print("Nhập tên bạn đọc: ");
            String tenBanDoc = new Scanner(System.in).nextLine();

            if (tenBanDoc.equalsIgnoreCase("q")) {
                continueEntering = false;
                break;
            }

            System.out.print("Nhập số lượng sách mượn: ");
            int totalBorrow = new Scanner(System.in).nextInt();

            borrowBook borrows = new borrowBook(entity.Person.getName(), totalBorrow);
            danhSachQuanLyMuonSach.add(borrows);
        }

        int n = danhSachQuanLyMuonSach.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                borrowBook a = danhSachQuanLyMuonSach.get(j);
                borrowBook b = danhSachQuanLyMuonSach.get(j + 1);

                int compareByName = getName().compareTo(getName());

                if (compareByName > 0) {
                    // Swap a và b
                    danhSachQuanLyMuonSach.set(j, b);
                    danhSachQuanLyMuonSach.set(j + 1, a);
                } else if (compareByName == 0) {
                    if (a.getTotalBorrow() < b.getTotalBorrow()) {
                        // Swap a và b
                        danhSachQuanLyMuonSach.set(j, b);
                        danhSachQuanLyMuonSach.set(j + 1, a);
                    }
                }
            }
        }

        // In ra danh sách quản lý mượn sách đã sắp xếp
        System.out.println("Danh sách quản lý mượn sách đã sắp xếp:");
        for (borrowBook borrowBooks : danhSachQuanLyMuonSach) {
            inThongTin();
        }
        return continueEntering;
    }
    public static boolean findbyName(){
        List<borrowBook> danhSachQuanLyMuonSach = new ArrayList<>();
        int n = danhSachQuanLyMuonSach.size();
    System.out.print("Nhập tên bạn đọc cần tìm kiếm: ");
    String tenBanDocCanTim = new Scanner(System.in).nextLine();

    // Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc
        System.out.println("Danh sách mượn sách của bạn đọc '" + tenBanDocCanTim + "':");
    boolean timThay = false;
        for (borrowBook borrowBooks : danhSachQuanLyMuonSach) {
        if (borrowBooks.getName().equalsIgnoreCase(tenBanDocCanTim)) {
            borrowBooks.inThongTin();
            timThay = true;
        }
    }

        if (!timThay) {
        System.out.println("Không tìm thấy thông tin của bạn đọc '" + tenBanDocCanTim + "'.");
    }
        return timThay;
    }

}


