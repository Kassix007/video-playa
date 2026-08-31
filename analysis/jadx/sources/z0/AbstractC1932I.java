package z0;

import B0.InterfaceC0038e0;

/* JADX INFO: renamed from: z0.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1932I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18663a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: z0.J */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AbstractC1932I abstractC1932I, AbstractC1933J abstractC1933J) {
        abstractC1932I.getClass();
        if (abstractC1933J instanceof InterfaceC0038e0) {
            ((InterfaceC0038e0) abstractC1933J).k(abstractC1932I.f18663a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(AbstractC1932I abstractC1932I, AbstractC1933J abstractC1933J, int i, int i7) {
        abstractC1932I.getClass();
        a(abstractC1932I, abstractC1933J);
        abstractC1933J.U(W0.i.c((((long) i7) & 4294967295L) | (((long) i) << 32), abstractC1933J.f18668u), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(AbstractC1932I abstractC1932I, AbstractC1933J abstractC1933J, long j) {
        abstractC1932I.getClass();
        a(abstractC1932I, abstractC1933J);
        abstractC1933J.U(W0.i.c(j, abstractC1933J.f18668u), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(AbstractC1932I abstractC1932I, AbstractC1933J abstractC1933J, int i, int i7) {
        long j = (((long) i) << 32) | (((long) i7) & 4294967295L);
        if (abstractC1932I.b() == W0.l.f8022q || abstractC1932I.c() == 0) {
            a(abstractC1932I, abstractC1933J);
            abstractC1933J.U(W0.i.c(j, abstractC1933J.f18668u), 0.0f, null);
        } else {
            int iC = (abstractC1932I.c() - abstractC1933J.f18664q) - ((int) (j >> 32));
            a(abstractC1932I, abstractC1933J);
            abstractC1933J.U(W0.i.c((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC1933J.f18668u), 0.0f, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(AbstractC1932I abstractC1932I, AbstractC1933J abstractC1933J) {
        int i = AbstractC1935L.f18673b;
        C1934K c1934k = C1934K.f18669r;
        long j = 0;
        long j7 = (j & 4294967295L) | (j << 32);
        if (abstractC1932I.b() == W0.l.f8022q || abstractC1932I.c() == 0) {
            a(abstractC1932I, abstractC1933J);
            abstractC1933J.U(W0.i.c(j7, abstractC1933J.f18668u), 0.0f, c1934k);
        } else {
            int iC = (abstractC1932I.c() - abstractC1933J.f18664q) - ((int) (j7 >> 32));
            a(abstractC1932I, abstractC1933J);
            abstractC1933J.U(W0.i.c((((long) iC) << 32) | (((long) ((int) (j7 & 4294967295L))) & 4294967295L), abstractC1933J.f18668u), 0.0f, c1934k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(AbstractC1932I abstractC1932I, AbstractC1933J abstractC1933J, B5.c cVar) {
        abstractC1932I.getClass();
        long j = 0;
        a(abstractC1932I, abstractC1933J);
        abstractC1933J.U(W0.i.c((j & 4294967295L) | (j << 32), abstractC1933J.f18668u), 0.0f, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(AbstractC1932I abstractC1932I, AbstractC1933J abstractC1933J, long j) {
        int i = AbstractC1935L.f18673b;
        C1934K c1934k = C1934K.f18669r;
        abstractC1932I.getClass();
        a(abstractC1932I, abstractC1933J);
        abstractC1933J.U(W0.i.c(j, abstractC1933J.f18668u), 0.0f, c1934k);
    }

    public abstract W0.l b();

    public abstract int c();
}
