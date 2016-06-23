package service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ServiceTest implements Serializable{

	
	public String test(){
		return "hello world";
	}

	
}
