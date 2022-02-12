package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
     public void getBook() {
         System.out.println("Taking a book from UniLibrary");
         System.out.println("--------------------------------------------");
     }
    public String returnBook() {
        System.out.println("Returning book");
        return "Война и мир";
    }
    public void getMagazine() {
        System.out.println("Taking a magazine from UniLibrary");
        System.out.println("--------------------------------------------");
    }
    public void returnMagazine() {
        System.out.println("Returning a book in UniLibrary");
        System.out.println("--------------------------------------------");
    }
    public void addBook(String person_name, Book book) {
        System.out.println("Add a book to UniLibrary");
        System.out.println("--------------------------------------------");
    }
    public void addMagazine() {
        System.out.println("Add a magazine to UniLibrary");
        System.out.println("--------------------------------------------");
    }
}
