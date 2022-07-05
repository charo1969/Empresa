/**
 * 
 */
package clases;

/**
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
	
	// constructor sin par�metros
	public Empleado() {
		
	}
	
	// constructor con par�metros
	public Empleado(String nombre, String apellido, int edad, double salario, int antiguedadAnios) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedadAnios = antiguedadAnios;
	}
	
	// constructor de copia
	public Empleado(Empleado e) {
		this.nombre = e.nombre;
		this.apellido = e.apellido;
		this.edad = e.edad;
		this.salario = e.salario;
		this.antiguedadAnios = e.antiguedadAnios;
	}
	
	//getters y setters
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
	
	// toString
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedadAnios=" + antiguedadAnios + "]";
	}
	
	/**
	 * Se calcula de la siguiente manera: cada 3 a�os 
		se le a�ade un 5% m�s de salario, pero si lleva m�s de 5 trienios se 
			le suma por cada trienio un 8%
	 * @return
	 */
	public double calculaTrienios() {
		
		int trienios = this.antiguedadAnios /3;
		
		double importeTrienios = 0;//acumulador 
		double sal =this.salario;
		
		// 
		for(int i=1;i<=trienios;i++) {
			sal =salario + importeTrienios;
			
			if(i<=5) {
				
				importeTrienios = importeTrienios + sal*0.05;
			}else {
				importeTrienios = importeTrienios + sal*0.08;
			}
			
		}
		return importeTrienios;
	
	
		
	}
	
	public double calculaSalario() {
		
		double cantiSalario = this.salario + calculaTrienios();
		
		return cantiSalario;
		
	}
	
	
	
	
	
	

}
