package n1;

import C0.S;
import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f15124e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15128d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(int i, int i7, int i8, int i9) {
        this.f15125a = i;
        this.f15126b = i7;
        this.f15127c = i8;
        this.f15128d = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15125a, bVar2.f15125a), Math.max(bVar.f15126b, bVar2.f15126b), Math.max(bVar.f15127c, bVar2.f15127c), Math.max(bVar.f15128d, bVar2.f15128d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b b(int i, int i7, int i8, int i9) {
        return (i == 0 && i7 == 0 && i8 == 0 && i9 == 0) ? f15124e : new b(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Insets d() {
        return E0.b.i(this.f15125a, this.f15126b, this.f15127c, this.f15128d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15128d == bVar.f15128d && this.f15125a == bVar.f15125a && this.f15127c == bVar.f15127c && this.f15126b == bVar.f15126b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f15125a * 31) + this.f15126b) * 31) + this.f15127c) * 31) + this.f15128d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f15125a);
        sb.append(", top=");
        sb.append(this.f15126b);
        sb.append(", right=");
        sb.append(this.f15127c);
        sb.append(", bottom=");
        return S.o(sb, this.f15128d, '}');
    }
}
