package Encapsulation;

public class User {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String cardNumber;
    private int birthDate;
    private int password;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public int getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(int birthDate){
        this.birthDate = birthDate;
    }

    public int getPassword(){
        return password;
    }

    public void setPassword(int password){
        this.password = password;
    }
}
