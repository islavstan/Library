/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Home
 */
public class DataBase {
    private static Connection conn;
    private static InitialContext ic;
    private static DataSource ds;
    public static Connection getConnection(){
        try{
            //контекст - это состояние переменных в данный момент
            ic = new InitialContext();
            //с помощью DataSource можем работать с сервером GlassFish
            ds=(DataSource)ic.lookup("jdbc/Library");
            if(conn==null){
                conn=ds.getConnection();
            }
                   
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
}
