package clases;

public class Repartidor extends Empleado {
	
	private String zona;
	private String matriculaVehiculo;
	private int kminicioMes;
	private double kmFinales;
	private double dietas;
	
	
	// constructor sin par�metros
	public Repartidor() {
		super();
	}
	
	// constructor con par�metros
	public Repartidor(String nombre, String apellido, int edad, double salario, int antiguedadAnios, String zona,
			String matriculaVehiculo) {
		super(nombre, apellido, edad, salario, antiguedadAnios);
		this.zona = zona;
		this.matriculaVehiculo = matriculaVehiculo;
		this.kminicioMes = 0;
		this.kmFinales = 0;
		this.dietas = 0;
	}
	
	// copia de constructor
	public Repartidor(Repartidor r) {
		this.zona = r.zona;
		this.matriculaVehiculo = r.matriculaVehiculo;
		this.kminicioMes = 0;
		this.kmFinales = 0;
		this.dietas = 0;
		
	}
	
	// toString
	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", matriculaVehiculo=" + matriculaVehiculo + ", kminicioMes=" + kminicioMes
				+ ", kmFinales=" + kmFinales + ", dietas=" + dietas + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", salario=" + salario + ", antiguedadAnios=" + antiguedadAnios + "]";
	}
	
	// getters y setters
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}

	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}
	
	/**
	 * el m�todo a�adirDieta que se le pasa el importe de la dieta y 
		se sumar� al c�mputo total, aunque la empresa s�lo paga hasta un 
		m�ximo de 25 euros por dieta, el resto lo debe asumir el empleado.
	 * @param impDieta
	 * @return
	 */
	
	public void aniadirDieta(double impDieta) {
				
		if(impDieta<=25.0) {
			this.dietas = this.dietas + impDieta;
		}else {
			
			this.dietas = this.dietas + 25;
		}
	}
	
	/**
	 *  A�ade el m�todo actualizaKms que le pasa el nuevo valor del 
		cuentakil�metros de la furgoneta, s�lo deber� actualizarse si el dato 
		actualizado es superior al anterior almacenado
	 */
	
	public void actualizaKilometraje(double vKilometraje) {
		
		if(vKilometraje>0) {
			
			this.kmFinales = this.kminicioMes + vKilometraje;
		}else {
			System.out.println("El CuentaKilometros no actualizado");
		}
		
	}
	/**
	 * calcular el salario del Repartidor, que se calcula como su salario base + los gastos que ha 
		tenido en dietas y m�s 0.45*km por lo km que ha hecho en el mes. no tiene trienios.
	 */
	
	@Override
	public double calculaSalario() {
		
		
		
		double salRepartidor = this.salario + ;
		
		
	}

}
