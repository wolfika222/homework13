import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Hp_Workplace on 2017. 06. 12..
 */
public class PaymentQuery {

    public static void QuerySelect(int column){


        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(QueryConstans.SELECT_COLUMN_FROM_PAYMENT);

            while (result.next()){
                System.out.println(result.getString(column));
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
