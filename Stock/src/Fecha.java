
public class Fecha {

//Atributos de una fecha:
	private int dia;
	private int mes;
	private int año;
	
//crear metodo constructor para construir fechas más facilmente
	public Fecha(int año, int mes, int dia){
		this.año=año;
		this.mes=mes;
		this.dia=dia;
	}
	
//crear otro constructor
	public Fecha(){ //este metodo es por si la persona no da el dia ni mes ni año ni nada
		this.año=0000;
		this.mes=000;
		this.dia=00;
	}
	//metodos de gettters y setters
	public int darDia() {
		return dia;
	}
	public void actualizarDia(int dia) {
		this.dia = dia;
	}
	public int darMes() {
		return mes;
	}
	public void actualizarMes(int mes) {
		this.mes = mes;
	}
	public int darAño() {
		return año;
	}
	public void actualizarAño(int año) {
		this.año = año;	
}
	/***************************************
	 * crear metodo que retorne la fecha   *
	 * en un formato Adecuado:             *
	 * AAAA/MMM/DD; ó DD/MMM/AAAA          *
	 **************************************/
	public String toString(){
		return año+"/"+mes+"/"+dia;
	}
}
