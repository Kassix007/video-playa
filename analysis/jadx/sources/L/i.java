package L;

import B0.C0050o;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f3035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f3036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0050o f3037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3038u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(Context context) {
        super(context);
        this.f3034q = 5;
        ArrayList arrayList = new ArrayList();
        this.f3035r = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3036s = arrayList2;
        this.f3037t = new C0050o(14);
        setClipChildren(false);
        k kVar = new k(context);
        addView(kVar);
        arrayList.add(kVar);
        arrayList2.add(kVar);
        this.f3038u = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k a(j jVar) {
        C0050o c0050o = this.f3037t;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0050o.f499q;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0050o.f499q;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c0050o.f500r;
        k kVar = (k) linkedHashMap.get(jVar);
        if (kVar != null) {
            return kVar;
        }
        ArrayList arrayList = this.f3036s;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        k kVar2 = (k) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (kVar2 == null) {
            int i = this.f3038u;
            ArrayList arrayList2 = this.f3035r;
            if (i > AbstractC0836n2.u(arrayList2)) {
                kVar2 = new k(getContext());
                addView(kVar2);
                arrayList2.add(kVar2);
            } else {
                kVar2 = (k) arrayList2.get(this.f3038u);
                j jVar2 = (j) linkedHashMap3.get(kVar2);
                if (jVar2 != null) {
                    jVar2.Y();
                    k kVar3 = (k) linkedHashMap2.get(jVar2);
                    if (kVar3 != null) {
                    }
                    linkedHashMap2.remove(jVar2);
                    kVar2.c();
                }
            }
            int i7 = this.f3038u;
            if (i7 < this.f3034q - 1) {
                this.f3038u = i7 + 1;
            } else {
                this.f3038u = 0;
            }
        }
        linkedHashMap2.put(jVar, kVar2);
        linkedHashMap3.put(kVar2, jVar);
        return kVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
    }
}
