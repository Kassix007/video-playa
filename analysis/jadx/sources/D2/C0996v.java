package d2;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: d2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0996v extends C0994t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0997w f12215q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0996v(C0997w c0997w, Context context) {
        super(context);
        this.f12215q = c0997w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.C0994t
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.C0994t
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.C0994t
    public final void h(View view, C0969P c0969p) {
        C0997w c0997w = this.f12215q;
        int[] iArrA = c0997w.a(c0997w.f12216a.getLayoutManager(), view);
        int i = iArrA[0];
        int i7 = iArrA[1];
        int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i7)))) / 0.3356d);
        if (iCeil > 0) {
            c0969p.f12007a = i;
            c0969p.f12008b = i7;
            c0969p.f12009c = iCeil;
            c0969p.f12011e = this.j;
            c0969p.f = true;
        }
    }
}
