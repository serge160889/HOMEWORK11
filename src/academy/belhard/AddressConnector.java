package academy.belhard;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressConnector {
    private static final String ADD = "INSERT INTO addresses (id,city, street, house_number, house_building, apartment_number) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL = "SELECT * FROM addresses";
    private static final String DELETE = "DELETE FROM addresses WHERE id = ?";
    private static final String UPDATE = "UPDATE addresses SET city = ?, street = ?, house_number = ?, house_building = ?, apartment_number = ? WHERE id = ?";

    public static void add(Address address) {
        Connection connection = DbConnectionProvider.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {
            statement.setInt(1, address.getId());
            statement.setString(2, address.getCity());
            statement.setString(3, address.getStreet());
            statement.setInt(4, address.getHouse_number());
            statement.setInt(5, address.getHouse_building());
            statement.setInt(6, address.getApartment_number());


            int changed = statement.executeUpdate();
            System.out.println("Changed items:" + changed);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Address> readAll() {
        List<Address> addresses = new ArrayList<>();
        Connection connection = DbConnectionProvider.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_ALL)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Address address = AddressUtil.buildPerson(result);

                addresses.add(address);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return addresses;
    }

    public static void delete(int id) {
        Connection connection = DbConnectionProvider.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(DELETE)) {
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ошибка обновления");
        }
    }

    public static void update(Address address, int id) {
        Connection connection = DbConnectionProvider.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(UPDATE)) {

             statement.setString(1, address.getCity());
            statement.setString(2, address.getStreet());
            statement.setInt(3, address.getHouse_number());
            statement.setInt(4, address.getHouse_building());
            statement.setInt(5, address.getApartment_number());
            statement.setInt(6, id);

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ошибка обновления");
        }


    }
}

