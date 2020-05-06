package UD08_T8;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.ArrayList;

public interface listAlumno {
    // https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/alumnos?_embed=asignaturas
    @GET("alumnos?_embed=asignaturas")
    Call<ArrayList<Alumno>> listAlumnos();

}
