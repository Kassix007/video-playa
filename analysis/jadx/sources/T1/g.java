package T1;

import P5.S;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7364q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f7365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f7366s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g(h hVar, d dVar) {
        this.f7365r = hVar;
        this.f7366s = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f7364q) {
            case 0:
                h hVar = this.f7365r;
                d entry = this.f7366s;
                kotlin.jvm.internal.m.e(entry, "entry");
                S s6 = hVar.f7369c;
                Set set = (Set) s6.getValue();
                kotlin.jvm.internal.m.e(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(n5.y.I(set.size()));
                boolean z5 = false;
                for (Object obj : set) {
                    boolean z6 = true;
                    if (!z5 && kotlin.jvm.internal.m.a(obj, entry)) {
                        z5 = true;
                        z6 = false;
                    }
                    if (z6) {
                        linkedHashSet.add(obj);
                    }
                }
                s6.h(null, linkedHashSet);
                break;
            default:
                h hVar2 = this.f7365r;
                d dVar = this.f7366s;
                synchronized (hVar2.f7367a) {
                    try {
                        S s7 = hVar2.f7368b;
                        Iterable iterable = (Iterable) s7.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (kotlin.jvm.internal.m.a((d) obj2, dVar)) {
                                s7.getClass();
                                s7.h(null, arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                            break;
                        }
                        s7.getClass();
                        s7.h(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ g(h hVar, d dVar, boolean z5) {
        this.f7365r = hVar;
        this.f7366s = dVar;
    }
}
