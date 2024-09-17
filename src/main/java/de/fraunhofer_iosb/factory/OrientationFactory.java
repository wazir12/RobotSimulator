package de.fraunhofer_iosb.factory;

import de.fraunhofer_iosb.Orientation.*;
import de.fraunhofer_iosb.contract.Orientation;

public class OrientationFactory {

    public static Orientation getOrientation(String orientation) {
        switch (orientation) {
            case "N": return new NorthOrientation();
            case "S": return new SouthOrientation();
            case "E": return new EastOrientation();
            case "W": return new WestOrientation();
            default: throw new IllegalArgumentException("Invalid orientation: " + orientation);
        }
    }
}
