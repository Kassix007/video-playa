package x3;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class C extends I3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1893e f18385a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(AbstractC1893e abstractC1893e, Looper looper) {
        super(looper, 1);
        this.f18385a = abstractC1893e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f18385a.f18430M.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                u uVar = (u) message.obj;
                uVar.getClass();
                uVar.c();
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || i7 == 4 || i7 == 5) && !this.f18385a.f()) {
            u uVar2 = (u) message.obj;
            uVar2.getClass();
            uVar2.c();
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            AbstractC1893e abstractC1893e = this.f18385a;
            abstractC1893e.f18427J = new com.google.android.gms.common.b(message.arg2);
            if (!abstractC1893e.f18428K && !TextUtils.isEmpty(abstractC1893e.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC1893e.u());
                    AbstractC1893e abstractC1893e2 = this.f18385a;
                    if (!abstractC1893e2.f18428K) {
                        abstractC1893e2.y(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            AbstractC1893e abstractC1893e3 = this.f18385a;
            com.google.android.gms.common.b bVar = abstractC1893e3.f18427J;
            if (bVar == null) {
                bVar = new com.google.android.gms.common.b(8);
            }
            abstractC1893e3.f18440z.c(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i8 == 5) {
            AbstractC1893e abstractC1893e4 = this.f18385a;
            com.google.android.gms.common.b bVar2 = abstractC1893e4.f18427J;
            if (bVar2 == null) {
                bVar2 = new com.google.android.gms.common.b(8);
            }
            abstractC1893e4.f18440z.c(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            this.f18385a.f18440z.c(new com.google.android.gms.common.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i8 == 6) {
            this.f18385a.y(5, null);
            InterfaceC1890b interfaceC1890b = this.f18385a.f18422E;
            if (interfaceC1890b != null) {
                interfaceC1890b.onConnectionSuspended(message.arg2);
            }
            System.currentTimeMillis();
            AbstractC1893e.x(this.f18385a, 5, 1, null);
            return;
        }
        if (i8 == 2 && !this.f18385a.a()) {
            u uVar3 = (u) message.obj;
            uVar3.getClass();
            uVar3.c();
            return;
        }
        int i9 = message.what;
        if (i9 != 2 && i9 != 1 && i9 != 7) {
            Log.wtf("GmsClient", k1.i.i(i9, "Don't know how to handle message: "), new Exception());
            return;
        }
        u uVar4 = (u) message.obj;
        synchronized (uVar4) {
            try {
                bool = uVar4.f18519a;
                if (uVar4.f18520b) {
                    Log.w("GmsClient", "Callback proxy " + uVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC1893e abstractC1893e5 = uVar4.f;
            int i10 = uVar4.f18522d;
            if (i10 != 0) {
                abstractC1893e5.y(1, null);
                Bundle bundle = uVar4.f18523e;
                uVar4.a(new com.google.android.gms.common.b(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!uVar4.b()) {
                abstractC1893e5.y(1, null);
                uVar4.a(new com.google.android.gms.common.b(8, null));
            }
        }
        synchronized (uVar4) {
            uVar4.f18520b = true;
        }
        uVar4.c();
    }
}
