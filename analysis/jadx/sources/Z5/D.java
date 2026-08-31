package Z5;

import com.google.android.gms.internal.measurement.I1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D implements X5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X5.f f8537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X5.f f8538b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(X5.f keyDesc, X5.f valueDesc) {
        kotlin.jvm.internal.m.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.m.e(valueDesc, "valueDesc");
        this.f8537a = keyDesc;
        this.f8538b = valueDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int a(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        Integer numH0 = J5.t.H0(name);
        if (numH0 != null) {
            return numH0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final I1 c() {
        return X5.i.f8196e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int d() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String e(int i) {
        return String.valueOf(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        d5.getClass();
        return kotlin.jvm.internal.m.a(this.f8537a, d5.f8537a) && kotlin.jvm.internal.m.a(this.f8538b, d5.f8538b);
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
        if (i >= 0) {
            return n5.s.f15299q;
        }
        throw new IllegalArgumentException(C0.S.m("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8538b.hashCode() + ((this.f8537a.hashCode() + 710441009) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final X5.f i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C0.S.m("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i).toString());
        }
        int i7 = i % 2;
        if (i7 == 0) {
            return this.f8537a;
        }
        if (i7 == 1) {
            return this.f8538b;
        }
        throw new IllegalStateException("Unreached");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean isInline() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(C0.S.m("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f8537a + ", " + this.f8538b + ')';
    }
}
