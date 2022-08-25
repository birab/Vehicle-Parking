package reynassha.labs.springdemo.dto;

import java.time.LocalDateTime;

public class PassDTO {
	private Long id;

    private int customer_id;

    private LocalDateTime purchase_date;
    
    private LocalDateTime start_date;
    
    private int duration;
    
    private int cost;
    

    public PassDTO() {
        super();
    
    }
  

public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}

public int getCustomerid() {
    return customer_id;
}

public void setCustomerid(int customer_id) {
   this.customer_id = customer_id;
}

public LocalDateTime  getDate() {
    return purchase_date;
}

public void setDate(LocalDateTime purchase_date) {
   this.purchase_date = purchase_date;
}

public  LocalDateTime getStartdate() {
    return start_date;
}

public void setStartdate(LocalDateTime start_date) {
    this.start_date = start_date;

}

public int getDuration() {
    return duration;
}

public void setDuration(int duration) {
    this.duration = duration;
}

public int getCost() {
    return cost;
}

public void setCost(int cost) {
    this.cost = cost;
}
}
