package NikoBolt;

public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Message reeived from the Internet";
    }
}
