package A;

/* JADX INFO: renamed from: A.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0009f implements InterfaceC0008e, InterfaceC0010g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f94a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B5.e f96c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f97d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0009f(float f, boolean z5, C0011h c0011h) {
        this.f94a = f;
        this.f95b = z5;
        this.f96c = c0011h;
        this.f97d = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.InterfaceC0008e, A.InterfaceC0010g
    public final float a() {
        return this.f97d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.InterfaceC0010g
    public final void b(W0.c cVar, int i, int[] iArr, int[] iArr2) {
        c(cVar, i, iArr, W0.l.f8022q, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.InterfaceC0008e
    public final void c(W0.c cVar, int i, int[] iArr, W0.l lVar, int[] iArr2) {
        int i7;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iG = cVar.G(this.f94a);
        boolean z5 = this.f95b && lVar == W0.l.f8023r;
        C0007d c0007d = AbstractC0012i.f106a;
        if (z5) {
            i7 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i8 = iArr[length];
                int iMin2 = Math.min(i7, i - i8);
                iArr2[length] = iMin2;
                iMin = Math.min(iG, (i - iMin2) - i8);
                i7 = iArr2[length] + i8 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i9 = 0;
            i7 = 0;
            iMin = 0;
            int i10 = 0;
            while (i9 < length2) {
                int i11 = iArr[i9];
                int iMin3 = Math.min(i7, i - i11);
                iArr2[i10] = iMin3;
                int iMin4 = Math.min(iG, (i - iMin3) - i11);
                int i12 = iArr2[i10] + i11 + iMin4;
                i9++;
                iMin = iMin4;
                i7 = i12;
                i10++;
            }
        }
        int i13 = i7 - iMin;
        B5.e eVar = this.f96c;
        if (eVar == null || i13 >= i) {
            return;
        }
        int iIntValue = ((Number) eVar.invoke(Integer.valueOf(i - i13), lVar)).intValue();
        int length3 = iArr2.length;
        for (int i14 = 0; i14 < length3; i14++) {
            iArr2[i14] = iArr2[i14] + iIntValue;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0009f)) {
            return false;
        }
        C0009f c0009f = (C0009f) obj;
        return W0.f.a(this.f94a, c0009f.f94a) && this.f95b == c0009f.f95b && kotlin.jvm.internal.m.a(this.f96c, c0009f.f96c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iE = k1.i.e(Float.hashCode(this.f94a) * 31, 31, this.f95b);
        B5.e eVar = this.f96c;
        return iE + (eVar == null ? 0 : eVar.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f95b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) W0.f.b(this.f94a));
        sb.append(", ");
        sb.append(this.f96c);
        sb.append(')');
        return sb.toString();
    }
}
