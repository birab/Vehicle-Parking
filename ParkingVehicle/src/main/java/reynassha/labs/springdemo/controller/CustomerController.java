package reynassha.labs.springdemo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reynassha.labs.springdemo.dto.CustomerDTO;
import reynassha.labs.springdemo.entity.Customer;
import reynassha.labs.springdemo.exception.CustomerNotFoundException;
import reynassha.labs.springdemo.service.CustomerService;
@RestController
@RequestMapping("/customer")
public class CustomerController {
	private CustomerService service;

    public CustomerController(CustomerService service) {
        super();
        this.service = service;
    }
      
    @PostMapping("/create")
    public Customer addPerson(@RequestBody Customer person) {
        return this.service.addPerson(person);
    }

    @GetMapping("/read")
    public void readOne(@PathParam("id") Long id) {
    	this.service.readById(id);;
    }
    
    @GetMapping("/getAll")
    public List<Customer> getAllPeople() {
        return this.service.getAllPeople();
    }

    @PutMapping("/update")
    public CustomerDTO updatePerson(@PathParam("id") Long id, @RequestBody Customer person) {
        return this.service.updateCustomer(id, person);
    }

    @DeleteMapping("/delete/{id}")
    public boolean removePerson(@PathVariable Long id) {
        return this.service.removePerson(id);
    }

}
