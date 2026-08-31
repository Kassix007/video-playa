package C0;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m5.C1371j;

/* JADX INFO: renamed from: C0.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0111x0 implements g2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1151b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0111x0(int i, Object obj) {
        this.f1150a = i;
        this.f1151b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.d
    public final Bundle a() {
        C1371j[] c1371jArr;
        switch (this.f1150a) {
            case 0:
                Map mapB = ((Z.j) this.f1151b).b();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapB.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                return ((J1.H) this.f1151b).S();
            default:
                L0.l lVar = (L0.l) this.f1151b;
                for (Map.Entry entry2 : n5.x.O((LinkedHashMap) lVar.f3128e).entrySet()) {
                    lVar.s(((P5.S) ((P5.C) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : n5.x.O((LinkedHashMap) lVar.f3126c).entrySet()) {
                    lVar.s(((g2.d) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f3125b;
                if (linkedHashMap.isEmpty()) {
                    c1371jArr = new C1371j[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new C1371j((String) entry4.getKey(), entry4.getValue()));
                    }
                    c1371jArr = (C1371j[]) arrayList.toArray(new C1371j[0]);
                }
                return P1.g((C1371j[]) Arrays.copyOf(c1371jArr, c1371jArr.length));
        }
    }
}
