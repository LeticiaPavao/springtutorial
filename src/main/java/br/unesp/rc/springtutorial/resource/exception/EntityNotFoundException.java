package br.unesp.rc.springtutorial.resource.exception;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(){

    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
    
}
