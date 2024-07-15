package org.infyni.hands_on.exception_handling;
class ABC {
    public void encrypt(String str,int licenseNumbers) throws InvalidLicenseException {
        if(licenseNumbers%15==0){
            String encryptedMessage = str.toUpperCase();
            System.out.println("Encrypt the data");
        }else{
            throw new InvalidLicenseException("Not a valid license");
        }


    }
}

public class _05_ExceptionHandling {
    public static void main(String[] args) {
            new ABC().encrypt("acb", 19);
    }
}
