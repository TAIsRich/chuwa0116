package java8.optional;

import java.util.Optional;

public class Client {

    public int getMobileScreenWidth(Mobile mobile) {
        if (mobile != null) {
            DisplayFeatures displayFeatures = mobile.getDisplayFeatures();
            if (displayFeatures != null) {
                ScreenResolution screenResolution = displayFeatures.getScreenResolution();
                if (screenResolution != null) {
                    System.out.println(screenResolution);
                    return screenResolution.getWidth();
                }
            }
        }
        return 0;
    }

    public int getMobileScreenWidthOptional(MobileOptional mobileOptional) {
        return Optional.ofNullable(mobileOptional)
                .flatMap(MobileOptional::getDisplayFeatures)
                .flatMap(DisplayFeaturesOptional::getScreenResolution)
                .map(ScreenResolution::getWidth)
                .orElse(0);
    }
}
