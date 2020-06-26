package Netflix;

import java.util.ArrayList;

public class Ejecutable {

	
	public Ejecutable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Serie> series = new ArrayList<Serie>();

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

		peliculas.add(pelicula1);
		peliculas.add(pelicula2);
		peliculas.add(pelicula3);
		peliculas.add(pelicula4);
		peliculas.add(pelicula5);

		series.add(serie1);
		series.add(serie2);
		series.add(serie3);
		series.add(serie4);
		series.add(serie5);

		System.out.println("***************************LISTA DE TODAS LAS PELICULAS***************************** ");
		for (int i=0; i < peliculas.size(); i++) 
		{
			System.out.println(peliculas.get(i).toString());	
		}
		System.out.println("");

		System.out.println("***************************LISTA DE TODAS LAS SERIES***************************** ");
		for (int i=0; i < series.size(); i++) 
		{
			System.out.println(series.get(i).toString());	
		}
		System.out.println("");
		
		//****************************************PELICULAS Y SERIES QUE SE VISUALIZARON*************************************
		System.out.println("***************************PELICULAS Y SERIES QUE SE VISUALIZARON*****************************");
		for (int i=0; i < peliculas.size(); i++) 
		{
			Pelicula miPelicula = peliculas.get(i);
			if (miPelicula.esVisto() == true)
			{
				System.out.println("La Pelicula: " + miPelicula.getTitulo() + " Tiempo Visualizacion: "+miPelicula.tiempoVisto);	
			}

		}

		for (int j = 0; j < series.size(); j++) 
		{
			Serie miSerie = series.get(j);
			if (miSerie.esVisto() == true)
			{
				System.out.println("La Serie: " + miSerie.getTitulo() + " Tiempo Visualizacion: "+miSerie.tiempoVisto);			
			}
		}
		System.out.println("");


		//****************************************PELICULA MAS RECIENTE Y SERIE CON MAS TEMPORADAS *************************************
		System.out.println("***************************PELICULA MAS RECIENTE Y SERIE CON MAS TEMPORADAS*****************************");
		//PELICULA MAS RECIENTE
		Pelicula aux = null;
		for (int i=0; i < peliculas.size(); i++) 
		{
			Pelicula miPelicula = peliculas.get(i);
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
		for (int i=0; i < series.size(); i++) 
		{
			Serie miSerie = series.get(i);
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
