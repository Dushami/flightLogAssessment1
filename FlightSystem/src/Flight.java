/**
 *  Class to Set/get information on flight information
 *
 * @author Archie Hamilton
 * @version 1.0
 */

public class Flight {

    /*All Fields*/
    private String flightNumber;
    private String destination;
    private int duration;

    /*Default constructor*/

    public Flight(){
        String flightNumber = "";
        String destination = "";
        int duration = 0;
    }

    /*Secondary constructor*/
    /**
     * secondary constructor, to initialise a Flight to a
     * default flight number, destination and duration.
     *
     * @param flightNo The flight number
     * @param endDestination The destination of the flight
     * @param flightDuration The duration of the flight
     */
    public Flight(String flightNo, String endDestination, int flightDuration){
        flightNumber = flightNo;
        destination = endDestination;
        duration = flightDuration;
    }

    /*Mutator Methods (set)*/

    /**
     * Set the Flight number.
     *
     * @param flightNo The flight Number
     */
    public void setFlightNumber(String flightNo){
        flightNumber = flightNo;
    }

    /**
     * Set the Flights destination.
     *
     * @param flightDestination The destination of the flight
     */
    public void setDestination(String flightDestination){
        destination = flightDestination;
    }

    /**
     * Set the duration of the flight.
     *
     * @param flightTime The duration of the flight
     */
    public void setDuration(int flightTime){
        duration = flightTime;
    }

    /*Accessor Methods (get)*/

    /**
     * Get the Flight Number.
     *
     * @return The Flight Number
     */
    public String getFlightNumber(){
        return flightNumber;
    }

    /**
     * Get the Flights Destination.
     *
     * @return The Flight destination
     */
    public String getDestination(){
        return destination;
    }

    /**
     * Get the FLights duration.
     *
     * @return The fights duration
     */
    public int getDuration(){
        return duration;
    }

}
