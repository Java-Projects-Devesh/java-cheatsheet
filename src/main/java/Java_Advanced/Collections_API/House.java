package Java_Advanced.Collections_API;

import java.util.Objects;

public class House {
    private int rooms;
    private String color;
    private double housePrice;
    public House(int rooms, String color, double housePrice) {
        this.rooms = rooms;
        this.color = color;
        this.housePrice = housePrice;
    }

    public int getRooms() {
        return rooms;
    }

    public String getColor() {
        return color;
    }

    public double getHousePrice() {
        return housePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return rooms == house.rooms && Double.compare(house.housePrice, housePrice) == 0 && Objects.equals(color, house.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms, color, housePrice);
    }

    @Override
    public String toString() {
        return "Rooms: " + rooms +
                " | color: " + color +
                " | House Price: " + housePrice;
    }
}
