/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bari.dao;

import com.bari.util.Database;
import java.sql.*;

public class UserDAO {
  public static boolean login(String login, String password) throws SQLException  {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = Database.getConnection(); 
            ps = con.prepareStatement(
                    "select uname, password from users where uname = ? and password = ? ");
            ps.setString(1, login);
            ps.setString(2, password);

            rs = ps.executeQuery();
            if (rs.next()) // found
            {
                //System.out.println(rs.getString("uname"));
                return true;
            } 
            else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error in login() -->" + ex.getMessage());
            return false;
        } finally {
            //FixedVar.close(con);
            rs.close();
            ps.close();
            Database.close(con);
        }
    }  
}
