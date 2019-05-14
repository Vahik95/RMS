import java.sql.*;
import java.util.Scanner;

public class RMS {

    public static boolean exist(Connection connection, String email) throws SQLException {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        boolean exist = false;

        try {
            statement = connection.prepareStatement("SELECT * FROM Client WHERE email = ?");
            statement.setString(1, email);
            resultSet = statement.executeQuery();
            exist = resultSet.next();
        } finally {
            //close(resultSet, statement, connection);
        }

        return exist;
    }


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RMS_DB?autoReconnect=true&useSSL=false", "root", "root123!");
            Statement stmt = con.createStatement();

            Scanner sc = new Scanner(System.in);


            System.out.println("Please, input your name:");
            String name = sc.next();
            System.out.println("Please, input your email:");
            String email = sc.next();



            //System.out.println(exist(con, email));
            boolean result = exist(con, email);
            if(!result) {
                String query = " insert into Client (name, email)"
                        + " values (?, ?)";

                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString (1, name);
                preparedStmt.setString (2, email);
                if(!preparedStmt.execute()) {
                    System.out.println("Successfully registered new user");
                } else {
                    System.out.println("Failed to register new user");
                }

            }

            System.out.println("Welcome, " + name + "!");





            //ResultSet rs = stmt.executeQuery("select COUNT(*) from Client WHERE email = '" + email + "'");


           // while (rs.next())
             //   System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
