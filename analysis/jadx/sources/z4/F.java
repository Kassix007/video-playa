package Z4;

import a.AbstractC0597a;
import android.graphics.drawable.Drawable;
import c0.C0722j;
import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class F implements D2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W0.c f8448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f8451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f8452e;
    public final /* synthetic */ B5.c f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(W0.c cVar, String str, float f, float f7, long j, B5.c cVar2) {
        this.f8448a = cVar;
        this.f8449b = str;
        this.f8450c = f;
        this.f8451d = f7;
        this.f8452e = j;
        this.f = cVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.i
    public final void a(D2.r rVar) {
        Drawable drawable = rVar.f1436a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        W0.c cVar = this.f8448a;
        float fF0 = cVar.f0(intrinsicWidth);
        float fF02 = cVar.f0(drawable.getIntrinsicHeight());
        String str = this.f8449b;
        boolean zA = kotlin.jvm.internal.m.a(str, "SMALL");
        float f = this.f8450c;
        float f7 = zA ? f : 2 * f;
        if (Float.compare(fF0, fF02) < 0) {
            boolean zA2 = kotlin.jvm.internal.m.a(str, "SMALL");
            float f8 = this.f8451d;
            float f9 = (zA2 || kotlin.jvm.internal.m.a(str, "FULL_WIDTH")) ? f8 : 2 * f8;
            if (Float.compare(fF02, f9) > 0) {
                l6.d.m(fF0, fF02, f9, "height");
            } else if (!kotlin.jvm.internal.m.a(str, "FULL_SCREEN") || Float.compare(fF02, f9) >= 0) {
                L.f8475a = f;
                L.f8476b = f8;
            } else {
                l6.d.t(fF0, fF02, f9, "height", f);
            }
        } else if (Float.compare(fF0, f7) > 0) {
            l6.d.m(fF0, fF02, f7, "width");
        } else if (Float.compare(fF0, f7) < 0) {
            l6.d.t(fF0, fF02, f7, "width", f7);
        }
        boolean zA3 = kotlin.jvm.internal.m.a(str, "FULL_SCREEN");
        O3.D d5 = AbstractC1145B.f13658a;
        long j = this.f8452e;
        C0722j c0722j = C0722j.f10095q;
        this.f.invoke(zA3 ? androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), j, d5) : kotlin.jvm.internal.m.a(str, "FULL_WIDTH") ? Float.compare(fF0, fF02) < 0 ? androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), H.e.a(5)), j, d5) : androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), H.e.a(5)), j, d5) : Float.compare(fF02, fF0) > 0 ? androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), H.e.a(10)), j, d5) : androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), H.e.a(10)), j, d5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.i
    public final void b(D2.e eVar) {
        eVar.f1378c.printStackTrace();
    }
}
