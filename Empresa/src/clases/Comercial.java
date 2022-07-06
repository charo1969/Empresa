package clases;

public class Comercial extends Empleado {

	private int nVentas;
	private static double impVenta = 45.90;

	
	/**
	 * constructor vacio automático
	 */
	public Comercial() {
		super();
		this.nVentas = 0;

	}
	
	/**
	 * constructor con parámetros
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param salario
	 * @param antiguedadAnios
	 * @param nVentas
	 */

	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedadAnios, int nVentas) {
		super(nombre, apellido, edad, salario, antiguedadAnios);
		this.nVentas = 0;
	}
	
	/**
	 * constructor copia con herencia de la clase empleado y el especifico de Comercial
	 * @param c
	 */
	public Comercial(Comercial c) {
		super(c);
		this.nVentas = c.nVentas;
	}
	
	/**
	 * toString
	 * @return
	 */
	@Override
	public String toString() {
		return "Comercial [nVentas=" + nVentas + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", salario=" + salario + ", antiguedadAnios=" + antiguedadAnios + ", getnVentas()=" + getnVentas()
				+ "]";
	}
	

	// setters y getters

	public int getnVentas() {
		return nVentas;
	}


	/**
	 * Métodos especificos de comercial . Es un setters especifico no devuelve nada.
	 * @param cVentasD
	 */
	public void contabilizaVentas(int cVentasD) {

		if (cVentasD > 7) {
			cVentasD = 7;
		}
		this.nVentas = this.nVentas + cVentasD;
		if (this.nVentas>25) {
			this.nVentas = 25;
		}
		
		// this.nVentas = Math.min(this.nVentas + cVentasD, 25); Mas corto el método.
		
		// this.nVentas = Math.min(this.nVentas + Math.min(cVentasD, 7), 25); Se reduce a una sola línea el metodo contablizaVentas().
	}
	
	/**
	 * Ponemos el contador a cero.
	 * 
	 */
	public void reseteraContadorVentas() {

		this.nVentas = 0;
	}
	
	/**
	 * voy a sobrecargar el metodo de la clase Empleado y añadirle la variable
	 * salarioTotal para que me calcule la comisión .llamado al metodo con super y
	 * sumandole al salarioTotal con el nVentas por el atributo impVenta que es
	 * static Y devolver salarioTotal.
	 */
	@Override
	public double calculaSalario() {
		
		return super.calculaSalario() + this.nVentas* this.impVenta;
	}

		/*double salarioTotal = super.calculaSalario();
		salarioTotal = salarioTotal + nVentas * impVenta;
		return salarioTotal;*/
		

}
