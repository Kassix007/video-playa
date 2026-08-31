package Z5;

import com.google.android.gms.internal.measurement.I1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U implements X5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X5.e f8567b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U(String str, X5.e kind) {
        kotlin.jvm.internal.m.e(kind, "kind");
        this.f8566a = str;
        this.f8567b = kind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int a(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        f();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String b() {
        return this.f8566a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final I1 c() {
        return this.f8567b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int d() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String e(int i) {
        f();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u6 = (U) obj;
        return kotlin.jvm.internal.m.a(this.f8566a, u6.f8566a) && kotlin.jvm.internal.m.a(this.f8567b, u6.f8567b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        throw new IllegalStateException(k1.i.k(new StringBuilder("Primitive descriptor "), this.f8566a, " does not have elements"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean g() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final List getAnnotations() {
        return n5.s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final List h(int i) {
        f();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f8567b.hashCode() * 31) + this.f8566a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final X5.f i(int i) {
        f();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean isInline() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean j(int i) {
        f();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C0.S.p(new StringBuilder("PrimitiveDescriptor("), this.f8566a, ')');
    }
}
