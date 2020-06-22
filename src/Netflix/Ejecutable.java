package Netflix;

public class Ejecutable {

	
	public Ejecutable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula[] peliculas = new Pelicula[5];
		Serie[] series = new Serie[5];
		
		
		//***********PELICULAS*************************************
		Pelicula pelicula1 = new Pelicula("peli 1", "GONZALO V");
		pelicula1.marcarVisto();
		pelicula1.tiempoVisto(50.00);
		Pelicula pelicula2 = new Pelicula("peli 2", "terror", "yo", 2015, 60.00);
		Pelicula pelicula3 = new Pelicula("peli 3", "humor", "juanito", 2010, 42.00);
		pelicula3.marcarVisto();
		pelicula3.tiempoVisto(35.00);
		Pelicula pelicula4 = new Pelicula("peli 4", "terror", "yo", 2020, 80.00);
		Pelicula pelicula5 = new Pelicula("peli 5", "velico", "joker", 1997, 111.21, true);
		
		System.out.println("***************************LISTA DE TODAS LAS PELICULAS***************************** ");
		for (int i=0; i < peliculas.length; i++) 
		{
			peliculas[0] = pelicula1;
			peliculas[1] = pelicula2;
			peliculas[2] = pelicula3;
			peliculas[3] = pelicula4;
			peliculas[4] = pelicula5;
			System.out.println(peliculas[i].toString());	
		}
		System.out.println("");
	
		
		//***********SERIES*************************************
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Serie2", "Gonzalo v");
		serie2.marcarVisto();
		serie2.tiempoVisto(98.56);
		Serie serie3 = new Serie("Serie3", 2, "aventura", "Gonzalo v", 35.00);
		Serie serie4 = new Serie("Serie4", 5, false, "terror", "Gonzalo", 45.00);
		serie4.marcarVisto();
		serie4.tiempoVisto(122.35);
		Serie serie5 = new Serie("Serie5", "yo");
		
		System.out.println("***************************LISTA DE TODAS LAS SERIES ***************************** ");
		for (int i=0; i < series.length; i++) 
		{
			series[0] = serie1;
			series[1] = serie2;
			series[2] = serie3;
			series[3] = serie4;
			series[4] = serie5;
			System.out.println(series[i].toString());	
		}
		System.out.println("");
		
		//****************************************PELICULAS Y SERIES QUE SE VISUALIZARON*************************************
		System.out.println("***************************PELICULAS Y SERIES QUE SE VISUALIZARON*****************************");
		for (int i=0; i < peliculas.length; i++) 
		{
			Pelicula miPelicula = peliculas[i];
			if (miPelicula.esVisto() == true)
			{
				System.out.println("La Pelicula: " + miPelicula.getTitulo() + " Tiempo Visualizacion: "+miPelicula.tiempoVisto);	
			}

		}

		for (int j = 0; j < series.length; j++) 
		{
			Serie miSerie = series[j];
			if (miSerie.esVisto() == true)
			{
				System.out.println("La Serie: " + miSerie.getTitulo() + " Tiempo Visualizacion: "+miSerie.tiempoVisto);			
			}
		}
		System.out.println("");
		
		
		
		//****************************************PELICULA Y SERIE CON MAS TEMPORADAS Y AÑO MAS RECIENTE*************************************
		System.out.println("***************************PELICULA MAS RECIENTE Y SERIE CON MAS TEMPORADAS*****************************");
		//PELICULA MAS RECIENTE
		Pelicula aux = null;
		for (int i=0; i < peliculas.length; i++) 
		{
			Pelicula miPelicula = peliculas[i];
			if(aux != null)
			{
				if (miPelicula.getAño() > aux.getAño())
				{
					aux = miPelicula;
				}
			}
			else
			{
				aux = miPelicula;
			}
		}
		System.out.println("La Pelicula de Año Mas Reciente es: " + "\n"+ aux.toString() );	
		
		
		//SERIE CON MAS TEMPORADAS
		Serie masT = null;
		for (int i=0; i < series.length; i++) 
		{
			Serie miSerie = series[i];
			if(masT != null)
			{
				if (miSerie.getNroTemporadas() > masT.getNroTemporadas())
				{
					masT = miSerie;
				}
			}
			else
			{
				masT = miSerie;
			}
		}
		System.out.println("La Serie con mas Temporadas es: "+ "\n" + masT.toString());	


	}

	
	
}
