
public class Fecha {

//Atributos de una fecha:
	private int dia;
	private int mes;
	private int a�o;
	
//crear metodo constructor para construir fechas m�s facilmente
	public Fecha(int a�o, int mes, int dia){
		this.a�o=a�o;
		this.mes=mes;
		this.dia=dia;
	}
	
//crear otro constructor
	public Fecha(){ //este metodo es por si la persona no da el dia ni mes ni a�o ni nada
		this.a�o=0000;
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
	public int darA�o() {
		return a�o;
	}
	public void actualizarA�o(int a�o) {
		this.a�o = a�o;	
}
	/***************************************
	 * crear metodo que retorne la fecha   *
	 * en un formato Adecuado:             *
	 * AAAA/MMM/DD; � DD/MMM/AAAA          *
	 **************************************/
	public String toString(){
		return a�o+"/"+mes+"/"+dia;
	}
}
