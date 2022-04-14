package pro.sky.skyprocalculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDivisionException extends IllegalArgumentException{

    public ZeroDivisionException() {
        super("Watch closely! You can't divided dy zero.");
    }

}