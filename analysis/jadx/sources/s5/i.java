package s5;

import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c implements kotlin.jvm.internal.i {
    private final int arity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(int i, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.arity = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        z.f14269a.getClass();
        String strA = A.a(this);
        m.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
