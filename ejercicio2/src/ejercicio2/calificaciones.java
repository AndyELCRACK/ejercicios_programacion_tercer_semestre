package ejercicio2;
import java.util.Scanner;
public class calificaciones {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0,porcentaje,calificacion;
		for(int nota=1;nota<51;nota++) 
		{  
			@SuppressWarnings("resource")
		    Scanner leer=new Scanner(System.in); 
			System.out.println("INGRESE CALIFICACION DEL ESTUDIANTE "+nota+":"); 
			calificacion=leer.nextInt();
			if(calificacion<70)
			{
				cont=cont+1;	
			}
			} porcentaje=(cont*100)/50;
			System.out.println("PORCENTAJE DE REPROVADOS ES DEL : "+porcentaje+"%");
		} 
	}


