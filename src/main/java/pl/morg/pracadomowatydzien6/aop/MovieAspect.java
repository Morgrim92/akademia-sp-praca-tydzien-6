package pl.morg.pracadomowatydzien6.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MovieAspect {

    @After("@annotation(MovieAnnotation)")
    private void sendEmail() {

    }

}
