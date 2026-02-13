package com.example.listycity;

/**
 * This is a class that defines a City.
 * @author Arnav
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    /**
     * Constructs a City object with a city name and province.
     *
     * @param city The name of the city
     * @param province The province of the city
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city to another city alphabetically
     * based on the city name.
     *
     * @param o the city to compare with
     * @return a negative integer, zero, or a positive integer
     *         as this city is less than, equal to,
     *         or greater than the specified city
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Checks if two City objects are equal.
     * Two cities are considered equal if both their
     * city names and provinces are the same.
     *
     * @param o the object to compare
     * @return true if the cities are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City other = (City) o;
        return city.equals(other.city) &&
                province.equals(other.province);
    }

    /**
     * Returns a hash code value for the city.
     *
     * @return hash code of city and province
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }

}

