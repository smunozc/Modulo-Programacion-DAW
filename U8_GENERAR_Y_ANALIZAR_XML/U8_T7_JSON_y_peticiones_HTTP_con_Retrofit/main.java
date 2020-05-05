package UD08_T7;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class main {
    public static void main(String[] args){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        listFutbolistas service = retrofit.create(listFutbolistas.class);
        System.out.println("Obtenemos el listado completo de futbolistas");
        try{
            Response<List<Futbolista>> response = service.listFutbolistas().execute();
            if (response.isSuccessful()){
                List<Futbolista> futbolistas = response.body();
                System.out.println(futbolistas);
            } else {
                System.out.println("Petición no válida" + response.message());
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
