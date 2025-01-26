import java.sql.*;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id,name,roll,and phone");
            int id = sc.nextInt();
            sc.nextLine();// flushing --> int paxi string lida flush garnu parxa
            String name = sc.nextLine();
            int roll = sc.nextInt();
            // flushing
            sc.nextLine();
            String phone = sc.nextLine();

            // loading driver
            Class.forName("com.microsoft.sqlServer.jdbc.SQLServerDriver");

            String server = "127.0.0.1";
            int port = 3306;
            String user = "root";
            String password = "root";
            String database = "db_soe_2023";// database name
            String url = "jdbc:sqlserver://" + server + ":" + port + ";user=" + user + ";password=" + password
                    + ";databaseName=" + database;

            // double quote vtra arko variable "+...+" yesari lekheko natra ,value nai
            // manthoy

            Connection con = DriverManager.getConnection(url);

            String str = "insert into tbl_student values(" + id + ",'" + name + "," + roll + "," + phone + "')";

            Statement stat = con.createStatement();
            stat.executeUpdate(str);
            System.out.println("Record Inserted Successfully");
            stat.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Cannot insert into the table" + e);
        }

    }

}
