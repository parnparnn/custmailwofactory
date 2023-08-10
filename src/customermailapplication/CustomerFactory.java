/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermailapplication;

/**
 *
 * @author Akiparn
 */
public class CustomerFactory {
    public static Customer createCustomer(String type) {
        switch (type) {
            case "DelinquentCustomer":
                return new DelinquentCustomer();
            case "MountainCustomer":
                return new MountainCustomer();
            case "RegularCustomer":
                return new RegularCustomer();
            default:
                break;
        }
	return null;
    }
}
