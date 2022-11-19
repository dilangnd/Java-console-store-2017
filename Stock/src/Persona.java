
public class Persona {
	
	//Atributos de una Persona
	protected String nombre;
	private String nombre2;
	protected String apellido;
	private String apellido2;
	protected int documento;
	protected int edad;
	private Fecha fechaNacimiento;
	private String ocupacion;
	private Lugar lugarResidencia;
	private Lugar lugarNacimiento;
	
	//metodos dar y actualizar
	public String darNombre() {
		return nombre;
	}
	public void actualizarNombre(String nombre) {
		this.nombre = nombre;
	}
	public String darNombre2() {
		return nombre2;
	}
	public void actualizarNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String darApellido() {
		return apellido;
	}
	public void actualizarApellido(String apellido) {
		this.apellido = apellido;
	}
	public String darApellido2() {
		return apellido2;
	}
	public void actualizarApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int darDocumento() {
		return documento;
	}
	public void actualizarDocumento(int documento) {
		this.documento = documento;
	}
	public int darEdad() {
		return edad;
	}
	public void actualizarEdad(int edad) {
		this.edad = edad;
	}
	public Fecha darFechaNacimiento() {
		return fechaNacimiento;
	}
	public void actualizarFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String darOcupacion() {
		return ocupacion;
	}
	public void actualizarOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public Lugar darLugarResidencia() {
		return lugarResidencia;
	}
	public void actualizarLugarResidencia(Lugar lugarResidencia) {
		this.lugarResidencia = lugarResidencia;
	}
	public Lugar darLugarNacimiento() {
		return lugarNacimiento;
	}
	public void actualizarLugarNacimiento(Lugar lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	
	//metodos constructores
	public Persona(){//metodo constructor para agregar a una persona con datos básicos
		this.nombre="No Especificado";
		this.nombre2="No Especificado";
		this.apellido="No Especificado";
		this.apellido2="No Especificado";
		this.documento=0;
		this.edad=0;
		//aca preguntar como definir el default, se deja el mismo de lugar y fecha?
	}
	public Persona(String nombre, String Apellido, int edad, int documento ){//metodo constructor para añadir datos básicos de una persona
		this.nombre = nombre;
		this.apellido =apellido;
		this.edad=edad;
		this.documento=documento;
	}
	public Persona(String nombre, String nombre2, String apellido, String apellido2, int edad,int documento, Fecha fechaN, String ocupacion, Lugar lugarN, Lugar lugarR){
		this.nombre=nombre;
		this.nombre2=nombre2;
		this.apellido=apellido;
		this.apellido2=apellido2;
		this.edad=edad;
		this.documento=documento;
		this.fechaNacimiento=fechaN;
		this.ocupacion=ocupacion;
		this.lugarNacimiento=lugarN;
		this.lugarResidencia=lugarR;
		//metodo constructor para añadir una persona completa
	}
	
}
