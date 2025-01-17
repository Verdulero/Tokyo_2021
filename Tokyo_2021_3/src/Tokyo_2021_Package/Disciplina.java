package Tokyo_2021_Package;

import java.util.Arrays;

public class Disciplina {
	private int id;//id_disciplina (bbdd-->deportista en disciplina) y (bbdd-->disciplina) 
	private String nombre;//nombere (bbdd-->disciplina)
	private int deportista;//id_deportista (bbdd-->deportista en disciplina)
	
	public Disciplina() {}
	public Disciplina(int id, String nombre, int deportista) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.deportista = deportista;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDeportista() {
		return deportista;
	}
	public void setDeportista(int deportista) {
		this.deportista = deportista;
	}
	
	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nombre=" + nombre + ", deportista=" + deportista + "]";
	}
	
	
	
	
	

}
