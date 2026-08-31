package E;

import B0.C0029a;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.T0;
import java.util.Map;
import r.C1549H;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Z.i, Z.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.j f1513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z.c f1514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1549H f1515c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public W(Z.i iVar, Map map, Z.c cVar) {
        C0029a c0029a = new C0029a(11, iVar);
        T0 t02 = Z.k.f8310a;
        this.f1513a = new Z.j(map, c0029a);
        this.f1514b = cVar;
        int i = r.P.f16163a;
        this.f1515c = new C1549H();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.i
    public final boolean a(Object obj) {
        return this.f1513a.a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // Z.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            r14 = this;
            r.H r0 = r14.f1515c
            java.lang.Object[] r1 = r0.f16139b
            long[] r0 = r0.f16138a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            Z.c r11 = r14.f1514b
            r11.e(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            Z.j r0 = r14.f1513a
            java.util.Map r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.W.b():java.util.Map");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.i
    public final Object c(String str) {
        return this.f1513a.c(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.i
    public final Z.h d(String str, B5.a aVar) {
        return this.f1513a.d(str, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.c
    public final void e(Object obj) {
        this.f1514b.e(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.c
    public final void f(Object obj, X.e eVar, C0371o c0371o, int i) {
        c0371o.S(-697180401);
        this.f1514b.f(obj, eVar, c0371o, i & 126);
        boolean zI = c0371o.i(this) | c0371o.i(obj);
        Object objH = c0371o.H();
        if (zI || objH == C0363k.f5418a) {
            objH = new A.Y(9, this, obj);
            c0371o.d0(objH);
        }
        C0345b.c(obj, (B5.c) objH, c0371o);
        c0371o.p(false);
    }
}
