package principal1;

import clases.Comercial;
import clases.Empleado;
import clases.Repartidor;

public class principal {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado();
		System.out.println("El empleado creado con el constructor sin parámetros es "+emp);
		
		/**
		 * probando y creando los objetos y ver sus métodos ahora de  la clase empleado
		 */
		Empleado e1 = new Empleado("Charo", "Carrasco", 33 , 1000 , 3);
		System.out.println("El empleado Charo es "+ e1);
		
		System.out.println("El sueldo de Charo es "+e1.calculaSalario());
	
		System.out.println("los trienios del empleado son "+e1.calculaTrienios());
		e1.setAntiguedadAnios(7);
		System.out.println("los trienios del empleado son "+e1.calculaTrienios());
		System.out.println("El sueldo de Charo es "+e1.calculaSalario());
		
		System.out.println("actualizando la antiguedad a 22 años");
		e1.setAntiguedadAnios(22);
		System.out.println("El sueldo de Charo es "+e1.calculaSalario());
		System.out.printf("El sueldo de Charo es: %.2f\n ", e1.calculaSalario());
		
		
		/**
		 * probando y creando objetos de la clase Comercial.
		 */
		
		Comercial c2 = new Comercial("Antonio", "Castro", 43 , 1400 , 2001 , 7);
		System.out.println("El comercial creado es\n " + c2);
		System.out.println("El salario del comercial es\n "+c2.calculaSalario());
		
		System.out.printf("El salario de Antonio es %.2f\n", c2.calculaSalario());
		
		System.out.println("Antonio tiene 3 ventas,...");
		c2.contabilizaVentas(3);
		System.out.println(c2);
		
		System.out.println("Antonio tiene 9 ventas,...");
		c2.contabilizaVentas(9);
		System.out.println(c2);
		
		System.out.println("Antonio tiene 19 ventas,...");
		c2.contabilizaVentas(19);
		System.out.println(c2);
		
		System.out.println("Antonio tiene 19 ventas,...");
		c2.contabilizaVentas(19);
		System.out.println(c2);
		
		System.out.printf("El salario de Antonio es %.2f\n", c2.calculaSalario());
		
		c2.reseteraContadorVentas();
		
		System.out.println("Empieza un nuevo mes. a Vender !!");
		System.out.println(c2);
		
		/**
		 * probar y calcular los objetos de la clase Repartidor.
		 */
		Repartidor r1 = new Repartidor("Luis","Garcia",55,1200,2010,"Zona1","1234567ACD");
		System.out.println(r1);
		
		
		
		
		
		
		
		
		
		

	}

}
