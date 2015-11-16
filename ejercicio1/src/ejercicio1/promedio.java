package ejercicio1;
import java.util.Scanner; 
public class promedio {
	public static void main(String[] args) 
		{ 
		@SuppressWarnings("resource")
	    Scanner leer=new Scanner(System.in); 
		float promedio=0.0f,suma=0.0f,notas=0.0f; 
		int ingreso;
		System.out.println("CUANTAS NOTAS VA A INGRESAR "); 
	    ingreso=leer.nextInt();
	    ingreso=ingreso +1;
		for(int nota=1;nota<ingreso;nota++) 
		{ 
			System.out.println("INGRESE NOTA DEL ESTUDIANTE "+nota+":"); 
		    notas=leer.nextFloat();
		    suma=suma+notas;
		} 
		ingreso=ingreso-1;
		promedio=suma/ingreso; 
		System.out.println("TOTAL DE NOTAS : "+suma); 
		System.out.println("EL PROMEDIO GENERAL ES : "+promedio); 
		} 
	}