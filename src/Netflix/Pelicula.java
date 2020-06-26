package Netflix;

public class Pelicula extends SuperClaseNetlix implements IVisualizable
{

	//**************************ATRIBUTOS********************************
	private int año;
	
	//**************************METODOS CONSTRUCTOR************************************
	//CONSTRUCTOR POR DEFECTO
	public Pelicula()
	{
		this.titulo = "";
		this.genero = "";
		this.creador = "";
		this.año = 0;
		this.duracion = 0.0;
		this.visto = false;
	}
	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Pelicula(String titulo, String genero, String creador, int año, double duracion, boolean visto) 
	{
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.año = año;
		this.duracion = duracion;
		this.visto = visto;
	}

	//CONSTRUCTOR CON ATRIBUTOS TITULO Y CREADOR
	public Pelicula(String titulo, String creador) 
	{
		this.titulo = titulo;
		this.creador = creador;
	}

	//CONSTRUCTOR SIN --VISTO
	public Pelicula(String titulo, String genero, String creador, int año, double duracion) 
	{
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.año = año;
		this.duracion = duracion;
	}

	
	//**************************GETTERS AND SETTERS*****************************************
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	
	
	@Override
	public String toString() {
		return "Pelicula [ titulo=" + titulo + ", año=" + año + ", genero=" + genero + ", creador=" + creador
				+ ", duracion=" + duracion + ", visto=" + visto + "]";
	}

	//**************************METODOS DE LA INTERFACE*****************************************
	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.visto = true;
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.visto;
	}

	@Override
	public double tiempoVisto(double tiempo) {
		// TODO Auto-generated method stub
		tiempoVisto = tiempo;
		return this.tiempoVisto;
	}

}
