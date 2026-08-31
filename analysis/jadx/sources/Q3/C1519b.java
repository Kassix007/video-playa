package q3;

import B0.N;
import C2.e;
import I2.d;
import P.C0345b;
import P.C0354f0;
import P.w0;
import W0.l;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import i0.C1133e;
import j0.AbstractC1148c;
import j0.j;
import kotlin.jvm.internal.m;
import l0.C1219b;
import m0.o;
import m5.AbstractC1362a;
import m5.C1376o;
import n5.AbstractC1397A;
import o0.AbstractC1412b;

/* JADX INFO: renamed from: q3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1519b extends AbstractC1412b implements w0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Drawable f16009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0354f0 f16010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0354f0 f16011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1376o f16012y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1519b(Drawable drawable) {
        m.e(drawable, "drawable");
        this.f16009v = drawable;
        this.f16010w = C0345b.q(0);
        Object obj = AbstractC1520c.f16013a;
        this.f16011x = C0345b.q(new C1133e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC1397A.g(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f16012y = AbstractC1362a.d(new d(19, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final boolean a(float f) {
        this.f16009v.setAlpha(D5.a.q(D5.a.G(f * 255), 0, 255));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // P.w0
    public final void b() {
        Drawable.Callback callback = (Drawable.Callback) this.f16012y.getValue();
        Drawable drawable = this.f16009v;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void c() {
        e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final boolean d(j jVar) {
        this.f16009v.setColorFilter(jVar != null ? jVar.f13711a : null);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // P.w0
    public final void e() {
        Drawable drawable = this.f16009v;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final void f(l layoutDirection) {
        int i;
        m.e(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new e();
            }
        } else {
            i = 0;
        }
        this.f16009v.setLayoutDirection(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final long h() {
        return ((C1133e) this.f16011x.getValue()).f13533a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final void i(N n7) {
        C1219b c1219b = n7.f296q;
        j0.m mVarT = c1219b.f14425r.t();
        ((Number) this.f16010w.getValue()).intValue();
        try {
            mVarT.k();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f16009v;
            if (i < 28 || i >= 31 || !o.r(drawable)) {
                drawable.setBounds(0, 0, D5.a.G(C1133e.d(c1219b.d())), D5.a.G(C1133e.b(c1219b.d())));
            } else {
                mVarT.c(C1133e.d(c1219b.d()) / C1133e.d(h()), C1133e.b(c1219b.d()) / C1133e.b(h()));
            }
            drawable.draw(AbstractC1148c.a(mVarT));
            mVarT.i();
        } catch (Throwable th) {
            mVarT.i();
            throw th;
        }
    }
}
