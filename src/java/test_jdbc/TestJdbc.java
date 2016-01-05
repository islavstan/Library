/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestJdbc {
    public void check(){
        try {
            InitialContext ic=new InitialContext();
            //с помощью DataSource можем работать с сервером GlassFish
            DataSource ds=(DataSource)ic.lookup("jdbc/Library");
           Connection con=ds.getConnection();
           Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM library.book");
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
            
         } catch (SQLException ex) {
            Logger.getLogger(TestJdbc.class.getName()).log(Level.SEVERE, null, ex);
           
        } catch (NamingException ex) {
            Logger.getLogger(TestJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
