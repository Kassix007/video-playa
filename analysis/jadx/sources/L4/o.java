package l4;

import android.view.View;
import java.util.WeakHashMap;
import w1.AbstractC1835K;
import w1.AbstractC1862z;

/* JADX INFO: loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1862z.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
