package P0;

import L0.C0192d;
import L0.E;
import Z.m;
import Z.n;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0192d f5603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f5605c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        m mVar = n.f8314a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(C0192d c0192d, long j) {
        this.f5603a = c0192d;
        int length = c0192d.f3106r.length();
        int i = E.f3088c;
        int i7 = (int) (j >> 32);
        int i8 = i7 < 0 ? 0 : i7;
        i8 = i8 > length ? length : i8;
        int i9 = (int) (4294967295L & j);
        int i10 = i9 >= 0 ? i9 : 0;
        length = i10 <= length ? i10 : length;
        this.f5604b = (i8 == i7 && length == i9) ? j : D5.a.i(i8, length);
        this.f5605c = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        long j = dVar.f5604b;
        int i = E.f3088c;
        return this.f5604b == j && kotlin.jvm.internal.m.a(this.f5605c, dVar.f5605c) && kotlin.jvm.internal.m.a(this.f5603a, dVar.f5603a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f5603a.hashCode() * 31;
        int i = E.f3088c;
        int iD = i.d(iHashCode, 31, this.f5604b);
        E e7 = this.f5605c;
        return iD + (e7 != null ? Long.hashCode(e7.f3089a) : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f5603a) + "', selection=" + ((Object) E.a(this.f5604b)) + ", composition=" + this.f5605c + ')';
    }
}
