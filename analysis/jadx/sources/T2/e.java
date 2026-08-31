package t2;

import android.content.ClipDescription;
import android.net.Uri;
import com.google.android.gms.internal.measurement.O1;
import i1.C1134a;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import v.C1725u;
import v0.C1737f;
import v0.C1743l;
import v0.C1748q;
import v0.C1749r;
import v0.EnumC1747p;
import v0.v;
import y4.C1919c;
import z0.InterfaceC1953m;
import z4.InterfaceC1969c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements y1.f, InterfaceC1969c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f16684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f16685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f16686s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.f16684q = obj;
        this.f16685r = obj2;
        this.f16686s = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public ClipDescription a() {
        return (ClipDescription) this.f16685r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public Object b() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public Uri c() {
        return (Uri) this.f16684q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public Uri e() {
        return (Uri) this.f16686s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public void f(C1737f c1737f) {
        C1749r c1749r = (C1749r) this.f16686s;
        ?? r12 = c1737f.f17451a;
        Collection collection = (Collection) r12;
        int size = collection.size();
        int i = 0;
        while (true) {
            EnumC1747p enumC1747p = EnumC1747p.f17484r;
            if (i >= size) {
                InterfaceC1953m interfaceC1953m = (InterfaceC1953m) this.f16684q;
                if (interfaceC1953m == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                v.g(c1737f, interfaceC1953m.F(0L), new C1725u(2, this, c1749r), false);
                if (((EnumC1747p) this.f16685r) == enumC1747p) {
                    int size2 = collection.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((C1743l) r12.get(i7)).a();
                    }
                    O1 o12 = c1737f.f17452b;
                    if (o12 == null) {
                        return;
                    }
                    o12.f10679a = !c1749r.f17491s;
                    return;
                }
                return;
            }
            if (((C1743l) r12.get(i)).b()) {
                if (((EnumC1747p) this.f16685r) == enumC1747p) {
                    InterfaceC1953m interfaceC1953m2 = (InterfaceC1953m) this.f16684q;
                    if (interfaceC1953m2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    v.g(c1737f, interfaceC1953m2.F(0L), new C1748q(c1749r, 0), true);
                }
                this.f16685r = EnumC1747p.f17485s;
                return;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.InterfaceC1969c
    public Object zza() {
        return new y4.e((y4.j) ((InterfaceC1969c) this.f16684q).zza(), (C1919c) ((InterfaceC1969c) this.f16685r).zza(), ((C3.b) ((C1134a) this.f16686s).f13535r).f1185a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public e(Runnable runnable) {
        this.f16685r = new CopyOnWriteArrayList();
        this.f16686s = new HashMap();
        this.f16684q = runnable;
    }

    @Override // y1.f
    public void d() {
    }
}
