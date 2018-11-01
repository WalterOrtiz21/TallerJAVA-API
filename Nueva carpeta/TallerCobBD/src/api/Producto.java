package api;

public class Producto {
	private int id_producto;
	private String nombre;
	private String proveedor;
	private int precio;
	
	public Producto() {
		super();
	}
	
	public Producto(int id_producto, String nombre, String proveedor, int precio) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.precio = precio;
	}
	
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
