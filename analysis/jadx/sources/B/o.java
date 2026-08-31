package b;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.I1;
import i3.C1136a;
import n5.AbstractC1397A;
import w1.p0;
import w1.q0;
import w1.r0;
import w1.s0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends I1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public void B0(C statusBarStyle, C navigationBarStyle, Window window, View view, boolean z5, boolean z6) {
        kotlin.jvm.internal.m.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.m.e(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.m.e(window, "window");
        kotlin.jvm.internal.m.e(view, "view");
        AbstractC1397A.A(window, false);
        window.setStatusBarColor(z5 ? statusBarStyle.f9853b : statusBarStyle.f9852a);
        window.setNavigationBarColor(navigationBarStyle.f9853b);
        C1136a c1136a = new C1136a(view);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new s0(window, c1136a) : i >= 30 ? new r0(window, c1136a) : i >= 26 ? new q0(window, c1136a) : new p0(window, c1136a)).P(!z5);
    }
}
