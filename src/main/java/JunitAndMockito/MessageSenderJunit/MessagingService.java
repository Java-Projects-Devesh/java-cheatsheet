package JunitAndMockito.MessageSenderJunit;

public interface MessagingService {
    public String sendSMS(String SMS);
    public String sendEmail(String email);
}
