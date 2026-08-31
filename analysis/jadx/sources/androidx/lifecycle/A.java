package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import m5.InterfaceC1364c;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends Service implements InterfaceC0660x {
    private final d0 dispatcher = new d0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0660x
    public AbstractC0654q getLifecycle() {
        return this.dispatcher.f9537a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(EnumC0652o.ON_START);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public void onCreate() {
        d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(EnumC0652o.ON_CREATE);
        super.onCreate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public void onDestroy() {
        d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(EnumC0652o.ON_STOP);
        d0Var.a(EnumC0652o.ON_DESTROY);
        super.onDestroy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    @InterfaceC1364c
    public void onStart(Intent intent, int i) {
        d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(EnumC0652o.ON_START);
        super.onStart(intent, i);
    }
}
