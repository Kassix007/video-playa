package Z4;

import P5.S;
import androidx.lifecycle.f0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f8477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P5.D f8478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f8479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f8480e;
    public final S f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P5.D f8481g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public M() {
        S sB = P5.H.b(null);
        this.f8477b = sB;
        this.f8478c = new P5.D(sB);
        Boolean bool = Boolean.FALSE;
        S sB2 = P5.H.b(bool);
        this.f8479d = sB2;
        this.f8480e = sB2;
        S sB3 = P5.H.b(bool);
        this.f = sB3;
        this.f8481g = new P5.D(sB3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        S s6 = this.f8479d;
        s6.getClass();
        s6.h(null, boolValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str) {
        if (str.equals("")) {
            Boolean bool = Boolean.FALSE;
            S s6 = this.f8479d;
            s6.getClass();
            s6.h(null, bool);
            S s7 = this.f;
            s7.getClass();
            s7.h(null, bool);
        }
        S s8 = this.f8477b;
        s8.getClass();
        s8.h(null, str);
    }
}
