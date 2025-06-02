abstract class Electronicdevices {
    String brand;
    String model;
    Boolean isOn;
    public Electronicdevices(String brand,String model){
        this.brand=brand;
        this.model=model;
        this.isOn=false;;
    }
   

    public void showdetails(){
        System.out.println("Brand : "+brand+"model : "+model);
    }
    public String getbrand(){
        return brand;

    }

    
}
