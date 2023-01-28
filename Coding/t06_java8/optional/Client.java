package optional;
/**
 * @author ls
 * @date 23 2:41 PM
 */
public class Client {
    public int getMobileScreenWidth(Mobile7 mobile7) {
        if (mobile7 != null) {
            DisplayFeatures7 df = mobile7.getDisplayFeatures();
            if (df != null) {
                ScreenResolution sr = df.getResolution();
                if (sr != null) {
                    return sr.getWidth();
                }
            }
        }

        return 0;
    }
}
