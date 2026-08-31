package p3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f15639a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap(9);
        f15639a = map;
        map.put("xx-small", new C(7, 0.694f));
        map.put("x-small", new C(7, 0.833f));
        map.put("small", new C(7, 10.0f));
        map.put(FirebaseAnalytics.Param.MEDIUM, new C(7, 12.0f));
        map.put("large", new C(7, 14.4f));
        map.put("x-large", new C(7, 17.3f));
        map.put("xx-large", new C(7, 20.7f));
        map.put("smaller", new C(9, 83.33f));
        map.put("larger", new C(9, 120.0f));
    }
}
