package l4;

import android.content.Context;
import android.text.TextPaint;
import g4.C1085b;
import java.lang.ref.WeakReference;
import p4.C1483d;

/* JADX INFO: renamed from: l4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1240j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14574d;
    public final WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1483d f14576g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f14571a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085b f14572b = new C1085b(1, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14575e = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1240j(InterfaceC1239i interfaceC1239i) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(interfaceC1239i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str) {
        TextPaint textPaint = this.f14571a;
        this.f14573c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f14574d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f14575e = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(C1483d c1483d, Context context) {
        if (this.f14576g != c1483d) {
            this.f14576g = c1483d;
            if (c1483d != null) {
                TextPaint textPaint = this.f14571a;
                C1085b c1085b = this.f14572b;
                c1483d.f(context, textPaint, c1085b);
                InterfaceC1239i interfaceC1239i = (InterfaceC1239i) this.f.get();
                if (interfaceC1239i != null) {
                    textPaint.drawableState = interfaceC1239i.getState();
                }
                c1483d.e(context, textPaint, c1085b);
                this.f14575e = true;
            }
            InterfaceC1239i interfaceC1239i2 = (InterfaceC1239i) this.f.get();
            if (interfaceC1239i2 != null) {
                interfaceC1239i2.a();
                interfaceC1239i2.onStateChange(interfaceC1239i2.getState());
            }
        }
    }
}
