package customermailapplication;

public class MountainCustomer extends Customer {

    @Override
    public String createMail() {
        return "Mountain Customer";
    }
    
}