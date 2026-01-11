
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message1 = new Message("Adam", "Hello");
        Message message2 = new Message("Alex", "Hi");
        Message message3 = new Message("Andy", "What are you doing?");
        
        MessagingService messages = new MessagingService();
        
        messages.add(message1);
        messages.add(message2);
        messages.add(message3);
        
        for (Message message: messages.getMessages()) {
            System.out.println(message);
        }
    }
}
