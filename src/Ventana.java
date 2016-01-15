import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
	
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbN1 = new JLabel("Numero 1");
	private JLabel lbN2 = new JLabel("Numero 2");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("CALCULAR");
	
	private Container C = getContentPane();
	
	private Operaciones Op = new Operaciones();
	
	
	public Ventana(){
		
		super.setTitle("operaciones");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
		
	}

	private void cargarControles() {
		C.setLayout(null);
		lbN1.setBounds(10, 10, 300,30);
		txtN1.setBounds(10, 40, 250, 30);
		lbN2.setBounds(10, 80, 300,30);
		txtN2.setBounds(10, 110, 250, 30);
		
		btnCalcular.setBounds(10, 150, 250, 35);
		
		lbResultado.setBounds(10, 190, 300, 30);
		
		
		C.add(lbN1);
		C.add(txtN1);
		C.add(lbN2);
		C.add(txtN2);
		C.add(btnCalcular);
		C.add(lbResultado);
		btnCalcular.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int r = Op.sumar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s + %s = %d", txtN1.getText(), txtN2.getText(), r));
	}

}
