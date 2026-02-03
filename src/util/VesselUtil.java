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
}
