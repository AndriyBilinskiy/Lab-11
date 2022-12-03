package task2;

public class GiftMail implements MailCode{
    private final static String TEMPLATE = "SALE!!! Dear %NAME, Special sale for you!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
