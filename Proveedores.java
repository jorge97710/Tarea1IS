
public class Proveedores {
	String nombre;
	int codigo_proveedor;
	String [] lista_juguetes;
	
	public Proveedores(String nombre, int codigo_proveedor, Object[] lista_juguetes) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo_proveedor() {
		return codigo_proveedor;
	}
	public void setCodigo_proveedor(int codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}
	public Object[] getLista_juguetes() {
		return lista_juguetes;
	}


}
