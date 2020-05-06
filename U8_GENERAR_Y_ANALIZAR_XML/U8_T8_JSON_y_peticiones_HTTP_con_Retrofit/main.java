package UD08_T8;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;
import java.util.List;

public class main {
  public static void main(String[] args) {
      Retrofit retrofit = new Retrofit.Builder()
              .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
              .addConverterFactory(GsonConverterFactory.create())
              .build();

      listAlumno service = retrofit.create(listAlumno.class);
      System.out.println("Obtenemos el listado completo de alumnos");
      try{
          Response<ArrayList<Alumno>> response = service.listAlumnos().execute();
          if (response.isSuccessful()){
              List<Alumno> alumnos = response.body();
              System.out.println(alumnos);
          } else {
              System.out.println("Petición no válida" + response.message());
          }
      } catch (Exception e){
          System.out.println("Error: " + e.getMessage());
      }
  }
}
