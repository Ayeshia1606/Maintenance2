
package com.ayeshiat.demo.domain.core.expections;

//telling you how things went when you asked them to do something.
// good (200), couldn't find what you wanted (404),
// and  a big problem (500).
import org.springframework.http.HttpStatus;

//used to import the ResponseStatus annotation
import org.springframework.web.bind.annotation.ResponseStatus;


//the conflict status is stating there is a clash between systems
// both systems are doing different request
@ResponseStatus(value = HttpStatus.CONFLICT)
public class ResourceCreationException extends RuntimeException {
    //is when an exception has occurred and the program stopped running
    //and an error message has displayed(Runtime Exception)
    public ResourceCreationException(String message){
        super(message);
    }

}
