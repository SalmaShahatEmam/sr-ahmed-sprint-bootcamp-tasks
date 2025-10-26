package main.com.myApp.customAnnotation;

import main.com.myApp.Validation.confirmed;
import main.com.myApp.model.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConfirmedImplementation implements ConstraintValidator<confirmed, User> {

    @Override
    public void initialize(confirmed confirmed) {
    }

    @Override
    public boolean isValid(User user, ConstraintValidatorContext cxt) {
        String password = user.getPassword();
        String confirmPassword = user.getPassword_confirmed();

        if (password == null || confirmPassword == null) {
            return false;
        }
        return password.equals(confirmPassword);
    }

}