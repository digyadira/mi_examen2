package miclase2;

import java.util.Scanner;

public class examen2 {

	//Devuelve el valor de "arreglo" en la posicion "i"
	//2.5pts
	static int obtenerValor(int arreglo[],int i)
	{
		
		return 
				arreglo [i];
	}
	
	//Si el promedio de todos los valores de "notas" es mayor a 60, devuelve verdadero de lo contrario falso
	//2.5pts
	static boolean alumnoAprobo(int notas[])
	{
		 Scanner y = new Scanner (System.in); 
		   double alumnoaprobo[] []=new double [3][4];
		   for (int alum=0; alum<4;alum++)
		   {
			   System.out.print("alumno"+(alum+1));
			   for(int nota=0; nota<3; nota++)
			   {
				   System.out.print("ingrese la nota del alumno" + (nota+1)+": ");
				   alumnoaprobo[nota] [alum]=y.nextInt();   
			   }
		   }
		
	        System.out.println(" las notas del alumno : ");  
	      for (int nota = 0; nota<3; nota++)
	      
	    	  
		  System.out.println(alumnoaprobo);
		
	       int nota = 60;
	
			System.out.print("true");
			return false;
		}
	
	
	//Devuelve el valor de mi_arreglo en la posicion [x][y]
	//2.5pts
	static int obtenerValorBidi(int mi_arreglo[][], int x, int y)
	{
		return 
				mi_arreglo[x][y];
	}
	
	//Devuelve la cantidad de veces que "valor" existe en "arreglo"
	//2.5pts
	static int cuantosExisten(int arreglo[][], int valor)
	{
    int cuantoexisten = 0;
		
		for
			(int valoR = 0; valoR < arreglo.length; valoR++)
		{
			for
				(int i = 0; i < arreglo[i].length; i++)
			{
				if(arreglo[valoR][i] == valor)
		{
					cuantoexisten++;
				}
		}
	}
				return  cuantoexisten;
		}
	
	//Realizar la siguiente funcion recursiva
	//recursiva1(n) = recursiva1(n-1) - recursiva1(n-2)
	//Dados los siguientes caso base
	//recursiva1(0)=10
	//recursiva1(1)=20
	//2.5pts
	static int recursiva1(int n)
	{

		if (n==0)
			return 10;
		if (n==1)
			return 20;
		return recursiva1 (n-1) - recursiva1 (n-2);
		
	}
	
	
	//Realizar la siguiente funcion recursiva
	//recursiva2(n) = recursiva2(n-1) + recursiva2(n-2) * recursiva2(n-3)
	//Dados los siguientes caso base
	//recursiva2(0)=10
	//recursiva2(1)=20
	//recursiva2(2)=30
	//2.5pts
	static int recursiva2(int n)
	{
		if (n==0)
			return 1;
		if (n==1)
			return 2;
		if (n==2)
			return 3;
		return recursiva2 (n-1) + recursiva2 (n-2) * recursiva2 (n-3) ;
	}
	
	
	public static void main(String args[])
	{
		for (int i =0; i<3; i++)
		{
			System.out.println(recursiva2(i));
		
	}
}
}
// GRACIAS POR HABERME IMPARTIDO LA CLASE UTD EA SIDO IUN EXLENTE LENTE INGENIERO APRENDI MUCHO MUESTO DE UTD, GRACIAS ESPERO LLEVAR PROGRA DOS CON UTD.
