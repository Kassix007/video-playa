package O3;

import android.util.Log;

/* JADX INFO: renamed from: O3.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0294j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4923a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0323t0 f4924b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0294j0(T1 t12) {
        this.f4924b = t12.f4582B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0019 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: O3.t0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: O3.t0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: O3.t0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: O3.t0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: O3.t0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: O3.t0 */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.f4923a) {
            case 0:
                C0323t0 c0323t0 = this.f4924b;
                boolean z5 = false;
                try {
                    C3.b bVarA = C3.c.a(c0323t0.f5072q);
                    if (bVarA == null) {
                        X x6 = c0323t0.f5077v;
                        C0323t0.l(x6);
                        x6.f4666E.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        c0323t0 = c0323t0;
                    } else {
                        int i = bVarA.a(128, "com.android.vending").versionCode;
                        c0323t0 = i;
                        if (i >= 80837300) {
                            z5 = true;
                            c0323t0 = i;
                        }
                    }
                    break;
                } catch (Exception e7) {
                    X x7 = c0323t0.f5077v;
                    C0323t0.l(x7);
                    x7.f4666E.c(e7, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z5;
            default:
                X x8 = this.f4924b.f5077v;
                C0323t0.l(x8);
                return Log.isLoggable(x8.y(), 3);
        }
    }

    public C0294j0(N0 n02, C0323t0 c0323t0) {
        this.f4924b = c0323t0;
    }
}
