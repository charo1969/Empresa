/**
 * 
 */
package clases;

/**
 * 
 * @author charo
 *
 */
public class Empleado {

	// atributos con protected
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antiguedadAnios;
	
	public static final double factorTrienio1 = 0.05;
	public static final double factorTrienio2 = 0.08;

	// constructor sin parámetros por defecto
	public Empleado() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.antiguedadAnios = 0;
	}

	// constructor con parámetros
	public Empleado(String nombre, String apellido, int edad, double salario, int antiguedadAnios) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedadAnios = antiguedadAnios;
	}

	/**
	 * constructor de copia que realiz una copia del empleado pasado como parámetro
	 * 
	 * @param e empleado a copia.
	 */
	public Empleado(Empleado e) {
		this.nombre = e.nombre;
		this.apellido = e.apellido;
		this.edad = e.edad;
		this.salario = e.salario;
		this.antiguedadAnios = e.antiguedadAnios;
	}

	// getters y setters generamos automaticamente
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAntiguedadAnios() {
		return antiguedadAnios;
	}

	public void setAntiguedadAnios(int antiguedadAnios) {
		this.antiguedadAnios = antiguedadAnios;
	}

	// toString sobreescribir el método con el modificador @Override
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedadAnios=" + antiguedadAnios + "]";
	}

	/**
	 * Se calcula de la siguiente manera: cada 3 años se le añade un 5% más de
	 * salario, pero si lleva más de 5 trienios se le suma por cada trienio un 8%
	 * 
	 * @return importeTrienios;
	 */

	public double calculaTrienios() {
		
		// saber cuantos trienios tiene el objeto
		int trienios = this.antiguedadAnios / 3;

		double importeTrienios = 0;// acumulador para calcular el total de trienios
		double salNuevo = this.salario;// calcular el salario a traves del que va teniendo acumulado en esta variable.

		/**
		 * hacemos una condicion dependiendo de los trienios que se tenga con una constante factorTrienio1 y otra factorTrienio2.
		 */
		for (int i = 1; i <= trienios; i++) {
			salNuevo = salario + importeTrienios;

			if (i <= 5) {

				importeTrienios = importeTrienios + salNuevo * factorTrienio1;
			} else {
				importeTrienios = importeTrienios + salNuevo * factorTrienio2;
			}
			
		}
		return importeTrienios;

	}
	
	/**
	 * Método que calcula el salario del empleado como la suma de su salario
	 * más el importe que se lleva por los trienios de antiguedad
	 * 
	 * @return double con la cantidad del cantiSalario.
	 */

	public double calculaSalario() {

		double cantiSalario = this.salario + calculaTrienios();

		return cantiSalario;
		
		/* o de esta forma:
		 * 
		 * return this.salario + this.calculaTrienios();
		 */
		

	}

}
