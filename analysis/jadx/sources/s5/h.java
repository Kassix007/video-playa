package s5;

import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g implements kotlin.jvm.internal.i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f16564q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(int i, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f16564q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return this.f16564q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        z.f14269a.getClass();
        String strA = A.a(this);
        m.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
