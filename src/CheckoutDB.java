/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mudiw
 */
public class CheckoutDB 
{
    
   private String username;
   private String date;
   private String price;
   private String pay;
   private String collect;
   private String hirebuy;

    public CheckoutDB(String u, String d, String pr, String pa, String c, String hb) 
    {
        username = u;
        date = d;
        price = pr;
        pay = pa;
        collect = c;
        hirebuy = hb;
    }

    public String getUsername() 
    {
        return username;
    }

    public String getDate() 
    {
        return date;
    }

    public String getPrice() 
    {
        return price;
    }

    public String getPay() 
    {
        return pay;
    }

    public String getCollect() 
    {
        return collect;
    }
    public String getHireBuy() 
    {
        return hirebuy;
    }
    

    
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public void setCollect(String collect) {
        this.collect = collect;
    }

    public void setHirebuy(String hirebuy) {
        this.hirebuy = hirebuy;
    }
    

    

    @Override
    public String toString() 
    {
        return "CheckoutDB{" + "username=" + username + ", date=" + date + ", price=" + price + ", pay=" + pay + ", collect=" + collect + ", hirebuy=" + hirebuy + '}';
    }
}
