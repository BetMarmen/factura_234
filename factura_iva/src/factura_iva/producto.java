package factura_iva;

public class producto {
private String nombre;
private double precio;
public producto(String nombre, double precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
}
public String getNombre() {
	return nombre;
}
public double getPrecio() {
	return precio;
}
public double iva() {
	return precio*0.15;
}
public double preciofinal() {
	return precio+iva();
}
}
