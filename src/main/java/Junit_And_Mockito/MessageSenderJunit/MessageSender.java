package Junit_And_Mockito.MessageSenderJunit;

public class MessageSender {

    MessagingService service;

    public MessageSender(MessagingService messagingService){
        service = messagingService;
    }

    public String sendSMS(String sms) {
        System.out.println("SMS was sent: " + sms);
        return service.sendSMS(sms);
    }

    public String sendEmail(String email) {
        System.out.println("Email was sent: " + email);
        return service.sendEmail(email);
    }

}
