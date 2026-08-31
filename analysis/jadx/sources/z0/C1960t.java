package z0;

import java.util.Map;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: z0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1960t implements T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public W0.l f18712q = W0.l.f8023r;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f18713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f18714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f18715t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1960t(y yVar) {
        this.f18715t = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // z0.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.lang.Object r12, B5.e r13) {
        /*
            r11 = this;
            z0.y r0 = r11.f18715t
            r0.b()
            B0.L r1 = r0.f18730q
            B0.P r2 = r1.f269V
            B0.G r2 = r2.f302d
            B0.G r3 = B0.G.f227s
            B0.G r4 = B0.G.f225q
            if (r2 == r4) goto L21
            if (r2 == r3) goto L21
            B0.G r5 = B0.G.f226r
            if (r2 == r5) goto L21
            B0.G r5 = B0.G.f228t
            if (r2 != r5) goto L1c
            goto L21
        L1c:
            java.lang.String r5 = "subcompose can only be used inside the measure or layout blocks"
            y0.AbstractC1904a.b(r5)
        L21:
            r.G r5 = r0.f18736w
            java.lang.Object r6 = r5.g(r12)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L5f
            r.G r6 = r0.f18739z
            java.lang.Object r6 = r6.j(r12)
            B0.L r6 = (B0.L) r6
            if (r6 == 0) goto L46
            int r9 = r0.f18729E
            if (r9 <= 0) goto L3a
            goto L3f
        L3a:
            java.lang.String r9 = "Check failed."
            y0.AbstractC1904a.b(r9)
        L3f:
            int r9 = r0.f18729E
            int r9 = r9 + (-1)
            r0.f18729E = r9
            goto L5c
        L46:
            B0.L r6 = r0.j(r12)
            if (r6 != 0) goto L5c
            int r6 = r0.f18733t
            B0.L r9 = new B0.L
            r10 = 2
            r9.<init>(r10)
            r1.f254G = r8
            r1.z(r6, r9)
            r1.f254G = r7
            r6 = r9
        L5c:
            r5.l(r12, r6)
        L5f:
            B0.L r6 = (B0.L) r6
            java.util.List r5 = r1.o()
            int r9 = r0.f18733t
            if (r9 < 0) goto L76
            R.b r5 = (R.b) r5
            R.e r10 = r5.f6670q
            int r10 = r10.f6678s
            if (r9 >= r10) goto L76
            java.lang.Object r5 = r5.get(r9)
            goto L77
        L76:
            r5 = 0
        L77:
            if (r5 == r6) goto Lab
            java.util.List r5 = r1.o()
            R.b r5 = (R.b) r5
            R.e r5 = r5.f6670q
            int r5 = r5.k(r6)
            int r9 = r0.f18733t
            if (r5 < r9) goto L8a
            goto La0
        L8a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Key \""
            r9.<init>(r10)
            r9.append(r12)
            java.lang.String r10 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            y0.AbstractC1904a.a(r9)
        La0:
            int r9 = r0.f18733t
            if (r9 == r5) goto Lab
            r1.f254G = r8
            r1.J(r5, r9, r8)
            r1.f254G = r7
        Lab:
            int r1 = r0.f18733t
            int r1 = r1 + r8
            r0.f18733t = r1
            r0.h(r6, r12, r13)
            if (r2 == r4) goto Lbd
            if (r2 != r3) goto Lb8
            goto Lbd
        Lb8:
            java.util.List r12 = r6.m()
            return r12
        Lbd:
            B0.P r12 = r6.f269V
            B0.c0 r12 = r12.f311p
            java.util.List r12 = r12.Y()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C1960t.H(java.lang.Object, B5.e):java.util.List");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final InterfaceC1927D O(int i, int i7, Map map, B5.c cVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i7) != 0) {
            AbstractC1904a.b("Size(" + i + " x " + i7 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1959s(i, i7, map, this, this.f18715t, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f18713r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final W0.l getLayoutDirection() {
        return this.f18712q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f18714s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final boolean r() {
        B0.G g7 = this.f18715t.f18730q.f269V.f302d;
        return g7 == B0.G.f228t || g7 == B0.G.f226r;
    }
}
