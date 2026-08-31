package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements i, Serializable {
    private final int arity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(int i) {
        this.arity = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        z.f14269a.getClass();
        String strA = A.a(this);
        m.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
