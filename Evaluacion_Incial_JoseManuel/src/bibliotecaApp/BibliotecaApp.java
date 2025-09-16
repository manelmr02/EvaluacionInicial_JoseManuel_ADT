package bibliotecaApp;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {
	
	public static ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
	public static Scanner teclado=new Scanner(System.in);	
	
	public static void main(String[] args) {
		int opcion;
		do {
			System.out.print("BIENVENIDO AL MENU, SELECCIONA UNA OPCION\n"
				+ "1.- AÑADIR LIBRO\n"
				+ "2.- AÑADIR REVISTA\n"
				+ "3.- MOSTRAR LISTA DE PUBLICACIONES\n"
				+ "4.- BUSCAR PUBLICACION\n"
				+ "5.- CONTAR CUANTAS PUBLICACIONES HAY POR AÑO\n"
				+ "6.- GUARDAR PUBLICACIONES EN FICHERO\n"
				+ "7.- CARGAR PUBLICACIONES DESDE FICHERO\n"
				+ "8.- SALIR\n");
			opcion=teclado.nextInt();
			teclado.nextLine();
			switch(opcion) {
				case 1:
					anadirLibro();
					break;
				case 2:
					anadirRevista();
					break;
				case 3:
					mostrarLista();
					break;
				case 4:
					buscarPorTitulo();
					break;
				case 5:
					contarPublicacionesAnio();
					break;
				case 6:
					System.out.println("No implementado actualmente.");
					break;
				case 7:
					System.out.println("No implementado actualmente.");
					break;
				case 8:
					System.out.println("SALIENDO...");
					break;
				default:
					System.out.println("Opción inválida");
			}
		}while(opcion!=8);	
	}
	
	public static void anadirLibro() {
		if(publicaciones.size()>=100) {
			System.out.println("No se pueden añadir más publicaciones.");
			return;
		}
		System.out.println("Introduce el titulo:");
		String titulo=teclado.nextLine();
		System.out.println("Introduce el año de publicacion:");
		int anioPublicacion=teclado.nextInt();
		teclado.nextLine();
		publicaciones.add(new Libro(titulo,anioPublicacion));
		System.out.println("\n--- Pulsa ENTER para volver al menú ---");
		teclado.nextLine();
	}
	
	public static void anadirRevista() {
		if(publicaciones.size()>=100) {
			System.out.println("No se pueden añadir más publicaciones.");
			return;
		}
		System.out.println("Introduce el titulo:");
		String titulo=teclado.nextLine();
		System.out.println("Introduce el año de publicacion:");
		int anioPublicacion=teclado.nextInt();
		teclado.nextLine();
		publicaciones.add(new Revista(titulo,anioPublicacion));
		System.out.println("\n--- Pulsa ENTER para volver al menú ---");
		teclado.nextLine();
	}
	
	public static void mostrarLista() {
		for (Publicacion p : publicaciones) {
			System.out.println(p);
		}
		System.out.println("\n--- Pulsa ENTER para volver al menú ---");
		teclado.nextLine();
	}
	
	public static void buscarPorTitulo() {
		System.out.println("Introduce el nombre de la publicacion que deseas buscar:");
		String fragmentoTitulo=teclado.nextLine().toLowerCase(); // lo ponemos en minusculas para realizar la busqueda mas comodamente
		for(Publicacion p : publicaciones) {
			if(p.getTitulo().toLowerCase().contains(fragmentoTitulo)) {
				System.out.println(p);
			}
		}
		System.out.println("\n--- Pulsa ENTER para volver al menú ---");
		teclado.nextLine();
	}
	
	public static void contarPublicacionesAnio() {
		System.out.println("Introduce el año de búsqueda:");
		int anioBusqueda=teclado.nextInt();
		int contadorPublicaciones=0;
		ArrayList<Publicacion> publicacionesAnioBusqueda = new ArrayList<Publicacion>();
		for(int i=0;i<publicaciones.size();i++) {
			if(publicaciones.get(i).getAnioPublicacion()==anioBusqueda){
				publicacionesAnioBusqueda.add(publicaciones.get(i));
				contadorPublicaciones++;
			}
		}
		System.out.println("El numero de publicaciones que hubo en el año "+anioBusqueda+" es de: "+contadorPublicaciones+".");
		System.out.println("Las publicaciones son:");
		for(Publicacion p: publicacionesAnioBusqueda) {
			System.out.println(p);
		}
		System.out.println("\n--- Pulsa ENTER para volver al menú ---");
		teclado.nextLine();
	}
	
	
}
