package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglo.Arreglos;
import clase.Celular;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnAgregar;
	private JButton btnReportar;
	private JButton btnBuscar;
	private JLabel lblModelo;
	private JLabel lblStock;
	private JLabel lblPrecio;
	private JTextField txtCodigo;
	private JTextField txtModelo;
	private JTextField txtStock;
	private JTextField txtPrecio;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Código");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			btnAgregar = new JButton("Agregar");
			btnAgregar.addActionListener(this);
			btnAgregar.setBounds(63, 119, 89, 23);
			contentPane.add(btnAgregar);
		}
		{
			btnReportar = new JButton("Reportar");
			btnReportar.addActionListener(this);
			btnReportar.setBounds(63, 147, 89, 23);
			contentPane.add(btnReportar);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(63, 174, 89, 23);
			contentPane.add(btnBuscar);
		}
		{
			lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 39, 46, 14);
			contentPane.add(lblModelo);
		}
		{
			lblStock = new JLabel("Stock");
			lblStock.setBounds(10, 64, 46, 14);
			contentPane.add(lblStock);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(10, 91, 46, 14);
			contentPane.add(lblPrecio);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setBounds(66, 8, 86, 20);
			contentPane.add(txtCodigo);
			txtCodigo.setColumns(10);
		}
		{
			txtModelo = new JTextField();
			txtModelo.setColumns(10);
			txtModelo.setBounds(66, 36, 86, 20);
			contentPane.add(txtModelo);
		}
		{
			txtStock = new JTextField();
			txtStock.setColumns(10);
			txtStock.setBounds(66, 61, 86, 20);
			contentPane.add(txtStock);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(66, 88, 86, 20);
			contentPane.add(txtPrecio);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(175, 6, 307, 300);
			contentPane.add(txtS);
		}
		{
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(269, 147, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnAdicionar = new JButton("Adicionar");
			btnAdicionar.addActionListener(this);
			btnAdicionar.setBounds(63, 203, 89, 23);
			contentPane.add(btnAdicionar);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdicionar) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnReportar) {
			do_btnReportar_actionPerformed(e);
		}
		if (e.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
	}
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		// Boton de Más
	}
	protected void do_btnReportar_actionPerformed(ActionEvent e) {
		txtS.setText("");
		txtS.append("--- REPORTE DE CELULARES ---\n");
        txtS.append("----------------------------\n");
        if (a.Tamaño() == 0) {
            txtS.append("No hay productos registrados.");
        } else {
            for (int i = 0; i < a.Tamaño(); i++) {
            	Celular c = a.Obtener(i);
            	txtS.append(c.getCodigo() + "\t" + c.getModelo() + "\t" + c.getStock() + "\t" + c.getPrecio() + "\n");
            }
            
          }
        }
        int LeerCodigo(){
			return Integer.parseInt(txtCodigo.getText());
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		// Boton Buscar 
		txtS.setText("");
		Celular c= a.Buscar(LeerCodigo());
		if(c!=null) {
			txtS.append("Producto encontrado");
		}else txtS.append("Producto no registrado");
	}
		
	}
	Arreglos a = new Arreglos();
	private JButton btnNewButton;
	private JButton btnAdicionar;
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		
		Celular c1 = a.Buscar(LeerCodigo());
		if (c1==null) {
			Celular c11 = new  Celular(LeerCodigo(), LeerModelo(), LeerStock(), LeerPrecio());
			a.Adicionar(c11);
			JOptionPane.showMessageDialog(null, "Se agrego correctamente");
		} 
		
		else JOptionPane.showMessageDialog(null, "El código ya existe");
			
		}

    String LeerModelo() 
    {
      return txtModelo.getText();
    }
    int LeerStock() 
    {
     return Integer.parseInt(txtStock.getText());
    }
    double LeerPrecio() 
    {
     return Double.parseDouble(txtPrecio.getText());
   }
}

