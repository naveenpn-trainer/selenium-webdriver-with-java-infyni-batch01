package org.infyni.hands_on.exception_handling;

public class InvalidLicenseException extends RuntimeException{
    InvalidLicenseException(String str){
        super(str);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
