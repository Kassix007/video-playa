package u;

import i3.C1136a;

/* JADX INFO: renamed from: u.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1649f0 implements InterfaceC1671z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16930b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1649f0(float f, Object obj) {
        this.f16929a = f;
        this.f16930b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1657k
    public final B0 a(Z.m mVar) {
        Object obj = this.f16930b;
        return new C1136a(this.f16929a, obj == null ? null : (AbstractC1663q) ((B5.c) mVar.f8313s).invoke(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1649f0)) {
            return false;
        }
        C1649f0 c1649f0 = (C1649f0) obj;
        c1649f0.getClass();
        return c1649f0.f16929a == this.f16929a && kotlin.jvm.internal.m.a(c1649f0.f16930b, this.f16930b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f16930b;
        return Float.hashCode(this.f16929a) + k1.i.b(1.0f, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
