package androidx.lifecycle;

import m5.InterfaceC1366e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements K, kotlin.jvm.internal.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J5.i f9542q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e0(J5.i iVar) {
        this.f9542q = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.h
    public final InterfaceC1366e a() {
        return this.f9542q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof K) || !(obj instanceof kotlin.jvm.internal.h)) {
            return false;
        }
        return this.f9542q.equals(((kotlin.jvm.internal.h) obj).a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9542q.hashCode();
    }

    @Override // androidx.lifecycle.K
    public final /* synthetic */ void onChanged(Object obj) {
        this.f9542q.invoke(obj);
    }
}
