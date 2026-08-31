package O5;

import M5.A0;
import M5.AbstractC0263y;
import M5.C0247h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1362a;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class b implements A0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f5210q = g.f5242p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0247h f5211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f5212s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(e eVar) {
        this.f5212s = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.A0
    public final void a(R5.s sVar, int i) {
        C0247h c0247h = this.f5211r;
        if (c0247h != null) {
            c0247h.a(sVar, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(s5.c cVar) throws Throwable {
        m mVarP;
        Boolean bool;
        Object obj = this.f5210q;
        boolean z5 = true;
        if (obj == g.f5242p || obj == g.f5238l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f5224w;
            e eVar = this.f5212s;
            m mVar = (m) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                if (eVar.w()) {
                    this.f5210q = g.f5238l;
                    Throwable thQ = eVar.q();
                    if (thQ != null) {
                        int i = R5.t.f7269a;
                        throw thQ;
                    }
                    z5 = false;
                } else {
                    long andIncrement = e.f5220s.getAndIncrement(eVar);
                    long j = g.f5231b;
                    long j7 = andIncrement / j;
                    int i7 = (int) (andIncrement % j);
                    if (mVar.f7268c != j7) {
                        mVarP = eVar.p(j7, mVar);
                        if (mVarP == null) {
                            continue;
                        }
                    } else {
                        mVarP = mVar;
                    }
                    Object objH = eVar.H(mVarP, i7, andIncrement, null);
                    E4.f fVar = g.f5239m;
                    if (objH == fVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    E4.f fVar2 = g.f5241o;
                    if (objH == fVar2) {
                        if (andIncrement < eVar.t()) {
                            mVarP.a();
                        }
                        mVar = mVarP;
                    } else {
                        if (objH == g.f5240n) {
                            e eVar2 = this.f5212s;
                            C0247h c0247hO = AbstractC0263y.o(AbstractC1397A.v(cVar));
                            try {
                                this.f5211r = c0247hO;
                                Object objH2 = eVar2.H(mVarP, i7, andIncrement, this);
                                if (objH2 == fVar) {
                                    a(mVarP, i7);
                                } else {
                                    if (objH2 == fVar2) {
                                        if (andIncrement < eVar2.t()) {
                                            mVarP.a();
                                        }
                                        m mVar2 = (m) e.f5224w.get(eVar2);
                                        while (true) {
                                            if (eVar2.w()) {
                                                C0247h c0247h = this.f5211r;
                                                kotlin.jvm.internal.m.b(c0247h);
                                                this.f5211r = null;
                                                this.f5210q = g.f5238l;
                                                Throwable thQ2 = eVar.q();
                                                if (thQ2 == null) {
                                                    c0247h.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c0247h.resumeWith(AbstractC1362a.b(thQ2));
                                                }
                                            } else {
                                                long andIncrement2 = e.f5220s.getAndIncrement(eVar2);
                                                long j8 = g.f5231b;
                                                long j9 = andIncrement2 / j8;
                                                int i8 = (int) (andIncrement2 % j8);
                                                if (mVar2.f7268c != j9) {
                                                    m mVarP2 = eVar2.p(j9, mVar2);
                                                    if (mVarP2 != null) {
                                                        mVar2 = mVarP2;
                                                    }
                                                }
                                                Object objH3 = eVar2.H(mVar2, i8, andIncrement2, this);
                                                if (objH3 == g.f5239m) {
                                                    a(mVar2, i8);
                                                    break;
                                                }
                                                if (objH3 == g.f5241o) {
                                                    if (andIncrement2 < eVar2.t()) {
                                                        mVar2.a();
                                                    }
                                                } else {
                                                    if (objH3 == g.f5240n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    mVar2.a();
                                                    this.f5210q = objH3;
                                                    this.f5211r = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        mVarP.a();
                                        this.f5210q = objH2;
                                        this.f5211r = null;
                                        bool = Boolean.TRUE;
                                    }
                                    c0247hO.n(bool, null);
                                }
                                return c0247hO.r();
                            } catch (Throwable th) {
                                c0247hO.A();
                                throw th;
                            }
                        }
                        mVarP.a();
                        this.f5210q = objH;
                    }
                }
            }
        }
        return Boolean.valueOf(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c() throws Throwable {
        Object obj = this.f5210q;
        E4.f fVar = g.f5242p;
        if (obj == fVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f5210q = fVar;
        if (obj != g.f5238l) {
            return obj;
        }
        Throwable thR = this.f5212s.r();
        int i = R5.t.f7269a;
        throw thR;
    }
}
