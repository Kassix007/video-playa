package P;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: P.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0367m extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f5426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5427e = new LinkedHashSet();
    public final C0354f0 f = new C0354f0(X.i.f8148t, S.f5375t);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0371o f5428g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0367m(C0371o c0371o, int i, boolean z5, boolean z6, S s6) {
        this.f5428g = c0371o;
        this.f5423a = i;
        this.f5424b = z5;
        this.f5425c = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void a(C0382u c0382u, X.e eVar) {
        this.f5428g.f5457b.a(c0382u, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void b() {
        C0371o c0371o = this.f5428g;
        c0371o.f5478z--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final boolean c() {
        return this.f5428g.f5457b.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final boolean d() {
        return this.f5424b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final boolean e() {
        return this.f5425c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final InterfaceC0360i0 f() {
        return (InterfaceC0360i0) this.f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final int g() {
        return this.f5423a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final InterfaceC1529h h() {
        return this.f5428g.f5457b.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void i(C0382u c0382u) {
        C0371o c0371o = this.f5428g;
        c0371o.f5457b.i(c0371o.f5461g);
        c0371o.f5457b.i(c0382u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final U j(V v6) {
        return this.f5428g.f5457b.j(v6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void k(Set set) {
        HashSet hashSet = this.f5426d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f5426d = hashSet;
        }
        hashSet.add(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void l(C0371o c0371o) {
        this.f5427e.add(c0371o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void m(C0382u c0382u) {
        this.f5428g.f5457b.m(c0382u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void n() {
        this.f5428g.f5478z++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void o(C0371o c0371o) {
        HashSet<Set> hashSet = this.f5426d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                kotlin.jvm.internal.m.c(c0371o, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c0371o.f5458c);
            }
        }
        LinkedHashSet linkedHashSet = this.f5427e;
        if ((linkedHashSet instanceof C5.a) && !(linkedHashSet instanceof C5.b)) {
            kotlin.jvm.internal.B.f(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(c0371o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.r
    public final void p(C0382u c0382u) {
        this.f5428g.f5457b.p(c0382u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        LinkedHashSet<C0371o> linkedHashSet = this.f5427e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f5426d;
        if (hashSet != null) {
            for (C0371o c0371o : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0371o.f5458c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
