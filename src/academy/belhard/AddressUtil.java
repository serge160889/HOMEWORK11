package academy.belhard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressUtil {

    public static Address buildPerson(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String city = resultSet.getString("city");
        String street = resultSet.getString("street");
        int houseNumber = resultSet.getInt("house_number");
        int houseBuilding = resultSet.getInt("house_building");
        int apartmentNumber = resultSet.getInt("apartment_number");

        return new Address(id, city, street, houseNumber, houseBuilding, apartmentNumber);
    }

}
