package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: m.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1275Q extends m1.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14705h;
    public final /* synthetic */ int i;
    public final /* synthetic */ WeakReference j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1284V f14706k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1275Q(C1284V c1284v, int i, int i7, WeakReference weakReference) {
        this.f14706k = c1284v;
        this.f14705h = i;
        this.i = i7;
        this.j = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m1.b
    public final void i(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f14705h) != -1) {
            typeface = AbstractC1282U.a(typeface, i, (this.i & 2) != 0);
        }
        C1284V c1284v = this.f14706k;
        if (c1284v.f14723m) {
            c1284v.f14722l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new U3.a(textView, typeface, c1284v.j));
                } else {
                    textView.setTypeface(typeface, c1284v.j);
                }
            }
        }
    }

    @Override // m1.b
    public final void h(int i) {
    }
}
