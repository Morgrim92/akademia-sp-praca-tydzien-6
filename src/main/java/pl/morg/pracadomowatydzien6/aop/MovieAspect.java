package pl.morg.pracadomowatydzien6.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import pl.morg.pracadomowatydzien6.api.Email;

@Aspect
@Component
public class MovieAspect {

    private  final Email email;

    public MovieAspect(Email email) {
        this.email = email;
    }

    @After("@annotation(MovieAnnotation)")
    private void sendEmail(JoinPoint joinPoint) {
        String message = "New movie has been added!";
        email.emailSend("wprowadzadres@gmail.com", "Nowy film", message);
    }

}
