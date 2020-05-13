package U9_T2_MTSQL_ClassicModels;

public class Office {

  // ATRIBUTOS

  private int codigoOficina;
  private String ciudad;
  private String telefono;
  private String direccion;
  private String estado;
  private String pais;
  private String cp;

  // MÉTODOS

  public Office(
      int codigoOficina,
      String ciudad,
      String telefono,
      String direccion,
      String estado,
      String pais,
      String cp) {
    this.codigoOficina = codigoOficina;
    this.ciudad = ciudad;
    this.telefono = telefono;
    this.direccion = direccion;
    this.estado = estado;
    this.pais = pais;
    this.cp = cp;
  }

  public int getCodigoOficina() {
    return codigoOficina;
  }

  public void setCodigoOficina(int codigoOficina) {
    this.codigoOficina = codigoOficina;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  @Override
  public String toString() {
    return "Office{"
        + "codigoOficina="
        + codigoOficina
        + ", ciudad='"
        + ciudad
        + '\''
        + ", telefono='"
        + telefono
        + '\''
        + ", direccion='"
        + direccion
        + '\''
        + ", estado='"
        + estado
        + '\''
        + ", pais='"
        + pais
        + '\''
        + ", cp='"
        + cp
        + '\''
        + '}';
  }
}
