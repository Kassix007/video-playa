package Z5;

import com.google.android.gms.internal.measurement.I1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class F implements X5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X5.f f8540a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(X5.f fVar) {
        this.f8540a = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int a(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        Integer numH0 = J5.t.H0(name);
        if (numH0 != null) {
            return numH0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final I1 c() {
        return X5.i.f8195d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int d() {
        return 1;
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
        if (!(obj instanceof F)) {
            return false;
        }
        F f = (F) obj;
        return kotlin.jvm.internal.m.a(this.f8540a, f.f8540a) && kotlin.jvm.internal.m.a(b(), f.b());
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
        StringBuilder sbL = k1.i.l("Illegal index ", ", ", i);
        sbL.append(b());
        sbL.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return b().hashCode() + (this.f8540a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final X5.f i(int i) {
        if (i >= 0) {
            return this.f8540a;
        }
        StringBuilder sbL = k1.i.l("Illegal index ", ", ", i);
        sbL.append(b());
        sbL.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbL.toString().toString());
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
        StringBuilder sbL = k1.i.l("Illegal index ", ", ", i);
        sbL.append(b());
        sbL.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return b() + '(' + this.f8540a + ')';
    }
}
