
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
public class DonateManager 
{
    public static DB db = new DB();
    public static DonateDB DonateDB;
    
    private DonateDB[] dArr = new DonateDB[100];
    private int size = 0;
    
    public DonateManager() throws SQLException
    {
        String p, s, d, q, e;
        ResultSet rs = DonateManager.db.query("SELECT * FROM UserProductInfo");
        
        while(rs.next())
        {
            p = rs.getString("ProductType");
            s = rs.getString("ProductSize");
            d = rs.getString("DonationDate");
            q = rs.getString("DonationQuantity");
            e = rs.getString("Email");
            
            dArr[size] = new DonateDB(p, s, d, q, e);
            size++;
        }
    }

    

    public int getSize() 
    {
        return size;
    }

    public DonateDB[] getdArr() 
    {
        return dArr;
    }
    public void addDonation(String P, String S, String D, String Q, String E)
    {
        dArr[size] = new DonateDB(P,S,D,Q,E );
        size++;
    }
    public String toString()
    {
        String temp = "";
        for(int i =0; i<size; i++)
        {
            temp = temp + dArr + "\n";
        }
        return temp;
    }
}
