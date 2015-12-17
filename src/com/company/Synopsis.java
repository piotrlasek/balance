import java.util.HashMap;
import java.util.Set;

/**
 * Created by Piotr Lasek on 15.12.2015.
 */
public class Synopsis {

    /**
     *
     */
    HashMap<String, Float> map;

    /**
     *
     * @param key
     * @return
     */
    public Float getValue(String key) {
        return getMap().get(key);
    }

    /**
     *
     * @param key
     * @param value
     */
    public void setValue(String key, Float value) {
        getMap().put(key, value);
    }

    /**
     *
     * @return
     */
    public HashMap<String,Float> getMap() {
        return map;
    }

    /**
     *
     * @return
     */
    public Set<String> keySet() {
        return map.keySet();
    }
}
