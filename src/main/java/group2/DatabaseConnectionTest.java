package group2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.sql.*;

public class DatabaseConnectionTest extends ActionSupport  {
    /*-------------------------------Class Variables-------------------------------*/
    private String airlineCode;
    private String airlineName;
    private String countryCode3;


    /*-------------------------------Overridden Execute Method-------------------------------*/
    @Override
    public String execute() throws Exception {
        String ret = ERROR;
        Connection conn = null;
        /*----------------------Connecting to DB----------------------*/
        try {
            String URL = "jdbc:mariadb://localhost:3306/FlightPub";
            Class.forName("com.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "root");
            String sql = "SELECT AirlineCode, AirlineName FROM Airlines WHERE";
            sql+=" countryCode3 = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, countryCode3);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                airlineCode = rs.getString(1);
                airlineName = rs.getString(2);
                countryCode3 = rs.getString(3);
                ret = SUCCESS;
            }
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            ret = ERROR;
        }
        finally {
            if (conn != null) {
                try {
                    conn.close();
                }
                catch (Exception e) {

                }
            }
        }
        return ret;
    }
    /*-------------------------------Getters and Setters-------------------------------*/

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
