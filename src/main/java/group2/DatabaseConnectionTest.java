package group2;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionTest extends ActionSupport {
    private String airlineCode;
    private String airlineName;
    private String countryCode3;

    private List<Airline> airlines;

    public String execute() throws Exception {

        airlines = new ArrayList<>();

        try {
            String URL = "jdbc:mariadb://localhost:3306/FlightPub";
            String username = "root";
            String password = "root";

            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, username, password);

            String sql = "SELECT AirlineCode, AirlineName, countryCode3 FROM Airlines";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String airlineCode = rs.getString("AirlineCode");
                String airlineName = rs.getString("AirlineName");
                String countryCode3 = rs.getString("countryCode3");
                airlines.add(new Airline(airlineCode, airlineName, countryCode3));
            }

            conn.close();
            return SUCCESS;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    // Rest of the getter and setter methods
    // ...
}
