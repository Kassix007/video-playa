package m0;

import L.s;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.internal.measurement.P1;
import i0.C1130b;
import i0.C1131c;
import i0.C1133e;
import j0.AbstractC1145B;
import j0.C1152g;
import j0.InterfaceC1144A;
import j0.x;
import j0.y;
import j0.z;
import l0.AbstractC1220c;
import l0.C1219b;

/* JADX INFO: renamed from: m0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1348c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1350e f14922a;
    public Outline f;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC1145B f14929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC1144A f14930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1152g f14931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1219b f14933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public W1.d f14934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14935q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f14938t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14939u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f14940v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f14942x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W0.c f14923b = AbstractC1220c.f14428a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public W0.l f14924c = W0.l.f8022q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.n f14925d = C1347b.f14919r;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1346a f14926e = new C1346a(0, this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14927g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14928h = 0;
    public long i = 9205357640488583168L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f14936r = new s();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = AbstractC1356k.f14996a;
        int i7 = AbstractC1356k.f14996a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1348c(InterfaceC1350e interfaceC1350e) {
        this.f14922a = interfaceC1350e;
        interfaceC1350e.u(false);
        this.f14938t = 0L;
        this.f14939u = 0L;
        this.f14940v = 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        Outline outline;
        if (this.f14927g) {
            boolean z5 = this.f14941w;
            Outline outline2 = null;
            InterfaceC1350e interfaceC1350e = this.f14922a;
            if (z5 || interfaceC1350e.E() > 0.0f) {
                InterfaceC1144A interfaceC1144A = this.f14930l;
                if (interfaceC1144A != null) {
                    RectF rectF = this.f14942x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f14942x = rectF;
                    }
                    boolean z6 = interfaceC1144A instanceof C1152g;
                    if (!z6) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = ((C1152g) interfaceC1144A).f13707a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || ((C1152g) interfaceC1144A).f13707a.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z6) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z6) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.f14932n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f14932n = true;
                        outline = null;
                    }
                    this.f14930l = interfaceC1144A;
                    if (outline != null) {
                        outline.setAlpha(interfaceC1350e.c());
                        outline2 = outline;
                    }
                    interfaceC1350e.r(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f14932n && this.f14941w) {
                        interfaceC1350e.u(false);
                        interfaceC1350e.i();
                    } else {
                        interfaceC1350e.u(this.f14941w);
                    }
                } else {
                    interfaceC1350e.u(this.f14941w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jD0 = P1.d0(this.f14939u);
                    long j = this.f14928h;
                    long j7 = this.i;
                    if (j7 != 9205357640488583168L) {
                        jD0 = j7;
                    }
                    int i7 = (int) (j >> 32);
                    int i8 = (int) (j & 4294967295L);
                    int i9 = (int) (jD0 >> 32);
                    int i10 = (int) (jD0 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i7)), Math.round(Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat(i9) + Float.intBitsToFloat(i7)), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat(i8)), this.j);
                    outline5.setAlpha(interfaceC1350e.c());
                    interfaceC1350e.r(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i10)))) | (((long) Math.round(Float.intBitsToFloat(i9))) << 32));
                }
            } else {
                interfaceC1350e.u(false);
                interfaceC1350e.r(null, 0L);
            }
        }
        this.f14927g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.f14937s
            if (r0 == 0) goto L69
            int r0 = r15.f14935q
            if (r0 != 0) goto L69
            L.s r0 = r15.f14936r
            java.lang.Object r1 = r0.f3062b
            m0.c r1 = (m0.C1348c) r1
            if (r1 == 0) goto L16
            r1.e()
            r1 = 0
            r0.f3062b = r1
        L16:
            java.lang.Object r0 = r0.f3064d
            r.H r0 = (r.C1549H) r0
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = r0.f16139b
            long[] r2 = r0.f16138a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L61
            r4 = 0
            r5 = r4
        L27:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5c
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L41:
            if (r10 >= r8) goto L5a
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            m0.c r11 = (m0.C1348c) r11
            r11.e()
        L56:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L41
        L5a:
            if (r8 != r9) goto L61
        L5c:
            if (r5 == r3) goto L61
            int r5 = r5 + 1
            goto L27
        L61:
            r0.b()
        L64:
            m0.e r0 = r15.f14922a
            r0.i()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C1348c.b():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Type inference failed for: r1v5, types: [B5.c, kotlin.jvm.internal.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(l0.InterfaceC1221d r15) {
        /*
            r14 = this;
            L.s r0 = r14.f14936r
            java.lang.Object r1 = r0.f3062b
            m0.c r1 = (m0.C1348c) r1
            r0.f3063c = r1
            java.lang.Object r1 = r0.f3064d
            r.H r1 = (r.C1549H) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f3065e
            r.H r2 = (r.C1549H) r2
            if (r2 != 0) goto L23
            int r2 = r.P.f16163a
            r.H r2 = new r.H
            r2.<init>()
            r0.f3065e = r2
        L23:
            r2.k(r1)
            r1.b()
        L29:
            r1 = 1
            r0.f3061a = r1
            kotlin.jvm.internal.n r1 = r14.f14925d
            r1.invoke(r15)
            r15 = 0
            r0.f3061a = r15
            java.lang.Object r1 = r0.f3063c
            m0.c r1 = (m0.C1348c) r1
            if (r1 == 0) goto L3d
            r1.e()
        L3d:
            java.lang.Object r0 = r0.f3065e
            r.H r0 = (r.C1549H) r0
            if (r0 == 0) goto L90
            boolean r1 = r0.h()
            if (r1 == 0) goto L90
            java.lang.Object[] r1 = r0.f16139b
            long[] r2 = r0.f16138a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8d
            r4 = r15
        L53:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L88
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6d:
            if (r9 >= r7) goto L86
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L82
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            m0.c r10 = (m0.C1348c) r10
            r10.e()
        L82:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6d
        L86:
            if (r7 != r8) goto L8d
        L88:
            if (r4 == r3) goto L8d
            int r4 = r4 + 1
            goto L53
        L8d:
            r0.b()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C1348c.c(l0.d):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC1145B d() {
        AbstractC1145B yVar;
        AbstractC1145B abstractC1145B = this.f14929k;
        InterfaceC1144A interfaceC1144A = this.f14930l;
        if (abstractC1145B != null) {
            return abstractC1145B;
        }
        if (interfaceC1144A != null) {
            x xVar = new x(interfaceC1144A);
            this.f14929k = xVar;
            return xVar;
        }
        long jD0 = P1.d0(this.f14939u);
        long j = this.f14928h;
        long j7 = this.i;
        if (j7 != 9205357640488583168L) {
            jD0 = j7;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD0 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            yVar = new z(l6.d.h(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            yVar = new y(new C1131c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f14929k = yVar;
        return yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        this.f14935q--;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(float f, long j, long j7) {
        if (C1130b.b(this.f14928h, j) && C1133e.a(this.i, j7) && this.j == f && this.f14930l == null) {
            return;
        }
        this.f14929k = null;
        this.f14930l = null;
        this.f14927g = true;
        this.f14932n = false;
        this.f14928h = j;
        this.i = j7;
        this.j = f;
        a();
    }
}
