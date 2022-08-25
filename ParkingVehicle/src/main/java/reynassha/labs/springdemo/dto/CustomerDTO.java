package reynassha.labs.springdemo.dto;

public class CustomerDTO {
	private Long id;

    private String customer_name;

    private String vehicle_no;
    
    private String vehicle_make;
    
    private String vehicle_color;
    

    public CustomerDTO() {
        super();
    
    }
  

public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}

public String getName() {
    return customer_name;
}

public void setName(String customer_name) {
   this.customer_name = customer_name;
}

public String getNumber() {
    return vehicle_no;
}

public void setNumber(String vehicle_no) {
    this.vehicle_no = vehicle_no;
}

public String getMake() {
    return vehicle_make;
}

public void setMake(String vehicle_make) {
    this.vehicle_make = vehicle_make;

}

public String getColor() {
    return vehicle_color;
}

public void setColor(String vehicle_color) {
    this.vehicle_color = vehicle_color;
}
}