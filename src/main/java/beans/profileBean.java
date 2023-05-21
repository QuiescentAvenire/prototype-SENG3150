package beans;

//SENG3150 - Prototype
//Luke Lendon - 3181594
//profileBean class
public class profileBean {
    private String firstName;
    private String lastName;
    private String email;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int passportID;
    private String paymentInformation;  // Basically just a placeholder for all payment information as we will be using third party payments
    private Group[] groups = new Group[5];  // Going to limit users to being in a max of 5 groups
    private int numOfGroups;  //Number of groups the user is in
    private Flight[] cart;  //The flights the users has reserved and are in the cart
    private int numOfCartItems;  //Number of cart items

    //Name: profileBean()
    //Description: The constructor method of the class
    //Inputs: None
    //Outputs: None
    public profileBean() {

    }

    //Name: setFirstName(String firstName)
    //Description:
    //Inputs:
    //Outputs:
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Name: getFirstName()
    //Description:
    //Inputs:
    //Outputs:
    public String getFirstName() {
        return firstName;
    }

    //Name: setLastName(String lastName)
    //Description:
    //Inputs:
    //Outputs:
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Name: getLastName()
    //Description:
    //Inputs:
    //Outputs:
    public String getLastName() {
        return lastName;
    }

    //Name: setEmail(String email)
    //Description:
    //Inputs:
    //Outputs:
    public void setEmail(String email) {
        this.email = email;
    }

    //Name: getEmail()
    //Description:
    //Inputs:
    //Outputs:
    public String getEmail() {
        return email;
    }

    //Name: setDayOfBirth(int dayOfBirth)
    //Description:
    //Inputs:
    //Outputs:
    public void setDayOfBirth(int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }

    //Name: getDayOfBirth()
    //Description:
    //Inputs:
    //Outputs:
    public int getDayOfBirth() {
        return dayOfBirth;
    }

    //Name: setMonthOfBirth(int monthOfBirth)
    //Description:
    //Inputs:
    //Outputs:
    public void setMonthOfBirth(int monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }

    //Name: getMonthOfBirth()
    //Description:
    //Inputs:
    //Outputs:
    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    //Name: setYearOfBirth(int yearOfBirth)
    //Description:
    //Inputs:
    //Outputs:
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    //Name: getYearOfBirth()
    //Description:
    //Inputs:
    //Outputs:
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    //Name: setPassportID(int passportID)
    //Description:
    //Inputs:
    //Outputs:
    public void setPassportID(int passportID){
        this.passportID = passportID;
    }

    //Name: getPassportID()
    //Description:
    //Inputs:
    //Outputs:
    public int getPassportID() {
        return passportID;
    }

    //Name: setPaymentInformation(String paymentInformation)
    //Description:
    //Inputs:
    //Outputs:
    public void setPaymentInformation(String paymentInformation){
        this.paymentInformation = paymentInformation;
    }

    //Name: getPaymentInformation()
    //Description:
    //Inputs:
    //Outputs:
    public String getPaymentInformation() {
        return paymentInformation;
    }

    //Name: setNewGroup(Group newGroup)
    //Description:
    //Inputs:
    //Outputs:
    public void setUpdateGroups(Group group, boolean add){
        if (add){
            this.groups[numOfGroups] = group;
            numOfGroups++;
        }
        else {
            numOfGroups--;
            Group[] temp = new Group[numOfGroups];
            int j = 0;
            for (int i=0; i<numOfGroup; i++){
                if (groups[i] != group) {
                    temp[j] = groups[i];
                    j++;
                }
            }
            groups = temp;
        }
    }

    //Name: getGroups()
    //Description:
    //Inputs:
    //Outputs:
    public int getGroups() {
        return groups;
    }

    //Name: setUpdateCart(Flight cartItem)
    //Description:
    //Inputs:
    //Outputs:
    public void updateCart(Flight cartItem, boolean add){
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
    }

    //Name: getCart()
    //Description:
    //Inputs:
    //Outputs:
    public int getCart() {
        return cart;
    }
}
