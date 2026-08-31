package P;

import M5.C0247h;
import java.util.ArrayList;
import m5.AbstractC1362a;
import n5.AbstractC1397A;
import q5.InterfaceC1527f;
import q5.InterfaceC1528g;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: P.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0351e implements T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A0.d f5393q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Throwable f5395s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f5394r = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f5396t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f5397u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final X.a f5398v = new X.a(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0351e(A0.d dVar) {
        this.f5393q = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(long j) {
        Object objB;
        synchronized (this.f5394r) {
            try {
                ArrayList arrayList = this.f5396t;
                this.f5396t = this.f5397u;
                this.f5397u = arrayList;
                this.f5398v.set(0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0349d c0349d = (C0349d) arrayList.get(i);
                    C0247h c0247h = c0349d.f5391b;
                    try {
                        objB = c0349d.f5390a.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        objB = AbstractC1362a.b(th);
                    }
                    c0247h.resumeWith(objB);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.T
    public final Object e(B5.c cVar, s5.c cVar2) {
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(cVar2));
        c0247h.s();
        C0349d c0349d = new C0349d(cVar, c0247h);
        synchronized (this.f5394r) {
            Throwable th = this.f5395s;
            if (th != null) {
                c0247h.resumeWith(AbstractC1362a.b(th));
            } else {
                boolean zIsEmpty = this.f5396t.isEmpty();
                this.f5396t.add(c0349d);
                if (zIsEmpty) {
                    this.f5398v.set(1);
                }
                c0247h.u(new A.Y(16, this, c0349d));
                if (zIsEmpty) {
                    try {
                        this.f5393q.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f5394r) {
                            try {
                                if (this.f5395s == null) {
                                    this.f5395s = th2;
                                    ArrayList arrayList = this.f5396t;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        ((C0349d) arrayList.get(i)).f5391b.resumeWith(AbstractC1362a.b(th2));
                                    }
                                    this.f5396t.clear();
                                    this.f5398v.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return c0247h.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final Object fold(Object obj, B5.e eVar) {
        return eVar.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1527f get(InterfaceC1528g interfaceC1528g) {
        return E3.h.A(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h minusKey(InterfaceC1528g interfaceC1528g) {
        return E3.h.I(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h plus(InterfaceC1529h interfaceC1529h) {
        return E3.h.L(this, interfaceC1529h);
    }
}
