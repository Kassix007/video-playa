package m5;

import java.io.Serializable;

/* JADX INFO: renamed from: m5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1387z implements InterfaceC1369h, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B5.a f15099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f15100r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m5.InterfaceC1369h
    public final Object getValue() {
        if (this.f15100r == C1383v.f15095a) {
            B5.a aVar = this.f15099q;
            kotlin.jvm.internal.m.b(aVar);
            this.f15100r = aVar.invoke();
            this.f15099q = null;
        }
        return this.f15100r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f15100r != C1383v.f15095a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
