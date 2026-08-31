package Q2;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6574a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r() {
        this.f6574a = new LinkedHashMap(0, 0.75f, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        this.f6574a.put(lowerCase, AbstractC0836n2.C(str));
    }

    public r(s sVar) {
        Map map = sVar.f6576a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), n5.l.C0((Collection) entry.getValue()));
        }
        this.f6574a = linkedHashMap;
    }
}
