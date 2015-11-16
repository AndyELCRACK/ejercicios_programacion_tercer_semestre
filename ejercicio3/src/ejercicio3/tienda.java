package ejercicio3;
import java.util.Scanner;
public class tienda {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner leer =new Scanner(System.in); 
	    float valor,des,total,total_dia=0;
	    int bolita,seguir;
		do{
		System.out.println("INGRESE IMPORTE A PAGAR "); 
		valor=leer.nextFloat();
		System.out.println("ELIJA COLOR DE LA BOLITA ");
		System.out.println("1)ROJA ");
		System.out.println("2)AMARILLA ");
		System.out.println("3)BLANCA"); 
		bolita=leer.nextInt();
		if(bolita==1)
			{des=(valor*40)/100;
			  total=valor-des;
			  total_dia=total_dia+total;
			  System.out.println("SU VALOR A PAGAR CON DESCUENTO ES : "+total);	
			}
		if(bolita==2)
			{des=(valor*25)/100;
			  total=valor-des;
			  total_dia=total_dia+total;
			  System.out.println("SU VALOR A PAGAR CON DESCUENTO ES : "+total);	
			}
		if(bolita==3)
		    {
			  System.out.println("SU VALOR A PAGAR CON DESCUENTO ES : "+valor);	
			  total_dia=total_dia+valor;
		    }
		  System.out.println("DESEA SEGUIR INGRESANDO CLIENTES ");	
		  System.out.println("1)SI ");
		  System.out.println("2)NO ");
		 seguir=leer.nextInt();
		}while(seguir==1);
		System.out.println("TOTAL DE IMPORTES DEL DIA RECAUDADO: "+ total_dia);
		System.out.println("GRACIAS POR USAR EL SISTEMA ");		
	}
}
