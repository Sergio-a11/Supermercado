package vista;

import javax.swing.JOptionPane;

public class CajasMensaje {
 private String titulo,msj;

public CajasMensaje(String titulo, String msj) {
	this.titulo = titulo;
	this.msj = msj;
}
public CajasMensaje() {
	this.titulo = "";
	this.msj = "";
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getMsj() {
	return msj;
}
public void setMsj(String msj) {
	this.msj = msj;
}
public int leerEntero(String msj) {
	int valor;
	valor=Integer.parseInt(
			JOptionPane.showInputDialog(null,
					msj,titulo,1));
	return valor;
}
public double leerDecimal(String msj) {
	double valor;
	valor=Double.parseDouble(
			JOptionPane.showInputDialog(null,
					msj,titulo,1));
	return valor;
}
public String leerTexto(String msj) {
	return	JOptionPane.showInputDialog(null,
			msj,titulo,1);
}

 public void mostrar(String msj) {
	JOptionPane.showMessageDialog(null,
			             msj, titulo, 1); 
 }
 public boolean confirmar(String msj) {
  int resp=JOptionPane.showConfirmDialog(
          null, msj, titulo, 0,JOptionPane.QUESTION_MESSAGE); 
   if (resp==JOptionPane.YES_OPTION)
       return true;
   else
       return false;
 }
 
 public int seleccion(String msj)
 {
     String[] opciones = {"Básico", "General", "Exento"};
     int seleccion = JOptionPane.showOptionDialog(null, msj, getTitulo(), JOptionPane.DEFAULT_OPTION, 3, null, opciones, opciones[0]);
     return seleccion;
 }
}
