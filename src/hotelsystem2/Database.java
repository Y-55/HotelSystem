/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Yousef Abdullah Abdulwahab
 */
public class Database {

    private Connection connect() throws SQLException {
        Connection con;
        String url = "jdbc:sqlite:C:\\Program Files\\SQLiteStudio\\HMS.db";
        con = DriverManager.getConnection(url);
        System.out.println("Connection Establish");
        return con;

    }

    public void insertUser(String username, String password, String emial, String phone, String address) throws SQLException {
        String sqlCommand
                = "INSERT INTO USERS(Username, Password, Email, Phone, Address) "
                + "VALUES('" + username + "','" + password + "','" + emial + "','" + phone + "','" + address + "');";

        Connection con = this.connect();
        Statement st = con.createStatement();
        st.executeUpdate(sqlCommand);
        st.close();
        con.close();
        System.out.println("the user added");
    }

    public void createRoom(String roomNumber, double roomRate) throws SQLException {
        String sqlCommand
                = "INSERT INTO ROOMS([Room-number], [Room-rate])"
                + "VALUES('" + roomNumber + "'," + roomRate + ");";

        Connection con = this.connect();
        Statement st = con.createStatement();
        st.executeUpdate(sqlCommand);
        st.close();
        con.close();
        System.out.println("the room added");
    }

    public boolean login(String username, String password) throws SQLException {
        String sqlCommand = ""
                + "SELECT Username, Password, User-type "
                + "FROM USERS "
                + "WHERE Username = '"+username+"' ";

        Connection con = this.connect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sqlCommand);
        if (rs.next()) {
            String name = rs.getString("Username");
            String pass = rs.getString("Password");
            String type = rs.getString("User-type");
            if (username.equals(name) && password.equals(pass)) {
                st.close();
                con.close();
                return true;
            } else {
                st.close();
                con.close();
                return false;
            }
        } else {
            st.close();
            con.close();
            return false;
        }

//        while (rs.next()) {
//            String name = rs.getString("username");
//            String pass = rs.getString("password");
//
//            if (username.equals(name) && password.equals(pass)) {
//                st.close();
//                con.close();
//                return true;
//            }
//        }
//        st.close();
//        con.close();
//        return false;
    }
}
