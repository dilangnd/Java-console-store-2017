import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 
 * @author DylanPerez
 * @category ProyectoAcademico
 * @version 1.0.0
 * @since 2017
 *
 */

/*
 * Ejecuta este archivo como Aplicacion Java y navega con los comandos numéricos
 * Si quieres entrar a la zona de Admin, el usuario es 'MASTER' y la clave es '7'
 * Si me quieres contactar, estoy en Linkedin como ** Dylan Perez **
 */

public class Menu {

	//atributos:
	ArrayList<Cliente> lstClientes = new ArrayList<Cliente>();
	ArrayList<Proveedor> lstProveedores = new ArrayList<Proveedor>();
	ArrayList<Producto> lstProductos = new  ArrayList<Producto>();
	ArrayList<Admin> lstAdmins =new ArrayList<Admin>();
	//------------------------------------
	ArrayList<Producto> Carrito = new  ArrayList<Producto>();//éste solo se usa en los métodos del cliente
	Scanner entrante = new Scanner (System.in);


	// IMPORTANTE, IR A ÉSTAS LINEAS // IGNORAR TODOS LOS COMENTARIOS QUE DENOTEN ERRORES DEL CÓDIGO
	//34 - ERROR LOGICO
	//36 - ERROR LOGICO
	//66 - ERROR LOGICO
	//126 - ERROR LOGICO
	//549 - CONTINUAR
	//552 - CONTINUAR

	/************************************************
	 * En éste programa, (Tercer Corte) 2da Version *
	 * como novedad intentare importar algunos      *
	 * clientes, productos, admins y                *
	 * proveedores desde unos archivos de           *
	 * texto en carpetas del proyecto.              *
	 * Éstos archivos estarán creados de acuerdo    * 
	 * a los métodos constructores de los objetos   *
	 ***********************************************/

	//ir a la línea 414
	String adminsEntrada = "Admins/admins.dat";
	String clientesEntrada = "Clientes/Clientes.dat";
	String productosEntrada = "Productos/Productos.dat";
	String proveedoresEntrada = "Proveedores/Proveedores.dat";

	public void importarAdmins(String baseAdmins){
		try {
			//Intentar abrir el archivo de admins
			Scanner entradaAdmins = new Scanner(new File (adminsEntrada));
			//aca se corre el programa y si funciona ya puedo continuar

			//imprimir titulos de cabecera del informe
			int contadorAdmins =0;
			while (entradaAdmins.hasNext()){
				//Leer el registro de cada usuario
				//--aca comienza asignando cada "columna" 
				//del archivo en variables que guarda en 
				//arreglos y luego el arreglo en listas de arreglos
				String nombre  = entradaAdmins.next();
				String apellido = entradaAdmins.next();
				int cedula = entradaAdmins.nextInt();
				int edad = entradaAdmins.nextInt();
				Admin admin = new Admin (nombre, apellido, cedula,edad);//crea el objeto con las variables importadas del archivo de texto
				lstAdmins.add(admin);//agrega los objetos a una lista de objetos
				contadorAdmins++;//aumenta el contador de objetos, en este caso admins
			}
			//cerrar el archivo
			entradaAdmins.close();
		}
		catch(Exception e){
			System.out.println("ERROR FATAL");
			System.out.println("No se pudo abrir: "+e);
			System.out.println("No se pudo Abrir: "+adminsEntrada);
		}
	}

	public void importarClientes(String baseClientes){
		try {
			//Intentar abrir el archivo de admins
			Scanner entradaClientes = new Scanner(new File (clientesEntrada));
			//aca se corre el programa y si funciona ya puedo continuar

			//imprimir titulos de cabecera del informe
			int contadorClientes =0;
			while (entradaClientes.hasNext()){
				//Leer el registro de cada usuario
				//--aca comienza asignando cada "columna" 
				//del archivo en variables que guarda en 
				//arreglos y luego el arreglo en listas de arreglos
				String nombre  = entradaClientes.next();
				String apellido = entradaClientes.next();
				int cedula = entradaClientes.nextInt();
				int edad = entradaClientes.nextInt();
				Cliente newCliente = new Cliente (nombre, apellido, cedula,edad);//crea el objeto con las variables importadas del archivo de texto
				lstClientes.add(newCliente);//agrega los objetos a una lista de objetos
				contadorClientes++;//aumenta el contador de objetos, en este caso admins
			}
			//cerrar el archivo
			entradaClientes.close();
		}
		catch(Exception e){
			System.out.println("ERROR FATAL");
			System.out.println("No se pudo abrir: "+e);
			System.out.println("No se pudo Abrir: "+clientesEntrada);
		}
	}

	public void importarProductos(String baseProductos){
		try {
			//Intentar abrir el archivo de productos
			Scanner entradaProductos = new Scanner(new File (productosEntrada));
			//aca se corre el programa y si funciona ya puedo continuar

			//imprimir titulos de cabecera del informe
			int contadorProductos =0;
			while (entradaProductos.hasNext()){
				//Leer el registro de cada usuario
				//--aca comienza asignando cada "columna" 
				//del archivo en variables que guarda en 
				//arreglos y luego el arreglo en listas de arreglos
				String nombre  = entradaProductos.next();
				int codigo = entradaProductos.nextInt();
				String fabricante = entradaProductos.next();
				int cantidad = entradaProductos.nextInt();
				Producto nuevoProducto = new Producto (nombre, codigo, fabricante, cantidad );
				//crea el objeto con las variables importadas del archivo de texto
				lstProductos.add(nuevoProducto);//agrega los objetos a una lista de objetos
				contadorProductos++;//aumenta el contador de objetos, en este caso admins
			}
			//cerrar el archivo
			entradaProductos.close();
		}
		catch(Exception e){
			System.out.println();
		}
	}

	public void importarProveedores(String baseProveedores){
		try {
			//Intentar abrir el archivo de proveedores
			Scanner entradaProveedores = new Scanner(new File (proveedoresEntrada));
			//aca se corre el programa y si funciona ya puedo continuar
			int contadorProveedores =0;
			while (entradaProveedores.hasNext()){
				//Leer el registro de cada usuario
				//--aca comienza asignando cada "columna" 
				//del archivo en variables que guarda en 
				//arreglos y luego el arreglo en listas de arreglos
				String nombre  = entradaProveedores.next();
				String apellido = entradaProveedores.next();
				int documento = entradaProveedores.nextInt();
				String empresa = entradaProveedores.next();
				//-
				int codProd = entradaProveedores.nextInt();
				String nomProd = entradaProveedores.next();
				Producto newProducto = new Producto (nomProd,codProd);
				//-		
				Proveedor proveedor = new Proveedor (nombre, apellido,documento, empresa, newProducto);
				//crea el objeto con las variables importadas del archivo de texto
				lstProveedores.add(proveedor);//agrega los objetos a una lista de objetos
				contadorProveedores++;//aumenta el contador de objetos, en este caso admins
			}
			//cerrar el archivo
			entradaProveedores.close();
		}
		catch(Exception e){
			System.out.println("ERROR No se pudo abrir: "+e);
			System.out.println("No se pudo abrir: "+productosEntrada);

		}
	}

	public void importarDatos(){

		importarAdmins(adminsEntrada);
		importarClientes(clientesEntrada);
		importarProductos(productosEntrada);
		importarProveedores(proveedoresEntrada);
	}//TERMINA DE IMPORTAR DATOS :/
	public void pausa(){
		System.out.println("          ╔═════════════════════════╗");
		System.out.println("          ║ DIGITE 0 PARA CONTINUAR ║"); 
		System.out.println("          ╚═════════════════════════╝");
		String pausa = entrante.next();
	}

	//----------------------------------ACA COMIENZA EL ERROR LÓGICO------------------------------ERROR LÓGICO SOLUCIONADO JAJAJA--------
	public  void verificacion (String texto, int clave ){
		if((texto.equals("MASTER")&&(clave==7))){
			System.out.println("          ╔═══════════════════════╗");
			System.out.println("          ║ INGRESO SATISFACTORIO ║"); 
			System.out.println("          ╚═══════════════════════╝");
			System.out.println();
			menuAdmin();
		}
		else{
			System.out.println("          ╔═══════════════════════╗");
			System.out.println("          ║   DATOS INCORRECTOS!  ║"); 
			System.out.println("          ╚═══════════════════════╝");
			System.out.println();
			pideDatos();

		}
	}
	public void pideDatos(){//pide datos del admin
		try{
			System.out.println("                 ╔═══════════════════════╗");
			System.out.println("                 ║    DIGITE SU LOGIN    ║"); 
			System.out.println("                 ║  SEGUIDO PULSE ENTER  ║");
			System.out.println("                 ╚═══════════════════════╝");	
			String login=entrante.next();
			System.out.println("                 ╔═══════════════════════╗");
			System.out.println("                 ║    DIGITE SU CLAVE    ║"); 
			System.out.println("                 ║  SEGUIDO PULSE ENTER  ║");
			System.out.println("                 ╚═══════════════════════╝");	
			int clave = entrante.nextInt();
			verificacion(login,clave);
		}
		catch(InputMismatchException e){
			System.out.println("Formato incorrecto del Dato");
			entrante.next();
		}
	}	
	public void ejecutarMenu(){
		// menu principal
		importarDatos();//trae los datos de la base de datos ántes de correr el resto del programa
		//-------------aca intento hacer el primer try catch------intento realizado perfectamente sin problemas ;)
		int opcion =0;
		while(opcion!=3){//abre while
			boolean check = false;
			while (!check){
				try{
					System.out.println();
					System.out.println("           ╔══════════════════════════════╗");
					System.out.println("           ║     S E T E N   C O R P .    ║"); 
					System.out.println("           ╠══════════════════════════════╣");
					System.out.println("           ║ Cómo deseas Ver nuestra App? ║"); 				
					System.out.println("           ╠═══════════════╦══════════════╣");
					System.out.println("           ║    1.Admin    ║  2.Cliente   ║");
					System.out.println("           ╠═══════════════╩══════════════╣");
					System.out.println("           ║            3.Salir           ║");
					System.out.println("           ╚══════════════════════════════╝");
					opcion = entrante.nextInt();
					check=true;
				}catch(InputMismatchException e){
					System.out.println("           ╔══════════════════════════════╗");
					System.out.println("           ║  Formato Incorrecto del Dato ║");
					System.out.println("           ╚══════════════════════════════╝");
					entrante.next();
				}
			}//-------------------------TERMINA EL PRIMER TRY-CATCH
			switch (opcion) {//abre switch
			case 1:
				//----------------------------------ACA LE DARE SEGURIDAD AL LOGIN DEL ADMIN
				pideDatos();//acá en vez de ir directo al menu del admin se irá a pedirle datos
				break;
			case 2:
				menuCliente();
				break;
			case 3: 
//				opcion=3;
				System.out.println("          ╔═══════════════════════╗");
				System.out.println("          ║GRACIAS POR VISITARNOS!║"); 
				System.out.println("          ╚═══════════════════════╝");
				break;
			default :
				System.out.println("           ╔══════════════════════════════╗");
				System.out.println("           ║        Opción no Válida      ║");
				System.out.println("           ╚══════════════════════════════╝");
				break;
			}//cierra switch
		}//cierra while
	}
	//----------------------------EL ERROR ESTA ENTE LO COMPRENDIDO DE LOS GUIONES------------------------ERROR LOGICO SOLUCIONADO
	public void menuAdmin(){
		int opcionAdmin=0;
		while (opcionAdmin!=19) {
			boolean check1 = false;
			while (!check1){
				try{
					System.out.println("           ╔═══════════════════════════════════════════════════════════════════════╗");
					System.out.println("           ║  HOLA!  BIENVENIDO AL MODO ADMINISTRADOR DE SETEN CORPORATION INC.    ║"); 
					System.out.println("           ║            S E T E N     C O R P O R A T I O N    I N C .             ║");
					System.out.println("           ╚═══════════════════════════════════════════════════════════════════════╝");
					System.out.println("           ═════════════════════════════════════════════════════════════════════════");
					System.out.println("           ╔════════════════╦══════════════════╦═════════════════╦═════════════════╗");
					System.out.println("           ║      Admin     ║      Cliente     ║     Producto    ║    Proveeedor   ║");
					System.out.println("           ║ -------------- ║ ---------------- ║ --------------- ║ --------------- ║");
					System.out.println("           ║  8. Agregar    ║  1. Agregar      ║  7. Agregar     ║  2. Agregar     ║");
					System.out.println("           ║ 12. Listar     ║  5. Listar       ║ 11. Listar      ║  6. Listar      ║");
					System.out.println("           ║ 16. Eliminar   ║ 13. Eliminar     ║ 14. Eliminar    ║ 15. Eliminar    ║");
					System.out.println("           ║ 10. Ver Ficha  ║  3. Ver Ficha    ║  9. Ver Ficha   ║  4. Ver Ficha   ║");
					System.out.println("           ║                ║                  ║ 17. Cambiar #   ║                 ║");
					System.out.println("           ║ -------------- ║ ---------------- ║ --------------- ║ --------------- ║");
					System.out.println("           ║   SETEN INC    ║     SETEN INC    ║    SETEN INC    ║   SETEN INC     ║");
					System.out.println("           ╠════════════════╬══════════════════╩═════════════════╩═════════════════╝");
					System.out.println("           ║ 19.  S A L I R ║");
					System.out.println("           ╚════════════════╝");

					opcionAdmin = entrante.nextInt();

					check1=true;
				}catch(InputMismatchException e){
					System.out.println("       ╔═══════════════════════════╗");
					System.out.println("       ║Formato Incorrecto del Dato║"); 
					System.out.println("       ╚═══════════════════════════╝");	
					entrante.next();
				}//segundo try catch sin problemas
			}

			switch (opcionAdmin) {
			case 1:
				agregarCliente();
				pausa();
				break;
			case 2:
				agregarProveedor();
				pausa();
				break;
			case 3:
				buscarCliente();
				pausa();
				break;
			case 4:
				buscarProveedor();
				pausa();
				break;
			case 5:
				listarClientes();
				pausa();
				//aca se listan los clientes
				break;
			case 6:
				listarProveedores();
				pausa();
				break;
			case 7:
				agregarProducto();
				pausa();
				break;
			case 8:
				agregarAdmin();
				pausa();
				break;
			case 9:
				buscarProducto();
				pausa();
				break;
			case 10:
				buscarAdmin();
				pausa();
				break;
			case 11:
				listarProductos();
				pausa();
				break;
			case 12:
				listarAdmins();
				pausa();
				break;
			case 13:
				eliminarCliente();
				pausa();
				break;
			case 14:
				eliminarProducto();
				pausa();
				break;
			case 15:
				eliminarProveedor();
				pausa();
				break;
			case 16:
				eliminarAdmin();
				pausa();
				break;
			case 17:
				cambiarCantidadProductos();
				pausa();
				break;
			case 18:
				listarAdmins();
				pausa();
				break;
			default:
				opcionAdmin=19;
				System.out.println("          ╔═══════════════════════╗");
				System.out.println("          ║    G O O D    B Y E   ║"); 
				System.out.println("          ╚═══════════════════════╝");
				break;
			}
		}

	}


	public void menu(){
		ejecutarMenu();
	}//cierra menu ppal
	//----------------------------------------------PARTE DE CLIENTE / GUI -------------------------------------------------
	public void menuCliente(){
		Scanner entrada = new Scanner (System.in);
		Producto Goddard = new Producto ("Goddard",7,225000);
		Producto StratoXL = new Producto("Strato XL",9,190000);
		Producto NeutronWatch = new Producto ("Neutron Watch",11,8000);
		try{//inicia try lectura opcion usuario
			int decisionCliente=-1;
			while (decisionCliente!=0){
				System.out.println("           ╔═════════════════════════════════════════════════════════════════════════════╗");
				System.out.println("           ║       HOLA!  BIENVENIDO A LA TIENDA OFICIAL DE SETEN CORPORATION INC.       ║"); 
				System.out.println("           ║                                                                             ║");
				System.out.println("           ║             S E T E N     I N T E R N A T I O N A L   S H O P               ║");
				System.out.println("           ╚═════════════════════════════════════════════════════════════════════════════╝");
				System.out.println("           ═══════════════════════════════════════════════════════════════════════════════");
				System.out.println("           ╔═════════════════════════════════════════════════════════════════════════════╗");
				System.out.println("           ║         AQUI PUEDES VER LA LISTA DE NUESTROS PRODUCTOS ESTRELLA!            ║");
				System.out.println("           ╚═════════════════════════════════════════════════════════════════════════════╝");
				System.out.println("           ═══════════════════════════════════════════════════════════════════════════════");
				System.out.println("           ╔═════════════════════════╦═════════════════════════╦═════════════════════════╗");
				System.out.println("           ║     7 - GODDARD         ║    9 - STRATO XL        ║  11 - NEUTRON WATCH     ║");
				System.out.println("           ║  ---------------------  ║ ----------------------- ║ ----------------------- ║");
				System.out.println("           ║ TIPO: IA                ║ TIPO: VEHÍCULO AÉREO    ║ TIPO: RELOJ INTELIGENTE ║");
				System.out.println("           ║ DESCRIPCION:            ║ DESCRIPCION:            ║ DESCRIPCION:            ║");
				System.out.println("           ║ La más innovadora forma ║ La gran revolucion del  ║ El más Inteligente y    ║");
				System.out.println("           ║ de manejar tu casa y    ║ incómodo transporte     ║ ajustable reloj del     ║");
				System.out.println("           ║ gestionar tus asuntos   ║ actual por medio de la  ║ mercado. (Sincronizado  ║");
				System.out.println("           ║ personales.             ║ invasión de los Aires!  ║ con IA Goddard-Móvil)   ║");
				System.out.println("           ║  ---------------------  ║ ----------------------- ║ ----------------------- ║");
				System.out.println("           ║       225.000 USD       ║       190.000 USD       ║         8.000 USD       ║");
				System.out.println("           ╚═════════════════════════╩═════════════════════════╩═════════════════════════╝");
				System.out.println("           ═══════════════════════════════════════════════════════════════════════════════");
				System.out.println("           ╔═════════════════════════╦═════════════════════════╦═════════════════════════╗");
				System.out.println("           ║ AÑADE TUS PRODUCTOS AL  ║   1. REVISA TU CARRITO  ║                         ║");
				System.out.println("           ║ CARRITO OPRIMIENDO EL   ║     DE COMPRAS AHORA!   ║      0. S A L I R       ║");
				System.out.println("           ║ NUMRO DEL ITEM Y ENTER  ║   3. MOSTRAR FACTURA    ║                         ║");
				System.out.println("           ╚═════════════════════════╩═════════════════════════╩═════════════════════════╝");
				System.out.println("           ═══════════════════════════════════════════════════════════════════════════════");
				System.out.println("           ╔══════════════════════════════════════╦══════════════════════════════════════╗");
				System.out.println("           ║  2. ELIMINAR ITEMS DEL CARRITO       ║     10.  P A G A R   A H O R A       ║");
				System.out.println("           ╚══════════════════════════════════════╩══════════════════════════════════════╝");

				decisionCliente=entrada.nextInt();
				switch (decisionCliente) {
				case 7:
					System.out.println("      ╔═════════════════════════════════════════════════╗");
					System.out.println("      ║ Goddard Ha sido Añadido a tu Carrito de Compras!║"); 
					System.out.println("      ╚═════════════════════════════════════════════════╝");
					Carrito.add(Goddard);
					pausa();
					break;
				case 9:
					System.out.println("    ╔══════════════════════════════════════════════════════╗");
					System.out.println("    ║ El Strato XL Ha sido Añadido a tu Carrito de Compras!║"); 
					System.out.println("    ╚══════════════════════════════════════════════════════╝");
					Carrito.add(StratoXL);
					pausa();
					break;
				case 11:
					System.out.println("    ╔═════════════════════════════════════════════════════════════╗");
					System.out.println("    ║  El Neutrón Watch Ha sido Añadido a tu Carrito de Compras!  ║"); 
					System.out.println("    ╚═════════════════════════════════════════════════════════════╝");
					Carrito.add(NeutronWatch);
					pausa();
					break;
				case 1:
					verCarrito();
					pausa();
					break;
				case 0:
					System.out.println("          ╔═══════════════════════╗");
					System.out.println("          ║GRACIAS POR VISITARNOS!║"); 
					System.out.println("          ╚═══════════════════════╝");
					ejecutarMenu();
//					pausa();
					break;
				case 2:
					//método para eliminar del carro
					sacarProd();
					pausa();
					break;
				case 10:
					//método para pagar
					pagarCarrito();
					pausa();
					break;
				case 3:
					mostrarFactura();
					pausa();
					break;
				default:
					System.out.println("opcion incorrecta");
					break;
				}
			}//finaliza el try
		}//finaliza while del menu del cliente
		catch(InputMismatchException e){
			System.out.println("       ╔══════════════════════════════╗");
			System.out.println("       ║  Formato Incorrecto del Dato ║"); 
			System.out.println("       ║Digite digite un Dato numérico║");
			System.out.println("       ╚══════════════════════════════╝");
			entrante.next();
		}
	}
	public void verCarrito(){
		// TODO Auto-generated method stub
		//con ciclo for each
		System.out.println("                        ╔═══════════════════════╗");
		System.out.println("                        ║  CARRITO DE COMPRAS:  ║"); 
		System.out.println("                        ╚═══════════════════════╝");	
		System.out.println("           ╔════════╦═════════════════╦════════════════════╗");
		System.out.println("           ║ CÓDIGO ║     NOMBRE      ║       PRECIO       ║");
		System.out.println("           ╠════════╬═════════════════╬════════════════════╣");
		for(Producto u: Carrito){
			System.out.printf("           ║ %-7s║ %-16s║ USD %-15s║\n",u.darCodigo(),u.darNombreProd(),u.darCostoVenta());
			System.out.println("           ╠════════╬═════════════════╬════════════════════╣");				
		}
		System.out.println("           ╚════════╩═════════════════╩════════════════════╝");
		//Imprimir total de admins
		System.out.println("Total de Items Añadidos: "+Carrito.size());
		int subtotal=0;
		for(Producto c: Carrito){
			subtotal=subtotal+c.darCostoVenta();		
		}
		System.out.println("            ╔═════════════════════════════╗");
		System.out.printf("            ║ TOTAL: $ USD %-15s║\n",subtotal); 
		System.out.println("            ╚═════════════════════════════╝");

	}
	public int buscarEnCarrito(int codigo){
		//primero se recorre la lista
		for (int i=0; i<Carrito.size();i++){
			Producto u = Carrito.get(i);
			if(u.darCodigo()==codigo){//si el login del usuario u es igual a la variable guardada en nombre
				return i;//si es satisfactorio, retorna i
			}
		}
		//no se encontro el usuario y nunca entro al if, es decir no retorno ninguna posicion
		return -1 ;

	}

	public void sacarProd(){
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔════════════════════════════════════════╗");
				System.out.println("           ║Digite el codigo del Producto a Borrar: ║"); 
				System.out.println("           ╚════════════════════════════════════════╝");	
				int codigo =entrante.nextInt();
				int pos = buscarEnCarrito(codigo);
				if (pos<0){
					System.out.println("           ╔═══════════════════════════════════════════╗");
					System.out.println("           ║El Producto a Borrar No esta en el Carrito!║"); 
					System.out.println("           ╚═══════════════════════════════════════════╝");	
				}
				else{
					//eliminar cliente de la posicion tal
					System.out.println();
					System.out.println("           ╔════════════════════════════════════════╗");
					System.out.println("           ║El Producto a Borrar Si esta registrado!║"); 
					System.out.println("           ╚════════════════════════════════════════╝");	
					System.out.println("                   ╔══════════════════════╗");
					System.out.println("                   ║Está seguro de borrar?║"); 
					System.out.println("                   ╚══════════════════════╝");						
					System.out.println("                      ╔═════╗     ╔═════╗ ");
					System.out.println("                      ║0. Si║     ║1. No║"); 
					System.out.println("                      ╚═════╝     ╚═════╝");	
					int opc =-1;
					opc = entrante.nextInt();
					if(opc==0){
						Carrito.remove(pos);
						System.out.println("           ╔════════════════════════════════════════╗");
						System.out.println("           ║    Producto Eliminado Correctamente    ║"); 
						System.out.println("           ╚════════════════════════════════════════╝");
					}
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║Digite digite un Dato numérico║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}

	public void mostrarFactura(){
		int subtotal=0;
		int  opcionFactura=0;
		boolean check=false;
		while(!check){
			try{
				System.out.println("         ╔═════════════════════════════════════════════════════════════════════════════════╗");
				System.out.println("         ║ ╔═════════════════════════════════════════════════════════════════════════════╗ ║");
				System.out.println("         ║ ║                        VER MI FACTURA O COTIZACIÓN                          ║ ║"); 
				System.out.println("         ║ ║             S E T E N     I N T E R N A T I O N A L   S H O P               ║ ║");
				System.out.println("         ║ ╚═════════════════════════════════════════════════════════════════════════════╝ ║");
				System.out.println("         ║ ═══════════════════════════════════════════════════════════════════════════════ ║");
				System.out.println("         ║ ╔═══════════════════════╗  ╔═══════════════════════╗  ╔═══════════════════════╗ ║");
				System.out.println("         ║ ║        CLIENTE:       ║  ║         FECHA:        ║  ║     SEDE DE VENTA:    ║ ║"); 
				System.out.println("         ║ ║        GENÉRICO       ║  ║      DD/MMM/AAAA      ║  ║     SEDE PRINCIPAL    ║ ║");
				System.out.println("         ║ ╚═══════════════════════╝  ╚═══════════════════════╝  ╚═══════════════════════╝ ║");
				System.out.println("         ║       ╔══════════════╦══════════════╦════════════════╦══════════════════╗       ║");
				System.out.println("         ║       ║    CÓDIGO    ║    NOMBRE    ║    CANTIDAD    ║      COSTO       ║       ║");
				System.out.println("         ║       ╠══════════════╬══════════════╬════════════════╬══════════════════╣       ║");
				for(Producto c: Carrito){
					System.out.printf("         ║       ║ %-13s║ %-13s║ %-15s║ USD %-13s║       ║\n",c.darCodigo(),c.darNombreProd(),1,c.darCostoVenta());
					System.out.println("         ║       ╠══════════════╬══════════════╬════════════════╬══════════════════╣       ║");				
				}
				System.out.println("         ║       ╚══════════════╩══════════════╩════════════════╩══════════════════╝       ║");
				System.out.println("         ╚═════════════════════════════════════════════════════════════════════════════════╝");
				for(Producto c: Carrito){
					subtotal=subtotal+c.darCostoVenta();		
				}
				System.out.println("            ╔═════════════════════════════╗");
				System.out.printf("            ║ TOTAL: $ USD %-15s║\n",subtotal); 
				System.out.println("            ╚═════════════════════════════╝");
				System.out.println();
				System.out.println("                        ╔═══════════════════════╗   ╔═══════════════════════╗");
				System.out.println("                        ║   1. PAGAR AHORA!     ║   ║ 2. VOLVER A LA TIENDA ║"); 
				System.out.println("                        ╚═══════════════════════╝   ╚═══════════════════════╝");	
				opcionFactura=entrante.nextInt();
				switch (opcionFactura) {
				case 1:
					pagarCarrito();
					break;
				case 2:
					menuCliente();
					break;
				default:
					break;
				}
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║Digite digite un Dato numérico║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}

		}
	}

	public void shipped(){
		System.out.println("       ╔═══════════════════════════════════════════╗");
		System.out.println("       ║ TU PRODUCTO HA COMENZADO A SER PRODUCIDO  ║"); 
		System.out.println("       ║     NOS PONDREMOS EN CONTACTO CONTIGO     ║");
		System.out.println("       ╚═══════════════════════════════════════════╝");
		pausa();
		menuCliente();
	}

	public void pagarCarrito(){
		boolean check=false;
		int metodoPago=0;
		int subtotal=0;
		while(!check){
			try{
				System.out.println("           ╔═════════════════════════════════════════════════════════════════════════════╗");
				System.out.println("           ║                          ELIGE TU MÉTODO DE PAGO                            ║"); 
				System.out.println("           ║             S E T E N     I N T E R N A T I O N A L    S H O P              ║");
				System.out.println("           ╚═════════════════════════════════════════════════════════════════════════════╝");
				System.out.println("           ═══════════════════════════════════════════════════════════════════════════════");
				System.out.println("           ╔═══════════════════════╗  ╔═══════════════════════╗  ╔═══════════════════════╗");
				System.out.println("           ║     1. TARJETA        ║  ║    2. EFECTIVO        ║  ║      3. BITCOIN       ║"); 
				System.out.println("           ╚═══════════════════════╝  ╚═══════════════════════╝  ╚═══════════════════════╝");
				System.out.println("                                      ╔═══════════════════════╗");
				System.out.println("                                      ║ 4. VOLVER A LA TIENDA ║"); 
				System.out.println("                                      ╚═══════════════════════╝");

				for(Producto c: Carrito){
					subtotal=subtotal+c.darCostoVenta();		
				}
				System.out.println("            ╔═════════════════════════════╗");
				System.out.printf("            ║ TOTAL: $ USD %-15s║\n",subtotal); 
				System.out.println("            ╚═════════════════════════════╝");
				metodoPago=entrante.nextInt();
				switch (metodoPago) {
				case 1:
					System.out.println("         ╔═══════════════════════════════════════════════════════════════╗");
					System.out.println("         ║ IMPRIME TU FACTURA, LUEGO REALIZA EL PAGO POR MEDIO DE BANCO x║"); 
					System.out.println("         ╚═══════════════════════════════════════════════════════════════╝");
					shipped();
				case 2:
					System.out.println("         ╔═══════════════════════════════════════════════════════════════╗");
					System.out.println("         ║    ENTREGA EL EFECTIVO AL CAJERO QUE TE ATIENDE Y ESPERALO    ║"); 
					System.out.println("         ╚═══════════════════════════════════════════════════════════════╝");
					shipped();
					break;
				case 3:
					System.out.println("         ╔══════════════════════════════════════════════════════════════════════════╗");
					System.out.println("         ║   ENVÍA LOS FONDOS A ESTA DIRECCION: 1PyzhhD4akcgZajrCdmd9YqXfiVjgzdn68  ║"); 
					System.out.println("         ║    CODIGO DE VENTA: IFC7 Y ESPERA MIENTRAS SE VERIFICA LA TRANSACCION    ║");
					System.out.println("         ╚══════════════════════════════════════════════════════════════════════════╝");
					shipped();
					break;
				case 4:
					menuCliente();
					break;
				default:
					menuCliente();
					break;
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║Digite digite un Dato numérico║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}

	}
	//------------------------------------FIN DE LA PARTE DEL CLIENTE / GUI ------------------------------------------------

	private void listarAdmins() {
		// TODO Auto-generated method stub
		//con ciclo for each
		System.out.println("                           ╔═══════════════════════╗");
		System.out.println("                           ║    Tabla a Imprimir:  ║"); 
		System.out.println("                           ║     LISTA DE ADMINS   ║");
		System.out.println("                           ╚═══════════════════════╝");	
		System.out.println("           ╔══════════════╦══════════════╦══════╦══════════════════╗");
		System.out.println("           ║    NOMBRE    ║  APELLIDO    ║ EDAD ║    DOCUMENTO     ║");
		System.out.println("           ╠══════════════╬══════════════╬══════╬══════════════════╣");
		for(Admin u: lstAdmins){
			System.out.printf("           ║%-14s║%-14s║ %-5s║%-18s║\n",u.darNombre(),u.darApellido(),u.darEdad(),u.darDocumento());
			System.out.println("           ╠══════════════╬══════════════╬══════╬══════════════════╣");				
		}
		System.out.println("           ╚══════════════╩══════════════╩══════╩══════════════════╝");
		//Imprimir total de admins
		System.out.println("Total de Admins registrados: "+lstAdmins.size());
	}

	public void agregarCliente(){//agregar cliente
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║      NOMBRE DEL CLIENTE     ║");
				System.out.println("           ╚═════════════════════════════╝");
				String nombre=entrante.next();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║     APELLIDO DEL CLIENTE    ║");
				System.out.println("           ╚═════════════════════════════╝");		
				String apellido = entrante.next();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║      CÉDULA DEL CLIENTE     ║");
				System.out.println("           ╚═════════════════════════════╝");
				int cedula = entrante.nextInt();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║      EDAD  DEL CLIENTE      ║");
				System.out.println("           ╚═════════════════════════════╝");
				int edad = entrante.nextInt();
				Cliente cliente = new Cliente (nombre, apellido, cedula,edad);
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║    Proceso Satisfactorio!   ║"); 
				System.out.println("             El Cliente: *"+nombre+ "*");
				System.out.println("           ║  Fue añadido correctamente  ║");
				System.out.println("           ╚═════════════════════════════╝");
				lstClientes.add(cliente);
				System.out.println("la cantidad de Clientes es de: "+lstClientes.size());
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}
	public void agregarProveedor(){//agregar proveedor
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║    NOMBRE DEL PROVEEDOR     ║");
				System.out.println("           ╚═════════════════════════════╝");
				String nombre=entrante.next();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║   APELLIDO DEL PROVEEDOR    ║");
				System.out.println("           ╚═════════════════════════════╝");		
				String apellido = entrante.next();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║    CÉDULA DEL PROVEEDOR     ║");
				System.out.println("           ╚═════════════════════════════╝");
				int cedula = entrante.nextInt();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║    EMPRESA DEL PROVEEDOR    ║");
				System.out.println("           ╚═════════════════════════════╝");
				String empresa = entrante.next();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║     NOMBRE DEL PRODUCTO     ║");
				System.out.println("           ╚═════════════════════════════╝");
				String nombreProd = entrante.next();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║     CÓDIGO DEL PRODUCTO     ║");
				System.out.println("           ╚═════════════════════════════╝");
				int codigoProd = entrante.nextInt();
				Producto productoTemp = new Producto (nombreProd, codigoProd);
				System.out.println("           ╔═══════════════════════════════╗");
				System.out.println("           ║  Llene los siguientes Datos:  ║"); 
				System.out.println("           ╠═══════════════════════════════╣");
				System.out.println("           ║PAÍS DE UBICACION DEL PROVEEDOR║");
				System.out.println("           ╚═══════════════════════════════╝");
				String paisTMP = entrante.next();
				System.out.println("           ╔═════════════════════════════════╗");
				System.out.println("           ║   Llene los siguientes Datos:   ║"); 
				System.out.println("           ╠═════════════════════════════════╣");
				System.out.println("           ║ESTADO DE UBICACION DEL PROVEEDOR║");
				System.out.println("           ╚═════════════════════════════════╝");
				String estadoTMP = entrante.next();
				System.out.println("           ╔═════════════════════════════════╗");
				System.out.println("           ║   Llene los siguientes Datos:   ║"); 
				System.out.println("           ╠═════════════════════════════════╣");
				System.out.println("           ║CIUDAD DE UBICACION DEL PROVEEDOR║");
				System.out.println("           ╚═════════════════════════════════╝");
				String ciudadTMP = entrante.next();
				Lugar lugarTMP = new Lugar (paisTMP, estadoTMP, ciudadTMP);

				Proveedor agregarProveedor = new Proveedor (nombre,apellido,cedula, empresa,productoTemp);
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║    Proceso Satisfactorio!   ║"); 
				System.out.println("             El Proveedor: * "+nombre+ " *");
				System.out.println("           ║  Fue añadido correctamente  ║");
				System.out.println("           ╚═════════════════════════════╝");
				lstProveedores.add(agregarProveedor);
				System.out.println("la cantidad de proveedores es: "+lstProveedores.size());
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}
	public int buscarPosicionCliente(String nombre){
		//primero se recorre la lista
		for (int i=0; i<lstClientes.size();i++){
			Cliente u = lstClientes.get(i);
			if(u.darNombre().equals(nombre)){//si el login del usuario u es igual a la variable guardada en nombre
				return i;//si es satisfactorio, retorna i
			}
		}
		//no se encontro el usuario y nunca entro al if, es decir no retorno ninguna posicion
		return -1 ;
	}
	//crear metodo similar
	public void buscarCliente(){//pide el nombre para buscar el usuario
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═══════════════════════╗");
				System.out.println("           ║  Digite el Nombre del ║"); 
				System.out.println("           ║  Cliente a buscar:    ║");
				System.out.println("           ╚═══════════════════════╝");		
				String nombre =entrante.next();
				int pos = buscarPosicionCliente(nombre);
				if (pos<0){
					System.out.println("           ╔═══════════════════════╗");
					System.out.println("           ║El Cliente "+nombre+"  ║"); 
					System.out.println("           ║No está Registrado!    ║");
					System.out.println("           ╚═══════════════════════╝");	
				}
				else{
					//imprimir Cliente de la posicipon tal
					imprimirFichaCliente(pos);
				}

				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}
	public void imprimirFichaCliente(int i){//este metodo imprime datos de un usuario, en este caso, imprime nombre y apellido y documento
		Cliente u =lstClientes.get(i);
		System.out.println();
		System.out.println("           ╔════════════════════════════════╗");
		System.out.println("           ║El Cliente Efectivamente Existe:║");
		System.out.println("           ╠════════════════════════════════╣");			
		System.out.println("           ║        Datos del Cliente:      ║");	
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║      Nombre:    ║ "+u.darNombre()+"");
		System.out.println("           ╠═════════════════╩══════════════╣");
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║    Apellido:    ║ "+u.darApellido()+"");
		System.out.println("           ╠═════════════════╩══════════════╣");
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║    Documento:   ║ "+u.darDocumento()+"");
		System.out.println("           ╚═════════════════╩══════════════╝");
	}
	public int buscarPosicionProveedor(String nombre){
		//primero se recorre la lista
		for (int i=0; i<lstProveedores.size();i++){
			Proveedor u = lstProveedores.get(i);
			if(u.darNombre().equals(nombre)){//si el nombre del proveedor  es igual a la variable guardada en nombre
				return i;//si es satisfactorio, retorna i
			}
		}
		//no se encontro el usuario y nunca entro al if, es decir no retorno ninguna posicion
		return -1 ;
	}

	//crear metodo similar
	public void buscarProveedor(){//pide el nombre para buscar el proveedor
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═══════════════════════╗");
				System.out.println("           ║  Digite el Nombre del ║"); 
				System.out.println("           ║  Proveedor a buscar:  ║");
				System.out.println("           ╚═══════════════════════╝");		
				String nombre =entrante.next();
				int pos = buscarPosicionProveedor(nombre);
				if (pos<0){
					System.out.println("           ╔═══════════════════════╗");
					System.out.println("           ║El Proveedor"+nombre+" ║"); 
					System.out.println("           ║No está Registrado!    ║");
					System.out.println("           ╚═══════════════════════╝");	
				}
				else{
					//imprimir proveedor de la posicipon tal
					imprimirFichaProveedor(pos);
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}	
	}
	public void imprimirFichaProveedor(int i){//este metodo imprime datos de un proveedor,
		Proveedor u =lstProveedores.get(i);
		System.out.println();
		System.out.println("           ╔══════════════════════════════════╗");
		System.out.println("           ║El Proveedor Efectivamente Existe:║");
		System.out.println("           ╠══════════════════════════════════╣");			
		System.out.println("           ║        Datos del Proveedor:      ║");	
		System.out.println("           ╠══════════════════╦═══════════════╣");
		System.out.println("           ║      Nombre:     ║ "+u.darNombre()+"");
		System.out.println("           ╠══════════════════╩═══════════════╣");
		System.out.println("           ╠══════════════════╦═══════════════╣");
		System.out.println("           ║    Apellido:     ║ "+u.darApellido()+"");
		System.out.println("           ╠══════════════════╩═══════════════╣");
		System.out.println("           ╠══════════════════╦═══════════════╣");
		System.out.println("           ║    Documento:    ║ "+u.darDocumento()+"");
		System.out.println("           ╠══════════════════╩═══════════════╣");
		System.out.println("           ╠══════════════════╦═══════════════╣");
		System.out.println("           ║     Empresa:     ║ "+u.darEmpresa()+"");
		System.out.println("           ╠══════════════════╩═══════════════╣");
		System.out.println("           ╠══════════════════╦═══════════════╣");
		System.out.println("           ║     Producto:    ║ "+u.darCodNomProducto()+"");
		System.out.println("           ╠══════════════════╩═══════════════╣");
		System.out.println("           ╠══════════════════╦═══════════════╣");
		System.out.println("           ║    Ubicacion:    ║ "+u.darLugarProveedor()+"");
		System.out.println("           ╠══════════════════╩═══════════════╣");
		System.out.println("           ╠══════════════════╦═══════════════╣");
		System.out.println("           ║     Producto:    ║ "+u.darCodNomProducto()+"");
		System.out.println("           ╚══════════════════╩═══════════════╝");	

	}
	public void agregarProducto(){
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║    NOMBRE DEL PRODUCTO      ║");
				System.out.println("           ╚═════════════════════════════╝");
				String nombre=entrante.next();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║    CODIGO DEL PRODUCTO      ║");				
				System.out.println("           ╚═════════════════════════════╝");		
				int codigo = entrante.nextInt();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║   CANTIDAD DE PRODUCTOS     ║");
				System.out.println("           ╚═════════════════════════════╝");
				int cantidad	=entrante.nextInt();
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║ Llene los siguientes Datos: ║"); 
				System.out.println("           ╠═════════════════════════════╣");
				System.out.println("           ║     EMPRESA FABRICANTE      ║");
				System.out.println("           ╚═════════════════════════════╝");
				String fabricante = entrante.next();
				Producto producto = new Producto (nombre, codigo, fabricante, cantidad);
				System.out.println("           ╔═════════════════════════════╗");
				System.out.println("           ║    Proceso Satisfactorio!   ║"); 
				System.out.println("             El Producto: *"+nombre+ "*");
				System.out.println("           ║  Fue añadido correctamente  ║");
				System.out.println("           ╚═════════════════════════════╝");
				lstProductos.add(producto);
				System.out.println("la cantidad de productos es: "+lstProductos.size());
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}	
	}
	public int buscarPosicionProducto(String nombre){
		//primero se recorre la lista
		for (int i=0; i<lstProductos.size();i++){
			Producto u = lstProductos.get(i);
			if(u.darNombreProd().equals(nombre)){//si el nombre del producto  es igual a la variable guardada en nombre
				return i;//si es satisfactorio, retorna i
			}
		}
		//no se encontro el producto y nunca entro al if, es decir no retorno ninguna posicion
		return -1 ;
	}
	public void imprimirFichaProducto(int i){//este metodo imprime datos de un usuario, en este caso, imprime login y password
		Producto u =lstProductos.get(i);
		System.out.println();
		System.out.println("           ╔════════════════════════════════╗");
		System.out.println("           ║      El Producto  Existe:      ║");
		System.out.println("           ╠════════════════════════════════╣");			
		System.out.println("           ║       Datos del Producto:      ║");	
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║       Nombre:   ║ "+u.darNombreProd()+"");
		System.out.println("           ╠═════════════════╩══════════════╣");
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║       Codigo:   ║ "+u.darCodigo()+"");
		System.out.println("           ╠═════════════════╩══════════════╣");
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║   Fabricante:   ║ "+u.darFabricante()+"");
		System.out.println("           ╠═════════════════╩══════════════╣");
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║     Cantidad:   ║ "+u.darCantidad()+"");
		System.out.println("           ╚═════════════════╩══════════════╝");
	}
	public void buscarProducto(){//pide el nombre para buscar el proveedor
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═══════════════════════╗");
				System.out.println("           ║  Digite el Nombre del ║"); 
				System.out.println("           ║  Producto a buscar:   ║");
				System.out.println("           ╚═══════════════════════╝");		
				String nombreProd =entrante.next();
				int pos = buscarPosicionProducto(nombreProd);
				if (pos<0){
					System.out.println("           ╔═══════════════════════╗");
					System.out.println("           El Producto: "+nombreProd+" "); 
					System.out.println("           ║  No está Registrado!  ║");
					System.out.println("           ╚═══════════════════════╝");	
				}
				else{
					//imprimir producto de la posicicion tal
					imprimirFichaProducto(pos);
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}	
	}
	public void agregarAdmin(){//agregar admin
		System.out.println("           ╔═════════════════════════════╗");
		System.out.println("           ║ Llene los siguientes Datos: ║"); 
		System.out.println("           ╠═════════════════════════════╣");
		System.out.println("           ║   NOMBRE DEL NUEVO ADMIN    ║");
		System.out.println("           ╚═════════════════════════════╝");
		String nombre=entrante.next();
		System.out.println("           ╔═════════════════════════════╗");
		System.out.println("           ║ Llene los siguientes Datos: ║"); 
		System.out.println("           ╠═════════════════════════════╣");
		System.out.println("           ║      APELLIDO DEL ADMIN     ║");
		System.out.println("           ╚═════════════════════════════╝");		
		String apellido = entrante.next();
		System.out.println("           ╔═════════════════════════════╗");
		System.out.println("           ║ Llene los siguientes Datos: ║"); 
		System.out.println("           ╠═════════════════════════════╣");
		System.out.println("           ║      CÉDULA DEL ADMIN       ║");
		System.out.println("           ╚═════════════════════════════╝");
		int cedula = entrante.nextInt();
		System.out.println("           ╔═════════════════════════════╗");
		System.out.println("           ║ Llene los siguientes Datos: ║"); 
		System.out.println("           ╠═════════════════════════════╣");
		System.out.println("           ║       EDAD DEL ADMIN        ║");
		System.out.println("           ╚═════════════════════════════╝");
		int edad = entrante.nextInt();
		Admin Administrador = new Admin (nombre, apellido, cedula, edad);
		System.out.println("           ╔═════════════════════════════╗");
		System.out.println("           ║    Proceso Satisfactorio!   ║"); 
		System.out.println("             El Admin: *"+nombre+ "*");
		System.out.println("           ║  Fue añadido correctamente  ║");
		System.out.println("           ╚═════════════════════════════╝");
		lstAdmins.add(Administrador);
		System.out.println("la cantidad de Administradores del sistema es de: "+lstAdmins.size());
	}

	//creacion de productoCHECK y administradoresHMM

	public int buscarPosicionAdmin(String nombre){
		//primero se recorre la lista
		for (int i=0; i<lstAdmins.size();i++){
			Admin m = lstAdmins.get(i);
			if(m.darNombre().equals(nombre)){//si el nombre del admin  es igual a la variable guardada en nombre
				return i;//si es satisfactorio, retorna i
			}
		}
		//no se encontro el producto y nunca entro al if, es decir no retorno ninguna posicion
		return -1 ;
	}
	public void imprimirFichaAdmin(int i){//este metodo imprime datos de un usuario, en este caso, imprime datos
		Admin u = (lstAdmins).get(i);
		System.out.println();
		System.out.println("           ╔════════════════════════════════╗");
		System.out.println("           ║      El Admin si  Existe:      ║");
		System.out.println("           ╠════════════════════════════════╣");			
		System.out.println("           ║     Datos del Administrador:   ║");	
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║       Nombre:   ║ "+u.darNombre()+"");
		System.out.println("           ╠═════════════════╩══════════════╣");
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║     Apellido:   ║ "+u.darApellido()+"");
		System.out.println("           ╠═════════════════╩══════════════╣");
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║    Documento:   ║ "+u.darDocumento()+"");
		System.out.println("           ╠═════════════════╩══════════════╣");
		System.out.println("           ╠═════════════════╦══════════════╣");
		System.out.println("           ║       Edad:     ║ "+u.darEdad()+"");
		System.out.println("           ╚═════════════════╩══════════════╝");
	}
	public void buscarAdmin(){//pide el nombre para buscar el proveedor
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═══════════════════════╗");
				System.out.println("           ║  Digite el Nombre del ║"); 
				System.out.println("           ║Administrador a buscar:║");
				System.out.println("           ╚═══════════════════════╝");		
				String nombre =entrante.next();
				int pos = buscarPosicionAdmin(nombre);
				if (pos<0){
					System.out.println("           ╔═══════════════════════╗");
					System.out.println("           El Administrador: "+nombre+" "); 
					System.out.println("           ║  No está Registrado!  ║");
					System.out.println("           ╚═══════════════════════╝");	
				}
				else{
					//imprimir producto de la posicicion tal
					imprimirFichaAdmin(pos);
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}
	public void listarClientes(){//listar clientes
		//con ciclo for each
		System.out.println("                           ╔═══════════════════════╗");
		System.out.println("                           ║    Tabla a Imprimir:  ║"); 
		System.out.println("                           ║   LISTA DE CLIENTES   ║");
		System.out.println("                           ╚═══════════════════════╝");	
		System.out.println("           ╔══════════════╦══════════════╦══════╦══════════════════╗");
		System.out.println("           ║    NOMBRE    ║  APELLIDO    ║ EDAD ║    DOCUMENTO     ║");
		System.out.println("           ╠══════════════╬══════════════╬══════╬══════════════════╣");
		for(Cliente u: lstClientes){
			System.out.printf("           ║%-14s║%-14s║ %-5s║%-18s║\n",u.darNombre(),u.darApellido(),u.darEdad(),u.darDocumento());
			System.out.println("           ╠══════════════╬══════════════╬══════╬══════════════════╣");				
		}
		System.out.println("           ╚══════════════╩══════════════╩══════╩══════════════════╝");
		//Imprimir total de usuarios
		System.out.println("Total de usuarios registrados: "+lstClientes.size());
	}
	public void listarProveedores(){//listar proveedores
		//con ciclo for each
		System.out.println("                           ╔═══════════════════════╗");
		System.out.println("                           ║    Tabla a Imprimir:  ║"); 
		System.out.println("                           ║ LISTA DE PROVEEDORES  ║");
		System.out.println("                           ╚═══════════════════════╝");	
		System.out.println("           ╔══════════════╦══════════════╦══════════════════╦══════════════════════╦══════════════╗");
		System.out.println("           ║    NOMBRE    ║   APELLIDO   ║    DOCUMENTO     ║       EMPRESA        ║   PRODUCTO   ║");
		System.out.println("           ╠══════════════╬══════════════╬══════════════════╬══════════════════════╬══════════════╣");
		for(Proveedor u: lstProveedores){
			System.out.printf("           ║ %-13s║ %-13s║ %-17s║ %-21s║ %-13s║\n",u.darNombre(),u.darApellido(),u.darDocumento(),u.darEmpresa(),u.darCodNomProducto());
			System.out.println("           ╠══════════════╬══════════════╬══════════════════╬══════════════════════╬══════════════╣");				
		}
		System.out.println("           ╚══════════════╩══════════════╩══════════════════╩══════════════════════╩══════════════╝");
		//Imprimir total de PROVEEDORES
		System.out.println("Total de usuarios registrados: "+lstProveedores.size());
	}
	public void listarProductos(){//listar productos
		//con ciclo for each
		System.out.println("                           ╔═══════════════════════╗");
		System.out.println("                           ║    Tabla a Imprimir:  ║"); 
		System.out.println("                           ║    LISTA DE PRODUCTOS ║");
		System.out.println("                           ╚═══════════════════════╝");	
		System.out.println("           ╔══════════════╦══════════════╦═════════╦══════════════════╗");
		System.out.println("           ║    CODIGO    ║    NOMBRE    ║ CANTIDAD║   FABRICANTE     ║");
		System.out.println("           ╠══════════════╬══════════════╬═════════╬══════════════════╣");
		for(Producto u: lstProductos){
			System.out.printf("           ║ %-13s║ %-13s║ %-8s║ %-17s║\n",u.darCodigo(),u.darNombreProd(),u.darCantidad(),u.darFabricante());
			System.out.println("           ╠══════════════╬══════════════╬═════════╬══════════════════╣");				
		}
		System.out.println("           ╚══════════════╩══════════════╩═════════╩══════════════════╝");
		//Imprimir total de usuarios
		System.out.println("Total de Productos Registrados es: "+lstProductos.size());
	}
	public void eliminarCliente(){//pide el nombre para buscar el usuario
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═══════════════════════════════════════╗");
				System.out.println("           ║Digite el nombre del Cliente a Borrar: ║"); 
				System.out.println("           ╚═══════════════════════════════════════╝");	
				String nombre =entrante.next();
				int pos = buscarPosicionCliente(nombre);
				if (pos<0){
					System.out.println("           ╔═══════════════════════════════════════╗");
					System.out.println("           ║El Cliente a Borrar No esta registrado!║"); 
					System.out.println("           ╚═══════════════════════════════════════╝");	
				}
				else{
					//eliminar cliente de la posicion tal
					System.out.println();
					System.out.println("           ╔═══════════════════════════════════════╗");
					System.out.println("           ║El Cliente a Borrar Si esta registrado!║"); 
					System.out.println("           ╚═══════════════════════════════════════╝");	
					System.out.println("                   ╔══════════════════════╗");
					System.out.println("                   ║Está seguro de borrar?║"); 
					System.out.println("                   ╚══════════════════════╝");						
					System.out.println("                      ╔═════╗     ╔═════╗ ");
					System.out.println("                      ║0. Si║     ║1. No║"); 
					System.out.println("                      ╚═════╝     ╚═════╝");	
					int opc =-1;
					opc = entrante.nextInt();
					if(opc==0){
						lstClientes.remove(pos);
					}
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}
	public void eliminarProveedor(){//pide el nombre para buscar el usuario
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═════════════════════════════════════════╗");
				System.out.println("           ║Digite el nombre del Proveedor a Borrar: ║"); 
				System.out.println("           ╚═════════════════════════════════════════╝");	
				String nombre =entrante.next();
				int pos = buscarPosicionProveedor(nombre);
				if (pos<0){
					System.out.println("           ╔═════════════════════════════════════════╗");
					System.out.println("           ║El Proveedor a Borrar No esta registrado!║"); 
					System.out.println("           ╚═════════════════════════════════════════╝");	
				}
				else{
					//eliminar proveedor de la posicion tal
					System.out.println();
					System.out.println("           ╔═════════════════════════════════════════╗");
					System.out.println("           ║El Proveedor a Borrar Si esta registrado!║"); 
					System.out.println("           ╚═════════════════════════════════════════╝");	
					System.out.println("                     ╔══════════════════════╗");
					System.out.println("                     ║Está seguro de borrar?║"); 
					System.out.println("                     ╚══════════════════════╝");						
					System.out.println("                        ╔═════╗     ╔═════╗ ");
					System.out.println("                        ║0. Si║     ║1. No║"); 
					System.out.println("                        ╚═════╝     ╚═════╝");	
					int opc =-1;
					opc = entrante.nextInt();
					if(opc==0){
						lstProveedores.remove(pos);
					}
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}
	public void eliminarProducto(){//pide el nombre para buscar el usuario
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔════════════════════════════════════════╗");
				System.out.println("           ║Digite el nombre del Producto a Borrar: ║"); 
				System.out.println("           ╚════════════════════════════════════════╝");	
				String nombre =entrante.next();
				int pos = buscarPosicionProducto(nombre);
				if (pos<0){
					System.out.println("           ╔═══════════════════════════════╗");
					System.out.println("           ║El producto a Borrar No existe!║"); 
					System.out.println("           ╚═══════════════════════════════╝");	
				}
				else{
					//eliminar producto de la posicion tal
					System.out.println();
					System.out.println("           ╔════════════════════════════════════════╗");
					System.out.println("           ║El Producto a Borrar Si esta registrado!║"); 
					System.out.println("           ╚════════════════════════════════════════╝");	
					System.out.println("                     ╔══════════════════════╗");
					System.out.println("                     ║Está seguro de borrar?║"); 
					System.out.println("                     ╚══════════════════════╝");						
					System.out.println("                        ╔═════╗     ╔═════╗");
					System.out.println("                        ║0. Si║     ║1. No║"); 
					System.out.println("                        ╚═════╝     ╚═════╝");	
					int opc =-1;
					opc = entrante.nextInt();
					if(opc==0){
						lstProductos.remove(pos);
					}
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}
	public void eliminarAdmin(){//pide el nombre para buscar el admin
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═════════════════════════════════════════════╗");
				System.out.println("           ║Digite el nombre del Administrador a Borrar: ║"); 
				System.out.println("           ╚═════════════════════════════════════════════╝");	
				String nombre =entrante.next();
				int pos = buscarPosicionAdmin(nombre);
				if (pos<0){
					System.out.println("           ╔════════════════════════════════════╗");
					System.out.println("           ║El Administrador a Borrar No existe!║"); 
					System.out.println("           ╚════════════════════════════════════╝");	
				}
				else{
					//eliminar Administrador  de la posicion tal
					System.out.println();
					System.out.println("           ╔═════════════════════════════════════════════╗");
					System.out.println("           ║El Administrador a Borrar Si esta registrado!║"); 
					System.out.println("           ╚═════════════════════════════════════════════╝");	
					System.out.println("                     ╔══════════════════════╗");
					System.out.println("                     ║Está seguro de borrar?║"); 
					System.out.println("                     ╚══════════════════════╝");						
					System.out.println("                        ╔═════╗     ╔═════╗");
					System.out.println("                        ║0. Si║     ║1. No║"); 
					System.out.println("                        ╚═════╝     ╚═════╝");	
					int opc =-1;
					opc = entrante.nextInt();
					if(opc==0){
						lstAdmins.remove(pos);
					}
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}
	public void cambiarCantidadProductos(){
		boolean check=false;
		while(!check){
			try{
				System.out.println("           ╔═════════════════════════════════════════════╗");
				System.out.println("           ║   Digite el nombre del Producto a cambiar   ║"); 
				System.out.println("           ╚═════════════════════════════════════════════╝");					
				String nombre =entrante.next();
				int pos = buscarPosicionProducto(nombre);
				if (pos<0){
					System.out.println("           ╔════════════════════════════════════╗");
					System.out.println("           ║  El Producto "+nombre+" no existe! ║"); 
					System.out.println("           ╚════════════════════════════════════╝");
				}
				else{
					System.out.println("           ╔═════════════════════════════════════════════╗");
					System.out.println("           ║  El Producto "+nombre+" Si esta en Stock!   ║"); 
					System.out.println("           ╚═════════════════════════════════════════════╝");	
					System.out.println("           ╔═════════════════════════════════════════════╗");
					System.out.println("           ║  Digite la nueva cantidad de "+nombre+"     ║"); 
					System.out.println("           ╚═════════════════════════════════════════════╝");	
					int cantidad = entrante.nextInt();
					Producto u = lstProductos.get(pos);
					u.actualizarCantidad(cantidad);
					System.out.println("           ╔═════════════════════════════╗");
					System.out.println("           ║    Proceso Satisfactorio!   ║"); 
					System.out.println("             El Producto: *"+nombre+ "*");
					System.out.println("           ║Fue modificado correctamente ║");
					System.out.println("           ╚═════════════════════════════╝");
				}
				check=true;
			}
			catch(InputMismatchException e){
				System.out.println("       ╔══════════════════════════════╗");
				System.out.println("       ║  Formato Incorrecto del Dato ║"); 
				System.out.println("       ║  Digite el dato sin espacios ║");
				System.out.println("       ╚══════════════════════════════╝");
				entrante.next();
			}
		}
	}


}
/*falta hacer que lo metodos de listar x, 
 * o un método externo, a los métodos
 * hagan una importacion de los Datos en 
 * los archivos correspondientes
 * (clientes, productos,proveedores)   hecho
 * 
 * CREAR UN ADMIN MASTER KEY  hcecho
 * CREAS UN MASTER KEY PASS hecho
 * HACER LA VERIFICACION MEDIANTE ENCRIPTACION descartado
 * 
 */

