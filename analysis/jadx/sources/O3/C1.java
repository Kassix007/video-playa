package O3;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class C1 extends AbstractC0308o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4333e;
    public final /* synthetic */ Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1(Object obj, F0 f02, int i) {
        super(f02);
        this.f4333e = i;
        this.f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.AbstractC0308o
    public final void a() {
        switch (this.f4333e) {
            case 0:
                D1 d12 = (D1) this.f;
                E1 e12 = (E1) d12.f4350d;
                e12.o();
                C0323t0 c0323t0 = (C0323t0) e12.f4346r;
                c0323t0.f5052A.getClass();
                d12.e(false, false, SystemClock.elapsedRealtime());
                A a7 = c0323t0.f5055D;
                C0323t0.i(a7);
                c0323t0.f5052A.getClass();
                a7.r(SystemClock.elapsedRealtime());
                break;
            case 1:
                J1 j12 = (J1) this.f;
                j12.s();
                X x6 = ((C0323t0) j12.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4666E.b("Starting upload from DelayedRunnable");
                j12.f4510s.q();
                break;
            default:
                T1 t12 = (T1) this.f;
                t12.c().o();
                String str = (String) t12.f4587G.pollFirst();
                if (str != null) {
                    t12.e().getClass();
                    t12.f4605Y = SystemClock.elapsedRealtime();
                    t12.b().f4666E.c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = t12.f4582B.f5072q;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                t12.F();
                break;
        }
    }
}
