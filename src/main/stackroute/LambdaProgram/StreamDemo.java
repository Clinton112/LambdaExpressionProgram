/*
  2)Create class StreamDemo .
  Create list like -
       places.add("Nepal, Kathmandu");
       places.add("Nepal, Pokhara");
       places.add("India, Delhi");
       places.add("USA, New York");
       places.add("Africa, Nigeria");

   a)print all the places from Nepal.
   Output should be Kathmandu and Pokhara.
 */
package main.stackroute.LambdaProgram;

import java.util.ArrayList;

public class StreamDemo
{
    public static void main(String[] args)
    {
        ArrayList<Place> places=new ArrayList<Place>();//create an arraylist object places
        places.add(new Place("Nepal","Kathmandu"));//add country name and city name
        places.add(new Place("Nepal","Pokhara"));
        places.add(new Place("Sri Lanka","Colombo"));
        places.add(new Place("India","Mumbai"));
        places.add(new Place("Pakistan","Karachi"));
        places.stream()
                .filter(place -> place.getCountry().equals("Nepal"))
                .forEach(System.out::println);//using stream function using place object to getcountry nepal and display them
    }


}
class Place
{
    private String country;
    private String city;

    public Place(String country, String city)
    {
        this.country = country;
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "Place{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
