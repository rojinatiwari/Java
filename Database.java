import java.sql.*;
import java.util.Scanner;

public class Database {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter username and password:");

            String uname = sc.nextLine();
            String pwd = sc.nextLine();

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection parameters
            String server = "localhost";
            int port = 3306;
            String user = "root";
            String password = "root";
            String database = "db_soe_2023";

            // MySQL JDBC URL
            String url = "jdbc:mysql://" + server + ":" + port + "/" + database +
                    "?useSSL=false&allowPublicKeyRetrieval=true";

            // Establishing connection
            Connection con = DriverManager.getConnection(url, user, password);

            // SQL Query with proper escaping
            String str = "SELECT * FROM tbl_login WHERE uname='" + uname.replace("'", "''")
                    + "' AND password='" + pwd.replace("'", "''") + "'";

            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(str);

            if (res.next()) {
                System.out.println("Welcome to my app");
            } else {
                System.out.println("Invalid login details");
            }

            // Closing resources
            res.close();
            stat.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
