package f0;

import W0.l;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import j0.AbstractC1148c;
import j0.C1147b;
import j0.m;
import l0.C1218a;
import l0.C1219b;

/* JADX INFO: loaded from: classes.dex */
public final class b extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W0.d f12681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B5.c f12683c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(W0.d dVar, long j, B5.c cVar) {
        this.f12681a = dVar;
        this.f12682b = j;
        this.f12683c = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C1219b c1219b = new C1219b();
        Canvas canvas2 = AbstractC1148c.f13699a;
        C1147b c1147b = new C1147b();
        c1147b.f13696a = canvas;
        C1218a c1218a = c1219b.f14424q;
        W0.c cVar = c1218a.f14420a;
        l lVar = c1218a.f14421b;
        m mVar = c1218a.f14422c;
        long j = c1218a.f14423d;
        c1218a.f14420a = this.f12681a;
        c1218a.f14421b = l.f8022q;
        c1218a.f14422c = c1147b;
        c1218a.f14423d = this.f12682b;
        c1147b.k();
        this.f12683c.invoke(c1219b);
        c1147b.i();
        c1218a.f14420a = cVar;
        c1218a.f14421b = lVar;
        c1218a.f14422c = mVar;
        c1218a.f14423d = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f12682b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        W0.d dVar = this.f12681a;
        point.set(dVar.G(fIntBitsToFloat / dVar.b()), dVar.G(Float.intBitsToFloat((int) (j & 4294967295L)) / dVar.b()));
        point2.set(point.x / 2, point.y / 2);
    }
}
