package I0;

import B0.AbstractC0041g;
import B0.C0029a;
import B0.InterfaceC0048m;
import B0.L;
import B0.n0;
import a.AbstractC0597a;
import c0.AbstractC0724l;
import i0.C1131c;
import java.util.ArrayList;
import java.util.List;
import r.C1548G;
import z0.AbstractC1938O;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0724l f2265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f2267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f2268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2269e;
    public m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2270g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(AbstractC0724l abstractC0724l, boolean z5, L l7, i iVar) {
        this.f2265a = abstractC0724l;
        this.f2266b = z5;
        this.f2267c = l7;
        this.f2268d = iVar;
        this.f2270g = l7.f280r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ List h(int i, m mVar) {
        return mVar.g((i & 1) != 0 ? !mVar.f2266b : false, (i & 2) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m a(f fVar, B5.c cVar) {
        i iVar = new i();
        iVar.f2259s = false;
        iVar.f2260t = false;
        cVar.invoke(iVar);
        m mVar = new m(new l(cVar), false, new L(this.f2270g + (fVar != null ? 1000000000 : 2000000000), true), iVar);
        mVar.f2269e = true;
        mVar.f = this;
        return mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(L l7, ArrayList arrayList) {
        R.e eVarV = l7.v();
        Object[] objArr = eVarV.f6676q;
        int i = eVarV.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            if (l8.F() && !l8.f278e0) {
                if (l8.f268U.d(8)) {
                    arrayList.add(AbstractC0597a.a(l8, this.f2266b));
                } else {
                    b(l8, arrayList);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n0 c() {
        if (this.f2269e) {
            m mVarJ = j();
            if (mVarJ != null) {
                return mVarJ.c();
            }
            return null;
        }
        InterfaceC0048m interfaceC0048mD = AbstractC0597a.D(this.f2267c);
        if (interfaceC0048mD == null) {
            interfaceC0048mD = this.f2265a;
        }
        return AbstractC0041g.s(interfaceC0048mD, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            m mVar = (m) arrayList.get(size2);
            if (mVar.l()) {
                arrayList2.add(mVar);
            } else if (!mVar.f2268d.f2260t) {
                mVar.d(arrayList, arrayList2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1131c e() {
        n0 n0VarC = c();
        if (n0VarC != null) {
            if (!n0VarC.B0().f10099D) {
                n0VarC = null;
            }
            if (n0VarC != null) {
                return AbstractC1938O.f(n0VarC).I(n0VarC, true);
            }
        }
        return C1131c.f13521e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1131c f() {
        n0 n0VarC = c();
        if (n0VarC != null) {
            if (!n0VarC.B0().f10099D) {
                n0VarC = null;
            }
            if (n0VarC != null) {
                return AbstractC1938O.e(n0VarC);
            }
        }
        return C1131c.f13521e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List g(boolean z5, boolean z6) {
        if (!z5 && this.f2268d.f2260t) {
            return n5.s.f15299q;
        }
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return o(arrayList, z6);
        }
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final i i() {
        boolean zL = l();
        i iVar = this.f2268d;
        if (!zL) {
            return iVar;
        }
        i iVarG = iVar.g();
        n(new ArrayList(), iVarG);
        return iVarG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m j() {
        L lS;
        m mVar = this.f;
        if (mVar != null) {
            return mVar;
        }
        L l7 = this.f2267c;
        boolean z5 = this.f2266b;
        if (z5) {
            lS = l7.s();
            while (lS != null) {
                i iVarU = lS.u();
                if (iVarU != null && iVarU.f2259s) {
                    break;
                }
                lS = lS.s();
            }
            lS = null;
        } else {
            lS = null;
        }
        if (lS == null) {
            L lS2 = l7.s();
            while (true) {
                if (lS2 == null) {
                    lS = null;
                    break;
                }
                if (lS2.f268U.d(8)) {
                    lS = lS2;
                    break;
                }
                lS2 = lS2.s();
            }
        }
        if (lS == null) {
            return null;
        }
        return AbstractC0597a.a(lS, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final i k() {
        return this.f2268d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean l() {
        return this.f2266b && this.f2268d.f2259s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean m() {
        if (this.f2269e || !h(4, this).isEmpty()) {
            return false;
        }
        L lS = this.f2267c.s();
        while (true) {
            if (lS == null) {
                lS = null;
                break;
            }
            i iVarU = lS.u();
            if (iVarU != null && iVarU.f2259s) {
                break;
            }
            lS = lS.s();
        }
        return lS == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(ArrayList arrayList, i iVar) {
        if (this.f2268d.f2260t) {
            return;
        }
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            m mVar = (m) arrayList.get(size2);
            if (!mVar.l()) {
                iVar.i(mVar.f2268d);
                mVar.n(arrayList, iVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List o(ArrayList arrayList, boolean z5) {
        if (this.f2269e) {
            return n5.s.f15299q;
        }
        b(this.f2267c, arrayList);
        if (z5) {
            i iVar = this.f2268d;
            C1548G c1548g = iVar.f2257q;
            Object objG = c1548g.g(p.f2320v);
            if (objG == null) {
                objG = null;
            }
            f fVar = (f) objG;
            if (fVar != null && iVar.f2259s && !arrayList.isEmpty()) {
                arrayList.add(a(fVar, new C0029a(14, fVar)));
            }
            s sVar = p.f2302a;
            if (c1548g.c(sVar) && !arrayList.isEmpty() && iVar.f2259s) {
                Object objG2 = c1548g.g(sVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) n5.l.m0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new k(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
