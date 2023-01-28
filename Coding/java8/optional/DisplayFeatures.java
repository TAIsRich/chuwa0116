package java8.optional;

import java.util.Optional;

/**
 * @author Zhipeng Yin
 * @date 2023-01-27 19:16
 */
public class DisplayFeatures {
    private String size;
    private Optional<ScreenResolution> resolutionOptional;

    public DisplayFeatures(String size, Optional<ScreenResolution> resolutionOptional) {
        this.size = size;
        this.resolutionOptional = resolutionOptional;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Optional<ScreenResolution> getResolutionOptional() {
        return resolutionOptional;
    }

    public void setResolutionOptional(Optional<ScreenResolution> resolutionOptional) {
        this.resolutionOptional = resolutionOptional;
    }
}
