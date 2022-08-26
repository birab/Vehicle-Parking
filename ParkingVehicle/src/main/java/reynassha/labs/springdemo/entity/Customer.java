package reynassha.labs.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

	@NoArgsConstructor
	@Data
	@Entity
	public class Customer {
			    @Id
			    @GeneratedValue(strategy = GenerationType.IDENTITY)
			    private Long id;

			    @Column(unique = true, nullable = false)
			    private String customer_name;
			    @Column 
			    private String vehicle_no;
			    @Column
			    private String vehicle_make;
			    @Column
			    private String vehicle_color;
			   
			  
			    // Default constructor
			 

			    public Customer(Long id, String customer_name, String vehicle_no, String vehicle_make, String vehicle_color) {
			    	
			    	super();  
			    	
			    	this.id = id;
			        this.customer_name = customer_name;
			        this.vehicle_no =  vehicle_no;
			        this.vehicle_make = vehicle_make;
			         this.vehicle_color = vehicle_color;
			        
			    }

				}





