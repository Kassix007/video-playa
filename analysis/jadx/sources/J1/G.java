package J1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class G implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f2511b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(H h4, int i) {
        this.f2511b = h4;
        this.f2510a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.F
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        H h4 = this.f2511b;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = h4.f2544w;
        int i = this.f2510a;
        if (abstractComponentCallbacksC0185q == null || i >= 0 || !abstractComponentCallbacksC0185q.h().N(-1, 0)) {
            return h4.O(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
