package THPT_ItemSale;


/**
 * SaleItem lets users input the price of items and set a discount rate
 * that will reduce the total price.  Also a user will input the amount of money
 * given and the change recieved will be calculated.  
 * 
 * @author Arion Almond
 * @version 2/19/2014
 */
public class SaleItem
{
    
    
    double priceOfItem;
    double discountPercent;
    double taxRate;
    double cash;
    double discountPrice;
    double finalPrice;
    double change;
    
    /**
     * no-args constructor that that sets values for fields
     */
    
    public SaleItem()
    {
        priceOfItem = 0;
        discountPercent = .10;
        taxRate = .075;
        cash = 0;
        
        
    }
    
    
    /**
     * This constructor has arguments to allow the user to set the
     * initial values.  
     * @param double - the value for priceOfItem
     * @param double - the value for discountPercent
     * @param double - the value for the taxRate
     */
    
    public SaleItem(double price, double discount, double tax)
    {
        priceOfItem = price;
        discountPercent = discount;
        taxRate = tax;
    }
    
    
    /**
     * This method is used to set the price of the item.
     * @param double - the changed value of priceOfItem
     * 
     */
    
    public void setPrice(double price)
    {
        priceOfItem = price;
    }
    
    /**
     * This method is used to set the discount percent.
     * @param double - the changed value of the discountPercent
     */
    
    public void setDiscountPercent(double discount)
    {
        discountPercent = discount;
    }
    
    
   /**
     * This method is used to set the tax rate.
     * @param double - the changed value of the taxRate
     */
    
    public void setTaxRate(double tax)
    {
        taxRate = tax;
    }
    
     /**
     * This method is used to set the cash amount.
     * @param double - the changed value of cash tendered
     */
    
    public void setCash(double mula)
    {
        cash = mula;
    }
    
    
    /**
     * This method is used to calculate the discount price.
     * It will use the information provided to calulate the amount
     * and return the value.
     * @return - the discounted price of the item
     */
    public double getDiscountPrice()
    {
        discountPrice = priceOfItem - (priceOfItem * discountPercent);
        return discountPrice;
    }
    
     /**
     * This method is used to calculate the final price.
     * It will use the information provided to calulate the amount
     * and return the value.
     * @return - the final price of the item
     */
    public double getFinalPrice()
    {
        finalPrice = discountPrice + (discountPrice * taxRate);
        return finalPrice;
    }
    
     /**
     * This method is used to calculate the change due.
     * It will use the information provided to calulate the amount
     * and return the value.
     * @return - the change due to the customer
     */
    public double getChange()
    {
        change = cash - finalPrice;
        return change;
    } 
}
