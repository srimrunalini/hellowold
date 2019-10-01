package M4_ass1; /**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
    import javax.naming.Name;

class Contact {
    String name;
    String email;
    String Pno;
    public Contact(String Name, String Email, String phoneNumber) {
        name=Name;
        email=Email;
        Pno=phoneNumber;
        //System.out.println(name+"     "+email+"     "+PN);
    }
    String getName(){
        //System.out.println(name+"Hello");
        return name;
    }
    String getEmail(){
        return email;
    }
    String getPhoneNumber(){
        return Pno;
    }
    String setName(String Name){
        name=Name;
        return name;
    }
    String setEmail(String Email){
        email=Email;
        return email;
    }
    String setPhoneNumber(String PhoneNumber){
        Pno=PhoneNumber;
        return Pno;
    }
    public String toString() {
        String k="{ Name = "+name+", Email = "+email+", Phone Number = "+Pno+" }";
        return k;
    }
}






