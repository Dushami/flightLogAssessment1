/**
 *  Represents a catalog of flights
 *
 * @author Archie Hamilton
 * @version 1.0
 */

public class FlightCatalog {

    private Flight flight1;
    private Flight flight2;
    private Flight flight3;

    public FlightCatalog() {
        flight1 = new Flight();
        flight1.flightQuestions();

        flight2 = new Flight();


        flight3 = new Flight();
    }

    public static void main(String[] args) {
    }

}
