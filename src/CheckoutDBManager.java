import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mudiw
 */
public class CheckoutDBManager 
{
    public static DB db = new DB();
    public static CheckoutDB checkoutDB;
    
    private CheckoutDB[] uArr = new CheckoutDB[100];
    private int size = 0;
    
    public CheckoutDBManager() throws SQLException
    {
        String u,d,pr,pa,c,hb;
        ResultSet rs = CheckoutDBManager.db.query("SELECT * FROM UserCheckoutBuy");
        
        while(rs.next())
        {
            u = rs.getString("Username");
            d = rs.getString("PurchaseDate");
            pr = rs.getString("TotalPrice");
            pa = rs.getString("Paymentmethod");
            c = rs.getString("Collection");
            hb = rs.getString("PurchaseType");
            
            uArr[size] = new CheckoutDB(u,d,pr,pa,c,hb);
            size++;
        }
    }

    

    public int getSize() 
    {
        return size;
    }

    public CheckoutDB[] getuArr() 
    {
        return uArr;
    }
    public void addCheckout(String U, String D, String PR, String PA, String C, String HB)
    {
        uArr[size] = new CheckoutDB(U,D,PR,PA,C,HB );
        size++;
    }
    public String toString()
    {
        String temp = "";
        for(int i =0; i<size; i++)
        {
            temp = temp + uArr + "\n";
        }
        return temp;
    }
}
