package androidx.room;

import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f9753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f9754c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, C0666d delegate) {
        super(delegate.f9748a);
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f9753b = qVar;
        this.f9754c = new WeakReference(delegate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.room.n
    public final void a(Set tables) {
        kotlin.jvm.internal.m.e(tables, "tables");
        n nVar = (n) this.f9754c.get();
        if (nVar == null) {
            this.f9753b.d(this);
        } else {
            nVar.a(tables);
        }
    }
}
