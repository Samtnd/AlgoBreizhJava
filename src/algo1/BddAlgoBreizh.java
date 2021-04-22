/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo1;

/**
 *
 * @author Arthur
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BddAlgoBreizh {
    
    
    public static Connection conn;
    //Statement statement;
   //PreparedStatement pstmt;

    //test
    //private String BDD = "algobreizhvisite?autoReconnect=true&useSSL=false";
    //private String url ="jdbc:mysql://localhost:3307/" + BDD;
    //private String user = "root";
    //private String password = "";
    
    //serveur
    private String BDD = "ztsz4174_algobreizhvisite?autoReconnect=true&useSSL=true";
    private String url ="jdbc:mysql://dropfinder.fr/" + BDD;
    private String user = "ztsz4174_algobreizh_admin";
    private String password = "QhvTLmQrx42I7HzMo";

    public BddAlgoBreizh() throws ClassNotFoundException,SQLException {
        getBdd();
    }

    public Connection getBdd() throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.jdbc.Driver");

        conn = (Connection) DriverManager.getConnection(url,user,password);

        return conn;
    }
    
    
}
