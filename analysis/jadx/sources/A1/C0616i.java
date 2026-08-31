package a1;

/* JADX INFO: renamed from: a1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0616i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8739a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8740b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0618k f8741c = EnumC0618k.f8748q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8742d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8743e = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0616i)) {
            return false;
        }
        C0616i c0616i = (C0616i) obj;
        return this.f8739a == c0616i.f8739a && this.f8740b == c0616i.f8740b && this.f8741c == c0616i.f8741c && this.f8742d == c0616i.f8742d && this.f8743e == c0616i.f8743e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f8743e) + k1.i.e((this.f8741c.hashCode() + k1.i.e(Boolean.hashCode(this.f8739a) * 31, 31, this.f8740b)) * 31, 31, this.f8742d);
    }
}
