package org.example.model;

import java.util.*;
import org.example.model.PassengerService;

public class Aeroplane {

    private final List<Passenger> passengers = new ArrayList<>();
    private final PassengerService passengerService = new PassengerService();

    public String enter(Passenger passenger)
    {
        passengers.add(passenger);
        if (passenger.getDescription() != null) {
            System.out.println(passenger.getDescription());
        }
        return ("Welcome " + passenger.getType() + " Passenger " + passenger.getName());
        // throw new UnsupportedOperationException ("Add passenger to passengers list");
        // throw new UnsupportedOperationException ("Print passenger description if it is not null");
        // throw new UnsupportedOperationException ("Print a welcome message for each passenger type, see unit test shouldAddPassengerOnEnter for expected message");
    }

    public List<Passenger> bulkEnter(Passenger... passenger)
    {
        for (Passenger p : passenger) {
            enter(p);
        }
        return passengers;
        //throw new UnsupportedOperationException ("Implement method that executes enter(passenger) for each passenger and return all as list");
    }

    public boolean exit(UUID passengerId)
    {
        for (Passenger p : passengers) {
            if (p.getId().equals(passengerId)) {
                passengers.remove(p);
                return true;
            }
        }
        return false;
        // throw new UnsupportedOperationException ("Should remove passenger from passenger list returning true on success otherwise false");
    }

    public int countPassengers()
    {
        return passengers.size();
        // throw new UnsupportedOperationException ("count passengers in passenger list");
    }

    public int countPassengersByType(PassengerType passengerType)
    {
        List<Passenger> passengerz = passengerService.filterPassengersByType(passengers, passengerType);
        return  passengerz.size();
        // throw new UnsupportedOperationException ("count passengers of given passenger type in passenger list");
    }

    public Map<PassengerType, Passenger> mapPassengersByType()
    {
        List<Passenger> econPass = passengerService.filterPassengersByType(passengers, PassengerType.ECONOMY);
        List<Passenger> buisnessPass = passengerService.filterPassengersByType(passengers, PassengerType.ECONOMY);
        List<Passenger> firstPass = passengerService.filterPassengersByType(passengers, PassengerType.ECONOMY);
        Map<PassengerType, Passenger> map = new HashMap<>();
        // Not done
        return Map.of();
        //throw new UnsupportedOperationException ("Convert passenger list to a map keyed by passenger type. If any two elements would have the same key, then the last one gets added to the map");
    }

    public List<Passenger> orderPassengersByFare()
    {
         throw new UnsupportedOperationException ("Return a list of all passengers (from passengers list) sorted in ascending order of fare price");
    }

    public double totalFare()
    {
        throw new UnsupportedOperationException ("Return the sum of all passenger fare prices");
    }
}
