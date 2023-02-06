import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstname("Aizat");
        person.setLastname("Duisheeva");
        person.setDateofbirth(LocalDate.of(2003,03,13));


        Person person1=new Person();
        person1.setFirstname("Ernazar");
        person1.setLastname("Asanbekov");
        person1.setDateofbirth(LocalDate.of(2003,01,19));

        Person person2=new Person();
        person2.setFirstname("Meerim");
        person2.setLastname("Talanbekova");
        person2.setDateofbirth(LocalDate.of(2004,07,10));

        Person [] peoples={person,person1,person2};

        for (Person people :peoples) {
            System.out.println("First name:"+people.getFirstname()
                           +"\n"+"Last name:"+people.getLastname()
                           +"\n"+"Date of birth:"+people.getDateofbirth());

        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Country country=new Country();
        country.setCountry("Kyrgyzstan");
        Country country1=new Country();
        country1.setCountry("Kitai");
        Country country2=new Country();
        country2.setCountry("Korea");

        Country [] countries ={country,country1,country2};

        for (Country c:countries) {
            System.out.println("Person country:"+c.getCountry());

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        City city=new City();
        city.setCity("Bishkek");
        City city1=new City();
        city1.setCity("Pekin");
        City city2=new City();
        city2.setCity("Seul");

        City [] cities={city,city1,city2};
        for (City ct:cities) {
            System.out.println("Person cities:"+ct.getCity());

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Address address=new Address();
        address.setAddress("J/m Ak-Bosogo chui 51, dom 28");
        Address address1=new Address();
        address1.setAddress("Vanwunsin");
        Address address2=new Address();
        address2.setAddress("Kengridan");

        Address [] addresses={address,address1,address2};
        for (Address ad:addresses) {
            System.out.println("Person addreess:"+ad.getAddress());
        }










    }
}