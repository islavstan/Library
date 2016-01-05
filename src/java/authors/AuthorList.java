/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import web.db.DataBase;


public class AuthorList {
    Statement st;
    ResultSet rs;
    Connection con;
    private ArrayList<Author> authorList=new ArrayList<Author>();
    private ArrayList<Author>getAuthors(){
        try{
            con=DataBase.getConnection();//хранит соединение с базой данных
            st=con.createStatement();//хранит и выполняет sql запросы

            //выполнение SQL запроса
             rs=st.executeQuery("select * from author");//получает результаты sql запросов

            while (rs.next()){
                Author author=new Author();
                author.setName(rs.getString("fio"));
                authorList.add(author);
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorList.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(AuthorList.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(AuthorList.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AuthorList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return authorList;
    }
    public ArrayList<Author>getAuthorList(){
        if(!authorList.isEmpty()){
            return authorList;
        }else{
            return getAuthors();
        }
    }
}
