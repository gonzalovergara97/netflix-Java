package Netflix;

public class SuperClaseNetlix {

	
	//**************************ATRIBUTOS********************************

	 String titulo, genero, creador;
	 double duracion;
	 boolean visto;
	 double tiempoVisto;
	
    
	public SuperClaseNetlix() {
		// TODO Auto-generated constructor stub
	}

	
	//**************************GETTERS AND SETTERS*****************************************
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
}
