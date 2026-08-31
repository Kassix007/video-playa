package p3;

import androidx.work.impl.Scheduler;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f15646a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap(13);
        f15646a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        k1.i.q(1, map, "bolder", -1, "lighter");
        k1.i.q(100, map, "100", Scheduler.MAX_GREEDY_SCHEDULER_LIMIT, "200");
        map.put("300", 300);
        map.put("400", 400);
        k1.i.q(500, map, "500", 600, "600");
        map.put("700", 700);
        map.put("800", 800);
        map.put("900", 900);
    }
}
