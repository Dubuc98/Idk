package zoo;
import java.util.Scanner;

import java.util.ArrayList;
public class main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CrearV Prueba = new CrearV();
		
		Terrestre A1 = new Terrestre(190.0,(float) 1.2, "Leon", "Marron");
		Terrestre A2 = new Terrestre(300.0, (float)1.5, "Oso Pardo", "Marron");
		Terrestre A3 = new Terrestre(730.0, (float)4.2, "Jirafa", "Amarillo");
		Terrestre A4 = new Terrestre(300.0, (float)1.3, "Cebra", "Blanco y Negro");
		Terrestre A5 = new Terrestre(200.0, (float)1.1, "Tigre", "Naranja y Negro");
		Volador A6 = new Volador(3.1, (float) 1.3, "Flamenco", "Rosado");
		Volador A7 = new Volador(3.2,(float) 0.7, "Búho", "Gris");
		Volador A8 = new Volador(4.3,(float) 0.8, "Águila", "Blanco y Negro");
		Volador A9 = new Volador(1.1, (float)0.6, "Halcon", "Azul");
		Volador A10 = new Volador(0.7, (float)0.5, "Loro", "Variado");
		
		Prueba.AnimalesT.add(A1);
		Prueba.AnimalesT.add(A2);
		Prueba.AnimalesT.add(A3);
		Prueba.AnimalesT.add(A4);
		Prueba.AnimalesT.add(A5);
		
		Prueba.AnimalesV.add(A6);
		Prueba.AnimalesV.add(A7);
		Prueba.AnimalesV.add(A8);
		Prueba.AnimalesV.add(A9);
		Prueba.AnimalesV.add(A10);
	
		Prueba.Animales.add(A1);
		Prueba.Animales.add(A2);
		Prueba.Animales.add(A3);
		Prueba.Animales.add(A4);
		Prueba.Animales.add(A5);
		Prueba.Animales.add(A6);
		Prueba.Animales.add(A7);
		Prueba.Animales.add(A8);
		Prueba.Animales.add(A9);
		Prueba.Animales.add(A10);
		
		boolean Salir = false;
		int a;
		while(!Salir) {
		System.out.println("Bienvenido al zoologico seleccione una opcion de las siguientes:");
		System.out.println("1.Ingresar un nuevo animal Terrestre");
		System.out.println("2.Ingresar un nuevo animal Volador");
		System.out.println("3.Ver todos los animales");
		System.out.println("4.Ver animales voladores");
		System.out.println("5.Ver animales terrestres");
		
		System.out.println("6.Salir");
		a = sc.nextInt();
		System.out.println("Su eleccion: "+a);
		switch(a) {
		case 1:
			int m;
			do {
				int b=0;
				b++;
				Terrestre B[] = new Terrestre[10];
				for (int i = 0; i < B.length; i++) {
		            B[i] = new Terrestre();
		        }
				System.out.println("Ingrese el nombre del animal:");
				B[b].setname(sc.next());
				System.out.println("Ingrese la altura en mts:");
				B[b].setHeight(sc.nextFloat());
				System.out.println("Ingrese peso en kg:");
				B[b].setWeight(sc.nextDouble());
				System.out.println("Ingrese el color del animal:");
				B[b].setcolor(sc.next());
				System.out.println("Desea agregar otro animal?(0=Si,1=No):");
				m = sc.nextInt();
				Prueba.Animales.add(B[b]);
				Prueba.AnimalesT.add(B[b]);
				}while(m==0);
			break;
		case 2:
			int n;
			do {
				int c=0;
				c++;
				Volador C[] = new Volador[10];
				for (int i = 0; i < C.length; i++) {
		            C[i] = new Volador();
		        }
				System.out.println("Ingrese el nombre del animal:");
				C[c].setname(sc.next());
				System.out.println("Ingrese la altura en mts:");
				C[c].setHeight(sc.nextFloat());
				System.out.println("Ingrese peso en kg:");
				C[c].setWeight(sc.nextDouble());
				System.out.println("Ingrese el color del animal:");
				C[c].setcolor(sc.next());
				System.out.println("Desea agregar otro animal?(0=Si,1=No):");
				n = sc.nextInt();
				Prueba.Animales.add(C[c]);
				Prueba.AnimalesV.add(C[c]);
				}while(n==0);
			break;
		case 3:
			System.out.println("El zoologico tiene los siguientes Animales:\n" + Prueba.Animales);
			break;
		case 4:
			System.out.println("El zoologico tiene los siguientes Animales:\n" + Prueba.AnimalesV);
			break;
		case 5:
			System.out.println("El zoologico tiene los siguientes Animales:\n" + Prueba.AnimalesT);
			break;
		case 6:
			System.out.println();
			Salir=true;
			break;
		default:
			System.out.println("Ingrese un numero entre el 1 y el 6");
		}
		}	
	}

}
