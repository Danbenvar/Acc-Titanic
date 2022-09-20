package Barco;

import java.time.LocalDate;

public class Persona {

	
	private String DNI;
	private String nombre;
	boolean minusvalia;
	LocalDate fechaNacimiento;
	private Paises pais;
	private zonas zona;
	private int orden;
	
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isMinusvalia() {
		return minusvalia;
	}
	public void setMinusvalia(boolean minusvalia) {
		this.minusvalia = minusvalia;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Paises getPais() {
		return pais;
	}
	public void setPais(Paises pais) {
		this.pais = pais;
	}
	public zonas getZona() {
		return zona;
	}
	public void setZona(zonas zona) {
		this.zona = zona;
	}
	
	
	public Persona(String dNI, String nombre, boolean minusvalia, LocalDate fechaNacimiento, Paises pais, zonas zona) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.minusvalia = minusvalia;
		this.fechaNacimiento = fechaNacimiento;
		this.pais = pais;
		this.zona = zona;
	}
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
