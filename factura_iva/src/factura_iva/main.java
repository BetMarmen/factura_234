package factura_iva;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner (System.in);
		System.out.println("Ingrese el nombre del producto:");
		String name = scan.nextLine();
		System.out.println("Ingrese el precio del producto:");
		double pre = scan.nextDouble();
		System.out.println("Ingrese la cantidad del producto:");
		int can = scan.nextInt();
		producto p= new producto(name,pre);
		factura fac = new factura(p,can);
		fac.mostrar_factura();
	}

}
