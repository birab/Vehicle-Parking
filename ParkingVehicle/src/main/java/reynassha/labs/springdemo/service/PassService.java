package reynassha.labs.springdemo.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import reynassha.labs.springdemo.dto.PassDTO;
import reynassha.labs.springdemo.entity.Customer;
import reynassha.labs.springdemo.entity.Pass;
import reynassha.labs.springdemo.exception.CustomerNotFoundException;
import reynassha.labs.springdemo.exception.PassNotFoundException;
import reynassha.labs.springdemo.repo.PassRepo;

@Service
public class PassService {
	  private PassRepo repo;
	  
	  private ModelMapper mapper;
	 
	  public PassService(PassRepo repo, ModelMapper mapper) {
	        super();
	        this.repo = repo;
	        this.mapper = mapper;
	    }
	  
	  private PassDTO mapToDTO(Pass Pass) {
		 
		  return this.mapper.map(Pass, PassDTO.class);
	  }
	  
	  public Pass addPerson(Pass Pass) {
		  Pass saved =  this.repo.save(Pass);
	        return (saved);
	    }

	    public List<Pass> getAllPeople() {
	        return this.repo.findAll();
	    }
	  
	    public PassDTO readOne(Long id) {
	        Pass found = this.repo.findById(id).orElseThrow(PassNotFoundException::new);
	        return this.mapToDTO(found);
	    }
	  
	    
	    public PassDTO updatePass(Long id, Pass newPass) {
	        Optional<Pass> existingOptional = this.repo.findById(id);
	        Pass existing = existingOptional.get();

	        existing.setCustomer_id(newPass.getCustomer_id());
	        existing.setStart_date(newPass.getStart_date());
	        existing.setPurchase_date(newPass.getPurchase_date());
	        existing.setDuration(newPass.getDuration());
	        existing.setCost(newPass.getCost());
	        
	        Pass updated = this.repo.save(existing);
	        return this.mapToDTO(updated);
	    }
	    
	    public boolean removePass(Long id) {
	        // removes the entity
	        this.repo.deleteById(id);
	        // checks to see if it still exists
	        boolean exists = this.repo.existsById(id);
	        // returns true if entity no longer exists
	        return !exists;
	    }
}


