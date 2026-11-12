import java.util.Scanner;
import java.util.TreeMap;

public class LMS1{
    public static void main(String[] args) {

        TreeMap<Integer, String> book = new TreeMap<>();
        TreeMap<String, String> history = new TreeMap<>();

        int BookID;
        String BookName, StudName, date, StudID, bookid;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Add a New Book");
            System.out.println("2. Display History");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");

            System.out.println("Enter a choice:");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Enter Book ID:");
                BookID = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Book Name:");
                BookName = sc.nextLine();

                book.put(BookID, BookName);
                System.out.println("Book Added Successfully!");

            } else if (choice == 2) {
                

           if (history.isEmpty()) {
               System.out.println("No Issue History Found!");
           } else {
               System.out.println("Book ID | Book Details");

            for (String id : history.keySet()) {
                System.out.println(id + " | " + history.get(id));
        }
    }

                

            } else if (choice == 3) {

                System.out.println("Enter Book ID:");
                BookID = sc.nextInt();
                sc.nextLine();

                if (book.containsKey(BookID)) {

                    BookName = book.get(BookID);

                    System.out.println("Enter Student ID:");
                    StudID = sc.nextLine();

                    System.out.println("Enter Student Name:");
                    StudName = sc.nextLine();

                    System.out.println("Enter Date:");
                    date = sc.nextLine();

                    history.put(String.valueOf(BookID),
                        BookName + " | " + StudID + " | "
                        + StudName + " | " + date);

                    book.remove(BookID);

                    System.out.println("Book Issued Successfully!");

                } else {
                    System.out.println("Book Not Available!");
                }

            } else if (choice == 4) {

                System.out.println("Enter Book ID:");
                bookid = sc.next();

                if (history.containsKey(bookid)) {

                    String details = history.get(bookid);
                    String[] data = details.split(" \\| ");

                    book.put(Integer.parseInt(bookid), data[0]);
                    history.remove(bookid);

                    System.out.println("Book Returned Successfully!");

                } else {
                    System.out.println("Invalid Book ID!");
                }

            } else if (choice == 5) {

                System.out.println("All Available Books:");
                System.out.println(book);

            } else if (choice == 6) {

                System.out.println("Byeee...!");
                break;

            } else {

                System.out.println("Invalid Choice, Please Try Again!");
            }

        } while (true);

      
    }
}