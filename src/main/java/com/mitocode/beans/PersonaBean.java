package com.mitocode.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;


import com.mitocode.clases.Persona;

@ManagedBean
@RequestScoped
public class PersonaBean {

	private Persona persona = new Persona();
	
	private static List<Persona> listPersonas =  new ArrayList<>();
	
	public PersonaBean() {
		
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona =  persona;
	}
	public List<Persona> getListPersonas() {
		return listPersonas;
	}
	public void setListPersonas(List<Persona> listPersonas) {
		PersonaBean.listPersonas = listPersonas;
	}
	
	public void agregarPersona() {
		PersonaBean.listPersonas.add(this.persona);
	//	this.listPersonas.add(this.persona);
	}
	public void eliminarPersona(Persona persona) {
		PersonaBean.listPersonas.remove(persona);
	}
	public void registrar() {
		PersonaBean.listPersonas.add(persona);
	}
	
	public void validar(FacesContext  context, UIComponent toValidate, Object value) {
        //UIComponent es el componente que esta inviocando  este metodo o la aciion
		//Object value es el valor que trae consigo el componente es decir el texto
		//FacesContexttener acceso a todas la variables que son manegadas JSF
		context = FacesContext.getCurrentInstance();
	    String texto = (String)value;
	    
	    if(!texto.equalsIgnoreCase("M") && !texto.equalsIgnoreCase("F")) {
	    	((UIInput)toValidate).setValid(false); 
	    	context.addMessage((toValidate.getClientId(context)), new FacesMessage("Sexo no valido"));
	    }
		
	}
}
