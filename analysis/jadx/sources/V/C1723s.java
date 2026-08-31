package v;

import i0.C1131c;
import i1.C1134a;
import j0.C1150e;
import l0.C1219b;
import l0.InterfaceC1221d;
import m5.C1386y;

/* JADX INFO: renamed from: v.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1723s extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1131c f17382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f17383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f17384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0.j f17385t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1723s(C1131c c1131c, kotlin.jvm.internal.y yVar, long j, j0.j jVar) {
        super(1);
        this.f17382q = c1131c;
        this.f17383r = yVar;
        this.f17384s = j;
        this.f17385t = jVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        B0.N n7 = (B0.N) obj;
        n7.a();
        C1131c c1131c = this.f17382q;
        float f = c1131c.f13522a;
        float f7 = c1131c.f13523b;
        kotlin.jvm.internal.y yVar = this.f17383r;
        long j = this.f17384s;
        j0.j jVar = this.f17385t;
        C1219b c1219b = n7.f296q;
        ((C1134a) c1219b.f14425r.f234r).A(f, f7);
        try {
            InterfaceC1221d.y(n7, (C1150e) yVar.f14268q, j, 0L, 0.0f, jVar, 0, 890);
            ((C1134a) c1219b.f14425r.f234r).A(-f, -f7);
            return C1386y.f15098a;
        } catch (Throwable th) {
            ((C1134a) c1219b.f14425r.f234r).A(-f, -f7);
            throw th;
        }
    }
}
