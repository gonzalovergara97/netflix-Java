package Netflix;

public class Pelicula extends SuperClaseNetlix implements IVisualizable
{

	//**************************ATRIBUTOS********************************
	private int a�o;
	
	//**************************METODOS CONSTRUCTOR************************************
	//CONSTRUCTOR POR DEFECTO
	public Pelicula()
	{
		this.titulo = "";
		this.genero = "";
		this.creador = "";
		this.a�o = 0;
		this.duracion = 0.0;
		this.visto = false;
	}
	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Pelicula(String titulo, String genero, String creador, int a�o, double duracion, boolean visto) 
	{
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.a�o = a�o;
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
	public Pelicula(String titulo, String genero, String creador, int a�o, double duracion) 
	{
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.a�o = a�o;
		this.duracion = duracion;
	}

	
	//**************************GETTERS AND SETTERS*****************************************
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	
	
	@Override
	public String toString() {
		return "Pelicula [ titulo=" + titulo + ", a�o=" + a�o + ", genero=" + genero + ", creador=" + creador
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
