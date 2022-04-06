package com.mitocode.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value = "MayorEdadValidator")
public class MayorEdadValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		//String texto= (String)value;
		String texto= String.valueOf(value);
		int edad = Integer.parseInt(texto);
		
		if(edad <18) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Edad no permitida", "debe ser mayor 18");
			throw new ValidatorException(msg);
		}
		
	}

}
