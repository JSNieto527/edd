package arreglos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GenerarArchivosVentas3 {
	private static String nombreArchivo;
	private static short longitudArchivo;
	private static short[] aleatoriosSolicitados;
	private static boolean controlEjecucion = true;
	private static byte decisionUsuario=0;	
	private static short[] datosAlmacenadosArchivo;
	private static String sufijo;
	
	public static void menuPrincipal() {
		System.out.println("--------Menu Principal---------");
		while(controlEjecucion) {
			System.out.println("1. Generar Archivos Venta y Aleatorios");
			System.out.println("2. Abrir y Consolidar un Archivo de Ventas");
			System.out.println("3. Por hacer");				
			System.out.println("Digite el numero que representa su eleccion: ");
			Scanner sc = new Scanner(System.in);
			decisionUsuario = sc.nextByte();
			switch(decisionUsuario) {
				case 1:
					solicitarDatosArchivos(); 
					generarAleatorios();
					generarArchivosVentas(); 					
					decisionUsuario = 0;
					break;
				case 2:
					leerArchivosVentas(); 
					decisionUsuario = 0;
					break;					
				case 3:
					estadisticasConsolidacion();
					decisionUsuario = 0;
					break;				
				default:
					System.out.println("Digite un numero entre 1 y 3");
					break;
			}//fin de switch
			System.out.println("Si desea salir presione 0, para continuar presione 1");
			decisionUsuario = sc.nextByte();
			if(decisionUsuario == 0) {
				System.out.println("Programa Finalizado");
				sc.close();
				controlEjecucion = false;
			}//fin de if
		}//fin de while		
	}//fin de menu principal
	
	public static void solicitarDatosArchivos() {
		System.out.println("Rutina para Generacion de Archivos con Nums Aleatorios");
		System.out.println("Digite la region del archivo a generar:");
		Scanner usuarioDecision = new Scanner(System.in);
		nombreArchivo = usuarioDecision.nextLine();
		System.out.println("Digite la cantidad de aleatorios para el archivo:");		
		longitudArchivo = usuarioDecision.nextShort();		
		usuarioDecision.close();
	}
	
	public static void generarAleatorios() {
		NumAleatSeguros4.secuenciaNumeros(longitudArchivo);
		aleatoriosSolicitados = NumAleatSeguros4.ordenarSecuenciaNumeros();		
		}
	
	public static void generarArchivosVentas() {
		if(nombreArchivo=="occidente") {
			sufijo = "oc";
		}else if(nombreArchivo=="oriente") {
			sufijo = "ot";
		}else {
			sufijo = "ce";
		}
		try {
			File archivo = new File(nombreArchivo);			
			FileWriter escribir = new FileWriter(archivo,true);
			for(int i=0;i<aleatoriosSolicitados.length;i++) {
				escribir.write(sufijo+(i+1)+","+aleatoriosSolicitados[i]+"\n");
			}			
			escribir.close();
			System.out.println("Datos escritos satisfactoriamente");
		}catch(Exception e) {
			System.out.println("Error al escribir el archivo");
		}					
	}
	
	public static void leerArchivosVentas() {
		int i=0;
		String cadena;
		int ventasRegional=0;		
		long cantidadLineasArchivo=0;
		System.out.println("Leer contenido de archivo");
		System.out.println("=========================");
		System.out.println("Digite el nombre del archivo que desea abrir: ");
		Scanner usuarioDecision = new Scanner(System.in);
		nombreArchivo = usuarioDecision.nextLine();		
		try {
			//rutina para contar las lineas del archivo, compatible con J2SE 1.8
			Path ruta = Paths.get(nombreArchivo);
			cantidadLineasArchivo = Files.lines(ruta).count();
			datosAlmacenadosArchivo = new short[(int) (cantidadLineasArchivo)];	
			//////
			FileReader archivodatos = new FileReader(nombreArchivo);
			BufferedReader buferDatos = new BufferedReader(archivodatos);
			while((cadena = buferDatos.readLine())!=null) {
				datosAlmacenadosArchivo[i] = Short.valueOf(cadena.substring(cadena.indexOf(",")+1, cadena.length()));
				ventasRegional += Integer.parseInt(cadena.substring(cadena.indexOf(",")+1, cadena.length()));
				i++;
			}
			usuarioDecision.close();
			buferDatos.close();			
			System.out.println("Datos leidos exitosamente");			
			System.out.println("Estadisticas de Informacion de Ventas de la Regional: "+nombreArchivo);
			System.out.println("Cantidad de Vendedores reportados: "+datosAlmacenadosArchivo.length);
			System.out.println("Monto total de Ventas: "+ventasRegional);
			System.out.println("Cinco Mayores Ventas: ");
			for(i = (datosAlmacenadosArchivo.length-1);i>=(datosAlmacenadosArchivo.length-5);i--) {
				System.out.println(datosAlmacenadosArchivo[i]);
			}
		}catch(FileNotFoundException fnfe) {
			System.out.println("Archivo no encontrado");
		}		
		catch(IOException ioe) {
			System.out.println("Error de entrada y salida");
		}		
		//rutina de consolidacion de datos
		try {
			if(nombreArchivo=="occidente") {
				sufijo = "oc";
			}else if(nombreArchivo=="oriente") {
				sufijo = "ot";
			}else {
				sufijo = "ce";
			}
			
			File archivo = new File("vtaspais");			
			FileWriter escribir = new FileWriter(archivo,true);
			for(i=0;i<datosAlmacenadosArchivo.length;i++) {
				escribir.write(sufijo+(i+1)+","+datosAlmacenadosArchivo[i]+"\n");
			}			
			escribir.close();
			System.out.println("Consolidacion realizada satisfactoriamente");
		}catch(Exception e) {
			System.out.println("Error al escribir el archivo de consolidacion");
		}										
	}//fin de leerConsolidar
	
	public static void estadisticasConsolidacion() {
		
	}
	public static void main(String args[]) {
		menuPrincipal();

	}
}
