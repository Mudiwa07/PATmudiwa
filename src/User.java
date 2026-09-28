/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mudiw
 */
public class User 
{
   private String username;
   private String cellno;
   private String email;
   private String password;

    public User(String u, String c, String e, String p) 
    {
        username = u;
        cellno = c;
        email = e;
        password = p;
    }

    public String getUsername() 
    {
        return username;
    }

    public String getCellno() 
    {
        return cellno;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getPassword() 
    {
        return password;
    }

    
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public void setCellno(String cellno) 
    {
        this.cellno = cellno;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    @Override
    public String toString() 
    {
        return "User{" + "username=" + username + ", cellno=" + cellno + ", email=" + email + ", password=" + password + '}';
    }
    
    
   
    
    
    
    
    
    
}
