
public class Admin extends Persona{
	//atributos
private String login;
private String pass;

//dar y actualizar
public String darLogin() {
	return login;
}
public void actualizarLogin(String login) {
	this.login = login;
}
public String darPass() {
	return pass;
}
public void actualizarPass(String pass) {
	this.pass = pass;
}
//constructores:
public void Admin (){//constructor default
	this.login="admin";
	this.pass="pass";
	this.nombre="No Especificado";
	this.apellido="No Especificado";
	this.documento=0;
	this.edad=0;
}
public  Admin (String nombre, String Apellido, int documento, int edad){
	this.nombre=nombre;
	this.apellido=Apellido;
	this.documento=documento;
	this.edad=edad;
	
}
}
