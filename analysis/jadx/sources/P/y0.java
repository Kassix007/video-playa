package P;

import M5.AbstractC0263y;
import M5.C0258t;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import q5.C1530i;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements InterfaceC0261w, w0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0353f f5579t = new C0353f();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1529h f5580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f5581r = this;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile InterfaceC1529h f5582s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y0(InterfaceC1529h interfaceC1529h) {
        this.f5580q = interfaceC1529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this.f5581r) {
            try {
                InterfaceC1529h interfaceC1529h = this.f5582s;
                if (interfaceC1529h == null) {
                    this.f5582s = f5579t;
                } else {
                    AbstractC0263y.f(interfaceC1529h, new H(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void c() {
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0261w
    public final InterfaceC1529h d() {
        InterfaceC1529h interfaceC1529hPlus;
        InterfaceC1529h interfaceC1529h = this.f5582s;
        if (interfaceC1529h == null || interfaceC1529h == f5579t) {
            synchronized (this.f5581r) {
                try {
                    interfaceC1529hPlus = this.f5582s;
                    if (interfaceC1529hPlus == null) {
                        InterfaceC1529h interfaceC1529h2 = this.f5580q;
                        interfaceC1529hPlus = interfaceC1529h2.plus(new M5.d0((InterfaceC0241b0) interfaceC1529h2.get(C0258t.f3885r))).plus(C1530i.f16022q);
                    } else if (interfaceC1529hPlus == f5579t) {
                        InterfaceC1529h interfaceC1529h3 = this.f5580q;
                        M5.d0 d0Var = new M5.d0((InterfaceC0241b0) interfaceC1529h3.get(C0258t.f3885r));
                        d0Var.s(new H(0));
                        interfaceC1529hPlus = interfaceC1529h3.plus(d0Var).plus(C1530i.f16022q);
                    }
                    this.f5582s = interfaceC1529hPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC1529h = interfaceC1529hPlus;
        }
        kotlin.jvm.internal.m.b(interfaceC1529h);
        return interfaceC1529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void e() {
        a();
    }

    @Override // P.w0
    public final void b() {
    }
}
