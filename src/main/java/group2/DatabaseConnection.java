//package group2;
//
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//
//import java.sql.*;
//
//public class DatabaseConnection extends ActionSupport implements ModelDriven<FlightBean> {
//    /*-------------------------------Class Variables-------------------------------*/
//    String title;
//
//    private FlightBean model = new FlightBean();
//
//    @Override
//    public FlightBean getModel() {return model;}
//
//    /*-------------------------------Overridden Execute Method-------------------------------*/
//    @Override
//    public String execute() throws Exception {
//        String ret = ERROR;
//        Connection conn = null;
//        /*----------------------Connecting to DB----------------------*/
//        try {
//            String URL = "jdbc:mariadb://localhost:3306/FlightPub";
//            Class.forName("com.mariadb.jdbc.Driver");
//            conn = DriverManager.getConnection(URL, "root", "root");
//            String sql = "SELECT AirlineCode, AirlineName, CountryCode3 FROM Airlines;";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()){
//                title = rs.getString(1);
//                ret = SUCCESS;
//            }
//        }
//        catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            ret = ERROR;
//        }
//        finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                }
//                catch (Exception e) {
//
//                }
//            }
//        }
//        return ret;
//
//    }
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//}
