package Netflix;

public class Serie extends SuperClaseNetlix implements IVisualizable
{

	//***********************ATRIBUTOS********************************
	private int nroTemporadas;
	
	//***********************METODOS CONTRUCTORES********************************
	//CONTRUCTOR POR DEFECTO
	public Serie()
	{
		this.titulo = "";
		this.nroTemporadas = 1;
		this.visto = false;
		this.genero = "";
		this.creador = "";
		this.duracion = 0.0;
	}
	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Serie(String titulo,int nroTemporadas, boolean visto, String genero, String creador,  double duracion) 
	{
		this.titulo = titulo;
		this.nroTemporadas = nroTemporadas;
		this.visto = visto;
		this.genero = genero;
		this.creador = creador;
		this.duracion = 0.0;
	}


	//CONSTRUCTOR CON ATRIBUTOS TITULO Y CREADOR
	public Serie(String titulo, String creador) 
	{
		this.titulo = titulo;
		this.creador = creador;
	}
	
	//CONSTRUCTOR SIN --VISTO
	public Serie(String titulo,int nroTemporadas, String genero, String creador,  double duracion) 
	{
		this.titulo = titulo;
		this.nroTemporadas = nroTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.duracion = 0.0;
	}
	
	//******************GETTERS AND SETTERS*****************************************

	public int getNroTemporadas() {
		return nroTemporadas;
	}


	public void setNroTemporadas(int nroTemporadas) {
		this.nroTemporadas = nroTemporadas;
	}

	@Override
	public String toString() {
		return "Serie [ titulo=" + titulo + ", genero=" + genero + ", creador="
				+ creador + ", nroTemporadas=" + nroTemporadas + ", duracion=" + duracion + ", visto=" + visto + "]";
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
