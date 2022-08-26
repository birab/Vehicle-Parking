package reynassha.labs.springdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import reynassha.labs.springdemo.entity.Customer;


	@Repository
	public interface CustomerRepo extends JpaRepository<Customer, Long> {
		
		
		
		
//		@Query("SELECT p from Person p WHERE p.name = ?1")
			//	List<Person>findPersonBYNameJPQL(String name);
		
		//@Query("SELECT p from Person p WHERE p.name = ?1 and p.id = ?2")
			//	Person findPersonByNameAndAgeJPQL(String name, int id);

	}

