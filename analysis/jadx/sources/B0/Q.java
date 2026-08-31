package B0;

import java.util.Map;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements InterfaceC1927D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B5.c f316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f317e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Q(int i, int i7, Map map, B5.c cVar, T t6) {
        this.f313a = i;
        this.f314b = i7;
        this.f315c = map;
        this.f316d = cVar;
        this.f317e = t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int a() {
        return this.f314b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int b() {
        return this.f313a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final Map c() {
        return this.f315c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final void d() {
        this.f316d.invoke(this.f317e.f323y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final B5.c e() {
        return null;
    }
}
