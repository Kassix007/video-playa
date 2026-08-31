package Z5;

import com.google.android.gms.internal.measurement.I1;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class W implements X5.f, InterfaceC0581j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X5.f f8569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f8571c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public W(X5.f original) {
        kotlin.jvm.internal.m.e(original, "original");
        this.f8569a = original;
        this.f8570b = original.b() + '?';
        this.f8571c = N.b(original);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int a(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.f8569a.a(name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String b() {
        return this.f8570b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final I1 c() {
        return this.f8569a.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int d() {
        return this.f8569a.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String e(int i) {
        return this.f8569a.e(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W) {
            return kotlin.jvm.internal.m.a(this.f8569a, ((W) obj).f8569a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0581j
    public final Set f() {
        return this.f8571c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean g() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final List getAnnotations() {
        return this.f8569a.getAnnotations();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final List h(int i) {
        return this.f8569a.h(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8569a.hashCode() * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final X5.f i(int i) {
        return this.f8569a.i(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean isInline() {
        return this.f8569a.isInline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean j(int i) {
        return this.f8569a.j(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:X5.f:IGET), 63 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8569a);
        sb.append('?');
        return sb.toString();
    }
}
