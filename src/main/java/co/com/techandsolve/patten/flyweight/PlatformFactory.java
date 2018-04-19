package co.com.techandsolve.patten.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public final class PlatformFactory {
    private static Map<String, Platform> map = new HashMap<>();

    private PlatformFactory() {
    }

    public static synchronized Platform getPlatformInstance(String platformType) {
        Platform platform = map.get(platformType);
        if (platform == null) {
            switch (platformType) {
                case "java":
                    platform = new JavaPlatform();
                    break;
                case "javascript":
                    platform = new JavascriptPlatform();
                    break;
            }
            map.put(platformType, platform);
        }
        return platform;
    }

}
