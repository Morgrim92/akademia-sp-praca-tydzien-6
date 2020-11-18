package pl.morg.pracadomowatydzien6.api;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Email {

    private final JavaMailSender jms;

    public Email(JavaMailSender jms) {
        this.jms = jms;
    }

    @Async
    public void emailSend(String to,
                          String subject,
                          String message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        jms.send(simpleMailMessage);
    }
}
