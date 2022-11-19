
public class Cliente extends Persona{//esta clase es un cliente con herencia de atributos y metodos de persona

	//atributos 
	private boolean registrado;
	private boolean preBuy;

	//metodos get y set
	
	
	//metodos cosntructores
	public Cliente(String nombre, String apellido, int cedula,int edad) { //consrtuctor de un cliente con datos minimos
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.apellido=apellido;
		this.documento=cedula;
		this.edad=edad;
	}
	//constructores
	public Cliente (){//constructor default
		this.nombre="No Especificado";
		this.apellido="No Especificado";
		this.documento=0;
		this.edad=0;
	}
}
