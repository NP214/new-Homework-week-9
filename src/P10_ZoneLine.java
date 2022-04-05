import java.util.HashMap;
import java.util.Scanner;

public class P10_ZoneLine {
/* Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name */
public static void main(String[] args) {
    char ch;

    HashMap<String, String> zone = new HashMap<>();
    zone.put("Paddington", "Bakerloo/CircleLineDistrictLine/Hammersmith & City ");
    zone.put(" EdgwareRoad", "Bakerloo");
    zone.put("Marylebone", "Bakerloo");
    zone.put("BakerStreet", "Bakerloo/JubileeLine/Metropolitan/CircleLine/Hammersmith & City");
    zone.put("OxfordCircus", "Bakerloo/Central");
    zone.put("PiccadillyCircus", "Bakerloo/PiccadillyLine");
    zone.put("CharringCross", "Bakerloo/NorthenLine");
    zone.put("Embankment", "Bakerloo/NorthenLine/CircleLine");
    zone.put("Waterloo", "Bakerloo/JubileeLine/NorthenLine");
    zone.put("LambethNorth,", "Bakerloo");
    zone.put("E&C.", "Bakerloo/NorthenLine");
    zone.put("NottingHillGate", "Central/CircleLine/DistrictLine");
    zone.put("Queensway", "Central");
    zone.put("LancasterGate", "Central");
    zone.put("MarbleArch", "Central");
    zone.put("BondStreet", "Central/JubileeLine");
    zone.put("TCR", "Central/NorthenLine");
    zone.put("Holborn", "Central/PiccadillyLine/NorthenLine");
    zone.put("ChanceryLane", "Central");
    zone.put("StPauls", "Central");
    zone.put("Bank", "Central/NorthenLine");
    zone.put("LiverpoolStree", "Central");
    zone.put("GreenPark", "JubileeLine");
    zone.put("Westminster", "JubileeLine/CircleLine");
    zone.put("Southwark", "JubileeLine");
    zone.put("LondonBridge", "JubileeLine/NorthenLine");
    zone.put("Euston", "NorthenLine ");
    zone.put("King's Cross", "NorthenLine/PiccadillyLine/Metropolitan/CircleLine/Hammersmith & City");
    zone.put("Angel", "NorthenLine ");
    zone.put("OldStreet", "NorthenLine ");
    zone.put("Moorgate", "NorthenLine/Metropolitan/King'sCross/Hammersmith & City");
    zone.put("WarrenStreet", "NorthenLine ");
    zone.put("GoodgeStreet", "NorthenLine ");
    zone.put("LeicesterSquare", "NorthenLine/PiccadillyLine");
    zone.put("Earl'sCourt", "PiccadillyLine/DistrictLine");
    zone.put("GloucesterRoad", "PiccadillyLine/DistrictLine");
    zone.put("SouthKensington", "PiccadillyLine/CircleLine/DistrictLine");
    zone.put("KnightsBridge", "PiccadillyLine");
    zone.put("HydeParkCorner", "PiccadillyLine");
    zone.put("CoventGarden", "PiccadillyLine");
    zone.put("RussellSq", "PiccadillyLine");
    zone.put("Greatportland", "Metropolitan");
    zone.put("EustonSquare", "Metropolitan/CircleLine/Hammersmith & City");
    zone.put("Barbican", "Metropolitan/CircleLine/Hammersmith & City");
    zone.put("Aldgate", "Metropolitan/CircleLine");
    zone.put("EdgwareRoad", "CircleLine/DistrictLine/Hammersmith & City ");
    zone.put("Bayswater", "CircleLine/DistrictLine ");
    zone.put("HighStreetKensington", "CircleLine/DistrictLine ");
    zone.put("GloucesterRoad,", "CircleLine ");
    zone.put("SloaneSquare", "CircleLine ");
    zone.put("Victoria", "CircleLine ");
    zone.put("St.Jame'sPark", "CircleLine ");
    zone.put("Temple", "CircleLine");
    zone.put("Blackfrier", "CircleLine");
    zone.put("MansionHouse", "CircleLine");
    zone.put("CannonStreet", "CircleLine");
    zone.put("Monument", "CircleLine");
    zone.put("TowerHill", "CircleLine/DistrictLine");
    zone.put("LiverpoolStreet", "CircleLine/Hammersmith & City");
    zone.put("GreatPortland", "CircleLine");
    zone.put("Farringdon", "CircleLine/Hammersmith & City");
    zone.put("AldgateEast", "DistrictLine/Hammersmith & City");
    zone.put("GreatPortlandStreet", "Hammersmith & City ");
    zone.put("Tower", "CircleLine");
    zone.put("Vauxhall", "Victoria");

    do {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any zone 1 station name : ");
        String stationName = sc.nextLine();
        for (String sn : zone.keySet()) {
            if (stationName.equalsIgnoreCase(sn)) {
                System.out.println(zone.get(sn));
            }

        }
        System.out.println("Would you like to search for more station please enter \"Y or \"N :");
String another = sc.next();
 ch = another.charAt(0);//here  ch declare golbally

    }while(ch == 'Y' || ch == 'y');
    System.out.println("Thank you for using London map now mind the Gap");

}
}
