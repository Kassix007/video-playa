package J1;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.InterfaceC0648k;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import i2.C1135a;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC0648k, g2.e, l0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractComponentCallbacksC0185q f2588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k0 f2589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h0 f2590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0662z f2591t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Z.m f2592u = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q, k0 k0Var) {
        this.f2588q = abstractComponentCallbacksC0185q;
        this.f2589r = k0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.e
    public final Z.m b() {
        g();
        return (Z.m) this.f2592u.f8313s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(EnumC0652o enumC0652o) {
        this.f2591t.f(enumC0652o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0648k
    public final h0 d() {
        Application application;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2588q;
        h0 h0VarD = abstractComponentCallbacksC0185q.d();
        if (!h0VarD.equals(abstractComponentCallbacksC0185q.f2714f0)) {
            this.f2590s = h0VarD;
            return h0VarD;
        }
        if (this.f2590s == null) {
            Context applicationContext = abstractComponentCallbacksC0185q.C().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f2590s = new a0(application, this, abstractComponentCallbacksC0185q.f2723v);
        }
        return this.f2590s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0648k
    public final P1.e e() {
        Application application;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2588q;
        Context applicationContext = abstractComponentCallbacksC0185q.C().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        P1.e eVar = new P1.e(0);
        LinkedHashMap linkedHashMap = eVar.f5610a;
        if (application != null) {
            linkedHashMap.put(g0.f9546d, application);
        }
        linkedHashMap.put(X.f9512a, this);
        linkedHashMap.put(X.f9513b, this);
        Bundle bundle = abstractComponentCallbacksC0185q.f2723v;
        if (bundle != null) {
            linkedHashMap.put(X.f9514c, bundle);
        }
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.l0
    public final k0 f() {
        g();
        return this.f2589r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        if (this.f2591t == null) {
            this.f2591t = new C0662z(this);
            C1135a c1135a = new C1135a(this, new I2.d(16, this));
            this.f2592u = new Z.m(c1135a, 13);
            c1135a.a();
            X.c(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0660x
    public final AbstractC0654q getLifecycle() {
        g();
        return this.f2591t;
    }
}
