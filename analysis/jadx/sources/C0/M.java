package C0;

import L0.C0192d;
import android.content.res.Resources;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import r.AbstractC1560k;
import r.C1548G;
import r.C1570v;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator[] f890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K f891b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new L(1, new L(i == 0 ? J0.f878c : J0.f877b));
            i++;
        }
        f890a = comparatorArr;
        f891b = K.f881r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(I0.m mVar) {
        I0.i iVarI = mVar.i();
        return !iVarI.f2257q.c(I0.p.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(I0.m mVar, ArrayList arrayList, C1570v c1570v, AbstractC1560k abstractC1560k, Resources resources) {
        boolean zF = f(mVar);
        int i = mVar.f2270g;
        I0.i iVar = mVar.f2268d;
        Object objG = iVar.f2257q.g(I0.p.f2311m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || g(mVar, resources)) && abstractC1560k.a(i)) {
            arrayList.add(mVar);
        }
        if (zBooleanValue) {
            c1570v.h(i, h(zF, I0.m.h(7, mVar), abstractC1560k, resources));
            return;
        }
        List listH = I0.m.h(7, mVar);
        int size = listH.size();
        for (int i7 = 0; i7 < size; i7++) {
            b((I0.m) listH.get(i7), arrayList, c1570v, abstractC1560k, resources);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(I0.m mVar) {
        Object objG = mVar.f2268d.f2257q.g(I0.p.f2296F);
        if (objG == null) {
            objG = null;
        }
        K0.a aVar = (K0.a) objG;
        C1548G c1548g = mVar.f2268d.f2257q;
        Object objG2 = c1548g.g(I0.p.f2320v);
        if (objG2 == null) {
            objG2 = null;
        }
        I0.f fVar = (I0.f) objG2;
        boolean z5 = aVar != null;
        Object objG3 = c1548g.g(I0.p.f2295E);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (fVar != null && fVar.f2230a == 4)) {
            return z5;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String d(I0.m mVar, Resources resources) {
        I0.i iVar = mVar.f2268d;
        I0.i iVar2 = mVar.f2268d;
        Object objG = iVar.f2257q.g(I0.p.f2303b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        C1548G c1548g = iVar2.f2257q;
        Object objG2 = c1548g.g(I0.p.f2296F);
        if (objG2 == null) {
            objG2 = null;
        }
        K0.a aVar = (K0.a) objG2;
        Object objG3 = c1548g.g(I0.p.f2320v);
        if (objG3 == null) {
            objG3 = null;
        }
        I0.f fVar = (I0.f) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (fVar != null && fVar.f2230a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (fVar != null && fVar.f2230a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = c1548g.g(I0.p.f2295E);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((fVar == null || fVar.f2230a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = c1548g.g(I0.p.f2304c);
        if (objG5 == null) {
            objG5 = null;
        }
        I0.e eVar = (I0.e) objG5;
        if (eVar != null) {
            if (eVar != I0.e.f2227c) {
                if (objG == null) {
                    G5.a aVar2 = eVar.f2229b;
                    float f = aVar2.f2016b;
                    float f7 = aVar2.f2015a;
                    float f8 = f - f7 == 0.0f ? 0.0f : (eVar.f2228a - f7) / (f - f7);
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(f8 == 0.0f ? 0 : f8 == 1.0f ? 100 : D5.a.q(Math.round(f8 * 100), 1, 99)));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        I0.s sVar = I0.p.f2293C;
        if (c1548g.c(sVar)) {
            C1548G c1548g2 = new I0.m(mVar.f2265a, true, mVar.f2267c, iVar2).i().f2257q;
            Object objG6 = c1548g2.g(I0.p.f2302a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = c1548g2.g(I0.p.f2323y);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = c1548g2.g(sVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0192d e(I0.m mVar) {
        I0.i iVar = mVar.f2268d;
        I0.s sVar = I0.p.f2302a;
        C0192d c0192d = (C0192d) Q2.g.G(iVar, I0.p.f2293C);
        List list = (List) Q2.g.G(mVar.f2268d, I0.p.f2323y);
        return c0192d == null ? list != null ? (C0192d) n5.l.m0(list) : null : c0192d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean f(I0.m mVar) {
        return mVar.f2267c.f262O == W0.l.f8023r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean g(I0.m mVar, Resources resources) {
        Object objG = mVar.f2268d.f2257q.g(I0.p.f2302a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !W.j(mVar) && (mVar.f2268d.f2259s || (mVar.m() && ((list != null ? (String) n5.l.m0(list) : null) != null || e(mVar) != null || d(mVar, resources) != null || c(mVar))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r16v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r16v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r16v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList h(boolean r17, java.util.List r18, r.AbstractC1560k r19, android.content.res.Resources r20) {
        /*
            r0 = r18
            r1 = r20
            r.v r2 = r.AbstractC1561l.f16221a
            r.v r2 = new r.v
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L19:
            if (r6 >= r4) goto L29
            java.lang.Object r7 = r0.get(r6)
            I0.m r7 = (I0.m) r7
            r8 = r19
            b(r7, r3, r2, r8, r1)
            int r6 = r6 + 1
            goto L19
        L29:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = r3.size()
            int r4 = r4 / 2
            r0.<init>(r4)
            int r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r3)
            if (r4 < 0) goto Le3
            r7 = r5
        L3b:
            java.lang.Object r8 = r3.get(r7)
            I0.m r8 = (I0.m) r8
            if (r7 == 0) goto Lc7
            i0.c r9 = r8.f()
            float r9 = r9.f13523b
            i0.c r10 = r8.f()
            float r10 = r10.f13525d
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 < 0) goto L55
            r11 = 1
            goto L56
        L55:
            r11 = r5
        L56:
            int r12 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r0)
            if (r12 < 0) goto Lc7
            r13 = r5
        L5d:
            java.lang.Object r14 = r0.get(r13)
            m5.j r14 = (m5.C1371j) r14
            java.lang.Object r14 = r14.f15080q
            i0.c r14 = (i0.C1131c) r14
            float r15 = r14.f13523b
            r18 = 1
            float r6 = r14.f13525d
            int r16 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r16 < 0) goto L74
            r16 = r18
            goto L76
        L74:
            r16 = r5
        L76:
            if (r11 != 0) goto Lc2
            if (r16 != 0) goto Lc2
            float r15 = java.lang.Math.max(r9, r15)
            float r16 = java.lang.Math.min(r10, r6)
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 >= 0) goto Lc2
            i0.c r11 = new i0.c
            float r12 = r14.f13522a
            r15 = 0
            float r12 = java.lang.Math.max(r12, r15)
            float r15 = r14.f13523b
            float r9 = java.lang.Math.max(r15, r9)
            float r14 = r14.f13524c
            r15 = 2139095040(0x7f800000, float:Infinity)
            float r14 = java.lang.Math.min(r14, r15)
            float r6 = java.lang.Math.min(r6, r10)
            r11.<init>(r12, r9, r14, r6)
            m5.j r6 = new m5.j
            java.lang.Object r9 = r0.get(r13)
            m5.j r9 = (m5.C1371j) r9
            java.lang.Object r9 = r9.f15081r
            r6.<init>(r11, r9)
            r0.set(r13, r6)
            java.lang.Object r6 = r0.get(r13)
            m5.j r6 = (m5.C1371j) r6
            java.lang.Object r6 = r6.f15081r
            java.util.List r6 = (java.util.List) r6
            r6.add(r8)
            goto Ldd
        Lc2:
            if (r13 == r12) goto Lc9
            int r13 = r13 + 1
            goto L5d
        Lc7:
            r18 = 1
        Lc9:
            i0.c r6 = r8.f()
            m5.j r9 = new m5.j
            I0.m[] r8 = new I0.m[]{r8}
            java.util.ArrayList r8 = com.google.android.gms.internal.measurement.AbstractC0836n2.C(r8)
            r9.<init>(r6, r8)
            r0.add(r9)
        Ldd:
            if (r7 == r4) goto Le5
            int r7 = r7 + 1
            goto L3b
        Le3:
            r18 = 1
        Le5:
            C0.J0 r3 = C0.J0.f879d
            n5.p.d0(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Comparator[] r4 = C0.M.f890a
            r6 = r17 ^ 1
            r4 = r4[r6]
            int r6 = r0.size()
            r7 = r5
        Lfa:
            if (r7 >= r6) goto L113
            java.lang.Object r8 = r0.get(r7)
            m5.j r8 = (m5.C1371j) r8
            java.lang.Object r9 = r8.f15081r
            java.util.List r9 = (java.util.List) r9
            n5.p.d0(r9, r4)
            java.lang.Object r8 = r8.f15081r
            java.util.Collection r8 = (java.util.Collection) r8
            r3.addAll(r8)
            int r7 = r7 + 1
            goto Lfa
        L113:
            C0.J r0 = new C0.J
            C0.K r4 = C0.M.f891b
            r0.<init>(r5, r4)
            n5.p.d0(r3, r0)
        L11d:
            int r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r3)
            if (r5 > r0) goto L154
            java.lang.Object r0 = r3.get(r5)
            I0.m r0 = (I0.m) r0
            int r0 = r0.f2270g
            java.lang.Object r0 = r2.b(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L151
            java.lang.Object r4 = r3.get(r5)
            I0.m r4 = (I0.m) r4
            boolean r4 = g(r4, r1)
            if (r4 != 0) goto L143
            r3.remove(r5)
            goto L145
        L143:
            int r5 = r5 + 1
        L145:
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r5, r4)
            int r0 = r0.size()
            int r5 = r5 + r0
            goto L11d
        L151:
            int r5 = r5 + 1
            goto L11d
        L154:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.M.h(boolean, java.util.List, r.k, android.content.res.Resources):java.util.ArrayList");
    }
}
