package U9_T2_MTSQL_ClassicModels;

import java.sql.*;
import java.util.ArrayList;

public class ADClassicModels {

  public ADClassicModels() {}

  /**
   * Funcion que recorre la tabla employees y devuelve un ArrayList con los empleados de la tabla.
   *
   * @return devuelve los empleados de la tabla employees en un ArrayList.
   * @throws SQLException
   */
  public ArrayList<Employee> getEmpleados() throws SQLException {

    ArrayList<Employee> ls = new ArrayList<>();

    Connection c = ConexionBD.getConnection();
    Statement st = c.createStatement();
    st.setQueryTimeout(30);

    ResultSet rs = st.executeQuery("select * from employees");

    while (rs.next()) {
      ls.add(
          new Employee(
              rs.getInt("employeeNumber"),
              rs.getString("lastName"),
              rs.getString("firstName"),
              rs.getString("extension"),
              rs.getString("email"),
              rs.getString("officeCode"),
              rs.getInt("reportsTo"),
              rs.getString("jobTitle")));
    }
    rs.close();
    return ls;
  }

  /**
   * Funcion que recorre la tabla offices y devuelve un ArrayList con las oficinas de la tabla.
   *
   * @return devuelve las oficinas de la tabla offices en un ArrayList.
   * @throws SQLException
   */
  public ArrayList<Office> getOffices() throws SQLException {
    ArrayList<Office> ls = new ArrayList<>();

    Connection c = ConexionBD.getConnection();

    Statement statement = c.createStatement();
    statement.setQueryTimeout(30);

    ResultSet rs = statement.executeQuery("select * from offices");
    while (rs.next()) {
      ls.add(
          new Office(
              rs.getInt("officeCode"),
              rs.getString("city"),
              rs.getString("phone"),
              rs.getString("addressLine1"),
              rs.getString("state"),
              rs.getString("country"),
              rs.getString("postalCode")));
    }
    rs.close();
    return ls;
  }
}
