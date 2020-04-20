package UD08_JSON_T1;

import com.google.gson.Gson;

import java.util.ArrayList;

public class principal {
  public static void main(String[] args) {
      Gson gson = new Gson();

      ArrayList<Futbolista> campeones = new ArrayList<>();

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

      campeones.add(new Futbolista(1,"Casillas",casillas,"Real Madrid"));
      campeones.add(new Futbolista(15,"Ramos",ramos,"Real Madrid"));
      campeones.add(new Futbolista(3, "Pique",pique, "FC Barcelona"));
      campeones.add(new Futbolista(5, "Puyol",puyol, "FC Barcelona"));
      campeones.add(new Futbolista(11, "Capdevila",capdevila,"Villareal"));
      campeones.add(new Futbolista(14, "Xabi Alonso",xabiAlonso,"Real Madrid"));
      campeones.add(new Futbolista(16, "Busquets",busquets,"FC Barcelona"));
      campeones.add(new Futbolista(8, "Xavi Hernandez",xaviHernandez,"FC Barcelona"));
      campeones.add(new Futbolista(18, "Pedrito",pedrito, "FC Barcelona"));
      campeones.add(new Futbolista(6, "Iniesta",iniesta,"FC Barcelona"));
      campeones.add(new Futbolista(7, "Villa",villa,"FC Barcelona"));

      String json = gson.toJson(campeones);

      System.out.println(json);
  }
}
