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

import reynassha.labs.springdemo.dto.PassDTO;
import reynassha.labs.springdemo.entity.Pass;
import reynassha.labs.springdemo.service.PassService;

@RestController
@RequestMapping("/pass")
public class PassController {
	private PassService service;

    public PassController(PassService service) {
        super();
        this.service = service;
    }
   
    @PostMapping("/create")
    public Pass addPerson(@RequestBody Pass person) {
        return this.service.addPerson(person);
    }

    @GetMapping("/getAll")
    public List<Pass> getAllPeople() {
        return this.service.getAllPeople();
    }

    @PutMapping("/update")
    public PassDTO updatePerson(@PathParam("id") Long id, @RequestBody Pass person) {
        return this.service.updatePass(id, person);
    }

    @DeleteMapping("/delete/{id}")
    public boolean removePerson(@PathVariable Long id) {
        return this.service.removePass(id);
    }

}
