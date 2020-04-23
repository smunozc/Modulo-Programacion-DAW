package UD08_JSON_T1;

import com.google.gson.Gson;

import java.util.ArrayList;

public class principal {
  public static void main(String[] args) {
      Gson gson = new Gson();

      ArrayList<Futbolista> campeones = new ArrayList<>();

      //Había hecho vectores de String para las posiciones de los futbolistas pero no se si es lo que pide el
      //enunciado así que lo he cambiado.
      /*
      String[]casillas = {"Portero"};
      String[]ramos = {"Lateral derecho", "Medio centro"};
      String[]pique = {"Central"};
      String[]puyol = {"Central"};
      String[]capdevila = {"Lateral izquierdo"};
      String[]xabiAlonso = {"Defensa mediocampo", "Mediocampo"};
      String[]busquets = {"Defensa mediocampo"};
      String[]xaviHernandez = {"Mediocampo"};
      String[]pedrito = {"Extremo izquierdo", "Falso Extremo"};
      String[]iniesta = {"Extremo derecho","Mediocampo"};
      String[]villa = {"Delantero centro"};
       */

      Futbolista casillas = new Futbolista(1,"Casillas","Real Madrid");
      Futbolista ramos = new Futbolista(15,"Ramos","Real Madrid");
      Futbolista pique = new Futbolista(3, "Pique", "FC Barcelona");
      Futbolista puyol = new Futbolista(5, "Puyol", "FC Barcelona");
      Futbolista capdevila = new Futbolista(11, "Capdevila","Villareal");
      Futbolista xabiAlonso = new Futbolista(14, "Xabi Alonso","Real Madrid");
      Futbolista busquets = new Futbolista(16, "Busquets","FC Barcelona");
      Futbolista xaviHernandez = new Futbolista(8, "Xavi Hernandez","FC Barcelona");
      Futbolista pedrito = new Futbolista(18, "Pedrito", "FC Barcelona");
      Futbolista iniesta = new Futbolista(6, "Iniesta","FC Barcelona");
      Futbolista villa = new Futbolista(7, "Villa","FC Barcelona");

      casillas.getDemarcaciones().add("Portero");
      ramos.getDemarcaciones().add("Lateral derecho");
      ramos.getDemarcaciones().add("Medio centro");
      pique.getDemarcaciones().add("Central");
      puyol.getDemarcaciones().add("Central");
      capdevila.getDemarcaciones().add("Lateral izquierdo");
      xabiAlonso.getDemarcaciones().add("Defensa mediocampo");
      xabiAlonso.getDemarcaciones().add("Mediocampo");
      busquets.getDemarcaciones().add("Defensa mediocampo");
      xaviHernandez.getDemarcaciones().add("Mediocampo");
      pedrito.getDemarcaciones().add("Extremo izquierdo");
      pedrito.getDemarcaciones().add("Falso Extremo");
      iniesta.getDemarcaciones().add("Extremo derecho");
      iniesta.getDemarcaciones().add("Mediocampo");
      villa.getDemarcaciones().add("Delantero centro");

      campeones.add(casillas);
      campeones.add(ramos);
      campeones.add(pique);
      campeones.add(puyol);
      campeones.add(capdevila);
      campeones.add(xabiAlonso);
      campeones.add(busquets);
      campeones.add(xaviHernandez);
      campeones.add(pedrito);
      campeones.add(iniesta);
      campeones.add(villa);



      String json = gson.toJson(campeones);

      System.out.println(json);
  }
}
