package clases;

public class Repartidor extends Empleado {
	
	private String zona;
	private String matriculaVehiculo;
	private double kminicioMes;
	private double kmFinales;
	private double dietas;
	
	
	// constructor sin parámetros
	public Repartidor() {
		super();
		
		this.zona = "";
		this.matriculaVehiculo = "";
	}
	
	// constructor con parámetros
	public Repartidor(String nombre, String apellido, int edad, double salario, int antiguedadAnios, String zona,
			String matriculaVehiculo, double kminioMes) {
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
		this.kminicioMes = r.kminicioMes;
		this.kmFinales = r.kmFinales;
		this.dietas = r.dietas;
		
	}
	
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
	 * el método añadirDieta que se le pasa el importe de la dieta y 
		se sumará al cómputo total, aunque la empresa sólo paga hasta un 
		máximo de 25 euros por dieta, el resto lo debe asumir el empleado.
	 * @param impDieta
	 * @return
	 */
	
	public void aniadirDieta(double impDieta) {
				
		if(impDieta>25) {
			this.dietas = this.dietas + 25;
		}else {
			
			this.dietas = this.dietas + impDieta;
		}
	}
	
	/**
	 *  Añade el método actualizaKms que le pasa el nuevo valor del 
		cuentakilómetros de la furgoneta, sólo deberá actualizarse si el dato 
		actualizado es superior al anterior almacenado
	 */
	
	public void actualizaKilometraje(double vKilometraje) {
		
		if(vKilometraje>kmFinales) {
			
			this.kmFinales=vKilometraje;
		
		}
		
	}
	// poner a 0 las dietas y los km al mes.
	
	public void reiniciarDietas() {
		this.dietas = 0;
	}
	
	public void reiniciarKm() {
		this.kminicioMes = this.kmFinales;
	}
	
	/**
	 * calcular el salario del Repartidor, que se calcula como su salario base + los gastos que ha 
		tenido en dietas y más 0.45*km por lo km que ha hecho en el mes. no tiene trienios.
		
		hay que sobreescribir totallmenta
	 */
	
	@Override
	public double calculaSalario() {
		
		double salRepartidor = this.salario + this.dietas+ 0.45 * (this.kmFinales - this.kminicioMes);
		
		return salRepartidor;
		
		// return this.salario + this.dietas+ 0.45 * (this.kmFinales - this.kminicioMes);
		
	}

}
