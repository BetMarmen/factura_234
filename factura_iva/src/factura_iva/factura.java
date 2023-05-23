package factura_iva;

public class factura {
private producto pro;
private int cantidad;
public factura(producto pro, int cantidad) {
	super();
	this.pro = pro;
	this.cantidad = cantidad;
}
public double subtotal() {
	return  pro.preciofinal()*cantidad;
}
public void mostrar_factura() {
	System.out.println("Su factura!");
	System.out.println("Producto:"+pro.getNombre());
	System.out.println("Cantidad:"+cantidad);
	System.out.println("Precio Unitario antes de IVA:"+pro.getPrecio());
	System.out.println("IVA  a pagar:"+pro.iva());
	System.out.println("Precio unitario con IVA:"+pro.preciofinal());
	System.out.println("Total a pagar:"+subtotal());
}
}
