package n5;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends y {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object J(Object obj, Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LinkedHashMap K(Map map, Map map2) {
        kotlin.jvm.internal.m.e(map, "<this>");
        kotlin.jvm.internal.m.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void L(HashMap map, C1371j[] c1371jArr) {
        for (C1371j c1371j : c1371jArr) {
            map.put(c1371j.f15080q, c1371j.f15081r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List M(HashMap map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        if (map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return AbstractC0836n2.z(new C1371j(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new C1371j(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new C1371j(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map N(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return t.f15300q;
        }
        if (size == 1) {
            C1371j pair = (C1371j) arrayList.get(0);
            kotlin.jvm.internal.m.e(pair, "pair");
            Map mapSingletonMap = Collections.singletonMap(pair.f15080q, pair.f15081r);
            kotlin.jvm.internal.m.d(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.I(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            C1371j c1371j = (C1371j) obj;
            linkedHashMap.put(c1371j.f15080q, c1371j.f15081r);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map O(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return t.f15300q;
        }
        if (size != 1) {
            return P(map);
        }
        kotlin.jvm.internal.m.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.m.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LinkedHashMap P(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
