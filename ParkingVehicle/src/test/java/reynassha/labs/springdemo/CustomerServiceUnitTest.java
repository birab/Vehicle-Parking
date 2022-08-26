package reynassha.labs.springdemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import reynassha.labs.springdemo.entity.Customer;
import reynassha.labs.springdemo.repo.CustomerRepo;
import reynassha.labs.springdemo.service.CustomerService;


	@SpringBootTest
	public class CustomerServiceUnitTest {
		 
		  @Autowired
	    private CustomerService service;

	    @MockBean
	    private CustomerRepo repo;

	    @Test
	    void testCreate() {
	    	final Customer TEST_CUSTOMER = new Customer( null, "Kathy Shrestha", "LK45TYD", "Toyota", "Blue");
	   	    final Customer TEST_SAVED_CUSTOMER = new Customer(8L, "Kathy Shrestha", "LK45TYD", "Toyota", "Blue");
	    	     	   
	    
	    	    // WHEN
	    	    Mockito.when(this.repo.save(TEST_CUSTOMER)).thenReturn(TEST_SAVED_CUSTOMER);

	    	    // THEN
	    	    Assertions.assertThat(this.service.addPerson(TEST_CUSTOMER)).isEqualTo(TEST_SAVED_CUSTOMER);

	    	    // verify that our repo was accessed exactly once
	    	    Mockito.verify(this.repo, Mockito.times(1)).save(TEST_CUSTOMER);
	    	   

	    }
	    }



