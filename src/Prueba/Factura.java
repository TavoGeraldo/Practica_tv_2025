package Prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Factura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factura frame = new Factura();
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
	public Factura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 6, 6));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		//panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY),"Datos del cliente"));
		

		
		JLabel lblNewLabel_1 = new JLabel("Documento:");
		lblNewLabel_1.setBounds(37, 43, 69, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dirección:");
		lblNewLabel_2.setBounds(37, 84, 69, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(111, 40, 103, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 81, 103, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setBounds(282, 43, 55, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Teléfono:");
		lblNewLabel_4.setBounds(282, 84, 55, 14);
		panel.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(347, 81, 156, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(344, 40, 159, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY),"Datos de factura"));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nº Factura:");
		lblNewLabel.setBounds(10, 59, 62, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("1");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(84, 59, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha:");
		lblNewLabel_6.setBounds(258, 59, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("26/03/2025");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(331, 59, 73, 14);
		panel_1.add(lblNewLabel_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Factura.class.getResource("/Prueba/circulo.png")));
		lblNewLabel_8.setBounds(10, 0, 40, 35);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Factura.class.getResource("/Prueba/anadir.png")));
		lblNewLabel_9.setBounds(353, 0, 30, 35);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Factura.class.getResource("/Prueba/eliminar.png")));
		lblNewLabel_10.setBounds(446, 0, 30, 35);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Ver listado de facturas");
		lblNewLabel_11.setBounds(35, 11, 132, 14);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Añadir");
		lblNewLabel_12.setBounds(379, 11, 46, 14);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Eliminar");
		lblNewLabel_13.setBounds(475, 11, 46, 14);
		panel_2.add(lblNewLabel_13);
		
		table = new JTable();
		String[] titles = { "Producto", "Cantidad", "Valor", "Sub Total" };
		Object[][] datos = {
		    { "Agua", "2", "500", "1000" },
		    { "Cereal", "5", "1000", "5000" },
		    { "Leche", "2", "300", "600" }
		};

		// Crear la tabla y el JScrollPane
		JTable table = new JTable(datos, titles);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 46, 560, 105); 
		panel_2.add(scrollPane); 
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("SubTotal:");
		lblNewLabel_14.setBounds(10, 22, 77, 14);
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("%Descuento:");
		lblNewLabel_15.setBounds(10, 45, 77, 14);
		panel_3.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("IVA 19%:");
		lblNewLabel_16.setBounds(10, 70, 56, 14);
		panel_3.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Total factura:");
		lblNewLabel_17.setBounds(10, 94, 77, 14);
		panel_3.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("6600.0");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_18.setBounds(97, 22, 46, 14);
		panel_3.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("1254.0");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_19.setBounds(97, 70, 46, 14);
		panel_3.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("7524.0");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_20.setBounds(97, 94, 46, 14);
		panel_3.add(lblNewLabel_20);
		
		textField_4 = new JTextField();
		textField_4.setBounds(97, 42, 46, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(149, 42, 38, 23);
		panel_3.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_21 = new JLabel("Valor descontado:");
		lblNewLabel_21.setBounds(215, 45, 104, 14);
		panel_3.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("330.0");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_22.setBounds(319, 45, 46, 14);
		panel_3.add(lblNewLabel_22);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBounds(298, 117, 138, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(446, 117, 89, 23);
		panel_3.add(btnNewButton_1);
	}
}
