package w1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: w1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1825A implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f18142a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1850m f18144c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public ViewOnApplyWindowInsetsListenerC1825A(View view, InterfaceC1850m interfaceC1850m) {
        this.f18143b = view;
        this.f18144c = interfaceC1850m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o0 o0VarG = o0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC1850m interfaceC1850m = this.f18144c;
        if (i < 30) {
            AbstractC1826B.a(windowInsets, this.f18143b);
            if (o0VarG.equals(this.f18142a)) {
                return interfaceC1850m.c(view, o0VarG).f();
            }
        }
        this.f18142a = o0VarG;
        o0 o0VarC = interfaceC1850m.c(view, o0VarG);
        if (i >= 30) {
            return o0VarC.f();
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1862z.c(view);
        return o0VarC.f();
    }
}
