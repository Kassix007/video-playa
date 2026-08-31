package U;

import a.AbstractC0597a;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.B;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final X.h f7498t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f7499u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7501w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(X.h hVar, n[] nVarArr) {
        super(hVar.f8143r, nVarArr);
        this.f7498t = hVar;
        this.f7501w = hVar.f8145t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, m mVar, Object obj, int i7) {
        int i8 = i7 * 5;
        n[] nVarArr = this.f7495q;
        if (i8 <= 30) {
            int iF = 1 << AbstractC0597a.F(i, i8);
            if (mVar.h(iF)) {
                nVarArr[i7].a(mVar.f7516d, Integer.bitCount(mVar.f7513a) * 2, mVar.f(iF));
                this.f7496r = i7;
                return;
            } else {
                int iT = mVar.t(iF);
                m mVarS = mVar.s(iT);
                nVarArr[i7].a(mVar.f7516d, Integer.bitCount(mVar.f7513a) * 2, iT);
                c(i, mVarS, obj, i7 + 1);
                return;
            }
        }
        n nVar = nVarArr[i7];
        Object[] objArr = mVar.f7516d;
        nVar.a(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i7];
            if (kotlin.jvm.internal.m.a(nVar2.f7517q[nVar2.f7519s], obj)) {
                this.f7496r = i7;
                return;
            } else {
                nVarArr[i7].f7519s += 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U.d, java.util.Iterator
    public final Object next() {
        if (this.f7498t.f8145t != this.f7501w) {
            throw new ConcurrentModificationException();
        }
        if (!this.f7497s) {
            throw new NoSuchElementException();
        }
        n nVar = this.f7495q[this.f7496r];
        this.f7499u = nVar.f7517q[nVar.f7519s];
        this.f7500v = true;
        return super.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U.d, java.util.Iterator
    public final void remove() {
        if (!this.f7500v) {
            throw new IllegalStateException();
        }
        boolean z5 = this.f7497s;
        X.h hVar = this.f7498t;
        if (!z5) {
            B.a(hVar).remove(this.f7499u);
        } else {
            if (!z5) {
                throw new NoSuchElementException();
            }
            n nVar = this.f7495q[this.f7496r];
            Object obj = nVar.f7517q[nVar.f7519s];
            B.a(hVar).remove(this.f7499u);
            c(obj != null ? obj.hashCode() : 0, hVar.f8143r, obj, 0);
        }
        this.f7499u = null;
        this.f7500v = false;
        this.f7501w = hVar.f8145t;
    }
}
