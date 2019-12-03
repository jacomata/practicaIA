//package alfonso;

import java.util.ArrayList;



public class Haversine {
	  private static double calculateDistanceByHaversine(coordenadas a, coordenadas b) {

			  double earthRadius = 6371; // km

			  double lat1 = Math.toRadians(a.getX());
			  double lon1 = Math.toRadians(a.getY());
			  double lat2 = Math.toRadians(b.getX());
			  double lon2 = Math.toRadians(b.getY());

			  double dlon = (lon2 - lon1);
			  double dlat = (lat2 - lat1);

			  double sinlat = Math.sin(dlat / 2);
			  double sinlon = Math.sin(dlon / 2);

			  double d = (sinlat * sinlat) + Math.cos(lat1)*Math.cos(lat2)*(sinlon*sinlon);
			  double c = 2 * Math.asin (Math.min(1.0, Math.sqrt(d)));

			  double distanceInMeters = earthRadius * c ;

			  return distanceInMeters;

			  }
	  public static void main(String[]args) {
		  coordenadas a=new coordenadas(40.656478, -4.7002172);
		  coordenadas b=new coordenadas(40.4167047, -3.7035825);
		  System.out.print(calculateDistanceByHaversine(a,b));
		  
	  }
	  
	  ArrayList<coordenadas> estaciones=new ArrayList<coordenadas>();
	  public void escribirCoordenadas() {
		  estaciones.add(new coordenadas(35.6839519,139.7020805)); //yoyogi
		  estaciones.add(new coordenadas(35.6895965,139.7004782)); //shinjuku
		  estaciones.add(new coordenadas(35.7013007,139.7002421)); //shin-okubo
		  estaciones.add(new coordenadas(35.7126839,139.7036425)); //takadanobaba
		  estaciones.add(new coordenadas(35.7211861,139.7064823)); //mejiro
		  estaciones.add(new coordenadas(35.7301027,139.7118843)); //ikebukuro
		  estaciones.add(new coordenadas(35.7317401,139.7283438)); //otsuka
		  estaciones.add(new coordenadas(35.7337073,139.7381212)); //sugamo
		  estaciones.add(new coordenadas(35.7365848,139.7472412)); //komagome
		  estaciones.add(new coordenadas(35.7373701,139.7617151)); //tabata
		  estaciones.add(new coordenadas(35.7322284,139.7665852)); //nishi-nippori
		  estaciones.add(new coordenadas(35.7289017,139.7713508)); //nippori
		  estaciones.add(new coordenadas(35.7203576,139.7790442)); //uguisudani
		  estaciones.add(new coordenadas(35.7119208,139.7758575)); //ueno
		  estaciones.add(new coordenadas(35.7069531,139.7746303)); //okachimachi
		  estaciones.add(new coordenadas(35.6985569,139.7731418)); //akihabara
		  estaciones.add(new coordenadas(35.6952811,139.7704909)); //kanda
		  estaciones.add(new coordenadas(35.6820678,139.7655776)); //tokyo
		  estaciones.add(new coordenadas(35.6757852,139.7619259)); //yurakucho
		  estaciones.add(new coordenadas(35.6661109,139.7597208)); //shimbashi
		  estaciones.add(new coordenadas(35.6551327,139.7569141)); //hamamatsucho
		  estaciones.add(new coordenadas(35.6456467,139.7474507)); //tamachi
		  estaciones.add(new coordenadas(35.6293681,139.7392729)); //shinagawa
		  estaciones.add(new coordenadas(35.6196271,139.7280502)); //osaki
		  estaciones.add(new coordenadas(35.6264962,139.7237208)); //gotanda
		  estaciones.add(new coordenadas(35.6327445,139.7160149)); //meguro
		  estaciones.add(new coordenadas(35.6465799,139.7102148)); //ebisu
		  estaciones.add(new coordenadas(35.6645956,139.6987107)); //shibuya
		  estaciones.add(new coordenadas(35.6687049,139.7053357)); //harajuku
		  estaciones.add(new coordenadas(35.699593,139.7649185)); //ochanomizu
		  estaciones.add(new coordenadas(35.6813099,139.7113735));//sendagaya
		  estaciones.add(new coordenadas(35.680168,139.720288)); //shinanomachi
		  estaciones.add(new coordenadas(35.686222,139.730218)); //yotsutya
		  estaciones.add(new coordenadas(35.691047,139.735578)); //lichigaya
		  estaciones.add(new coordenadas(35.702162,139.745002)); //lidabashi
		  estaciones.add(new coordenadas(35.702083,139.753480)); //suidobashi
	  }
	  
}
