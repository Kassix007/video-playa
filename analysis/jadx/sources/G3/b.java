package G3;

import O3.C0;
import O3.C0270b0;
import O3.C0300l0;
import O3.C0328v;
import O3.T1;
import android.content.Context;
import com.google.android.gms.internal.measurement.R1;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2003b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(int i, Object obj) {
        this.f2002a = i;
        this.f2003b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2002a) {
            case 0:
                return ((Context) this.f2003b).getSharedPreferences("google_sdk_flags", 0);
            case 1:
                return new R1(((C0300l0) this.f2003b).f4946B);
            default:
                C0 c02 = (C0) this.f2003b;
                c02.f4330c.A();
                C0270b0 c0270b0 = c02.f4330c.f4614x;
                T1.S(c0270b0);
                c0270b0.o();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public b(C0 c02, C0328v c0328v, String str) {
        this.f2002a = 2;
        this.f2003b = c02;
    }
}
