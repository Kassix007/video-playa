package J1;

import android.util.Log;
import e.C1008a;
import e.InterfaceC1009b;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y implements InterfaceC1009b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H f2748r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ y(H h4, int i) {
        this.f2747q = i;
        this.f2748r = h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e.InterfaceC1009b
    public final void d(Object obj) {
        switch (this.f2747q) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                H h4 = this.f2748r;
                E e7 = (E) h4.f2514C.pollFirst();
                if (e7 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = e7.f2508q;
                    if (h4.f2527c.h(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                C1008a c1008a = (C1008a) obj;
                H h7 = this.f2748r;
                E e8 = (E) h7.f2514C.pollFirst();
                if (e8 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str2 = e8.f2508q;
                    int i7 = e8.f2509r;
                    AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qH = h7.f2527c.h(str2);
                    if (abstractComponentCallbacksC0185qH == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC0185qH.q(i7, c1008a.f12454q, c1008a.f12455r);
                    }
                }
                break;
        }
    }
}
