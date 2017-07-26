
public class Juguete {

	int codigo;
	int v_unitario;
	String marca;
	int edad_min;
	boolean tipo;
	int cantidad;
	int complejidad;
	
	
	public Juguete(int codigo, int v_unitario, String marca, int edad_min, boolean tipo, int cantidad, int complejidad) {
		this.codigo = codigo;
		this.v_unitario = v_unitario;
		this.marca = marca;
		this.edad_min = edad_min;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.complejidad = complejidad;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getV_unitario() {
		return v_unitario;
	}
	public void setV_unitario(int v_unitario) {
		this.v_unitario = v_unitario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getEdad_min() {
		return edad_min;
	}
	public void setEdad_min(int edad_min) {
		this.edad_min = edad_min;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getComplejidad() {
		return complejidad;
	}
	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}
	
	
}
