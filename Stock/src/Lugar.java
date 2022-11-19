
public class Lugar {
	//atributos de la clase "Lugar"
	private String pais;
	private String estado;
	private String ciudad;
	
	//Metodos darters y actualizarters de la clase
	public String darPais() {
		return pais;
	}
	public void actualizarPais(String pais) {
		this.pais = pais;
	}
	public String darEstado() {
		return estado;
	}
	public void actualizarEstado(String estado) {
		this.estado = estado;
	}
	public String darCiudad() {
		return ciudad;
	}
	public void actualizarCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	//metodos constructores
	public Lugar (String pais, String estado, String ciudad){//este metodo constructor es para ingresar un lugar exacto en una sola línea
		this.pais=pais;
		this.estado=estado;
		this.ciudad=ciudad;
	}
	public Lugar(){// este es el método por defecto si el usuario no ingresa un lugar al sistema pero solicita uno
		this.pais="No Especificado";
		this.estado="No Especificado";
		this.ciudad="No Especificado";
	}
	public String toString(){
		return "País: "+pais+" - Estado: "+estado+" - Ciudad: "+ciudad;
	}
}
