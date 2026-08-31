package s1;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: s1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1590a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f16418c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1590a)) {
            return false;
        }
        C1590a c1590a = (C1590a) obj;
        return Objects.equals(this.f16416a, c1590a.f16416a) && Objects.equals(this.f16417b, c1590a.f16417b) && Objects.equals(this.f16418c, c1590a.f16418c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f16416a, this.f16417b, this.f16418c);
    }
}
