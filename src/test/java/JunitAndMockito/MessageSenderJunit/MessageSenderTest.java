package JunitAndMockito.MessageSenderJunit;

import JunitAndMockito.MessageSenderJunit.MessageSender;
import JunitAndMockito.MessageSenderJunit.MessagingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

public class MessageSenderTest {
    MessageSender messageSender;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    MessagingService messagingService;

    @Before
    public void setUp(){
          this.messageSender = new MessageSender(messagingService);
    }


    @Test
    public void testSendingSMS(){
        when(messageSender.sendSMS("Hello")).thenReturn("Hello");
        Assert.assertEquals("Hello", messageSender.sendSMS("Hello"));
    }

    @Test
    public void testSendingEmail(){
        when(messageSender.sendEmail("Hey")).thenReturn("Hey");
        Assert.assertEquals("Hey", messageSender.sendEmail("Hey"));
    }

}
