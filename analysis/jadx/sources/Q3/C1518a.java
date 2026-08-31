package q3;

import P.C0354f0;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import i0.C1133e;
import kotlin.jvm.internal.m;
import n5.AbstractC1397A;
import r2.e;

/* JADX INFO: renamed from: q3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1518a implements Drawable.Callback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16008r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1518a(int i, Object obj) {
        this.f16007q = i;
        this.f16008r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d5) {
        int i = this.f16007q;
        Object obj = this.f16008r;
        switch (i) {
            case 0:
                m.e(d5, "d");
                C1519b c1519b = (C1519b) obj;
                C0354f0 c0354f0 = c1519b.f16010w;
                c0354f0.setValue(Integer.valueOf(((Number) c0354f0.getValue()).intValue() + 1));
                Drawable drawable = c1519b.f16009v;
                Object obj2 = AbstractC1520c.f16013a;
                c1519b.f16011x.setValue(new C1133e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC1397A.g(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
                break;
            default:
                ((e) obj).invalidateSelf();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, m5.h] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d5, Runnable what, long j) {
        switch (this.f16007q) {
            case 0:
                m.e(d5, "d");
                m.e(what, "what");
                ((Handler) AbstractC1520c.f16013a.getValue()).postAtTime(what, j);
                break;
            default:
                ((e) this.f16008r).scheduleSelf(what, j);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, m5.h] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d5, Runnable what) {
        switch (this.f16007q) {
            case 0:
                m.e(d5, "d");
                m.e(what, "what");
                ((Handler) AbstractC1520c.f16013a.getValue()).removeCallbacks(what);
                break;
            default:
                ((e) this.f16008r).unscheduleSelf(what);
                break;
        }
    }
}
