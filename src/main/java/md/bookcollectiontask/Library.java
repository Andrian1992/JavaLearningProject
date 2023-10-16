package md.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> LibraryStock;
    private String LibraryName;

    public Library(String name) {
        LibraryName = name;
        LibraryStock = new ArrayList<>();
    }

    public void addBook(Book bookElement){
        boolean operationStatus = LibraryStock.add(bookElement);
        if (operationStatus){
            System.out.println(" The book " + bookElement.getTitle() + "has been added");
        }else {
            System.out.println(" The book " + bookElement.getTitle() + "has not been added");;
        }
    }

    public int getTheStockStatusNumber(){
        return LibraryStock.size();
    }

    public boolean isThereSuchABookInTheStock(Book book){
        return LibraryStock.contains(book);
    }

    public void deleteTheBookIfExist(Book book){
        if(LibraryStock.remove(book)){
            System.out.println("The book " + book.getTitle() + " has been deleted");
        } else {
            System.out.println("The book " + book.getTitle() + " has not exist");
        }
    }

    public void printAllTheBooks(){
        for (int i = 0; i <LibraryStock.size(); i++){
            LibraryStock.get(i).printTheBookDetails();
        }
    }
}
