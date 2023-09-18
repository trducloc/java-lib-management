package entity;

import statics.SpecializedType;

import java.util.Scanner;

public class Book {
    private static int AUTO_ID = 10000;
    private int idBook;
    protected String nameBook;
    protected String author;
    private String specialized;
    private int year;
    private SpecializedType specializedType;

    public SpecializedType getSpecializedType() {
        return specializedType;
    }

    public void setSpecializedType(SpecializedType specializedType) {
        this.specializedType = specializedType;
    }

    public Book() {
        this.idBook = AUTO_ID;
        AUTO_ID++;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", specialized='" + specialized + '\'' +
                ", year=" + year +
                ", specializedType=" + specializedType.value2 +
                '}';
    }

    public void inputBookInfo(){
        System.out.print("Nhập tên sách: ");
        this.setNameBook(new Scanner(System.in).nextLine());
        System.out.print("Nhập tác giả: ");
        this.setAuthor(new Scanner(System.in).nextLine());
        System.out.print("Nhập chuyên ngành: ");
        this.setSpecialized(new Scanner(System.in).nextLine());
        System.out.print("Nhập năm xuất bản: ");
        this.setYear(new Scanner(System.in).nextInt());
        System.out.println("Nhập loại sách, chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Khoa học tự nhiên.");
        System.out.println("2. Văn học - Nghệ thuật.");
        System.out.println("3. Điện tử Viễn thông.");
        System.out.println("4. Công nghệ thông tin.");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setSpecializedType(SpecializedType.NATURAL_SCIENCES);
                break;
            case 2:
                this.setSpecializedType(SpecializedType.LITERATURE_ART);
                break;
            case 3:
                this.setSpecializedType(SpecializedType.ELECTRONICS_TELECOMMUNICATION);
                break;
            case 4:
                this.setSpecializedType(SpecializedType.INFORMATION_TECHNOLOGY);
                break;
        }

    }

    public void setStatus(String borrowed) {
    }
}
