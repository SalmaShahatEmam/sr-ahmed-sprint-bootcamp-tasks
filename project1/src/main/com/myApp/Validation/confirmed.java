package main.com.myApp.Validation;

import main.com.myApp.customAnnotation.ConfirmedImplementation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = ConfirmedImplementation.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface confirmed {

    String message() default "password does not match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
