package cl.infoclub.fsj.entity;

import org.springframework.stereotype.Component;

@Component("contact")
public class Contact {
	private int idContact;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String direccion;
	private int telefono;
	public Contact(int idContact, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion,
			int telefono) {
		super();
		this.idContact = idContact;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdContact() {
		return idContact;
	}
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
