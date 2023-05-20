package group2;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionTest extends ActionSupport {
    private List<Airline> airlines = new ArrayList<>();

    @Override
    public String execute() throws Exception {
        String ret = ERROR;
        Connection conn = null;

        try {
            String URL = "jdbc:mariadb://localhost:3306/FlightPub";
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "root");
            String sql = "SELECT AirlineCode, AirlineName, countryCode3 FROM Airlines";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String airlineCode = rs.getString("AirlineCode");
                String airlineName = rs.getString("AirlineName");
                String countryCode3 = rs.getString("countryCode3");
                Airline airline = new Airline(airlineCode, airlineName, countryCode3);
                airlines.add(airline);
            }

            ret = SUCCESS;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            ret = ERROR;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return ret;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public class Airline {
        private String airlineCode;
        private String airlineName;
        private String countryCode3;

        public Airline(String airlineCode, String airlineName, String countryCode3) {
            this.airlineCode = airlineCode;
            this.airlineName = airlineName;
            this.countryCode3 = countryCode3;
        }

        public String getAirlineCode() {
            return airlineCode;
        }

        public String getAirlineName() {
            return airlineName;
        }

        public String getCountryCode3() {
            return countryCode3;
        }
    }
}