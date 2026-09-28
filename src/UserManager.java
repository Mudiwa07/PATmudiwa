
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
public class UserManager 
{
    public static DB db = new DB();
    public static User user;
    
    private User[] uArr = new User[100];
    private int size = 0;
    
    public UserManager() throws SQLException
    {
        String u,c,e,p;
        ResultSet rs = UserManager.db.query("SELECT * FROM User Info");
        
        while(rs.next())
        {
            u = rs.getString("Username");
            c = rs.getString("CellNo");
            e = rs.getString("Email");
            p = rs.getString("Password");
            
            uArr[size] = new User(u,c,e,p);
            size++;
        }
    }

    

    public int getSize() 
    {
        return size;
    }

    public User[] getuArr() 
    {
        return uArr;
    }
    public void addUser(String U, String C, String E, String P)
    {
        uArr[size] = new User(U,C,E,P);
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
