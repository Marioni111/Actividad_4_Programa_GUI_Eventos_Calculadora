import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora extends JFrame{
	
	double n1 = 0, res = 0;
	boolean l = true, op = false;
	String sg;
	
	GridBagConstraints configuracion = new GridBagConstraints();
	GridBagLayout gbl = new GridBagLayout();
	Font f = new Font("Arial", Font.BOLD, 16);
	
	JTextField txtOperacion;
	JButton btnMC, btnMR, btnMmas, btnMmenos, btnMS, btnM, btnPorcentaje, btnRaiz, btnXpotencia, btnDivideX,
			 btnCE, btnC, btnBack, btnDividir, btnSiete, btnOcho, btnNueve, btnMultiplicar, btnCuatro,btnCinco,
			 btnSeis, btnRestar, btnUno, btnDos, btnTres, btnSumar, btnMasMenos, btnCero, btnPunto, btnIgual;
	
	public Calculadora() {
		crearComponentes();
	}
	
	public void crearComponentes() {
		
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setSize(390, 450);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton btn1 = new JButton(new ImageIcon("Icono/menu2.png"));
		addComponent(btn1, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JLabel label1 = new JLabel("  ESTÁNDAR");
		label1.setFont(f);
		addComponent(label1, 1, 0, 2, 1, GridBagConstraints.HORIZONTAL);
		
		txtOperacion = new JTextField();
		txtOperacion.setFont(f);
		addComponent(txtOperacion, 0, 1, 7, 3, GridBagConstraints.HORIZONTAL);
		
		btnMC = new JButton("MC");
		btnMC.setFont(f);
		btnMC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText("");
                res = 0;
			}
		});
		addComponent(btnMC, 0, 4, 1, 1, 1);
		
		btnMR = new JButton("MR");
		btnMR.setFont(f);
		btnMR.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText("" + res);
			}
		});
		addComponent(btnMR, 1, 4, 1, 1, 1);
		
		btnMmas = new JButton("M+");
		btnMmas.setFont(f);
		btnMmas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				res += n1;
                txtOperacion.setText("" + res);
			}
		});
		addComponent(btnMmas, 2, 4, 1, 1, 1);
		
		btnMmenos = new JButton("M-");
		btnMmenos.setFont(f);
		btnMmenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				res -= n1;
                txtOperacion.setText("" + res);
			}
		});
		addComponent(btnMmenos, 3, 4, 1, 1, 1);
		
		btnMS = new JButton("MS");
		btnMS.setFont(f);
		addComponent(btnMS, 4, 4, 1, 1, 1);
		
		btnM = new JButton("M");
		btnM.setFont(f);
		addComponent(btnM, 5, 4, 1, 1, 1);
		
		btnPorcentaje = new JButton(new ImageIcon("Icono/porcentaje.png"));
		btnPorcentaje.setFont(f);
		btnPorcentaje.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(""+Double.parseDouble(txtOperacion.getText())/n1);
				
			}
		});
		addComponent(btnPorcentaje, 0, 5, 1, 1, 1);
		
		btnRaiz = new JButton(new ImageIcon("Icono/raiz.png"));
		btnRaiz.setFont(f);
		btnRaiz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(""+Math.sqrt(Double.parseDouble(txtOperacion.getText())));
			}
		});
		addComponent(btnRaiz, 1, 5, 2, 1, 1);
		
		btnXpotencia = new JButton("X^2");
		btnXpotencia.setFont(f);
		btnXpotencia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(""+Math.pow(Double.parseDouble(txtOperacion.getText()), 2));
			}
		});
		addComponent(btnXpotencia, 3, 5, 1, 1, 1);
		
		btnDivideX = new JButton("1/X");
		btnDivideX.setFont(f);
		btnDivideX.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(""+1/(Double.parseDouble(txtOperacion.getText())));
			}
		});
		addComponent(btnDivideX, 4, 5, 2, 1, 1);
		
		btnCE = new JButton("CE");
		btnCE.setFont(f);
		btnCE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText("");
				res = 0;
				l = true;
				op = false;
			}
		});
		addComponent(btnCE, 0, 6, 1, 1, 1);
		
		btnC = new JButton("C");
		btnC.setFont(f);
		btnC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtOperacion.getText().length() != 0) {
					txtOperacion.setText((txtOperacion.getText()).substring(0, (txtOperacion.getText().length()-1)));
					res = 0;
				}
			}
		});
		addComponent(btnC, 1, 6, 2, 1, 1);
		
		btnBack = new JButton(new ImageIcon("Icono/flecha.png"));
		btnBack.setFont(f);
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtOperacion.getText().length() != 0) {
					txtOperacion.setText((txtOperacion.getText()).substring(0, (txtOperacion.getText().length()-1)));
					res = 0;
				}
			}
		});
		addComponent(btnBack, 3, 6, 1, 1, 1);
		
		btnDividir = new JButton(new ImageIcon("Icono/dividir.png"));
		btnDividir.setFont(f);
		btnDividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(op == true){
					operacionP(Double.parseDouble(txtOperacion.getText()));
					op = false;
					l = false;
				}
				
				if(l == true) {
					n1 = Double.parseDouble(txtOperacion.getText());
					sg = "/";
					l = false;
					txtOperacion.setText("");
					op = true;
				}else{
					res = Double.parseDouble(txtOperacion.getText());
					n1 = n1 / res;
					txtOperacion.setText(n1+"");
					l = false;
				}
			}
		});
		addComponent(btnDividir, 4, 6, 2, 1, 1);
		
		btnSiete = new JButton("7");
		btnSiete.setFont(f);
		btnSiete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"7");
			}
		});
		addComponent(btnSiete, 0, 7, 1, 1, 1);
		
		btnOcho = new JButton("8");
		btnOcho.setFont(f);
		btnOcho.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"8");
			}
		});
		addComponent(btnOcho, 1, 7, 2, 1, 1);
		
		btnNueve = new JButton("9");
		btnNueve.setFont(f);
		btnNueve.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"9");
			}
		});
		addComponent(btnNueve, 3, 7, 1, 1, 1);
		
		btnMultiplicar = new JButton(new ImageIcon("Icono/multiplicar.png"));
		btnMultiplicar.setFont(f);
		btnMultiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == true){
					operacionP(Double.parseDouble(txtOperacion.getText()));
					op = false;
					l = false;
				}
				if(l == true) {
					n1 = Double.parseDouble(txtOperacion.getText());
					sg = "*";
					l = false;
					txtOperacion.setText("");
					op = true;
				}else{
					res = Double.parseDouble(txtOperacion.getText());
					n1 = n1 * res;
					txtOperacion.setText(n1+"");
					l = false;
				}
				
			}
		});
		addComponent(btnMultiplicar, 4, 7, 2, 1, 1);
		
		btnCuatro = new JButton("4");
		btnCuatro.setFont(f);
		btnCuatro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"4");
			}
		});
		addComponent(btnCuatro, 0, 8, 1, 1, 1);
		
		btnCinco = new JButton("5");
		btnCinco.setFont(f);
		btnCinco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"5");
			}
		});
		addComponent(btnCinco, 1, 8, 2, 1, 1);
		
		btnSeis = new JButton("6");
		btnSeis.setFont(f);
		btnSeis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"6");
			}
		});
		addComponent(btnSeis, 3, 8, 1, 1, 1);
		
		btnRestar = new JButton(new ImageIcon("Icono/restar.png"));
		btnRestar.setFont(f);
		btnRestar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == true){
					operacionP(Double.parseDouble(txtOperacion.getText()));
					op = false;
					l = false;
				}
				
				if(l == true) {
					n1 = Double.parseDouble(txtOperacion.getText());
					sg = "-";
					l = false;
					txtOperacion.setText("");
					op = true;
				}else{
					res = Double.parseDouble(txtOperacion.getText());
					n1 = n1 - res;
					txtOperacion.setText(n1+"");
					l = false;
				}
			}
		});
		addComponent(btnRestar,4, 8, 2, 1, 1);
		
		btnUno = new JButton("1");
		btnUno.setFont(f);
		btnUno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"1");
			}
		});
		addComponent(btnUno, 0, 9, 1, 1, 1);
		
		btnDos = new JButton("2");
		btnDos.setFont(f);
		btnDos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"2");
			}
		});
		addComponent(btnDos, 1, 9, 2, 1, 1);
		
		btnTres = new JButton("3");
		btnTres.setFont(f);
		btnTres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"3");
			}
		});
		addComponent(btnTres, 3, 9, 1, 1, 1);
		
		btnSumar = new JButton(new ImageIcon("Icono/sumar.png"));
		btnSumar.setFont(f);
		btnSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(l == true) {
					res = Double.parseDouble(txtOperacion.getText());
					sg = "+";
					l = false;
					txtOperacion.setText("");
					op = true;
				}else{
					res = Double.parseDouble(txtOperacion.getText());
					if(op == true){
						operacionP(Double.parseDouble(txtOperacion.getText()));
						op = false;
						l = false;
					}
					res = res + res;
					txtOperacion.setText(res+"");
					l = true;
					op = false;
				}
			}
		});
		addComponent(btnSumar, 4, 9, 2, 1, 1);
		
		btnMasMenos = new JButton("±");
		btnMasMenos.setFont(f);
		btnMasMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String v = txtOperacion.getText().substring(0, 1);
				if (!v.equalsIgnoreCase("+") && !v.equalsIgnoreCase("-")){
					v = "+";
					txtOperacion.setText("+"+txtOperacion.getText());
				}
				if (v.equalsIgnoreCase("+")) {					
					txtOperacion.setText("-"+txtOperacion.getText().substring(1, txtOperacion.getText().length()));
				} else {
					txtOperacion.setText("+"+txtOperacion.getText().substring(1, txtOperacion.getText().length()));
				}
			}
		});
		addComponent(btnMasMenos, 0, 10, 1, 1, 1);
		
		btnCero = new JButton("0");
		btnCero.setFont(f);
		btnCero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtOperacion.setText(txtOperacion.getText()+"0");
			}
		});
		addComponent(btnCero, 1, 10, 2, 1, 1);
		
		btnPunto = new JButton(".");
		btnPunto.setFont(f);
		btnPunto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int error = 0;
				for (int i = 0; i < txtOperacion.getText().length(); i++) {
					if(txtOperacion.getText().substring(i, i+1).equalsIgnoreCase(".")){
						error++;
					}
				}
				if(error == 0){
					txtOperacion.setText(txtOperacion.getText()+".");
				}
			}
		});
		addComponent(btnPunto, 3, 10, 1, 1, 1);
		
		btnIgual = new JButton(new ImageIcon("Icono/igual.png"));
		btnIgual.setFont(f);
		btnIgual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(op = true){
					operacionP(Double.parseDouble(txtOperacion.getText()));
					op = false;
				}
				txtOperacion.setText(n1+"");
				l = true;
				op = false;
			}
		});
		addComponent(btnIgual, 4, 10, 2, 1, 1);
		
	}//Metodo crear componentes
	
	public void operacionP(double tem){
		res = tem;
		if (sg == "+") {
			n1 = n1 + res;
		} else if (sg == "-") {
			n1 = n1 - res;
		} else if (sg == "/") {
			n1 = n1 / res;
		}else if (sg == "*") {
			n1 = n1 * res;
		}
	 }
	
	public void addComponent(JComponent c, int gx, int gy, int gw, int gh, int f){
		configuracion.gridx = gx;
		configuracion.gridy = gy;
		configuracion.gridwidth = gw;
		configuracion.gridheight = gh;
		configuracion.fill = f;
		gbl.setConstraints(c, configuracion);
		add(c);
		
	}//Método coordenadas componentes
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new Calculadora();
			}
		});
		
		new Calculadora();
		
	}
}