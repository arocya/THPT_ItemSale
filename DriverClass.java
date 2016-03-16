package THPT_ItemSale;


/**
 * This is the driver class for SaleItem.
 * 
 * @author Arion Almond 
 * @version 2/19/2014
 */

import java.util.*;
public class DriverClass
{
        public static void main (String[]args)
        {
            Scanner input = new Scanner(System.in);
            
            SaleItem itemCost = new SaleItem();
            
            double inItemPrice = 0;
            double inCashAmount = 0;
            double discountPrice = 0;
            double totalPrice = 0;
            double inDiscountPercent =0;
            char repeat = 'y'; 
            
            do
            {
            System.out.println("Welcome to the Item Cost Calculator. We will calculate \nhow much your item " +
                               "was discounted.  \nStandard discount is 10 percent!"  +
                               "\nPlease enter the price of the item : ");
                               
            inItemPrice = input.nextDouble();
            itemCost.setPrice(inItemPrice);
            
            System.out.println("How much cash would you like to pay with? \n" +
                               "Please enter the amount of cash : " );
                              
            inCashAmount = input.nextDouble();
            itemCost.setCash(inCashAmount);
            
            discountPrice = itemCost.getDiscountPrice();
            totalPrice = itemCost.getFinalPrice();
            
            
            
            System.out.println("Results: \n Original Price : " + inItemPrice +
                                "\n Discount Price : " + discountPrice +
                                "\n Total Price (tax included) : " + totalPrice +
                                "\n Change Due: " + (inCashAmount-totalPrice));
                                
                                
            System.out.println("What would you like to change the discount percent to: ");
            
            inDiscountPercent = input.nextDouble();
            itemCost.setDiscountPercent(inDiscountPercent);
            
            System.out.println("How much cash would you like to pay with? \n" +
                               "Please enter the amount of cash : " );
                              
            inCashAmount = input.nextDouble();
            itemCost.setCash(inCashAmount);
            discountPrice = itemCost.getDiscountPrice();
            totalPrice = itemCost.getFinalPrice();
                              
            System.out.println("Results: \n Original Price : " + inItemPrice +
                        "\n Discount Price : " + discountPrice +
                        "\n Total Price (tax included) : " + totalPrice +
                        "\n Change Due: " + (inCashAmount-totalPrice));
            
            
            System.out.println("Would you like to find the discount price of another item? " +
                                "\n Enter (y) for yes or (n) for no: ");
                
            repeat = input.next().charAt(0);
            
        }while(repeat =='y');
    
    }
}
