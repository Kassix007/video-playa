package p3;

/* JADX INFO: renamed from: p3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1455f implements InterfaceC1453e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15769e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1455f(int i, int i7, boolean z5, boolean z6, String str) {
        this.f15765a = i;
        this.f15766b = i7;
        this.f15767c = z5;
        this.f15768d = z6;
        this.f15769e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
    @Override // p3.InterfaceC1453e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(p3.Y r8) {
        /*
            r7 = this;
            boolean r0 = r7.f15768d
            java.lang.String r1 = r7.f15769e
            if (r0 == 0) goto Lc
            if (r1 != 0) goto Lc
            java.lang.String r1 = r8.o()
        Lc:
            p3.W r0 = r8.f15751b
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3c
            java.util.List r0 = r0.f()
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
            r5 = r4
        L1c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r0.next()
            p3.a0 r6 = (p3.AbstractC1446a0) r6
            p3.Y r6 = (p3.Y) r6
            if (r6 != r8) goto L2d
            r4 = r5
        L2d:
            if (r1 == 0) goto L39
            java.lang.String r6 = r6.o()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L1c
        L39:
            int r5 = r5 + 1
            goto L1c
        L3c:
            r4 = r2
            r5 = r3
        L3e:
            boolean r8 = r7.f15767c
            if (r8 == 0) goto L44
            int r4 = r4 + r3
            goto L46
        L44:
            int r4 = r5 - r4
        L46:
            int r8 = r7.f15765a
            int r0 = r7.f15766b
            if (r8 != 0) goto L4f
            if (r4 != r0) goto L65
            goto L64
        L4f:
            int r4 = r4 - r0
            int r0 = r4 % r8
            if (r0 != 0) goto L65
            int r0 = java.lang.Integer.signum(r4)
            if (r0 == 0) goto L64
            int r0 = java.lang.Integer.signum(r4)
            int r8 = java.lang.Integer.signum(r8)
            if (r0 != r8) goto L65
        L64:
            return r3
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C1455f.a(p3.Y):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f15767c ? "" : "last-";
        boolean z5 = this.f15768d;
        int i = this.f15766b;
        int i7 = this.f15765a;
        return z5 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i7), Integer.valueOf(i), this.f15769e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i7), Integer.valueOf(i));
    }
}
