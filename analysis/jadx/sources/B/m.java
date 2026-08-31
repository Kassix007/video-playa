package b;

import C0.RunnableC0089m;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.X;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import i2.C1135a;

/* JADX INFO: loaded from: classes.dex */
public class m extends Dialog implements InterfaceC0660x, B, g2.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0662z f9901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Z.m f9902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0683A f9903s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(Context context, int i) {
        super(context, i);
        this.f9902r = new Z.m(new C1135a(this, new I2.d(16, this)), 13);
        this.f9903s = new C0683A(new RunnableC0089m(13, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(m mVar) {
        super.onBackPressed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.B
    public final C0683A a() {
        return this.f9903s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.m.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.e
    public final Z.m b() {
        return (Z.m) this.f9902r.f8313s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        Window window = getWindow();
        kotlin.jvm.internal.m.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window!!.decorView");
        X.h(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.m.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.m.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.m.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.m.d(decorView3, "window!!.decorView");
        AbstractC0836n2.M(decorView3, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0660x
    public final AbstractC0654q getLifecycle() {
        C0662z c0662z = this.f9901q;
        if (c0662z != null) {
            return c0662z;
        }
        C0662z c0662z2 = new C0662z(this);
        this.f9901q = c0662z2;
        return c0662z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f9903s.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.m.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0683A c0683a = this.f9903s;
            c0683a.f9850e = onBackInvokedDispatcher;
            c0683a.d(c0683a.f9851g);
        }
        this.f9902r.z(bundle);
        C0662z c0662z = this.f9901q;
        if (c0662z == null) {
            c0662z = new C0662z(this);
            this.f9901q = c0662z;
        }
        c0662z.f(EnumC0652o.ON_CREATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.m.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f9902r.A(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0662z c0662z = this.f9901q;
        if (c0662z == null) {
            c0662z = new C0662z(this);
            this.f9901q = c0662z;
        }
        c0662z.f(EnumC0652o.ON_RESUME);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void onStop() {
        C0662z c0662z = this.f9901q;
        if (c0662z == null) {
            c0662z = new C0662z(this);
            this.f9901q = c0662z;
        }
        c0662z.f(EnumC0652o.ON_DESTROY);
        this.f9901q = null;
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.m.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.m.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
