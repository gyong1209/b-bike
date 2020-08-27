package BikeRental;


public class BikeUpdated extends AbstractEvent {

    private Long id;
    private String status;

    public BikeUpdated(){
        super();
    }

    //@Autowired
    //BikeRepository bikeRepository;

    /*public BikeUpdated(Bike bike){
        this.status = "occupied";

    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
