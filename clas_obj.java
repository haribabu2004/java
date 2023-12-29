import java.util.Date;

class User {
    int userId;
    String userName;
    String userEmail;

    User(int userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }
}

class Book{
    int bookId;
    String bookName;
    String author;

    Book(int bookId , String bookName ,String author ){
        this.bookId=bookId;
        this.bookName=bookName;
        this.author=author;
    }
}

class Card {
    int cardId;
    User user;
    Date issueDate;
    Date returnDate;

    Card(int cardId, User user, Date issueDate, Date returnDate) {
        this.cardId = cardId;
        this.user = user;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
}

class ReminderMessage {
    int messageId;
    String messageText;

    ReminderMessage(int messageId, String messageText) {
        this.messageId = messageId;
        this.messageText = messageText;
    }
}






public class clas_obj {
    public static void main(String[] args) {
        User user = new User(1, "John Doe", "johndoe@example.com");
        Book book = new Book(101, "The Catcher in the Rye", "J.D. Salinger");
        Date issueDate = new Date();
        Date returnDate = new Date(issueDate.getTime() + 14 * 24 * 60 * 60 * 1000); // 2 weeks from issue date
        Card card = new Card(1001, user, issueDate, returnDate);
        ReminderMessage message = new ReminderMessage(501, "Please return the book by the due date.");

        // Print user information
        System.out.println("User Information:");
        System.out.println("User ID: " + user.userId);
        System.out.println("User Name: " + user.userName);
        System.out.println("User Email: " + user.userEmail);

        // Print book information
        System.out.println("\nBook Information:");
        System.out.println("Book ID: " + book.bookId);
        System.out.println("Book Title: " + book.bookName);
        System.out.println("Author: " + book.author);

        // Print card information
        System.out.println("\nCard Information:");
        System.out.println("Card ID: " + card.cardId);
        System.out.println("User ID: " + card.user.userId);
        System.out.println("Issue Date: " + card.issueDate);
        System.out.println("Return Date: " + card.returnDate);

        // Print reminder message
        System.out.println("\nReminder Message:");
        System.out.println("Message ID: " + message.messageId);
        System.out.println("Message Text: " + message.messageText);
    }
}
