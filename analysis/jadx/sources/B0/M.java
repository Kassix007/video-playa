package B0;

import com.google.android.gms.internal.measurement.K1;
import i0.C1130b;
import java.util.HashMap;
import java.util.Map;
import z0.AbstractC1933J;
import z0.AbstractC1943c;
import z0.C1952l;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1933J f289a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f293e;
    public InterfaceC0031b f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f295h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f290b = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f294g = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B0.b */
    /* JADX WARN: Multi-variable type inference failed */
    public M(InterfaceC0031b interfaceC0031b, int i) {
        this.f295h = i;
        this.f289a = (AbstractC1933J) interfaceC0031b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r12v5, types: [B5.e, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r3v6, types: [B0.b, z0.J] */
    public static final void a(M m4, C1952l c1952l, int i, n0 n0Var) {
        HashMap map = m4.f294g;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jH = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (m4.f295h) {
                    case 0:
                        s0 s0Var = n0Var.f498V;
                        if (s0Var != null) {
                            jH = s0Var.f(false, jH);
                        }
                        jH = K1.H(jH, n0Var.f489M);
                        break;
                    default:
                        U uZ0 = n0Var.z0();
                        kotlin.jvm.internal.m.b(uZ0);
                        long j = uZ0.f326C;
                        jH = C1130b.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jH);
                        break;
                }
                n0Var = n0Var.f480D;
                kotlin.jvm.internal.m.b(n0Var);
                if (n0Var.equals(m4.f289a.n())) {
                    int iRound = Math.round(c1952l instanceof C1952l ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (jH >> 32)));
                    if (map.containsKey(c1952l)) {
                        int iIntValue = ((Number) n5.x.J(c1952l, map)).intValue();
                        C1952l c1952l2 = AbstractC1943c.f18686a;
                        iRound = ((Number) c1952l.f18698a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(c1952l, Integer.valueOf(iRound));
                    return;
                }
            } while (!m4.b(n0Var).containsKey(c1952l));
            float fC = m4.c(n0Var, c1952l);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map b(n0 n0Var) {
        switch (this.f295h) {
            case 0:
                return n0Var.j0().c();
            default:
                U uZ0 = n0Var.z0();
                kotlin.jvm.internal.m.b(uZ0);
                return uZ0.j0().c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(n0 n0Var, C1952l c1952l) {
        switch (this.f295h) {
            case 0:
                return n0Var.b0(c1952l);
            default:
                U uZ0 = n0Var.z0();
                kotlin.jvm.internal.m.b(uZ0);
                return uZ0.b0(c1952l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        return this.f291c || this.f292d || this.f293e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        h();
        return this.f != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [B0.b, z0.J] */
    public final void f() {
        this.f290b = true;
        ?? r02 = this.f289a;
        InterfaceC0031b interfaceC0031bQ = r02.q();
        if (interfaceC0031bQ == null) {
            return;
        }
        if (this.f291c) {
            interfaceC0031bQ.requestLayout();
        }
        if (this.f292d) {
            r02.J();
        }
        if (this.f293e) {
            r02.requestLayout();
        }
        interfaceC0031bQ.c().f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v1, types: [B0.b, z0.J] */
    public final void g() {
        HashMap map = this.f294g;
        map.clear();
        C0029a c0029a = new C0029a(0, this);
        ?? r22 = this.f289a;
        r22.o(c0029a);
        map.putAll(b(r22.n()));
        this.f290b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [B0.b, z0.J] */
    /* JADX WARN: Type inference failed for: r1v1, types: [B0.b] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            z0.J r1 = r2.f289a
            if (r0 == 0) goto L9
            goto L51
        L9:
            B0.b r0 = r1.q()
            if (r0 != 0) goto L10
            goto L53
        L10:
            B0.M r0 = r0.c()
            B0.b r1 = r0.f
            if (r1 == 0) goto L23
            B0.M r0 = r1.c()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            B0.b r0 = r2.f
            if (r0 == 0) goto L53
            B0.M r1 = r0.c()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            B0.b r1 = r0.q()
            if (r1 == 0) goto L41
            B0.M r1 = r1.c()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            B0.b r0 = r0.q()
            if (r0 == 0) goto L50
            B0.M r0 = r0.c()
            if (r0 == 0) goto L50
            B0.b r1 = r0.f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.M.h():void");
    }
}
