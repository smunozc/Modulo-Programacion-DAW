package U9_T3_Aplicacion_con_PreparedStatements;

import java.sql.*;
import java.util.Scanner;

public class ADClassicModels {

  public ADClassicModels() {}
  Scanner sc = new Scanner(System.in);

  public boolean insertarCliente(){
    System.out.println("Inserta los datos del cliente: ");
    System.out.println("numero del cliente:");
    int customerNumber = sc.nextInt();
    sc.nextLine();
    System.out.println("nombre del cliente:");
    String customerName = sc.nextLine();
    System.out.println("apellido del contacto:");
    String contactLastName = sc.nextLine();
    System.out.println("nombre del contacto:");
    String contactFirstName = sc.nextLine();
    System.out.println("teléfono de contacto:");
    String phone = sc.nextLine();
    System.out.println("direccion 1 del cliente:");
    String addressLine1 = sc.nextLine();
    System.out.println("direccion 2 del cliente:");
    String addressLine2 = sc.nextLine();
    System.out.println("ciudad del cliente:");
    String city = sc.nextLine();
    System.out.println("estado del cliente:");
    String state = sc.nextLine();
    System.out.println("CP del cliente:");
    String postalCode = sc.nextLine();
    System.out.println("país del cliente:");
    String country = sc.nextLine();
    System.out.println("numero del empleado responsable:");
    int salesRepEmployeeNumber = sc.nextInt();
    System.out.println("limite de credito del cliente:");
    float creditLimit = sc.nextInt();

    Customer customer = new Customer(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,
                              addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit);

    try{
      Connection c = ConexionBD.getConnection();
      String sql = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement st = c.prepareStatement(sql);

      st.setInt(1,customer.getCustomerNumber());
      st.setString(2,customer.getCustomerName());
      st.setString(3,customer.getContactLastName());
      st.setString(4,customer.getContactFirstName());
      st.setString(5,customer.getPhone());
      st.setString(6,customer.getAddressLine1());
      st.setString(7,customer.getAddressLine2());
      st.setString(8,customer.getCity());
      st.setString(9,customer.getState());
      st.setString(10,customer.getPostalCode());
      st.setString(11,customer.getCountry());
      st.setInt(12,customer.getSalesRepEmployeeNumber());
      st.setFloat(13,customer.getCreditLimit());

      st.setQueryTimeout(30);
      st.executeUpdate();

      return true;
    }catch(SQLException e){
      e.printStackTrace();
      return false;
    }
  }


  public boolean asignarEmpleado(){
    System.out.println("Asigna un empleado a un cliente: ");
    System.out.println("Introduce el número del empleado: ");
    int numEmpleado = sc.nextInt();
    System.out.println("Introduce el número del cliente: ");
    int numCliente = sc.nextInt();
    try{

      Connection c = ConexionBD.getConnection();

      //Comprobar el empleado
      String sqlEmployee = "SELECT * FROM employees WHERE employeeNumber = ?";
      PreparedStatement stEmployee = c.prepareStatement(sqlEmployee);

      stEmployee.setInt(1,numEmpleado);
      stEmployee.setQueryTimeout(30);
      ResultSet rsEmployee = stEmployee.executeQuery();

      while(!rsEmployee.next()){
        System.out.println("El numero del empleado no existe. Por favor, vuelva a introducirlo:");
        numEmpleado = sc.nextInt();
        stEmployee.setInt(1,numEmpleado);
        rsEmployee = stEmployee.executeQuery();
      }

      //Comporbar el cliente
      String sqlCustomer = "SELECT * FROM customers WHERE customerNumber = ?";
      PreparedStatement stCustomer = c.prepareStatement(sqlCustomer);

      stCustomer.setInt(1,numCliente);
      stCustomer.setQueryTimeout(30);
      ResultSet rsCustomer = stCustomer.executeQuery();

      while(!rsCustomer.next()){
        System.out.println("El numero del cliente no existe. Por favor, vuelva a introducirlo:");
        numCliente = sc.nextInt();
        stCustomer.setInt(1,numCliente);
        rsCustomer = stCustomer.executeQuery();
      }

      //Asignar empleado al cliente
      String sqlAsigna = "UPDATE customers SET salesRepEmployeeNumber = ? WHERE customerNumber = ?";
      PreparedStatement stAsigna = c.prepareStatement(sqlAsigna);

      stAsigna.setInt(1,numEmpleado);
      stAsigna.setInt(2,numCliente);
      stAsigna.setQueryTimeout(30);

      stAsigna.executeUpdate();
      return true;
    }catch(SQLException e){
      e.printStackTrace();
      return false;
    }

  }

  public boolean addProducto(){
    System.out.println("Añade un producto al pedido: ");
    System.out.println("Introduce el número del producto: ");
    String productCode = sc.nextLine();
    System.out.println("Introduce el número del pedido: ");
    int numPedido = sc.nextInt();
    System.out.println("Introduce el precio de venta: ");
    float priceEach = sc.nextFloat();
    System.out.println("Introduce la cantidad de producto a añadir");
    int cantiadadProducto = sc.nextInt();
    System.out.println("Introduce el numero de linea del pedido: ");
    int orderLineNumber = sc.nextInt();
    sc.nextLine();
    try{

      Connection c = ConexionBD.getConnection();

      //Comprobar el producto
      String sqlProducto = "SELECT * FROM products WHERE productCode = ?";
      PreparedStatement stProducto = c.prepareStatement(sqlProducto);

      stProducto.setString(1,productCode);
      stProducto.setQueryTimeout(30);
      ResultSet rsProducto = stProducto.executeQuery();

      while(!rsProducto.next()){
        System.out.println("El numero del producto no existe. Por favor, vuelva a introducirlo:");
        productCode = sc.nextLine();
        stProducto.setString(1,productCode);
        rsProducto = stProducto.executeQuery();
      }


      //Comporbar el pedido
      String sqlOrder = "SELECT * FROM orders WHERE orderNumber = ?";
      PreparedStatement stOrder = c.prepareStatement(sqlOrder);

      stOrder.setInt(1,numPedido);
      stOrder.setQueryTimeout(30);
      ResultSet rsOrder = stOrder.executeQuery();

      while(!rsOrder.next()){
        System.out.println("El numero del pedido no existe. Por favor, vuelva a introducirlo:");
        numPedido = sc.nextInt();
        stOrder.setInt(1,numPedido);
        rsOrder = stOrder.executeQuery();
      }

      //Añadir producto al pedido
      String sqlAdd = "INSERT INTO orderdetails VALUES (?,?,?,?,?)";
      PreparedStatement stAdd = c.prepareStatement(sqlAdd);

      stAdd.setInt(1,numPedido);
      stAdd.setString(2,productCode);
      stAdd.setInt(3,cantiadadProducto);
      stAdd.setFloat(4,priceEach);
      stAdd.setInt(5,orderLineNumber);
      stAdd.setQueryTimeout(30);

      stAdd.executeUpdate();

      rsProducto.close();
      rsOrder.close();

      return true;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean mostrarPedido(){
    System.out.println("Identificador del pedido: ");
    int orderID = sc.nextInt();

    try{
      Connection c = ConexionBD.getConnection();
      //Comprobar si existe el pedido
      String sql = "SELECT * FROM orders WHERE orderNumber = ?";
      PreparedStatement st = c.prepareStatement(sql);

      st.setInt(1,orderID);

      ResultSet rs = st.executeQuery();
      while(!rs.next()){
        System.out.println("El pedido no existe. Vuelve a introducir el código: ");
        orderID = sc.nextInt();
        st.setInt(1,orderID);
        rs = st.executeQuery();
      }

      sql = "SELECT * FROM orders WHERE orderNumber = ?";
      st = c.prepareStatement(sql);

      st.setInt(1,orderID);

      rs = st.executeQuery();
      rs.next();

      System.out.println("Pedido " + rs.getInt("orderNumber"));
      System.out.println("---------------------------");
      System.out.println("Fecha de pedido: " + rs.getString("orderDate"));
      System.out.println("Fecha requerida: " + rs.getString("requiredDate"));
      System.out.println("Fecha de entrega: " + rs.getString("shippedDate"));
      System.out.println("Status: " + rs.getString("status"));
      System.out.println("Comentarios: " + rs.getString("comments"));
      System.out.println("Numero del cliente: " + rs.getInt("customerNumber") + "\n");
      System.out.println("Detalles de los productos: ");

      sql = "SELECT * FROM orderdetails od INNER JOIN products p ON od.productCode = p.productCode WHERE od.orderNumber = ?";
      st = c.prepareStatement(sql);
      st.setInt(1,orderID);

      rs = st.executeQuery();
      while(rs.next()){
        System.out.println("---------------------------------------");
        System.out.println("  Codigo: " + rs.getString("productCode"));
        System.out.println("  Nombre: " + rs.getString("productName"));
        System.out.println("  Cantidad: " + rs.getInt("quantityOrdered"));
        System.out.println("  Precio de compra: " + rs.getFloat("buyprice"));
        System.out.println("  Precio de venta: " + rs.getFloat("priceEach"));
      }

      //Calcular el total
      sql = "SELECT SUM(priceEach*quantityOrdered) 'Total' FROM orderdetails WHERE orderNumber = ?";
      st = c.prepareStatement(sql);
      st.setInt(1,orderID);

      rs = st.executeQuery();
      rs.next();

      System.out.println("=========================================");
      System.out.println("Precio total: " + rs.getFloat("Total"));

      return true;
    } catch (SQLException e){
      e.printStackTrace();
      return false;
    }
  }
}
