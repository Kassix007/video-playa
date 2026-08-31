package M;

import a1.EnumC0618k;

/* JADX INFO: renamed from: M.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0212h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0618k f3497a = EnumC0618k.f8748q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3498b = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0212h0) {
            return this.f3497a == ((C0212h0) obj).f3497a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3498b) + (this.f3497a.hashCode() * 31);
    }
}
