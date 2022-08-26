package reynassha.labs.springdemo.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "The customer with that id does not exist")
public class CustomerNotFoundException extends EntityNotFoundException {

	

	

	}


