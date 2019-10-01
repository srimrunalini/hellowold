package M4_ass1;

/**
 * This class maintains the contacts of your friends / relations / wellwishers et.
 * 
 * The following are the opertaions that this ContactManager application can
 * perform.
 * 
 * You can create a contact of your choice.
 *      Creates a contact and keep this in the ContactManager list.
 * You can search for a contact by name
 *      Search for a contact based on the name in the ContactManager list.
 * You can search for a contact by email.
 *      Search for a contact based on email in the ContactManager list.
 * You can delete a contact by name.
 *      Search for a contact based on name of the contact and delete from the 
 *      ContactManager list.
 * 
 * @author Siva Sankar
 */
import java.lang.*;

class ContactsManager {


    /**
     * Define a variable myFriends which is an array that can hold
     * the contacts of your friends.
     */
    Contact[] myFriends;
    int friendsCount;


    /**
     * Define a variable friendsCount of type int maintain the number of 
     * contacts of your friends.
     */


    /**
     * When the object of ContactManager is created, the constructor should
     * constrcut the object initialy with the following requirements.
     * <p>
     * 1. Initializes the friendsCount to 0 as there no contacts in the list.
     * 2. myFriends with array initial size of 500
     */
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    /**
     * The addContact method takes in a parameter of type contact object and
     * adds this to the contact list.
     *
     * @param contact, to be added.
     */


    public void addContact(Contact contact) {
        //  Your code goes here....

        //  Nothing to be returned... As this method is void...
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    /**
     * This method search for the contact based on the name of your friend and gives the
     * first occurance of the contact in your friends list.
     *
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContact(String searchName) {
        //  Your code goes here....
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    /**
     * This method search for the contact based on the email of your friend
     * and gives the first occurance of the contact in your friends list.
     *
     * @param searchName, the email of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContactByEmail(String email) {
        //  Your code goes here....


        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].email.equals(email)) {
                return myFriends[i];
            }
        }

        return null;
    }

    /**
     * This method deletes the contact based on the name of your friend and returns
     * true on success and false if failure in deleting the contact.
     *
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return true if contact has been removed successfully and false otherwise.
     */
    public boolean deleteContact(String searchName) {
        //  Your code goes here....
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                myFriends[i].name = "doodle";
                return true;
            }
        }
        return false;
    }


    // Any additional method that you want to implement by yourself.

    //  Happy Coding... Have Fun.....

    static class Main {
        public static void main(String[] args) {

            ContactsManager myContactManager = new ContactsManager();
        }
    }
}
