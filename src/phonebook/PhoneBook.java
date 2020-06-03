package phonebook;

import java.io.Serializable;

public class PhoneBook implements Serializable {
    private String name;
    private int phoneNumber;
    private String address;
    private String email;
    private String facebook;

    public PhoneBook(String name, int phoneNumber, String address, String email, String facebook) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
    }

    public PhoneBook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString(){
        return "Name: "+name+", Phone: "+phoneNumber+", Address: "+address+", Email:"+email+", Facebook: "+facebook;
    }
}
