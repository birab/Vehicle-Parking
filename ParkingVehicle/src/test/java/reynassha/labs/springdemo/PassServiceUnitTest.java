package reynassha.labs.springdemo;

import java.time.LocalDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import reynassha.labs.springdemo.entity.Pass;
import reynassha.labs.springdemo.repo.PassRepo;
import reynassha.labs.springdemo.service.PassService;


	@SpringBootTest
	public class PassServiceUnitTest {
	
			 
		  @Autowired
	    private PassService service;

	    @MockBean
	    private PassRepo repo;
		
	    @Test
	    void testCreate() {
	    	final Pass TEST_Pass = new Pass(null, 10, LocalDateTime.now(), LocalDateTime.now(), 4, 12 );
	   	    final Pass TEST_SAVED_Pass = new Pass(1L, 10, LocalDateTime.now(), LocalDateTime.now(), 4 , 12);
	    	     	   
	    
	    	    // WHEN
	    	    Mockito.when(this.repo.save(TEST_Pass)).thenReturn(TEST_SAVED_Pass);

	    	    // THEN
	    	    Assertions.assertThat(this.service.addPerson(TEST_Pass)).isEqualTo(TEST_SAVED_Pass);

	    	    // verify that our repo was accessed exactly once
	    	    Mockito.verify(this.repo, Mockito.times(1)).save(TEST_Pass);
	    
	  
	    }
	    


	}

