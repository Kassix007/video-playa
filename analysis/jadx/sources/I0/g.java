package I0;

import E.Q;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f2231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f2232b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(Q q7, Q q8) {
        this.f2231a = q7;
        this.f2232b = q8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f2231a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f2232b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
