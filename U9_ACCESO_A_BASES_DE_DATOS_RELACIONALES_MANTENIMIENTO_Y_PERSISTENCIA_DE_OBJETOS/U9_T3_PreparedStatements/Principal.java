package U9_T3_Aplicacion_con_PreparedStatements;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
      ADClassicModels adc = new ADClassicModels();
    try {
      int opcion;
      Scanner sc = new Scanner(System.in);
      System.out.println("MENU:");
      System.out.println("1.Insertar Cliente.");
      System.out.println("2.Asignar empleado a cliente.");
      System.out.println("3.Añadir producto a pedido.");
      System.out.println("4.Mostrar con Detalle un pedido.");
      System.out.println("5.Salir de la aplicación.");
      System.out.println("---------------------Elige una opción del menú---------------------");
      opcion = sc.nextInt();

      while(opcion != 5){
          if (opcion > 5 || opcion < 1){
            System.out.println("Error, escribe un numero especificado en el menú \n");
          }
          switch (opcion){
              case 1:
                  adc.insertarCliente();
                  break;
              case 2:
                  adc.asignarEmpleado();
                  break;
              case 3:
                  adc.addProducto();
                  break;
              case 4:
                  adc.mostrarPedido();
                  break;
          }
          System.out.println("MENU:");
          System.out.println("1.Insertar Cliente.");
          System.out.println("2.Asignar empleado a cliente.");
          System.out.println("3.Añadir producto a pedido.");
          System.out.println("4.Mostrar con Detalle un pedido.");
          System.out.println("5.Salir de la aplicación.");
          System.out.println("---------------------Elige una opción del menú---------------------");
          opcion = sc.nextInt();
      }
      ConexionBD.close();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
