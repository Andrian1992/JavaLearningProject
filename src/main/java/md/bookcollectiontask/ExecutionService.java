package md.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {

        Book book1 = new Book("Atomic Habits", "James C.");
        Book book2 = new Book("Crime and Punishment", "Feodor D.");
        Book book3 = new Book("Karamazov Brothers", "Feodor D.");
        Book book4 = new Book("To Kill a Mockingbird", "Harper L.");
        Book book5 = new Book("1984", "George O.");

        book2.printTheBookDetails();
        book1.printTheBookDetails();
        book3.printTheBookDetails();
        book4.printTheBookDetails();
        book5.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(book1);
        carturestiLibrary.addBook(book2);
        carturestiLibrary.addBook(book3);
        carturestiLibrary.addBook(book4);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(book5));

        carturestiLibrary.addBook(book5);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(book5));

        carturestiLibrary.deleteTheBookIfExist(book1);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        carturestiLibrary.printAllTheBooks();


        Library victorsLibrary = new Library("Cartier");
        victorsLibrary.addBook(book1);
        victorsLibrary.addBook(book2);
        victorsLibrary.addBook(book3);
        System.out.println(victorsLibrary.getTheStockStatusNumber());
        victorsLibrary.printAllTheBooks();

        Map<String, Library> librariesMap = new HashMap<>();

        librariesMap.put("str. Stefan cel Mare 136", carturestiLibrary);
        librariesMap.put("str. Dacia 102", victorsLibrary);

        librariesMap.get("str. Stefan cel Mare 136").printAllTheBooks();
        System.out.println(librariesMap.get("str. Dacia 102").isThereSuchABookInTheStock(book1));


        int[] dataTable = new int[6];
        dataTable[0] = 65;
        dataTable[1] = 15;
        dataTable[2] = 6;
        dataTable[3] = 1;
        dataTable[4] = 15;
        dataTable[5] = 95;

        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));


        int[] dataTableShort = {2, 5, 6, 8, 9151, 4848, 9595, 998, 9823159, 161, 515, 51, 5}; // metoda fara a fi in mai multe rinduri

        System.out.println(IntNumberArrayService.findMin(dataTableShort));
        System.out.println(IntNumberArrayService.getAvg(dataTableShort));


    }
}
