package Tokyo_2021_Package;

public class Pais {
	private String nombre;

	public Pais() {
		
	}
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "pais [nombre=" + nombre + "]";
	}
	
	

}
