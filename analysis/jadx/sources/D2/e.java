package D2;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f1376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f1378c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Drawable drawable, j jVar, Throwable th) {
        this.f1376a = drawable;
        this.f1377b = jVar;
        this.f1378c = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.k
    public final j a() {
        return this.f1377b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f1376a, eVar.f1376a) && kotlin.jvm.internal.m.a(this.f1377b, eVar.f1377b) && kotlin.jvm.internal.m.a(this.f1378c, eVar.f1378c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Drawable drawable = this.f1376a;
        return this.f1378c.hashCode() + ((this.f1377b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
