package U9_T2_MTSQL_ClassicModels;

import java.sql.*;

public class ConexionBD {

    //ATRIBUTO

    private static Connection con = null;

    //MÉTODOS

    public static Connection getConnection() {
        try {
            if (con == null) {
                String driver="com.mysql.jdbc.Driver";
                String url="jdbc:mysql://localhost:3306/classicmodels?autoReconnect=true";
                String pwd="1q2w3e4r5t";
                String usr="root";
                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conection Succesfull");

                /*con = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=1q2w3e4r5t");
                System.out.println("Conection Succesfull");*/
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static void close(){
        try{
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
