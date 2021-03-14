package academy.belhard;

public class Address {
    private int id ;
    private String city ;
    private String street ;
    private int house_number ;
    private int house_building ;
    private int apartment_number ;

    public Address(int id, String city, String street, int house_number, int house_building, int apartment_number) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.house_number = house_number;
        this.house_building = house_building;
        this.apartment_number = apartment_number;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public int getHouse_number() { return house_number; }

    public void setHouse_number(int house_number) { this.house_number = house_number; }

    public int getHouse_building() { return house_building; }

    public void setHouse_building(int house_building) { this.house_building = house_building; }

    public int getApartment_number() { return apartment_number; }

    public void setApartment_number(int apartment_number) { this.apartment_number = apartment_number; }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house_number=" + house_number +
                ", house_building=" + house_building +
                ", apartment_number=" + apartment_number +
                '}';
    }


    public static Address createToSaving(String city, String street, int house_number, Integer house_building, Integer apartment_number) {
        return new Address(-1, city, street, house_number, house_building, apartment_number);
    }
}
