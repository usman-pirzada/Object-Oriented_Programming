interface MessageService {

    void send(String message, String recipient);
    String receive();
}

class WhatsApp implements MessageService {
    private String message;

    public void send(String message, String recipient) {
        this.message = message;
        System.out.println("Your message has been sent to " + recipient + " successfully");
    }

    public String receive() {
        return "\nReceived Message:\n\t" + this.message;
    }
}

public class Task_05 {
    public static void main(String[] args) {

        WhatsApp wa = new WhatsApp();

        wa.send("Where are you?", "Zeeshan");
        System.out.println(wa.receive());
    }
}