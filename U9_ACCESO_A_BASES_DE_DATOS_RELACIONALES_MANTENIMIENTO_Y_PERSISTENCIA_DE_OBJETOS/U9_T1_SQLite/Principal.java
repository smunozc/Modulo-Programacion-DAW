package U9_T1_SQLite;

import java.sql.*;

public class Principal {
    public static void main(String[] args){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = con.createStatement();
            statement.setQueryTimeout(30);

            //Result set 1, imprime por pantalla los clientes que tienen el estado en nulo
            ResultSet rs1= statement.executeQuery("SELECT * FROM customers WHERE state is NULL;");
            System.out.println("Clientes que tienen el 'state' en nulo:");
            System.out.println("----------------------------------------");
            while (rs1.next()){
                System.out.println("Nombre del cliente: " + rs1.getString("customerName"));
            }

            //Result set 2, imprime por pantalla los pagos que superan los 30000
            System.out.println("\n Pagos que superan los 30.000:");
            System.out.println("----------------------------------------");
            ResultSet rs2 = statement.executeQuery("SELECT * FROM payments WHERE amount > 30000;");
            while (rs2.next()){
                System.out.println("Pago mayor a 30.000: " + "Cliente: " + rs2.getInt("customerNumber") + ", " +
                                    "Numero de cheque: " + rs2.getString("checknumber") + ", cantidad: " +
                                    rs2.getInt("amount"));
            }

            //Result set 3, imprime por pantalla los empleados que estan a cargo del empleado con id = 1143
            System.out.println("\n Empleados que dan cuenta al empleado con id(1143):");
            System.out.println("----------------------------------------");
            ResultSet rs3 = statement.executeQuery("SELECT * FROM employees WHERE reportsTo = 1143;");
            while (rs3.next()){
                System.out.println("Empleado: " + rs3.getString("firstName") + " " + rs3.getString("lastName") +
                                    ", Numero de empleado: " + rs3.getInt("employeeNumber"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            try{
                if (con != null){
                    con.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
