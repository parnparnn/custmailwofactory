/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type: RegularCustomer, MountainCustomer, DelinquentCustomer: ");
        String customerType = inp.nextLine();
        Customer cus = CustomerFactory.createCustomer(customerType);
        System.out.println(cus);
    }
}
