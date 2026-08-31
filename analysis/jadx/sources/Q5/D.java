package Q5;

import P5.G;
import P5.P;

/* JADX INFO: loaded from: classes.dex */
public final class D extends G implements P {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.P
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f6349w;
            kotlin.jvm.internal.m.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f6350x + ((long) ((int) ((l() + ((long) this.f6352z)) - this.f6350x)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(int i) {
        synchronized (this) {
            Object[] objArr = this.f6349w;
            kotlin.jvm.internal.m.b(objArr);
            n(Integer.valueOf(((Number) objArr[((int) ((this.f6350x + ((long) ((int) ((l() + ((long) this.f6352z)) - this.f6350x)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
