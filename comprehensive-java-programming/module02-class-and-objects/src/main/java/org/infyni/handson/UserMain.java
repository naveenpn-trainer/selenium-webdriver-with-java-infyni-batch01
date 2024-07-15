package org.infyni.handson;
class User{
    // Properties / Attributes / Variables
    String userName;
    String password;

    // Behaviours / Methods :  which modify the properties

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class UserMain {
    public static void main(String[] args) {
        // ClassName objReference = new ClassName();
        User userOne = new User();
        userOne.setUserName("Krishna");
        String userName = userOne.getUserName();
        System.out.println("User Name= "+userName);
    }
}
