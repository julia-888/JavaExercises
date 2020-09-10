package third;

class Book{
    String author;
    String name;
    int year;
    int numberOfPages;
    int numberOfChapters;

    String getAuthor(){
        return author;
    }

    String getName(){
        return name;
    }

    int getYear(){
        return year;
    }

    int getNumberOfPages(){
        return numberOfPages;
    }
    int getNumberOfChapters(){
        return numberOfChapters;
    }

    void setAuthor(String author){
        this.author = author;
    }
    void setName(String name){
        this.name = name;
    }
    void setYear(int year){
        this.year = year;
    }
    void setNumberOfPages(int n){
        numberOfPages = n;
    }
    void setNumberOfChapters(int n){
        numberOfChapters = n;
    }


}


public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("A.Dumas");
        book.setName("Le Comte de Monte-Cristo");
        book.setNumberOfChapters(177);
        book.setNumberOfPages(1589);
        book.setYear(1845);

        System.out.println("The great author " + book.getAuthor() + " has written a wonderful book, called " + book.getName() + " in " + book.getYear() + ". This book has got " + book.getNumberOfChapters() + " chapters on " + book.getNumberOfPages() + " pages.");
    }
}
