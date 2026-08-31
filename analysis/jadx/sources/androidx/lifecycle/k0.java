package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9554a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        LinkedHashMap linkedHashMap = this.f9554a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
