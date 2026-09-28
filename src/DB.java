/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package kench;
/*
To get your Java progrm to connect to MS Access you have to download UCanAccess at
https://sourceforge.net/projects/ucanaccess/files/
and add the following JAR files to the classpath:
    ucanaccess-4.0.4.jar
    hsqldb-2.3.1.jar
    jackcess-2.1.11.jar
    commons-lang-2.6.jar
    commons-logging-1.1.3.jar
The version numbers here may differ than the latest versions you downloaded.
https://www.codejava.net/java-se/jdbc/java-jdbc-example-connect-to-microsoft-access-database
Add these libraries to the NetBeans Project
*/
import java.sql.*;


public class DB
{
    private static final String url = "jdbc:ucanaccess://PAT.accdb";

    private Connection conn;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public DB()
    {
          try  {    
            conn = DriverManager.getConnection(url);
            System.out.println("Connected");
        } catch (SQLException ex)
        {
            System.out.println("Cannot connect" + ex);
        }       
    }

    public void update(String update) throws SQLException
    {
        statement = conn.prepareStatement(update);
        statement.executeUpdate();
        statement.close();
    }

    public ResultSet query(String stmt) throws SQLException
    {
        statement = conn.prepareStatement(stmt);
        resultSet = statement.executeQuery();
        return resultSet;
    }

    public String processResultSet(ResultSet rs)
    {
        String temp = "";
        try
        {
            ResultSetMetaData meta = rs.getMetaData();
            int size = meta.getColumnCount();
            while (rs.next())
            {
                for (int i = 1; i <= size; i++)
                {
                    Object value = rs.getObject(i);
                    temp += "#" + value;
                }
                temp += "\n";
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return temp;
    }
}
