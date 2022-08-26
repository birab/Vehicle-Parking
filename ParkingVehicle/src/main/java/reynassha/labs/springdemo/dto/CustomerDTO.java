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
  

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}

public String getCustomer_name() {
    return customer_name;
}

public void setCustomer_name(String customer_name) {
   this.customer_name = customer_name;
}

public String getvehicle_no() {
    return vehicle_no;
}

public void setvehicle_no(String vehicle_no) {
    this.vehicle_no = vehicle_no;
}

public String getVehicle_make() {
    return vehicle_make;
}

public void setVehicle_make(String vehicle_make) {
    this.vehicle_make = vehicle_make;

}

public String getVehicle_color() {
    return vehicle_color;
}

public void setVehicle_color(String vehicle_color) {
    this.vehicle_color = vehicle_color;
}
}