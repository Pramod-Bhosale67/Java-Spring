import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {


        /*
          1. import package
          2. load & register
          3. create connection
          4. Execute
          5. process & result
          6. close
         */

        //step 2
        try{
            Class.forName("org.postgresql.Driver");
        }catch (Exception e){
            System.out.println("Error while loading & registering the driver");
        }

        //step 3
        Connection con = null;
        try{
            String url = "jdbc:postgresql://localhost:5432/Demo";
            String userName = "postgres";
            String pass = "error404";

            con = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connected");

        }catch(Exception e){
            System.out.println("Error while connecting to database");
            System.out.println(e);
        }

        // step 4 : Execute
        Statement st = null;

        try{
            assert con != null;
            st = con.createStatement();

            /* Reading the data
                String sql = "Select * from Students";

                //storing the res of query after running it
                ResultSet res = st.executeQuery(sql);
                //res.next();

                while(res.next()){
                    System.out.print(res.getString("roll") + " " + res.getString("name"));
                    System.out.println();
                }
            */

            //insert
//            String sql = "insert into Students values(8, 'Navin')";
//            st.execute(sql);

            // update
//            String sql = "update Students set name = 'Navin' where roll = 8";
//            st.execute(sql);

            String sql = "delete from Students where roll = 8";
            st.execute(sql);

        }catch(Exception e){
            System.out.println("Cannot create the statement");
            System.out.println(e);
        }

        con.close();

    }
}