package U9_T3_Aplicacion_con_PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

  // ATRIBUTO

  private static Connection con = null;

  // MÉTODOS

  public static Connection getConnection() {
    try {
      if (con == null) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/classicmodels?autoReconnect=true";
        String pwd = "1q2w3e4r5t";
        String usr = "root";
        Class.forName(driver);
        con = DriverManager.getConnection(url, usr, pwd);
        System.out.println("Conection Succesful");
      }
    } catch (SQLException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
    return con;
  }

  public static void close() {
    try {
      if (con != null) {
        con.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
