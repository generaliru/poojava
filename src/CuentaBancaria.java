
public class CuentaBancaria {
	
	private String intitucion = "";
	private String beneficiario = "";
	private float saldo = 0;
	private long numeroCuenta = 0;
	private String producto = "";
	private String direccion = "";
	private String rfc = "";
	
	
	
	/**
	 * @return the intitucion
	 */
	private String getIntitucion() {
		return intitucion;
	}

	/**
	 * @param intitucion the intitucion to set
	 */
	private void setIntitucion(String intitucion) {
		this.intitucion = intitucion;
	}

	/**
	 * @return the beneficiario
	 */
	private String getBeneficiario() {
		return beneficiario;
	}

	/**
	 * @param beneficiario the beneficiario to set
	 */
	private void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	/**
	 * @return the saldo
	 */
	private float getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	private void setSaldo(float saldo) {
		if (saldo > 0) {
			this.saldo = saldo;			
		}
		else {
			throw new IllegalArgumentException("El saldo es incorrecto");
		}
	}

	/**
	 * @return the numeroCuenta
	 */
	private long getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	private void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the producto
	 */
	private String getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	private void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * @return the direccion
	 */
	private String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the rfc
	 */
	private String getRfc() {
		return rfc;
	}

	/**
	 * @param rfc the rfc to set
	 */
	private void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public void depositos(float monto) {
		if (monto > 0) {
			this.saldo += monto;
		}
	}
	
	public void retiro(float monto) {
		if(monto <=  this.saldo && monto > 0) {			
			this.saldo -= monto;
		}
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}
	
	public String estadoCuenta() {
		return "";
	}
	
	
}
