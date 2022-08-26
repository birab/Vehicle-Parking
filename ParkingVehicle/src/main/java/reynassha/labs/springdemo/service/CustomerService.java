package reynassha.labs.springdemo.service;

import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import reynassha.labs.springdemo.dto.CustomerDTO;
import reynassha.labs.springdemo.entity.Customer;
import reynassha.labs.springdemo.exception.CustomerNotFoundException;
import reynassha.labs.springdemo.repo.CustomerRepo;

@Service
public class CustomerService {
	  private CustomerRepo repo;
	  
	  private ModelMapper mapper;
	 
	  public CustomerService(CustomerRepo repo, ModelMapper mapper) {
	        super();
	        this.repo = repo;
	        this.mapper = mapper;
	    }
	  
	  private CustomerDTO mapToDTO(Customer customer) {
		 
		  return this.mapper.map(customer, CustomerDTO.class);
	  }
	  
	  public Customer addPerson(Customer customer) {
	        Customer saved =  this.repo.save(customer);
	        return (saved);
	    }

	    public List<Customer> getAllPeople() {
	        return this.repo.findAll();
	    }
	    
	    public CustomerDTO readOne(Long id) {
	        Customer found = this.repo.findById(id).orElseThrow(CustomerNotFoundException::new);
	        return this.mapToDTO(found);
	    }
	  //ById
	    
	    public CustomerDTO updateCustomer(Long id, Customer newCustomer) {
	        Optional<Customer> existingOptional = this.repo.findById(id);
	        Customer existing = existingOptional.get();

	        existing.setCustomer_name(newCustomer.getCustomer_name());
	        existing.setVehicle_no(newCustomer.getVehicle_no());
	        existing.setVehicle_make(newCustomer.getVehicle_make());
	        existing.setVehicle_color(newCustomer.getVehicle_color());

	        Customer updated = this.repo.save(existing);
	        return this.mapToDTO(updated);
	    }
	    
	    public boolean removePerson(Long id) {
	        // removes the entity
	        this.repo.deleteById(id);
	        // checks to see if it still exists
	        boolean exists = this.repo.existsById(id);
	        // returns true if entity no longer exists
	        return !exists;
	    }
}


