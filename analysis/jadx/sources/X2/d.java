package x2;

import android.graphics.drawable.Drawable;
import v2.EnumC1757e;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f18356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC1757e f18358c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Drawable drawable, boolean z5, EnumC1757e enumC1757e) {
        this.f18356a = drawable;
        this.f18357b = z5;
        this.f18358c = enumC1757e;
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
        return kotlin.jvm.internal.m.a(this.f18356a, dVar.f18356a) && this.f18357b == dVar.f18357b && this.f18358c == dVar.f18358c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18358c.hashCode() + k1.i.e(this.f18356a.hashCode() * 31, 31, this.f18357b);
    }
}
