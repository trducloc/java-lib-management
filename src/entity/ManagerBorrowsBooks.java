package entity;
public class ManagerBorrowsBooks  {
    private Person person;
    private Reader reader;
    private Book book;
    private int numOfBorrow;
    private String state;



    public ManagerBorrowsBooks() {
    }

    public ManagerBorrowsBooks(Book book) {
        this.book = book;
    }

    public ManagerBorrowsBooks(Reader reader, Book book, int numOfBorrow, String state, Book[] totalBorrowed, int[] totalBorrowedCount) {
        this.reader = reader;
        this.book = book;
        this.numOfBorrow = numOfBorrow;
        this.state = state;

    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNumOfBorrow() {
        return numOfBorrow;
    }

    public void setNumOfBorrow(int numOfBorrow) {
        this.numOfBorrow = numOfBorrow;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ManagerBorrowsBooks{" +
                "person=" + person +
                ", reader=" + reader +
                ", book=" + book +
                ", numOfBorrow=" + numOfBorrow +
                ", state='" + state + '\'' +
                '}';
    }
}


