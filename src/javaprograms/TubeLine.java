package javaprograms;
// 10. Write a programme that tells you which line passes through particular stations.
//Just use Zone 1 stations name.

import java.util.*;
public class TubeLine {

    public static void main(String[] args) {
        //Create a map of station names and the lines they belong to

        Map<String, List<String>> stationLines = new HashMap<>();

        //Enter station name in Zone 1

       stationLines.put("Baker Street", Arrays.asList("Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"));
       stationLines.put("Bank", Arrays.asList("Central", "Northern", "Waterloo & City"));
       stationLines.put("Bond Street", Arrays.asList("Central", "Jubilee"));
       stationLines.put("Charing Cross", Arrays.asList("Bakerloo","Northern"));
       stationLines.put("Covent Garden", Arrays.asList("Piccadilly"));
       stationLines.put("Euston", Arrays.asList("Northern", "Victoria"));
       stationLines.put("Green Park", Arrays.asList("Jubilee", "Piccadilly", "Victoria"));
       stationLines.put("Holborn", Arrays.asList("Central", "Piccadilly"));
       stationLines.put("Leicester Square", Arrays.asList("Northern", "Piccadilly"));
       stationLines.put("Liverpool Street", Arrays.asList("Central", "Circle", "Hammersmith & City", "Metropolitan"));
       stationLines.put("London Bridge", Arrays.asList("Jubilee", "Northern"));
       stationLines.put("Moorgate", Arrays.asList("Circle", "Hammersmith & City", "Metropolitan", "Northern"));
       stationLines.put("Oxford Circus", Arrays.asList("Bakerloo", "central", "Victoria"));
       stationLines.put("Picadilly Circus", Arrays.asList("Bakerloo", "Piccadilly"));
       stationLines.put("Russell Square", Arrays.asList("Piccadilly"));
       stationLines.put("South Kinsington", Arrays.asList("Circle", "District", "Piccadilly"));
       stationLines.put("Tottenham Court Road", Arrays.asList("Central", "Northern"));
       stationLines.put("Victoria", Arrays.asList("Circle", "District", "Victoria"));
       stationLines.put("Waterloo", Arrays.asList("Bakerloo", "Jubilee", "Northern"));


       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a station name in Zone 1: ");
        String station = scanner.nextLine();
        if (stationLines.containsKey(station)){
            System.out.println("The following lines pass through " + station + ":"); // Output which lines pass through that station
            for (String line : stationLines.get(station)){
                System.out.println("- " + line);

            }
        }else {
            System.out.println("Invalid station name"); //Invalid message if station name is out of Zone 1
        }


    }

}
