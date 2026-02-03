package util;

import java.util.ArrayList;
import java.util.List;
import model.Vessel;

public class VesselUtil {

    // List to store all vessel objects
    private List<Vessel> vesselList = new ArrayList<>();

    // add vessel object into list
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // getter to access vessel list if needed later
    public List<Vessel> getVesselList() {
        return vesselList;
    }
    // returns vessel object for given vesselId
    public Vessel getVesselById(String vesselId) {

        // iterate through vessel list
        for (Vessel vessel : vesselList) {

            // case-sensitive comparison
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel; // vessel found
            }
        }

        // if no vessel matches
        return null;
    }
    // returns vessels with highest average speed
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> highPerformanceList = new ArrayList<>();

        double maxSpeed = 0;

        // find maximum speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // collect vessels matching max speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                highPerformanceList.add(vessel);
            }
        }

        return highPerformanceList;
    }


}
