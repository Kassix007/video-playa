package m5;

import java.io.Serializable;

/* JADX INFO: renamed from: m5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1376o implements InterfaceC1369h, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B5.a f15086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Object f15087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f15088s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1376o(B5.a initializer) {
        kotlin.jvm.internal.m.e(initializer, "initializer");
        this.f15086q = initializer;
        this.f15087r = C1383v.f15095a;
        this.f15088s = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m5.InterfaceC1369h
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f15087r;
        C1383v c1383v = C1383v.f15095a;
        if (obj != c1383v) {
            return obj;
        }
        synchronized (this.f15088s) {
            objInvoke = this.f15087r;
            if (objInvoke == c1383v) {
                B5.a aVar = this.f15086q;
                kotlin.jvm.internal.m.b(aVar);
                objInvoke = aVar.invoke();
                this.f15087r = objInvoke;
                this.f15086q = null;
            }
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f15087r != C1383v.f15095a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
