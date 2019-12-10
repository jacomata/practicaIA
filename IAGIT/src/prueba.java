
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import java.*;

public class prueba {

	private static ArrayList<Vertice> vertices;
	private static Grafo metro;
	private boolean encontrado = false;
	private static ArrayList<VV> ABIERTA = new ArrayList<VV>();
	private static ArrayList<VertVert> CERRADA = new ArrayList<VertVert>();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private static ArrayList<Vertice> solucion = new ArrayList<Vertice>();

	public static void main(String[] args) {

		vertices = new ArrayList<Vertice>();
		vertices.add(new Vertice("yoyogi", 35.6839519, 139.7020805));// 0
		vertices.add(new Vertice("shinjuku", 35.6895965, 139.7004782));// 1
		vertices.add(new Vertice("shin-okubo", 35.7013007, 139.7002421));// 2
		vertices.add(new Vertice("takadanobaba", 35.7126839, 139.7036425));// 3
		vertices.add(new Vertice("mejiro", 35.7211861, 139.7064823));// 4
		vertices.add(new Vertice("ikebukuro", 35.7301027, 139.7118843));// 5
		vertices.add(new Vertice("otsuka", 35.7317401, 139.7283438));// 6
		vertices.add(new Vertice("sugamo", 35.7337073, 139.7381212));// 7
		vertices.add(new Vertice("komagome", 35.7365848, 139.7472412));// 8
		vertices.add(new Vertice("tabata", 35.7373701, 139.7617151));// 9
		vertices.add(new Vertice("nishi-nippori", 35.7322284, 139.7665852));// 10
		vertices.add(new Vertice("nippori", 35.7289017, 139.7713508));// 11
		vertices.add(new Vertice("uguisudani", 35.7203576, 139.7790442));// 12
		vertices.add(new Vertice("ueno", 35.7119208, 139.7758575));// 13
		vertices.add(new Vertice("okachimachi", 35.7069531, 139.7746303));// 14
		vertices.add(new Vertice("akihabara", 35.6985569, 139.7731418));// 15
		vertices.add(new Vertice("kanda", 35.6952811, 139.7704909));// 16
		vertices.add(new Vertice("tokyo", 35.6820678, 139.7655776));// 17
		vertices.add(new Vertice("yurakucho", 35.6757852, 139.7619259));// 18
		vertices.add(new Vertice("shimbashi", 35.6661109, 139.7597208));// 19
		vertices.add(new Vertice("hamamatsucho", 35.6551327, 139.7569141));// 20
		vertices.add(new Vertice("tamachi", 35.6456467, 139.7474507));// 21
		vertices.add(new Vertice("shinagawa", 35.6293681, 139.7392729));// 22
		vertices.add(new Vertice("osaki", 35.6196271, 139.7280502));// 23
		vertices.add(new Vertice("gotanda", 35.6264962, 139.7237208));// 24
		vertices.add(new Vertice("meguro", 35.6327445, 139.7160149));// 25
		vertices.add(new Vertice("ebisu", 35.6465799, 139.7102148));// 26
		vertices.add(new Vertice("shibuya", 35.6645956, 139.6987107));// 27
		vertices.add(new Vertice("harajuku", 35.6687049, 139.7053357));// 28

		vertices.add(new Vertice("ochanomizu", 35.699593, 139.7649185));// 29
		vertices.add(new Vertice("sendagaya", 35.6813099, 139.7113735));// 30
		vertices.add(new Vertice("shinanomachi", 35.680168, 139.720288));// 31
		vertices.add(new Vertice("yotsuya", 35.686222, 139.730218));// 32
		vertices.add(new Vertice("lichigaya", 35.691047, 139.735578));// 33
		vertices.add(new Vertice("lidabashi", 35.702162, 139.745002));// 34
		vertices.add(new Vertice("suidobashi", 35.702083, 139.753480));// 35

		metro = new Grafo(vertices);
		metro.insertarArista(vertices.get(0), vertices.get(1), 700);// LINEA VERDE
		metro.insertarArista(vertices.get(1), vertices.get(2), 1300);
		metro.insertarArista(vertices.get(2), vertices.get(3), 1400);
		metro.insertarArista(vertices.get(3), vertices.get(4), 900);
		metro.insertarArista(vertices.get(4), vertices.get(5), 1200);
		metro.insertarArista(vertices.get(5), vertices.get(6), 1800);
		metro.insertarArista(vertices.get(6), vertices.get(7), 1100);
		metro.insertarArista(vertices.get(7), vertices.get(8), 700);
		metro.insertarArista(vertices.get(8), vertices.get(9), 1600);
		metro.insertarArista(vertices.get(9), vertices.get(10), 800);
		metro.insertarArista(vertices.get(10), vertices.get(11), 500);
		metro.insertarArista(vertices.get(11), vertices.get(12), 1100);
		metro.insertarArista(vertices.get(12), vertices.get(13), 1100);
		metro.insertarArista(vertices.get(13), vertices.get(14), 600);
		metro.insertarArista(vertices.get(14), vertices.get(15), 1000);
		metro.insertarArista(vertices.get(15), vertices.get(16), 700);
		metro.insertarArista(vertices.get(16), vertices.get(17), 1300);
		metro.insertarArista(vertices.get(17), vertices.get(18), 800);
		metro.insertarArista(vertices.get(18), vertices.get(19), 1100);
		metro.insertarArista(vertices.get(19), vertices.get(20), 1200);
		metro.insertarArista(vertices.get(20), vertices.get(21), 1500);
		metro.insertarArista(vertices.get(21), vertices.get(22), 2200);
		metro.insertarArista(vertices.get(22), vertices.get(23), 2000);
		metro.insertarArista(vertices.get(23), vertices.get(24), 900);
		metro.insertarArista(vertices.get(24), vertices.get(25), 1200);
		metro.insertarArista(vertices.get(25), vertices.get(26), 1500);
		metro.insertarArista(vertices.get(26), vertices.get(27), 1600);
		metro.insertarArista(vertices.get(27), vertices.get(28), 1200);
		metro.insertarArista(vertices.get(28), vertices.get(0), 1500);
		metro.insertarArista(vertices.get(1), vertices.get(29), 7700);// LINEA ROJA
		metro.insertarArista(vertices.get(29), vertices.get(17), 2600);
		metro.insertarArista(vertices.get(0), vertices.get(1), 700);// LINEA AMARILLA
		metro.insertarArista(vertices.get(0), vertices.get(30), 1000);
		metro.insertarArista(vertices.get(30), vertices.get(31), 700);
		metro.insertarArista(vertices.get(31), vertices.get(32), 1300);
		metro.insertarArista(vertices.get(32), vertices.get(33), 800);
		metro.insertarArista(vertices.get(33), vertices.get(34), 1500);
		metro.insertarArista(vertices.get(34), vertices.get(35), 900);
		metro.insertarArista(vertices.get(35), vertices.get(29), 800);// suidobashi-ochanomizu
		metro.insertarArista(vertices.get(29), vertices.get(15), 900);

		// pruebas
		
		
//		System.out.println(metro.getAristas().get(0).toString());
//
//		System.exit(0);
		Vertice verticePartida = new Vertice("", 0, 0);
		Vertice verticeLlegada = new Vertice("", 0, 0);
		String nodoPartida = "mejiro";
		String nodoLlegada = "ochanomizu";
		boolean encontrado = false;
		
		//asigna el nodo de partida y el de llegada
		for (int i = 0; i < vertices.size() && !encontrado; i++) { 
			if (vertices.get(i).getEtiqueta().equals(nodoPartida)) {
				encontrado = true;
				verticePartida = vertices.get(i);
			}

		}

		encontrado = false;

		for (int i = 0; i < vertices.size() && !encontrado; i++) {
			if (vertices.get(i).getEtiqueta().equals(nodoLlegada)) {
				encontrado = true;
				verticeLlegada = vertices.get(i);
			}

		}
		
		CERRADA.add(new VertVert(verticePartida, new Vertice("ACEPTAR", 0, 0)));
		//ABIERTA.add(new VV(verticePartida, 0));

		double dRecorrida;
		double dTotal = 0;
		boolean salir = false;
		boolean salirok = false;
		Vertice hijo;
		Vertice padre;
		boolean hallegado = false;
		Vertice partidaOriginal = new Vertice(nodoPartida, 0, 0);
		coordenadas coor1;
		coordenadas coor2;
		Arista aux;

		
		// CERRADA.add(new VertVert(v3,v1));
		// CERRADA.add(new VertVert(v2,v3));
		//el bucle principal que avanza cuando se mueve de nodo
		while (!verticePartida.getEtiqueta().equals(verticeLlegada.getEtiqueta()) ) {
			for (int i=0;i<CERRADA.size();i++) {
				System.out.print(CERRADA.get(i).getVertice1().getEtiqueta());
				System.out.println(" "+CERRADA.get(i).getVertice2().getEtiqueta());
				
			}
			hallegado=false;
			hijo = CERRADA.get(CERRADA.size() - 1).getVertice1();
			padre = CERRADA.get(CERRADA.size() - 1).getVertice2();
			dRecorrida = 0.0;
			
			//Calcula la distania recorrida para CERRADA.size() - 1
			while (!hallegado) {
				aux = new Arista(new Vertice("", 0, 0), new Vertice("", 0, 0),0);
				//busca al padre
				for (int k = CERRADA.size(); k > 0; k--) {
					if (CERRADA.get(k - 1).getVertice1().equals(hijo)) {
						padre = CERRADA.get(k - 1).getVertice2();
					}
				}
				
				//busca la arista
				for (int i=0;i<metro.getAristas().size();i++) {
					if((metro.getAristas().get(i).getVertice1()==hijo && metro.getAristas().get(i).getVertice2()==padre) ||
							(metro.getAristas().get(i).getVertice2()==hijo && metro.getAristas().get(i).getVertice1()==padre)) {
						aux=metro.getAristas().get(i);
						System.out.println("\n"+aux.toString());
					}
				}
				dRecorrida+=aux.getPeso();
				System.out.println(dRecorrida+"HELLO"+aux.getPeso()+"PESO");

				hijo = padre;
				//comprueba si hemos llegado al final 
				if (hijo.getEtiqueta().equals("ACEPTAR")) {
					hallegado = true;
				}
			}
			
			// recorre los vecinos 
			for (int i = 0; i < verticePartida.getVecinos().size(); i++) {

				boolean añadido = false;

				//compueba si esta en la cerrada
				for (int j = 0; j < CERRADA.size() ; j++) {
					if (CERRADA.get(j).getVertice1().equals(verticePartida.getVecino(i).getVecinoDe(verticePartida))) {
						salirok = true;
						System.out.print("3");

					}
				}

				
				if (!salirok) {
					
					double peso;
					double heuristica;
					//coor1 = el vecino , coor2 = destino 
					coor1 = new coordenadas(verticePartida.getVecinos().get(i).getVecinoDe(verticePartida).getX(),
							verticePartida.getVecinos().get(i).getVecinoDe(verticePartida).getY());
					coor2 = new coordenadas(verticeLlegada.getX(), verticeLlegada.getY());

					peso = verticePartida.getVecino(i).getPeso();
					heuristica = Haversine.calculateDistanceByHaversine(coor1, coor2);

					System.out.print("2");
					
					dTotal = dRecorrida + peso + heuristica; //el valor que compararemos

					//Mira si el vertice ya esta en la abierta 
					for (int j = 0; j < ABIERTA.size(); j++) {

						if (ABIERTA.get(j).getVertice1().getEtiqueta()
								.equals(verticePartida.getVecinos().get(i).getVecinoDe(verticePartida).getEtiqueta())) {
							// en la linea de arriba nos comprueba las etiquetas, no el vertice en si, por
							// si acaso
							añadido = true;
							if (ABIERTA.get(j).getValor() > dTotal) {
								ABIERTA.get(j).setValor(dTotal);
								//cambia el padre
								ABIERTA.get(j).setVertice2(verticePartida); 
							}
						}

					}
					if (!añadido) {

						ABIERTA.add(new VV(verticePartida.getVecinos().get(i).getVecinoDe(verticePartida),verticePartida, dTotal));

					}
					
				}
				salirok=false;
					
			}
			
			
			for (int i=0;i<ABIERTA.size();i++) {
				System.out.print(" hijo: "+ABIERTA.get(i).getVertice1().getEtiqueta());
				System.out.print(" padre: "+ABIERTA.get(i).getVertice2().getEtiqueta());
				System.out.println(" Valor "+ABIERTA.get(i).getValor());
				
			}
			System.out.println("--------------------------");

			// hasta aqui para rellenar la lista abierta

			double min = 1000000;
			VV salida = new VV(new Vertice("", 0, 0),new Vertice("", 0, 0), 0);

			int indice=0;
			//busca el elemento de la abierta con valor mas pequeño
			for ( int i = 1; i < ABIERTA.size(); i++) {
				if (min > ABIERTA.get(i).getValor()) {
					min = ABIERTA.get(i).getValor();
					salida.setVertice1(ABIERTA.get(i).getVertice1());
					salida.setVertice2(ABIERTA.get(i).getVertice2());
					salida.setValor(min);
					indice=i;

				}

			}
			//lo añadimos a la cerrada
			CERRADA.add(new VertVert(salida.getVertice1(), salida.getVertice2()));
			ABIERTA.remove(indice);
			//avazamos en el grafo
			verticePartida=salida.getVertice1();
		}

		boolean parar = false;
		hijo = CERRADA.get(CERRADA.size() - 1).getVertice1();
		solucion.add(hijo);
		padre = CERRADA.get(CERRADA.size() - 1).getVertice2();// esta bien? lo he cambiado
		while (!hallegado) {
			for (int k = CERRADA.size(); k > 0 && !parar; k--) {
				if (CERRADA.get(k - 1).getVertice1().equals(hijo)) {
					padre = CERRADA.get(k - 1).getVertice2();
					if (padre.getEtiqueta().equals("ACEPTAR")) {
						parar = true;

					}

					solucion.add(padre);
				}
			}
			hijo = padre;
			if (hijo.getEtiqueta().equals("ACEPTAR")) {
				hallegado = true;
			}
		}

		String sol="";
		for (int i = 0; i < CERRADA.size(); i++) {
			System.out.println(CERRADA.get(i).getVertice1());


	}
	}
}
