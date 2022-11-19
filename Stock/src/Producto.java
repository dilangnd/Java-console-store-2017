
public class Producto {

		//Definir Atributos del producto
	private String nombreProd; //ejm bolso, camisa, curso virtual, 
	private int codigo;
	private int costoVenta;
	private int cantidad;
	private int costoInterno;
	private String fabricante;//
	private Fecha fechaFabricacion;
	private Fecha fechaExpiracion;
	private String materiales;
	private Lugar lugarFabricacion;
	private Lugar lugarStock;
	
	
	//CONTINUAR EN LA TARDE DESDE LA LINEA DE ABAJO:
	//crear atributo de tipo fecha y crearle los respectivos getters y setters -- HECHO
	//crear la clase cliente y la clase proveedores de tipo persona (comenzar con herencia)
	
	//Definiendo métodos getter y setter
	
	public String darNombreProd() {
		return nombreProd;
	}
	public void actualizarNombreProd(String nombre) {
		this.nombreProd = nombreProd;
	}
	public int darCodigo() {
		return codigo;
	}
	public void actualizarCdigo(int codigo) {
		this.codigo = codigo;
	}
	public int darCostoVenta() {
		return costoVenta;
	}
	public void actualizarCostoVenta(int costoVenta) {
		this.costoVenta = costoVenta;
	}
	public int darCantidad() {
		return cantidad;
	}
	public void actualizarCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int darCostoInterno() {
		return costoInterno;
	}
	public void actualizarCostoInterno(int costoInterno) {
		this.costoInterno = costoInterno;
	}
	public String darFabricante() {
		return fabricante;
	}
	public void actualizarFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Fecha darFechaFabricacion() {
		return fechaFabricacion;
	}
	public void actualizarFechaFabricacion(Fecha fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	public Fecha darFechaExpiracion() {
		return fechaExpiracion;
	}
	public void actualizarFechaExpiracion(Fecha fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	public String darMateriales() {
		return materiales;
	}
	public void actualizarMateriales(String materiales) {
		this.materiales = materiales;
	}
	public Lugar darLugarFabricacion() {
		return lugarFabricacion;
	}
	public void actualizarLugarFabricacion(Lugar lugarFabricacion) {
		this.lugarFabricacion = lugarFabricacion;
	}
	public Lugar darLugarStock() {
		return lugarStock;
	}
	public void actualizarLugarStock(Lugar lugarStock) {
		this.lugarStock = lugarStock;
	}
	// metodos cosntructores para crear productos
	
	public Producto(){//este metodo constructor es el de los datos por defecto o vacios
		this.nombreProd="No Especificado";
		this.codigo=Integer.MAX_VALUE;
		this.costoVenta=Integer.MAX_VALUE;
		this.cantidad=Integer.MIN_VALUE;
		this.costoInterno=Integer.MAX_VALUE;
		this.fabricante="No Especificado";
		this.materiales="No Especificado";
		//crear fechas y lugares default en el main para evitar la ralentizacion del 
		//programa en la busqueda de las defaults de las clases
	}
	
	public Producto(String nombre, int codigo, int cantidad, int costoInterno){//metodo constructor para agregar un producto con datos básicos
		this.nombreProd=nombre;
		this.codigo=codigo;
		this.cantidad=cantidad;
		this.costoInterno=costoInterno;
		//metodo constructor para agregar un producto con datos básicos
	}
	public Producto(String nombre, int codigo, int cantidad, int costoInterno, int costoVenta, String fabricante, Fecha fechaFabr, Fecha fechaExp, String material, Lugar lugarFabr, Lugar lugarStock ){
		this.nombreProd = nombre;
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.costoInterno = costoInterno;
		this.costoVenta=costoVenta;
		this.fabricante = fabricante;
		this.fechaFabricacion = fechaFabr;
		this.fechaExpiracion = fechaExp;
		this.materiales = material;
		this.lugarFabricacion = lugarFabr;
		this.lugarStock=lugarStock;
		//metodo constructor para agregar un producto con los datos completos
	}
	public Producto(int codigo){ //metodo constructor para crear un prducto con unicamente el codigo
		this.codigo=codigo;
	}
	public Producto (String nombre){ //metodo constructor para crear un producto con unicamente el nombre
		this.nombreProd = nombre;
	}
	public Producto (String nombre, int codigo){ //metodo constructor para crear un producto con nombre y codigo nomás
		this.nombreProd = nombre;
		this.codigo = codigo;
	}
	public Producto (String nombre, int codigo, String fabricante, int cantidad){ //metodo constructor para cerar un producto con nombre y codigo nomás
		this.nombreProd = nombre;
		this.codigo = codigo;
		this.fabricante=fabricante;
		this.cantidad=cantidad;
	}
	public Producto(String nomProd, int codProd, int Precio){//constructor para el carrito del cliente
		this.nombreProd = nomProd;
		this.codigo = codProd;
		this.costoVenta = Precio;
	}
	public String toString(){
		return nombreProd;
	}
}