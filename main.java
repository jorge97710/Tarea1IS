import java.util.*;

public class main{

	public static void main(String[] args) { 
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario
	    Controlador_usuario control;
	       
	       while(!salir){
	           
	           System.out.println("Selecione su tipo de usuario"); 
	           System.out.println("1. Empleado de caja"); //visualizar juguetes, categorias y precios
	           System.out.println("2. Encargado de inventario"); //ademas, editar cantidades en existencia y precios, agregar nuevos productos
	           System.out.println("3. Director"); //ademas,  reportes y estadisticas
	           System.out.println("4. Salir");

	           
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();
	           control = new Controlador_usuario(opcion);
	          
	           switch(opcion){
	               case 1:
	                   System.out.println("Menu para el encargado de caja");
	                   control.mostrarMenu();
	                   break;
	               case 2:
	                   System.out.println("Menu para el encargado de inventario");
	                   control.mostrarMenu();
	                   break;
	                case 3:
	                   System.out.println("Menu para el director");
	                   control.mostrarMenu();
	                   break;
	                case 4:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	           
	       }
	}
}
