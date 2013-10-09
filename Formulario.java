import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Formulario extends JFrame implements ActionListener {
        JLabel l1 = new JLabel("Valor Unitario");
	JLabel l2 = new JLabel("Cantidad");
	JLabel l3 = new JLabel("Tipo de zapatilla");
        JLabel l4 = new JLabel("Valor de cada venta");
        JLabel l5 = new JLabel("Venta Total Tipo 1");
        JLabel l6 = new JLabel("Venta Total Tipo 2");
        JLabel l7 = new JLabel("Venta Total Tipo 3");
	JLabel l8 = new JLabel("Venta Total Tipo 4");
        JLabel l9 = new JLabel("Total de las ventas");
        JLabel l10 = new JLabel("Numero de Venta");
        JLabel l11 = new JLabel("Total descuento marca 1");
        JLabel l12 = new JLabel("Total descuento marca 2");
        JLabel l13 = new JLabel("Total de descuentos");
        Choice ch = new Choice();
	TextArea ta = new TextArea("Para desplegar la lista",5,20,TextArea.SCROLLBARS_BOTH);
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField("0");
	JTextField t4 = new JTextField("0");
	JTextField t5 = new JTextField("0");
	JTextField t6 = new JTextField("0");        
        JTextField t7 = new JTextField("0");        
        JTextField t8 = new JTextField("0");
        JTextField t9 = new JTextField("1");        
        JTextField t10 = new JTextField("0");        
        JTextField t11 = new JTextField("0");        
        JTextField t12 = new JTextField("0");        
                                
	JButton b1 = new JButton("Vender");
	JButton b2 = new JButton("Listar");
	JButton b3 = new JButton("Consultar");
	Metodos met = new Metodos();
	String cadena = "";

        public Formulario(){
		super("Ventas");
		this.setLayout(null);
		ch.addItem("Tipo 1");
		ch.addItem("Tipo 2");
                ch.addItem("Tipo 3");
                ch.addItem("Tipo 4");
//		se crean las etiquetas y se agregan al formulario
		this.l1.setBounds(10, 10, 150, 23);
		this.add(l1);
		this.l2.setBounds(10, 35, 150, 23);
		this.add(l2);
		this.l3.setBounds(10, 60, 150, 23);
		this.add(l3);
		this.l4.setBounds(10, 150, 150, 23);
		this.add(l4);
                this.l5.setBounds(10, 175,150, 23);
		this.add(l5);
                this.l6.setBounds(10, 200, 150, 23);
		this.add(l6);
                this.l7.setBounds(10, 225, 150, 23);
		this.add(l7);
                this.l8.setBounds(10, 250, 150, 23);
		this.add(l8);
                this.l9.setBounds(10, 275, 150, 23);
		this.add(l9);
                this.l11.setBounds(10, 300, 150, 23);
		this.add(l11);
                this.l12.setBounds(10, 325, 150, 23);
		this.add(l12);
                this.l13.setBounds(10, 350, 150, 23);
		this.add(l13);
                //se crean los textos y se agregan al formulario
		this.t1.setBounds(170, 10, 200, 23);
		this.add(t1);
		this.t2.setBounds(170, 35, 200, 23);
		this.add(t2);
	//	this.t3.setEditable(false);
		this.t3.setBounds(170, 150, 200, 23);
		this.add(t3);
                this.t4.setBounds(170, 175, 200, 23);
		this.add(t4);
                this.t5.setBounds(170, 200, 200, 23);
		this.add(t5);
                this.t6.setBounds(170, 225, 200, 23);
		this.add(t6);
                this.t7.setBounds(170, 250, 200, 23);
		this.add(t7);
                this.t8.setBounds(170, 275, 200, 23);
		this.add(t8);
                this.t10.setBounds(170, 300, 200, 23);
		this.add(t10);
                this.t11.setBounds(170, 325, 200, 23);
		this.add(t11);
                this.t12.setBounds(170, 350, 200, 23);
		this.add(t12);
                
                this.ch.setBounds(170, 60, 200, 23);
		this.add(ch);
                this.l10.setBounds(10, 85, 120, 25);
		this.add(l10);
                this.t9.setBounds(130, 85, 40, 25);
                this.add(t9);
                //No deja modificar los textfield
                t3.setEditable(false);
                t4.setEditable(false);
                t5.setEditable(false);
                t6.setEditable(false);
                t7.setEditable(false);
                t8.setEditable(false);
                t9.setEditable(false);
                t10.setEditable(false);
                t11.setEditable(false);
                t12.setEditable(false);
//		se crean los botones y se agregan el formulario
		this.b1.setBounds(190, 85, 160, 25);
		this.b1.addActionListener(this);
		this.add(b1);
		this.b2.setBounds(10, 115, 160, 25);
		this.b2.addActionListener(this);
		this.add(b2);
                this.b3.setBounds(190, 115, 160, 25);
		this.b3.addActionListener(this);
		this.add(b3);
                this.ta.setBounds(10, 380, 350, 200);
		this.add(ta);
                ta.setEditable(false);
		//Cerrar el formulario
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(380,620);
		this.setResizable(false);
		this.setVisible(true);
	}
        
	public static void main (String arg[]){
		new Formulario();
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==b1){
                    				Nodo no = new Nodo();
			if (t1.getText().equals("") || t2.getText().equals("")|| t9.getText().equals("")){
				JOptionPane.showMessageDialog(new JDialog(), "Faltan Datos");
			}  
                        else 
                        {
				no.valorU=Integer.parseInt(t1.getText());
				no.cantidadV=Integer.parseInt(t2.getText());                                
                                no.numVenta=t9.getText();
                                no.tipoZapatillas=ch.getSelectedIndex();                           
				met.adicionar(no);
				clear(); 
                        // Va haciendo calculos
                        int venta=0;
                        venta=(no.valorU*no.cantidadV);
                        t3.setText(Integer.toString(venta));
                        // Devuelve el valort3.setText(Double.toString(venta));
                        int zapatos;
                        int tipo1=0, tipo2=0,tipo3=0,tipo4=0;               
                        tipo1=Integer.parseInt(t4.getText());
                        tipo2=Integer.parseInt(t5.getText());
                        tipo3=Integer.parseInt(t6.getText());
                        tipo4=Integer.parseInt(t7.getText());
                        zapatos=  ch.getSelectedIndex();
                        if(zapatos==0)
                        {
                            tipo1=tipo1+venta;
                            t4.setText(Integer.toString(tipo1));
                        }
                         if(zapatos==1)
                        {
                            tipo2=tipo2+venta;
                            t5.setText(Integer.toString(tipo2));
                        }
                          if(zapatos==2)
                        {
                            tipo3=tipo3+venta;
                            t6.setText(Integer.toString(tipo3));
                        }
                           if(zapatos==3)
                        {
                            tipo4=tipo4+venta;
                            t7.setText(Integer.toString(tipo4));
                        }
                    no.res1=Integer.parseInt(t4.getText());
                    no.res2=Integer.parseInt(t5.getText());
                    no.res3=Integer.parseInt(t6.getText());
                    no.res4=Integer.parseInt(t7.getText());
                    int suma=0;
                    suma=no.res1+no.res2+no.res3+no.res4;       
                    t8.setText(Integer.toString(suma));       
                    
                    //variable para incremento de factura
                    int n=1;
                    no.numVenta=t9.getText();
                    
                    //la variable n aumenta cada vez que se agrega una factura
                    n=(Integer.parseInt(no.numVenta))+1;
                    //se muestra en el textfield el incremento
                    t9.setText(Integer.toString(n));
                    
                    double descuento1=0;
                    descuento1= (Double.parseDouble(t4.getText())*0.05);
                    t10.setText(Double.toString(descuento1));
                    
                    double descuento2=0;
                    descuento2= (Double.parseDouble(t5.getText())*0.05);
                    t11.setText(Double.toString(descuento2));
                    
                    double descuentoTotal=0;
                    descuentoTotal=descuento1+descuento2;
                    t12.setText(Double.toString(descuentoTotal));
                        }
		}
		if (arg0.getSource()==b2){
			cadena = met.listar();
			ta.setText(cadena);
		}
		if (arg0.getSource()==b3){
                met.buscar();
		}
	}
        
	public void clear(){
		t1.setText("");
		t2.setText("");
		t1.requestFocus();
	}
}
