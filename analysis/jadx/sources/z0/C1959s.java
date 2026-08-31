package z0;

import B0.C0055u;
import java.util.Map;

/* JADX INFO: renamed from: z0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1959s implements InterfaceC1927D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f18709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1960t f18710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f18711e;
    public final /* synthetic */ B5.c f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1959s(int i, int i7, Map map, C1960t c1960t, y yVar, B5.c cVar) {
        this.f18707a = i;
        this.f18708b = i7;
        this.f18709c = map;
        this.f18710d = c1960t;
        this.f18711e = yVar;
        this.f = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int a() {
        return this.f18708b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int b() {
        return this.f18707a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final Map c() {
        return this.f18709c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final void d() {
        C0055u c0055u;
        B0.L l7 = this.f18711e.f18730q;
        boolean zR = this.f18710d.r();
        B5.c cVar = this.f;
        if (!zR || (c0055u = l7.f268U.f430b.f518b0) == null) {
            cVar.invoke(l7.f268U.f430b.f323y);
        } else {
            cVar.invoke(c0055u.f323y);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final B5.c e() {
        return null;
    }
}
