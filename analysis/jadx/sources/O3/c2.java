package O3;

import com.google.android.gms.internal.measurement.C0775b1;
import com.google.android.gms.internal.measurement.C0780c1;
import com.google.android.gms.internal.measurement.C0805h1;
import com.google.android.gms.internal.measurement.C0810i1;
import com.google.android.gms.internal.measurement.C0869u1;
import com.google.android.gms.internal.measurement.C0874v1;
import com.google.android.gms.internal.measurement.C0879w1;
import com.google.android.gms.internal.measurement.C0883x0;
import com.google.android.gms.internal.measurement.C0884x1;
import com.google.android.gms.internal.measurement.D3;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import r.C1551b;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0874v1 f4818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f4819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f4820e;
    public final C1554e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1554e f4821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0272c f4822h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c2(C0272c c0272c, String str, C0874v1 c0874v1, BitSet bitSet, BitSet bitSet2, C1554e c1554e, C1554e c1554e2) {
        this.f4822h = c0272c;
        this.f4816a = str;
        this.f4819d = bitSet;
        this.f4820e = bitSet2;
        this.f = c1554e;
        this.f4821g = new C1554e(0);
        for (Integer num : (C1551b) c1554e2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c1554e2.get(num));
            this.f4821g.put(num, arrayList);
        }
        this.f4817b = false;
        this.f4818c = c0874v1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(C0269b c0269b) {
        int iQ;
        boolean z5;
        boolean zV;
        switch (c0269b.f4744g) {
            case 0:
                iQ = ((C0883x0) c0269b.i).q();
                break;
            default:
                iQ = ((com.google.android.gms.internal.measurement.E0) c0269b.i).q();
                break;
        }
        if (c0269b.f4741c != null) {
            this.f4820e.set(iQ, true);
        }
        Boolean bool = c0269b.f4742d;
        if (bool != null) {
            this.f4819d.set(iQ, bool.booleanValue());
        }
        if (c0269b.f4743e != null) {
            Integer numValueOf = Integer.valueOf(iQ);
            C1554e c1554e = this.f;
            Long l7 = (Long) c1554e.get(numValueOf);
            long jLongValue = c0269b.f4743e.longValue() / 1000;
            if (l7 == null || jLongValue > l7.longValue()) {
                c1554e.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (c0269b.f != null) {
            Integer numValueOf2 = Integer.valueOf(iQ);
            C1554e c1554e2 = this.f4821g;
            List arrayList = (List) c1554e2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1554e2.put(numValueOf2, arrayList);
            }
            switch (c0269b.f4744g) {
                case 0:
                    z5 = false;
                    break;
                default:
                    z5 = true;
                    break;
            }
            if (z5) {
                arrayList.clear();
            }
            D3.a();
            C0323t0 c0323t0 = (C0323t0) this.f4822h.f4346r;
            C0284g c0284g = c0323t0.f5075t;
            E e7 = F.f4372F0;
            String str = this.f4816a;
            if (c0284g.y(str, e7)) {
                switch (c0269b.f4744g) {
                    case 0:
                        zV = ((C0883x0) c0269b.i).v();
                        break;
                    default:
                        zV = false;
                        break;
                }
                if (zV) {
                    arrayList.clear();
                }
            }
            D3.a();
            if (!c0323t0.f5075t.y(str, e7)) {
                arrayList.add(Long.valueOf(c0269b.f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(c0269b.f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0780c1 b(int i) {
        ArrayList arrayList;
        List list;
        C0775b1 c0775b1W = C0780c1.w();
        c0775b1W.b();
        ((C0780c1) c0775b1W.f11012r).x(i);
        c0775b1W.b();
        ((C0780c1) c0775b1W.f11012r).A(this.f4817b);
        C0874v1 c0874v1 = this.f4818c;
        if (c0874v1 != null) {
            c0775b1W.b();
            ((C0780c1) c0775b1W.f11012r).z(c0874v1);
        }
        C0869u1 c0869u1X = C0874v1.x();
        ArrayList arrayListW = C0270b0.W(this.f4819d);
        c0869u1X.b();
        ((C0874v1) c0869u1X.f11012r).B(arrayListW);
        ArrayList arrayListW2 = C0270b0.W(this.f4820e);
        c0869u1X.b();
        ((C0874v1) c0869u1X.f11012r).z(arrayListW2);
        C1554e c1554e = this.f;
        if (c1554e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c1554e.f16166s);
            for (Integer num : (C1551b) c1554e.keySet()) {
                int iIntValue = num.intValue();
                Long l7 = (Long) c1554e.get(num);
                if (l7 != null) {
                    C0805h1 c0805h1T = C0810i1.t();
                    c0805h1T.b();
                    ((C0810i1) c0805h1T.f11012r).u(iIntValue);
                    long jLongValue = l7.longValue();
                    c0805h1T.b();
                    ((C0810i1) c0805h1T.f11012r).v(jLongValue);
                    arrayList2.add((C0810i1) c0805h1T.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            c0869u1X.b();
            ((C0874v1) c0869u1X.f11012r).D(arrayList);
        }
        C1554e c1554e2 = this.f4821g;
        if (c1554e2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c1554e2.f16166s);
            for (Integer num2 : (C1551b) c1554e2.keySet()) {
                C0879w1 c0879w1U = C0884x1.u();
                int iIntValue2 = num2.intValue();
                c0879w1U.b();
                ((C0884x1) c0879w1U.f11012r).v(iIntValue2);
                List list2 = (List) c1554e2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c0879w1U.b();
                    ((C0884x1) c0879w1U.f11012r).w(list2);
                }
                arrayList3.add((C0884x1) c0879w1U.e());
            }
            list = arrayList3;
        }
        c0869u1X.b();
        ((C0874v1) c0869u1X.f11012r).F(list);
        c0775b1W.b();
        ((C0780c1) c0775b1W.f11012r).y((C0874v1) c0869u1X.e());
        return (C0780c1) c0775b1W.e();
    }

    public c2(C0272c c0272c, String str) {
        this.f4822h = c0272c;
        this.f4816a = str;
        this.f4817b = true;
        this.f4819d = new BitSet();
        this.f4820e = new BitSet();
        this.f = new C1554e(0);
        this.f4821g = new C1554e(0);
    }
}
