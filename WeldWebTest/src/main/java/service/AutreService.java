package service;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AutreService implements Serializable{

	public String test2(){
		return "Hello World";
	}
	
	@PostConstruct
    public void initialize() {
        System.out.println("Starting");
    }

    @PreDestroy
    public void stop() {
        System.out.println("Stopping");
    }
	
}
