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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class paleto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static ArrayList<Vertice> vertices;
	private static Grafo metro;
	private boolean encontrado = false;
	private ArrayList<VV> ABIERTA;
	private ArrayList<VertVert> CERRADA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		vertices = new ArrayList<Vertice>();
		vertices.add(new Vertice("yoyogi"));// 0
		vertices.add(new Vertice("shinjuku"));// 1
		vertices.add(new Vertice("shin-okubo"));// 2
		vertices.add(new Vertice("takadanobaba"));// 3
		vertices.add(new Vertice("mejiro"));// 4
		vertices.add(new Vertice("ikebukuro"));// 5
		vertices.add(new Vertice("otsuka"));// 6
		vertices.add(new Vertice("sugamo"));// 7
		vertices.add(new Vertice("komagome"));// 8
		vertices.add(new Vertice("tabata"));// 9
		vertices.add(new Vertice("nishi-nippori"));// 10
		vertices.add(new Vertice("nippori"));// 11
		vertices.add(new Vertice("uguisudani"));// 12
		vertices.add(new Vertice("ueno"));// 13
		vertices.add(new Vertice("okachimachi"));// 14
		vertices.add(new Vertice("akihabara"));// 15
		vertices.add(new Vertice("kanda"));// 16
		vertices.add(new Vertice("tokyo"));// 17
		vertices.add(new Vertice("yurakucho"));// 18
		vertices.add(new Vertice("shimbashi"));// 19
		vertices.add(new Vertice("hamamatsucho"));// 20
		vertices.add(new Vertice("tamachi"));// 21
		vertices.add(new Vertice("shinagawa"));// 22
		vertices.add(new Vertice("osaki"));// 23
		vertices.add(new Vertice("gotanda"));// 24
		vertices.add(new Vertice("meguro"));// 25
		vertices.add(new Vertice("ebisu"));// 26
		vertices.add(new Vertice("shibuya"));// 27
		vertices.add(new Vertice("harajuku"));// 28
		vertices.add(new Vertice("ochanomizu"));// 29
		vertices.add(new Vertice("sendagaya"));// 30
		vertices.add(new Vertice("shinanomachi"));// 31
		vertices.add(new Vertice("yotsuya"));// 32
		vertices.add(new Vertice("lichigaya"));// 33
		vertices.add(new Vertice("lidabashi"));// 34
		vertices.add(new Vertice("suidobashi"));// 35

		metro = new Grafo(vertices);
		metro.insertarArista(vertices.get(0), vertices.get(1), 0);// yoyogi-shinjuku
		metro.insertarArista(vertices.get(1), vertices.get(2), 0);
		metro.insertarArista(vertices.get(2), vertices.get(3), 0);
		metro.insertarArista(vertices.get(3), vertices.get(4), 0);
		metro.insertarArista(vertices.get(4), vertices.get(5), 0);
		metro.insertarArista(vertices.get(5), vertices.get(6), 0);
		metro.insertarArista(vertices.get(6), vertices.get(7), 0);
		metro.insertarArista(vertices.get(7), vertices.get(8), 0);
		metro.insertarArista(vertices.get(8), vertices.get(9), 0);
		metro.insertarArista(vertices.get(9), vertices.get(10), 0);
		metro.insertarArista(vertices.get(10), vertices.get(11), 0);
		metro.insertarArista(vertices.get(11), vertices.get(12), 0);
		metro.insertarArista(vertices.get(12), vertices.get(13), 0);
		metro.insertarArista(vertices.get(13), vertices.get(14), 0);
		metro.insertarArista(vertices.get(14), vertices.get(15), 0);
		metro.insertarArista(vertices.get(15), vertices.get(16), 0);
		metro.insertarArista(vertices.get(16), vertices.get(17), 0);
		metro.insertarArista(vertices.get(17), vertices.get(18), 0);
		metro.insertarArista(vertices.get(18), vertices.get(19), 0);
		metro.insertarArista(vertices.get(19), vertices.get(20), 0);
		metro.insertarArista(vertices.get(20), vertices.get(21), 0);
		metro.insertarArista(vertices.get(21), vertices.get(22), 0);
		metro.insertarArista(vertices.get(22), vertices.get(23), 0);
		metro.insertarArista(vertices.get(23), vertices.get(24), 0);
		metro.insertarArista(vertices.get(24), vertices.get(25), 0);
		metro.insertarArista(vertices.get(25), vertices.get(26), 0);
		metro.insertarArista(vertices.get(26), vertices.get(27), 0);
		metro.insertarArista(vertices.get(27), vertices.get(28), 0);
		metro.insertarArista(vertices.get(1), vertices.get(29), 0);// shinjuku-ochanomizu
		metro.insertarArista(vertices.get(0), vertices.get(1), 0);// yoyogi-sendagaya
		metro.insertarArista(vertices.get(0), vertices.get(30), 0);
		metro.insertarArista(vertices.get(30), vertices.get(31), 0);
		metro.insertarArista(vertices.get(31), vertices.get(32), 0);
		metro.insertarArista(vertices.get(32), vertices.get(33), 0);
		metro.insertarArista(vertices.get(33), vertices.get(34), 0);
		metro.insertarArista(vertices.get(34), vertices.get(35), 0);
		metro.insertarArista(vertices.get(35), vertices.get(29), 0);// suidobashi-ochanomizu
		metro.insertarArista(vertices.get(29), vertices.get(15), 0);
		metro.insertarArista(vertices.get(29), vertices.get(17), 0);

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
		partida.setBounds(10, 101, 156, 28);
		contentPane.add(partida);

		textField = new JTextField();
		textField.setBounds(35, 138, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel llegada = new JLabel("NODO LLEGADA:");
		llegada.setBounds(10, 207, 176, 21);
		contentPane.add(llegada);

		textField_1 = new JTextField();
		textField_1.setBounds(35, 239, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton boton = new JButton("BUSCAR CAMINO");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nodoPartida = textField.getText();
				String nodoLlegada = textField_1.getText();
				textField_1.setText("");
				textField.setText("");
				Vertice verticePartida = new Vertice("");
				Vertice verticeLlegada = new Vertice("");

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

				CERRADA.add(new VertVert(verticePartida, new Vertice("ACEPTAR")));
				// ABIERTA.add(new VV(verticePartida, 0));

				int dRecorrida = 0;
				int dTotal = 0;
				boolean salir = false;
				boolean salirok = false;
				Vertice hijo;
				Vertice padre;
				boolean hallegado=false;
				Vertice partidaOriginal=new Vertice(nodoPartida);
				

				while (!verticePartida.getEtiqueta().equals(verticeLlegada.getEtiqueta())) {
					hijo=CERRADA.get(0).getVertice1();
					
					dRecorrida=0;
					while(!hallegado) {
					for (int k=0;k<CERRADA.size();k++) {
						if(CERRADA.get(k).getVertice1().equals(hijo)) {
							padre=CERRADA.get(k).getVertice2();
						}
					}
					dRecorrida+= new Arista(hijo,padre).getPeso();
					hijo=padre;
					if(hijo.equals(partidaOriginal)) {
						hallegado=true;
					}
					}

					for (int i = 0; i < verticePartida.getVecinos().size(); i++) {
											
						

						for (int j = 0; j < CERRADA.size() && !salirok; j++) {
							if (CERRADA.get(j).getVertice1().equals(verticePartida)) {
								salirok = true;

							}

						}
						if (salirok) {
							salirok=false;
							break;
						}

						int peso;
						int heuristica;

						peso = verticePartida.getVecino(i).getPeso();
						heuristica = calculateDistanceByHaversine(
								verticePartida.getVecinos().get(i).getVecinoDe(verticePartida), verticeLlegada);

						dTotal = dRecorrida + peso + heuristica;

						for (int j = 0; j < ABIERTA.size(); j++) {

							if (ABIERTA.get(j).getV().getEtiqueta().equals(
									verticePartida.getVecinos().get(i).getVecinoDe(verticePartida).getEtiqueta())) {
								// en la linea de arriba nos comprueba las etiquetas, no el vertice en si, por
								// si acaso
								if (ABIERTA.get(j).getValor() > dTotal) {
									ABIERTA.get(j).setValor(dTotal);
								}
							} else
								ABIERTA.add(
										new VV(verticePartida.getVecinos().get(i).getVecinoDe(verticePartida), dTotal));

						}

					}
					// hasta aqui para rellenar la lista abierta

					int min = ABIERTA.get(0).getValor();
					VV salida = new VV(new Vertice(""), 0);

					for (int i = 0; i < ABIERTA.size(); i++) {// recorro ABIERTA en busca del menor despues de haber
																// expandido un nodo
						if (min > ABIERTA.get(i).getValor()) {
							min = ABIERTA.get(i).getValor();// le vamos asignando el valor mas bajo, chompea un poco por
															// el valor de min al principio

						}
						salida.setV(ABIERTA.get(i).getV());// para tener el objeto VV y no tener luego que
						// buscar otra vez
						salida.setValor(min);
						// ABIERTA.remove(i);

					}

					CERRADA.add(new VertVert( salida.getV(),verticePartida));
					ABIERTA.remove(salida);
					
					

				}

			}
		});
		boton.setBounds(35, 348, 131, 35);
		contentPane.add(boton);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alfonso\\Desktop\\foto metro peque\u00F1a2.jpg"));
		lblNewLabel_1.setBounds(203, 42, 377, 438);
		contentPane.add(lblNewLabel_1);

	}
}
