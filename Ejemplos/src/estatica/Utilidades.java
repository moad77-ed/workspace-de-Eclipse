package estatica;

public class Utilidades {
	private final static double IVA_NORMAL = 21;
	private final static double IVA_REDUCIDO = 4;
	
	public static double calcularIva(double precio) {
		return precio * (IVA_NORMAL/100);
	}
	
	public static double calcularIvaReducido(double precio) {
		return precio * (IVA_REDUCIDO/100);
	}
	
	public double calcularPrecioSinIva(double precio) {
		return precio - calcularIva(precio);
	}
	
	public double calcularPrecioSinIvaReducido(double precio) {
		return precio - calcularIvaReducido(precio);
	}
}
