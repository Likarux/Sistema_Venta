package menu;
/**
 * Clase para ejecutar menu de aplicacion
 * Mostramos menu y esperamos entrada de opcion por teclado para ejecutarla.
 *@param Leer.datoInt  leer entrada teclado.
 *@param continuar se establece en false o true para posterior uso.
 *@author Jose Luis Alfosea
 *@see aplcacion.Aplicacion   y   leer.Leer
 *@version 1.0
 *@sice :04/02/2024
 */
import app.Aplicacion;
import leer.Leer;
import mensajes.Mensajes;
public class Menu {
/**
 * Este Manin hace uso de los metodos de Aplicacion y Leer.
 * @param args
 */
	
	/*
	 * 
	 * Aqui se declara el metodo Main , y se llama al metodo Mensaje_inicial para que ,muestre el mensaje y se declara un varibla
	 * y se inicializa con true, luego utilizamos el bucle do While para que muestre primero el menu y espere
	 * un valor determinado usando el Metodo de clase Leer datoInt() la actuacion en cada valor y cualquier otro valor sale del programa 
	 * e iguala el valor de continuar a false y con while llama al metodo que muestra el mensaje de fin.
	 * 
	 */
			
	
	
	public static void main(String[] args) {
		//muestra mensaje bienvenida
				Mensaje_Inicial();

				boolean continuar = true;

				do {
		//realiza el do mostrando el menu por consola
					Opciones_Menu();
		//utiliza el metodo  de la clase leer.Leer para entrada de datos y segun valor ejecuta cada caso.
					switch (Leer.datoInt()) {
						case 1:

							break;
						case 2:
						

							break;
						case 3:

							break;
					
					default:
						// Se sale del programa
						continuar = false;
					}
		//si no es ningun valor 1, 2 ,3 sigue ejecucion y muestra mensaje despedida.
				} while (continuar);

				Mensaje_Fin();

		}
			}
	
