package customermailapplication;

import java.util.Scanner;


public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private static Customer customer;
   
    public static void main(String[] args) {
        CustomerFactory app2 = new CustomerFactory();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                //app.getCustomerTypeFromUser("Regular");
                customer = app2.createCustomer("Regular");
                break;
            case 2:
                //app.getCustomerTypeFromUser("Mountain");
                customer = app2.createCustomer("Mountain");
                break;
            case 3:
                //app.getCustomerTypeFromUser("Delinquent");
                customer = app2.createCustomer("Delinquent");
                break;
            
        }
        System.out.println(customer.createMail());        
    }
}