package group2;

public class Airline {
    private String airlineCode;
    private String airlineName;
    private String countryCode3;

    public Airline() {
    }

    public Airline(String airlineCode, String airlineName, String countryCode3) {
        this.airlineCode = airlineCode;
        this.airlineName = airlineName;
        this.countryCode3 = countryCode3;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }
}
