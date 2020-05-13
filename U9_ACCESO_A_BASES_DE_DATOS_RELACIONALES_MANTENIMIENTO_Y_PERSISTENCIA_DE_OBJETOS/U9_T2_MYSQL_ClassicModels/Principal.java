package U9_T2_MTSQL_ClassicModels;

import java.sql.SQLException;

public class Principal {
  public static void main(String[] args) {
    try {
      ADClassicModels cmbd = new ADClassicModels();
      System.out.println(cmbd.getEmpleados());
      System.out.println(cmbd.getOffices());
      ConexionBD.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
