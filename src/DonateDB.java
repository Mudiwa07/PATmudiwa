/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mudiw
 */
public class DonateDB 
{
   private String product;
   private String size;
   private String date;
   private String quantity;
   private String email;

    public DonateDB(String p, String s, String d, String q, String e) 
    {
        product = p;
        size = s;
        date = d;
        quantity = q;
        email = e;
    }

    public String getProduct() {
        return product;
    }

    public String getSize() {
        return size;
    }

    public String getDate() {
        return date;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getEmail() {
        return email;
    }

    
    public void setProduct(String product) {
        this.product = product;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DonateDB{" + "product=" + product + ", size=" + size + ", date=" + date + ", quantity=" + quantity + ", email=" + email + '}';
    }

    
}
