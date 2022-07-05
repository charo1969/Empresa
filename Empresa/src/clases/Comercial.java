package clases;

public class Comercial extends Empleado {
	
	private int nVentas;
	private static double impVenta = 45.90;
	
	
	public Comercial() {
		super();
		
		this.nVentas = 0;
	
	}


	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedadAnios, int nVentas) {
		super(nombre, apellido, edad, salario, antiguedadAnios);
		this.nVentas = nVentas;
	}
	
	public void contabilizaVentas(int cVentasD) {
	
		if(nVentas<=7) {
				
			nVentas=nVentas+cVentasD; // suma el numero de ventas con las ventas que ha introducido
			
			if (nVentas >25) {
				nVentas=25; //si se pasa de venta la ponemos directamente a 25 que es el tope.
			}
		}
		
	}
	
	public void reseteraContadorVentas() {
		
		nVentas = 0;
	}
	
	/**
	 * voy a sobrecargar el metodo de la clase Empleado y añadirle la variable
	 * 	salarioTotal para que me calcule la comisión .llamado al metodo con super y sumandole al salarioTotal
	 * 	con el nVentas por el atributo impVenta que es static Y devolver salarioTotal.
	 */
	@Override
	public double calculaSalario() {
		
		double salarioTotal = super.calculaSalario();
		salarioTotal=salarioTotal+nVentas*impVenta;
		return salarioTotal;
	}
	
	
	

	
	
	
	
	

}
