package de.fraunhofer_iosb.factory;

import de.fraunhofer_iosb.contract.Orientation;
import de.fraunhofer_iosb.moveable_objects.orientation.EastOrientation;
import de.fraunhofer_iosb.moveable_objects.orientation.NorthOrientation;
import de.fraunhofer_iosb.moveable_objects.orientation.SouthOrientation;
import de.fraunhofer_iosb.moveable_objects.orientation.WestOrientation;

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
