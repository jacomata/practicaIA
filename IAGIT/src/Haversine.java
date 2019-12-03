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
		  estaciones.add(new coordenadas(35.6895965,139.7004782)); 
		  estaciones.add(new coordenadas(35.7013007,139.7002421));
		  estaciones.add(new coordenadas(35.7126839,139.7036425));
		  estaciones.add(new coordenadas(35.7211861,139.7064823));
		  estaciones.add(new coordenadas(35.7301027,139.7118843));//ikebukuro
		  estaciones.add(new coordenadas(35.7317401,139.7283438));
		  estaciones.add(new coordenadas(35.7337073,139.7381212));
		  estaciones.add(new coordenadas(35.7365848,139.7472412));
		  estaciones.add(new coordenadas(35.7373701,139.7617151));
		  estaciones.add(new coordenadas(35.7322284,139.7665852));//nishi-nippori
		  estaciones.add(new coordenadas(35.7289017,139.7713508));
		  estaciones.add(new coordenadas(35.7203576,139.7790442));
		  estaciones.add(new coordenadas(35.7119208,139.7758575));
		  estaciones.add(new coordenadas(35.7069531,139.7746303));
		  estaciones.add(new coordenadas(35.6985569,139.7731418));//akihabara
		  estaciones.add(new coordenadas(35.6952811,139.7704909));
		  estaciones.add(new coordenadas(35.6820678,139.7655776));
		  estaciones.add(new coordenadas(35.6757852,139.7619259));
		  estaciones.add(new coordenadas(35.6661109,139.7597208));
		  estaciones.add(new coordenadas(35.6551327,139.7569141));
		  estaciones.add(new coordenadas(35.6456467,139.7474507));//tamachi
		  estaciones.add(new coordenadas(35.6293681,139.7392729));
		  estaciones.add(new coordenadas(35.6196271,139.7280502));
		  estaciones.add(new coordenadas(35.6264962,139.7237208));
		  estaciones.add(new coordenadas(35.6327445,139.7160149));
		  estaciones.add(new coordenadas(35.6465799,139.7102148));//ebisu
		/*  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());
		  estaciones.add(new coordenadas());*/
	  }
	  
}
