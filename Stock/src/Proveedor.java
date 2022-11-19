
public class Proveedor extends Persona{//esta clase es un proveedor con herencia de atributos y metodos de persona
	
	//atributos
	private String empresa;
	private Producto codNomProducto; //codigo y nombre del producto que me da el proveedor
	private Lugar lugarProveedor;
	
	//metodos dar y actualizar
	public String darEmpresa() {
		return empresa;
	}
	public void actualizarEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Producto darCodNomProducto() {
		return codNomProducto;
	}
	public void actualizarCodNomProducto(Producto codNomProducto) {
		this.codNomProducto = codNomProducto;
	}
	public Lugar darLugarProveedor() {
		return lugarProveedor;
	}
	public void actualizarLugarProveedor(Lugar lugarProveedor) {
		this.lugarProveedor = lugarProveedor;
	}
	
	//metodos constructores
	
	public Proveedor (){// metodo para agregar un proveedor sin datos es decir por defecto
		this.nombre="No Especificado";
		this.empresa="No Especificado";
		this.apellido="No Especificado";
	}
	
	public Proveedor (String empresa, Producto codNomProducto, Lugar lugarProveedor){
		this.empresa=empresa;
		this.codNomProducto=codNomProducto;
		this.lugarProveedor=lugarProveedor;
		//este metodo productor es para agregar un proveedor 
		//relativamente completo debido al tema de la herencia :/
	}
	public Proveedor(String nombre, String apellido, int cedula,String empresa, Producto codNomProducto) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.apellido=apellido;
		this.documento=cedula;
		this.empresa = empresa;
		this.codNomProducto=codNomProducto;
	}

}
