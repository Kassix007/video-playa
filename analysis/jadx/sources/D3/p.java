package d3;

import a3.J;
import android.graphics.PointF;
import g3.C1083b;
import o3.C1416b;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Z.m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1416b f12257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z.m f12258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1083b f12259v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C1416b c1416b, Z.m mVar, C1083b c1083b) {
        super(21);
        this.f12257t = c1416b;
        this.f12258u = mVar;
        this.f12259v = c1083b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.m
    public final Object n(C1416b c1416b) {
        float f = c1416b.f15425a;
        float f7 = c1416b.f15426b;
        String str = ((C1083b) c1416b.f).f13041a;
        String str2 = ((C1083b) c1416b.f15430g).f13041a;
        float f8 = c1416b.f15427c;
        float f9 = c1416b.f15428d;
        float f10 = c1416b.f15429e;
        C1416b c1416b2 = this.f12257t;
        c1416b2.f15425a = f;
        c1416b2.f15426b = f7;
        c1416b2.f = str;
        c1416b2.f15430g = str2;
        c1416b2.f15427c = f8;
        c1416b2.f15428d = f9;
        c1416b2.f15429e = f10;
        String str3 = (String) ((J) this.f12258u.f8313s);
        C1083b c1083b = (C1083b) (c1416b.f15428d == 1.0f ? c1416b.f15430g : c1416b.f);
        String str4 = c1083b.f13042b;
        float f11 = c1083b.f13043c;
        int i = c1083b.f13044d;
        int i7 = c1083b.f13045e;
        float f12 = c1083b.f;
        float f13 = c1083b.f13046g;
        int i8 = c1083b.f13047h;
        int i9 = c1083b.i;
        float f14 = c1083b.j;
        boolean z5 = c1083b.f13048k;
        PointF pointF = c1083b.f13049l;
        PointF pointF2 = c1083b.f13050m;
        C1083b c1083b2 = this.f12259v;
        c1083b2.f13041a = str3;
        c1083b2.f13042b = str4;
        c1083b2.f13043c = f11;
        c1083b2.f13044d = i;
        c1083b2.f13045e = i7;
        c1083b2.f = f12;
        c1083b2.f13046g = f13;
        c1083b2.f13047h = i8;
        c1083b2.i = i9;
        c1083b2.j = f14;
        c1083b2.f13048k = z5;
        c1083b2.f13049l = pointF;
        c1083b2.f13050m = pointF2;
        return c1083b2;
    }
}
