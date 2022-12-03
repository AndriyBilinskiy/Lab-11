package example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import task2.*;
import task2.Gender;

public class TestMail {

    @Test
    public void testMailBox(){
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(new MailInfo(new Client("Andriy", Gender.MALE,19),new GiftMail()));
        Assertions.assertEquals(1, mailBox.infos.size());
    }
    @Test
    public void testMailInfo(){
        MailInfo mailInfo = new MailInfo(new Client("Andriy", Gender.MALE,19),new GiftMail());
        Assertions.assertEquals("SALE!!! Dear Andriy, Special sale for you!", mailInfo.generate());
    }


}
