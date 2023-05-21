package beans;

//SENG3150 - Prototype
//Luke Lendon - 3181594
//searchBean class
public class searchBean {
    private String departureDestination;
    private String arrivalDestination;
    private String departureDate;
    private String arrivalDate;
    private int minPrice;
    private int maxPrice;
    private int[] tags;
    private int classType;
    private boolean returnFlight;
    private Flight[] additionalFlights;
    private int numOfPassengers;
    private String[] additionalRequirements;      //dietry requirements, optional extras for flight etc


    //Name: searchBean()
    //Description: The constructor method of the class
    //Inputs: None
    //Outputs: None
    public searchBean() {

    }

    //Name: basicSearch()
    //Description:
    //Inputs:
    //Outputs:
    public Flight[] basicSearch() {

    }

    //Name: unknownItemSearch()
    //Description:
    //Inputs: None
    //Outputs: None
    public Flight[] unknownItemSearch() {

    }

    //Name: setDepartureDestination(String departureDestination)
    //Description:
    //Inputs:
    //Outputs:
    public void setDepartureDestination(String departureDestination) {
        this.departureDestination = departureDestination;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public String getDepartureDestination() {
        return departureDestination;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setArrivalDestination(String arrivalDestination) {
        this.arrivalDestination = arrivalDestination;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public String getArrivalDestination() {
        return arrivalDestination;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public String getDepartureDate() {
        return departureDate;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public String getArrivalDate() {
        return arrivalDate;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public int getMinPrice() {
        return minPrice;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public int getMaxPrice() {
        return maxPrice;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setTags(int[] tags) {
        this.tags = tags;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public int[] getTags() {
        return tags;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setClassType(int classType ) {
        this.classType = classType;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public int getClassType() {
        return classType;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setReturnFlight(boolean returnFlight ) {
        this.returnFlight = returnFlight;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public boolean getReturnFlight() {
        return returnFlight;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setAdditionalFlights(Flight[] flights ) {
        this.additionalFlights = flights;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public Flight[] getAdditionalFlights() {
        return additionalFlights;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setNumOfPassengers(int numOfPassengers ) {
        this.numOfPassengers = numOfPassengers;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public void setAdditionalRequirements(String[] additionalRequirements) {
        this.additionalRequirements = additionalRequirements;
    }

    //Name: ()
    //Description:
    //Inputs:
    //Outputs:
    public String[] getAdditionalRequirements() {
        return additionalRequirements;
    }
}