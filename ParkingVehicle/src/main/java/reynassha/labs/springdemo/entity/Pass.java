package reynassha.labs.springdemo.entity;

import java.time.LocalDateTime;

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
	public class Pass {
			    @Id
			    @GeneratedValue(strategy = GenerationType.IDENTITY)
			    private long id;

			    @Column(unique = true, nullable = false)
			    private int customer_id;
			    @Column 
			    private LocalDateTime   purchase_date;
			    @Column
			    private LocalDateTime start_date;
			    @Column
			    private int duration;
			    @Column
			    private int cost;
			  
			    // Default constructor
			 

			    public Pass(int customer_id, LocalDateTime purchase_date, LocalDateTime start_date, int duration, int cost) {
			    	
			    	super();  
			    	 
			        this.customer_id = customer_id;
			        this.purchase_date =  purchase_date;
			        this.start_date = start_date;
			         this.duration = duration;
			         this.cost = cost;
			        
			    }

			    
			    
				}


