package v0;

import B0.AbstractC0041g;
import B0.y0;
import M5.AbstractC0263y;
import M5.B;
import M5.EnumC0262x;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c0.AbstractC0724l;
import c0.C0726n;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: v0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1731A extends AbstractC0724l implements InterfaceC1746o, W0.c, y0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Object f17425E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Object f17426F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public PointerInputEventHandler f17427G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public B f17428H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1737f f17429I = u.f17495a;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final R.e f17430J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final R.e f17431K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final R.e f17432L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1737f f17433M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f17434N;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1731A(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f17425E = obj;
        this.f17426F = obj2;
        this.f17427G = pointerInputEventHandler;
        R.e eVar = new R.e(new y[16]);
        this.f17430J = eVar;
        this.f17431K = eVar;
        this.f17432L = new R.e(new y[16]);
        this.f17434N = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.y0
    public final void S() {
        y0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // B0.y0
    public final void U() {
        C1737f c1737f = this.f17433M;
        if (c1737f == null) {
            return;
        }
        ?? r12 = c1737f.f17451a;
        int size = ((Collection) r12).size();
        for (int i = 0; i < size; i++) {
            if (((C1743l) r12.get(i)).f17463d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = ((Collection) r12).size();
                for (int i7 = 0; i7 < size2; i7++) {
                    C1743l c1743l = (C1743l) r12.get(i7);
                    long j = c1743l.f17460a;
                    long j7 = c1743l.f17462c;
                    long j8 = c1743l.f17461b;
                    float f = c1743l.f17464e;
                    boolean z5 = c1743l.f17463d;
                    arrayList.add(new C1743l(j, j8, j7, false, f, j8, j7, z5, z5, c1743l.i, 0L));
                }
                C1737f c1737f2 = new C1737f(arrayList, null);
                this.f17429I = c1737f2;
                x0(c1737f2, EnumC1738g.f17454q);
                x0(c1737f2, EnumC1738g.f17455r);
                x0(c1737f2, EnumC1738g.f17456s);
                this.f17433M = null;
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0048m, B0.y0
    public final void a() {
        y0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return AbstractC0041g.u(this).f261N.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return AbstractC0041g.u(this).f261N.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        y0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // B0.y0
    public final void t(C1737f c1737f, EnumC1738g enumC1738g, long j) {
        this.f17434N = j;
        if (enumC1738g == EnumC1738g.f17454q) {
            this.f17429I = c1737f;
        }
        if (this.f17428H == null) {
            this.f17428H = AbstractC0263y.t(l0(), null, EnumC0262x.f3898t, new z(this, null), 1);
        }
        x0(c1737f, enumC1738g);
        ?? r52 = c1737f.f17451a;
        int size = ((Collection) r52).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1737f = null;
                break;
            } else if (!v.c((C1743l) r52.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f17433M = c1737f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(v0.C1737f r7, v0.EnumC1738g r8) {
        /*
            r6 = this;
            R.e r0 = r6.f17431K
            monitor-enter(r0)
            R.e r1 = r6.f17432L     // Catch: java.lang.Throwable -> L66
            R.e r2 = r6.f17430J     // Catch: java.lang.Throwable -> L66
            int r3 = r1.f6678s     // Catch: java.lang.Throwable -> L66
            r1.d(r3, r2)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            if (r0 == 0) goto L3d
            r2 = 1
            if (r0 == r2) goto L1b
            r2 = 2
            if (r0 == r2) goto L3d
            goto L5a
        L1b:
            R.e r0 = r6.f17432L     // Catch: java.lang.Throwable -> L3b
            int r3 = r0.f6678s     // Catch: java.lang.Throwable -> L3b
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f6676q     // Catch: java.lang.Throwable -> L3b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r3 >= r2) goto L5a
        L25:
            if (r3 < 0) goto L5a
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L3b
            v0.y r2 = (v0.y) r2     // Catch: java.lang.Throwable -> L3b
            v0.g r4 = r2.f17507t     // Catch: java.lang.Throwable -> L3b
            if (r8 != r4) goto L38
            M5.h r4 = r2.f17506s     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L38
            r2.f17506s = r1     // Catch: java.lang.Throwable -> L3b
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L3b
        L38:
            int r3 = r3 + (-1)
            goto L25
        L3b:
            r7 = move-exception
            goto L60
        L3d:
            R.e r0 = r6.f17432L     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r2 = r0.f6676q     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.f6678s     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L44:
            if (r3 >= r0) goto L5a
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L3b
            v0.y r4 = (v0.y) r4     // Catch: java.lang.Throwable -> L3b
            v0.g r5 = r4.f17507t     // Catch: java.lang.Throwable -> L3b
            if (r8 != r5) goto L57
            M5.h r5 = r4.f17506s     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L57
            r4.f17506s = r1     // Catch: java.lang.Throwable -> L3b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L3b
        L57:
            int r3 = r3 + 1
            goto L44
        L5a:
            R.e r7 = r6.f17432L
            r7.i()
            return
        L60:
            R.e r8 = r6.f17432L
            r8.i()
            throw r7
        L66:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1731A.x0(v0.f, v0.g):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y0() {
        B b7 = this.f17428H;
        if (b7 != null) {
            b7.t(new C0726n("Pointer input was reset", 3));
            this.f17428H = null;
        }
    }
}
