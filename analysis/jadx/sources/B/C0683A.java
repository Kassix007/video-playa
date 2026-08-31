package b;

import C0.C0097q;
import M.D;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.InterfaceC0660x;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: b.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0683A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f9846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5.j f9847b = new n5.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f9848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f9849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f9850e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9851g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0683A(Runnable runnable) {
        this.f9846a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f9849d = i >= 34 ? new x(new v(this, 0), new v(this, 1), new w(this, 0), new w(this, 1)) : new D(1, new w(this, 2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(InterfaceC0660x owner, u onBackPressedCallback) {
        kotlin.jvm.internal.m.e(owner, "owner");
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0654q lifecycle = owner.getLifecycle();
        if (lifecycle.b() == EnumC0653p.f9556q) {
            return;
        }
        onBackPressedCallback.f9910b.add(new y(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f9911c = new C0097q(0, this, C0683A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        Object objPrevious;
        u uVar = this.f9848c;
        if (uVar == null) {
            n5.j jVar = this.f9847b;
            ListIterator<E> listIterator = jVar.listIterator(jVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((u) objPrevious).f9909a) {
                        break;
                    }
                }
            }
            uVar = (u) objPrevious;
        }
        this.f9848c = null;
        if (uVar != null) {
            uVar.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        Object objPrevious;
        u uVar = this.f9848c;
        if (uVar == null) {
            n5.j jVar = this.f9847b;
            ListIterator listIterator = jVar.listIterator(jVar.d());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((u) objPrevious).f9909a) {
                        break;
                    }
                }
            }
            uVar = (u) objPrevious;
        }
        this.f9848c = null;
        if (uVar != null) {
            uVar.b();
        } else {
            this.f9846a.run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z5) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f9850e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f9849d) == null) {
            return;
        }
        if (z5 && !this.f) {
            f.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z5 || !this.f) {
                return;
            }
            f.g(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        boolean z5 = this.f9851g;
        boolean z6 = false;
        n5.j jVar = this.f9847b;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((u) it.next()).f9909a) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f9851g = z6;
        if (z6 == z5 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z6);
    }
}
