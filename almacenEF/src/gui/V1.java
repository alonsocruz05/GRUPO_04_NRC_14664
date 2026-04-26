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
import java.awt.Font;
import java.awt.Color;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
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
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Código");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			btnReportar = new JButton("Reportar");
			btnReportar.setBackground(new Color(255, 255, 255));
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
		{
			lblNewLabel_1 = new JLabel("ACCIONES ");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(63, 119, 109, 27);
			contentPane.add(lblNewLabel_1);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(this);
			btnModificar.setBounds(63, 237, 89, 23);
			contentPane.add(btnModificar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(this);
			btnEliminar.setBounds(63, 271, 89, 23);
			contentPane.add(btnEliminar);
		}
		
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnAdicionar) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnReportar) {
			do_btnReportar_actionPerformed(e);
		}
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
		Celular c = null; 

	    if (!txtCodigo.getText().isEmpty()) {
	        c = a.Buscar(LeerCodigo()); 
	    } 
	    else if (!txtModelo.getText().isEmpty()) {
	        c = a.Buscar(LeerModelo()); 
	    }

	    if (c != null) {
	        JOptionPane.showMessageDialog(this, 
	            "Código: " + c.getCodigo() + "\n" +
	            "Modelo: " + c.getModelo() + "\n" +
	            "Stock: " + c.getStock() + "\n" +
	            "Precio: " + c.getPrecio());
	    } else {
	        JOptionPane.showMessageDialog(this, "No se encontró el celular o campos vacíos.");
	    }
	    
		/*
			if(txtCodigo.getText().isEmpty()) {
				Celular c = a.Buscar(LeerModelo());
			}else if(txtModelo.getText().isEmpty()) {
				Celular c= a.Buscar(LeerCodigo());
			}
	        JOptionPane.showMessageDialog(this,"" + c.getCodigo() + "  ---  " + c.getModelo() + "  ---  " + c.getStock() + "  ---  " + c.getPrecio() + "\n");
		*/
	}
	Arreglos a = new Arreglos();
	private JButton btnNewButton;
	private JButton btnAdicionar;
	private JLabel lblNewLabel_1;
	private JButton btnModificar;
	private JButton btnEliminar;
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
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		try 
		{
			Celular c = a.Buscar(LeerCodigo());
			if (c != null) 
			{
			c.setModelo(LeerModelo());
			c.setStock(LeerStock());
			c.setPrecio(LeerPrecio());
			JOptionPane.showMessageDialog(null, "Se Modificó Correctamente");
			txtS.setText("");
			
			}else {
				JOptionPane.showMessageDialog(null, "El código no existe");
			}
			}
			catch(Exception exx)
			{
				JOptionPane.showMessageDialog(null, "¡Error! Revisa que todos los campos estén llenos correctamente");
			}
		
		}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		
		try {
			
	        Celular c = a.Buscar(LeerCodigo());
	        if (c != null) {
	            a.Eliminar(c);
	            JOptionPane.showMessageDialog(null, "Se elimino Correctamente");
	            txtS.setText("");
	        } else {
	            JOptionPane.showMessageDialog(null, "El código no existe");
	        }
			
		}
		catch(Exception exx)
		{
			JOptionPane.showMessageDialog(null, "¡Error! no hay nada para eliminar");
		}
	
		
		
	}
	
	}


