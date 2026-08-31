package k1;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import w1.InterfaceC1846i;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Activity implements InterfaceC0660x, InterfaceC1846i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0662z f14061q = new C0662z(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1846i
    public final boolean c(KeyEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        if (AbstractC0836n2.m(decorView, event)) {
            return true;
        }
        return AbstractC0836n2.n(this, decorView, this, event);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        if (AbstractC0836n2.m(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = T.f9505r;
        P.b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.e(outState, "outState");
        this.f14061q.h(EnumC0653p.f9558s);
        super.onSaveInstanceState(outState);
    }
}
