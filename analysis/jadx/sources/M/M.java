package M;

import C0.c1;
import M5.InterfaceC0261w;
import a1.EnumC0618k;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import com.wnapp.smspariaz.R;
import i3.C1136a;
import java.util.UUID;
import n5.AbstractC1397A;
import u.C1642c;

/* JADX INFO: loaded from: classes.dex */
public final class M extends b.m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B5.a f3337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0212h0 f3338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f3339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K f3340w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public M(B5.a aVar, C0212h0 c0212h0, View view, W0.l lVar, W0.c cVar, UUID uuid, C1642c c1642c, InterfaceC0261w interfaceC0261w, boolean z5) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f3337t = aVar;
        this.f3338u = c0212h0;
        this.f3339v = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC1397A.A(window, false);
        K k7 = new K(getContext(), this.f3338u.f3498b, this.f3337t, c1642c, interfaceC0261w);
        k7.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        k7.setClipChildren(false);
        k7.setElevation(cVar.u(f));
        k7.setOutlineProvider(new c1(1));
        this.f3340w = k7;
        setContentView(k7);
        androidx.lifecycle.X.h(k7, androidx.lifecycle.X.d(view));
        androidx.lifecycle.X.i(k7, androidx.lifecycle.X.e(view));
        AbstractC0836n2.M(k7, AbstractC0836n2.p(view));
        e(this.f3337t, this.f3338u, lVar);
        C1136a c1136a = new C1136a(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        C3.a s0Var = i >= 35 ? new w1.s0(window, c1136a) : i >= 30 ? new w1.r0(window, c1136a) : i >= 26 ? new w1.q0(window, c1136a) : new w1.p0(window, c1136a);
        boolean z6 = !z5;
        s0Var.P(z6);
        s0Var.O(z6);
        P1.c(this.f9903s, this, new L(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(B5.a aVar, C0212h0 c0212h0, W0.l lVar) {
        this.f3337t = aVar;
        this.f3338u = c0212h0;
        EnumC0618k enumC0618k = c0212h0.f3497a;
        ViewGroup.LayoutParams layoutParams = this.f3339v.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z5 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = enumC0618k.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z5 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new C2.e();
                }
                z5 = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.m.b(window);
        window.setFlags(z5 ? 8192 : -8193, 8192);
        int iOrdinal2 = lVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            throw new C2.e();
        }
        this.f3340w.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f3337t.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
