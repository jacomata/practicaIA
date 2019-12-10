import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

import javax.swing.*;

public class paleto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static ArrayList<Vertice> vertices;
	private static Grafo metro;
	private boolean encontrado = false;
	private ArrayList<VV> ABIERTA = new ArrayList<VV>();
	private ArrayList<VertVert> CERRADA = new ArrayList<VertVert>();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ArrayList<Vertice> solucion = new ArrayList<Vertice>();
	// private static ArrayList<coordenadas> estaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		/*
		 * estaciones=new ArrayList<coordenadas>();
		 * 
		 * estaciones.add(new coordenadas(35.6839519,139.7020805)); //yoyogi
		 * estaciones.add(new coordenadas(35.6895965,139.7004782)); //shinjuku
		 * estaciones.add(new coordenadas(35.7013007,139.7002421)); //shin-okubo
		 * estaciones.add(new coordenadas(35.7126839,139.7036425)); //takadanobaba
		 * estaciones.add(new coordenadas(35.7211861,139.7064823)); //mejiro
		 * estaciones.add(new coordenadas(35.7301027,139.7118843)); //ikebukuro
		 * estaciones.add(new coordenadas(35.7317401,139.7283438)); //otsuka
		 * estaciones.add(new coordenadas(35.7337073,139.7381212)); //sugamo
		 * estaciones.add(new coordenadas(35.7365848,139.7472412)); //komagome
		 * estaciones.add(new coordenadas(35.7373701,139.7617151)); //tabata
		 * estaciones.add(new coordenadas(35.7322284,139.7665852)); //nishi-nippori
		 * estaciones.add(new coordenadas(35.7289017,139.7713508)); //nippori
		 * estaciones.add(new coordenadas(35.7203576,139.7790442)); //uguisudani
		 * estaciones.add(new coordenadas(35.7119208,139.7758575)); //ueno
		 * estaciones.add(new coordenadas(35.7069531,139.7746303)); //okachimachi
		 * estaciones.add(new coordenadas(35.6985569,139.7731418)); //akihabara
		 * estaciones.add(new coordenadas(35.6952811,139.7704909)); //kanda
		 * estaciones.add(new coordenadas(35.6820678,139.7655776)); //tokyo
		 * estaciones.add(new coordenadas(35.6757852,139.7619259)); //yurakucho
		 * estaciones.add(new coordenadas(35.6661109,139.7597208)); //shimbashi
		 * estaciones.add(new coordenadas(35.6551327,139.7569141)); //hamamatsucho
		 * estaciones.add(new coordenadas(35.6456467,139.7474507)); //tamachi
		 * estaciones.add(new coordenadas(35.6293681,139.7392729)); //shinagawa
		 * estaciones.add(new coordenadas(35.6196271,139.7280502)); //osaki
		 * estaciones.add(new coordenadas(35.6264962,139.7237208)); //gotanda
		 * estaciones.add(new coordenadas(35.6327445,139.7160149)); //meguro
		 * estaciones.add(new coordenadas(35.6465799,139.7102148)); //ebisu
		 * estaciones.add(new coordenadas(35.6645956,139.6987107)); //shibuya
		 * estaciones.add(new coordenadas(35.6687049,139.7053357)); //harajuku
		 * 
		 * estaciones.add(new coordenadas(35.699593,139.7649185)); //ochanomizu
		 * estaciones.add(new coordenadas(35.6813099,139.7113735));//sendagaya
		 * estaciones.add(new coordenadas(35.680168,139.720288)); //shinanomachi
		 * estaciones.add(new coordenadas(35.686222,139.730218)); //yotsutya
		 * estaciones.add(new coordenadas(35.691047,139.735578)); //lichigaya
		 * estaciones.add(new coordenadas(35.702162,139.745002)); //lidabashi
		 * estaciones.add(new coordenadas(35.702083,139.753480)); //suidobashi
		 */
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

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paleto frame = new paleto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public paleto() {
		setTitle("METRO JAPON");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel partida = new JLabel("NODO PARTIDA:");
		partida.setBounds(10, 42, 156, 28);
		contentPane.add(partida);

		textField = new JTextField();
		textField.setBounds(35, 81, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel llegada = new JLabel("NODO LLEGADA:");
		llegada.setBounds(10, 112, 176, 21);
		contentPane.add(llegada);

		textField_1 = new JTextField();
		textField_1.setBounds(35, 144, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton boton = new JButton("BUSCAR CAMINO");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nodoPartida = textField.getText();
				String nodoLlegada = textField_1.getText();
				textField_1.setText("");
				textField.setText("");
				Vertice verticePartida = new Vertice("", 0, 0);
				Vertice verticeLlegada = new Vertice("", 0, 0);

				for (int i = 0; i < vertices.size() && !encontrado; i++) {
					if (vertices.get(i).getEtiqueta().equals(nodoPartida)) {
						encontrado = true;
						verticePartida = vertices.get(i);
					}
				}
				if (!encontrado) {
					JOptionPane.showMessageDialog(contentPane, "NODO PARTIDA NO RECONOCIDO", "ERROR",
							JOptionPane.ERROR_MESSAGE);

				}

				encontrado = false;

				for (int i = 0; i < vertices.size() && !encontrado; i++) {
					if (vertices.get(i).getEtiqueta().equals(nodoLlegada)) {
						encontrado = true;
						verticeLlegada = vertices.get(i);
					}
				}
				if (!encontrado)
					JOptionPane.showMessageDialog(contentPane, "NODO LLEGADA NO RECONOCIDO", "ERROR",
							JOptionPane.ERROR_MESSAGE);

				CERRADA.add(new VertVert(verticePartida, new Vertice("ACEPTAR", 0, 0)));
				ABIERTA.add(new VV(verticePartida, 0));

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
				Iterator<Arista> it1 = metro.getAristas().iterator();
				Arista aux = new Arista(new Vertice("", 0, 0), new Vertice("", 0, 0));

				// CERRADA.add(new VertVert(v3,v1));
				// CERRADA.add(new VertVert(v2,v3));

				while (!verticePartida.getEtiqueta().equals(verticeLlegada.getEtiqueta())) {

					hijo = CERRADA.get(CERRADA.size() - 1).getVertice1();
					padre = CERRADA.get(0).getVertice2();
					dRecorrida = 0.0;
					while (!hallegado) {
						for (int k = CERRADA.size(); k > 0; k--) {
							if (CERRADA.get(k - 1).getVertice1().equals(hijo)) {
								padre = CERRADA.get(k - 1).getVertice2();
							}
						}
						if (metro.contieneLaArista(new Arista(hijo, padre))) {

							for (int i = 0; i < metro.getAristas().size(); i++) {
								if (metro.getAristas().get(i).equals(new Arista(hijo, padre))) {// QUE SACADA
									dRecorrida += metro.getAristas().get(i).getPeso();
								}
							}
						}

						hijo = padre;
						if (hijo.getEtiqueta().equals("ACEPTAR")) {
							hallegado = true;
						}
					}

					for (int i = 0; i < verticePartida.getVecinos().size(); i++) {

						boolean añadido = false;

						for (int j = 0; j < CERRADA.size(); j++) {
							if (CERRADA.get(j).getVertice1()
									.equals(verticePartida.getVecino(i).getVecinoDe(verticePartida))) {
								salirok = true;
								System.out.print("3");

							}

						}

						if (!salirok) {
							double peso;
							double heuristica;
							coor1 = new coordenadas(
									verticePartida.getVecinos().get(i).getVecinoDe(verticePartida).getX(),
									verticePartida.getVecinos().get(i).getVecinoDe(verticePartida).getY());
							coor2 = new coordenadas(verticeLlegada.getX(), verticeLlegada.getY());

							peso = verticePartida.getVecino(i).getPeso();
							heuristica = Haversine.calculateDistanceByHaversine(coor1, coor2);

							System.out.print("2");
							dTotal = dRecorrida + peso + heuristica;

							for (int j = 0; j < ABIERTA.size(); j++) {

								if (ABIERTA.get(j).getV().getEtiqueta().equals(
										verticePartida.getVecinos().get(i).getVecinoDe(verticePartida).getEtiqueta())) {
									// en la linea de arriba nos comprueba las etiquetas, no el vertice en si, por
									// si acaso
									añadido = true;
									if (ABIERTA.get(j).getValor() > dTotal) {
										ABIERTA.get(j).setValor(dTotal);
									}
								}

							}
							if (!añadido) {

								ABIERTA.add(
										new VV(verticePartida.getVecinos().get(i).getVecinoDe(verticePartida), dTotal));

							}

						}
						salirok = false;

					}
					for (int i = 0; i < ABIERTA.size(); i++) {
						System.out.print(ABIERTA.get(i).getV().getEtiqueta());
						System.out.println(ABIERTA.get(i).getValor());

					}
					System.out.println("--------------------------");

					// hasta aqui para rellenar la lista abierta

					double min = 1000000;
					VV salida = new VV(new Vertice("", 0, 0), 0);

					int indice = 0;
					for (int i = 1; i < ABIERTA.size(); i++) {
						if (min > ABIERTA.get(i).getValor()) {
							min = ABIERTA.get(i).getValor();
							salida.setV(ABIERTA.get(i).getV());
							salida.setValor(min);
							indice = i;

						}

					}

					CERRADA.add(new VertVert(salida.getV(), verticePartida));
					ABIERTA.remove(indice);
					verticePartida = salida.getV();

				}

				boolean parar = false;
				hijo = CERRADA.get(CERRADA.size() - 1).getVertice1();
				solucion.add(hijo);
				padre = new Vertice("", 0, 0);// esta bien?
				while (!parar) {
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
						parar = true;
					}
				}

				String sol = "";
				for (int i = solucion.size() - 1; i > 0; i--) {

					sol += solucion.get(i - 1).getEtiqueta() + " - ";
				}

				JOptionPane.showMessageDialog(contentPane, sol, "TOSTUS", JOptionPane.INFORMATION_MESSAGE);
				
//				CERRADA.clear();
//				ABIERTA.clear();
//				solucion.clear();

			}

		});
		boton.setBounds(21, 196, 131, 35);
		contentPane.add(boton);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alfonso\\Desktop\\foto metro peque\u00F1a2.jpg"));
		lblNewLabel_1.setBounds(203, 42, 377, 438);
		contentPane.add(lblNewLabel_1);

		JRadioButton radioButton = new JRadioButton("Valorando tiempo de transbordo");
		buttonGroup.add(radioButton);
		radioButton.setBounds(6, 300, 180, 23);
		contentPane.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("Sin hacer transbordos");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(6, 338, 146, 23);
		contentPane.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("Sin pasar por alguna estacion");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(6, 376, 193, 28);
		contentPane.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("Sin modificaciones");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(6, 420, 160, 23);
		contentPane.add(radioButton_3);

		JLabel lblModificaciones = new JLabel("MODIFICACIONES:");
		lblModificaciones.setBounds(35, 263, 106, 20);
		contentPane.add(lblModificaciones);

		JLabel lblMapaMetroJapon = new JLabel("MAPA METRO JAPON");
		lblMapaMetroJapon.setBounds(336, 11, 202, 28);
		contentPane.add(lblMapaMetroJapon);

	}
}
