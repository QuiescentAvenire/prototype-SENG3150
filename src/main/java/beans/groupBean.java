package beans;

import group2.Flight;
import group2.Search;
import group2.User;

//SENG3150 - Prototype
//Luke Lendon - 3181594
//groupBean class
public class groupBean {
    private User[] users;  //Users in the group
    private int numOfUsers;  //Number of users in the group
    private Search[] toggledOnSearches;  //Searches that have been saved and toggled on for use in the group search
    private int numOfSearches;  //Number of searches toggled on
    private User groupLeader;  //The groups leader
    private Flight[] cart;  //The flights that have been reserved and in the cart
    private int numOfCartItems; //Number of flights in the cart

    //Name: groupBean()
    //Description: The constructor method of the class
    //Inputs: None
    //Outputs: None
    public groupBean() {

    }

    //Name: setGroupLeader(User user)
    //Description:
    //Inputs:
    //Outputs:
    public void setUpdateUsers(User user) {
        this.groupLeader = user;
    }

    //Name: getGroupLeader(User user)
    //Description:
    //Inputs:
    //Outputs:
    public User getGroupLeader(User user) {
        return groupLeader;
    }

    //Name: updateToggledOnSearches(User user, boolean add)
    //Description:
    //Inputs:
    //Outputs:
    public void updateToggledOnSearches(Search search, boolean add) {
        if (add){
            this.toggledOnSearches[numOfSearches] = search;
            numOfSearches++;
        }
        else {
            numOfSearches--;
            Search[] temp = new Search[numOfSearches];
            int j = 0;
            for (int i=0; i<numOfSearches; i++){
                if (toggledOnSearches[i] != search) {
                    temp[j] = toggledOnSearches[i];
                    j++;
                }
            }
            toggledOnSearches = temp;
        }
    }

    //Name: getToggledOnSearches()
    //Description:
    //Inputs:
    //Outputs:
    public Search[] getToggledOnSearches() {
        return toggledOnSearches;
    }

    //Name: updateUsers(User user, boolean add)
    //Description:
    //Inputs:
    //Outputs:
    public void updateUsers(User user, boolean add) {
        if (add){
            this.users[numOfUsers] = user;
            numOfUsers++;
        }
        else {
            numOfUsers--;
            User[] temp = new Users[numOfUsers];
            int j = 0;
            for (int i=0; i<numOfUsers; i++){
                if (users[i] != user) {
                    temp[j] = users[i];
                    j++;
                }
            }
            users = temp;
        }
    }

    //Name: getUsers()
    //Description:
    //Inputs:
    //Outputs:
    public User[] getUsers() {
        return users;
    }

    //Name: updateCart(Flight cartItem, User user, boolean add)
    //Description:
    //Inputs:
    //Outputs:
    public void updateCart(Flight cartItem, User user, boolean add){
        if (add){
            this.cart[numOfCartItems] = cartItem;
            numOfCartItems++;
        }
        else {
            numOfCartItems--;
            Flight[] temp = new Flight[numOfCartItems];
            int j = 0;
            for (int i=0; i<numOfCartItems; i++){
                if (cart[i] != cartItem) {
                    temp[j] = cart[i];
                    j++;
                }
            }
            cart = temp;
        }
        for (int i=0; i<numOfUsers; i++){
            if (users[i] == user){
                users[i].updateCart(cartItem, add);
            }
        }
    }

    //Name: getCart()
    //Description:
    //Inputs:
    //Outputs:
    public int getCart() {
        return cart;
    }
}
