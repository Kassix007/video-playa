package Q;

import B0.C0057w;
import P.AbstractC0373p;
import P.C0371o;
import java.util.ArrayList;

/* JADX INFO: renamed from: Q.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0411b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0371o f6487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0410a f6488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6489c;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6492g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6495l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0057w f6490d = new C0057w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6491e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f6493h = new ArrayList();
    public int i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6494k = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0411b(C0371o c0371o, C0410a c0410a) {
        this.f6487a = c0371o;
        this.f6488b = c0410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        c();
        ArrayList arrayList = this.f6493h;
        if (arrayList.isEmpty()) {
            this.f6492g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        int i = this.f6492g;
        if (i > 0) {
            K k7 = this.f6488b.f6486o;
            k7.W(G.f6472c);
            k7.f6482q[k7.f6483r - k7.f6480o[k7.f6481p - 1].f6474a] = i;
            this.f6492g = 0;
        }
        ArrayList arrayList = this.f6493h;
        if (arrayList.isEmpty()) {
            return;
        }
        C0410a c0410a = this.f6488b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i7 = 0; i7 < size; i7++) {
            objArr[i7] = arrayList.get(i7);
        }
        c0410a.getClass();
        if (size != 0) {
            K k8 = c0410a.f6486o;
            k8.W(C0420k.f6505c);
            D5.a.I(k8, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        int i = this.f6495l;
        if (i > 0) {
            int i7 = this.i;
            if (i7 >= 0) {
                b();
                K k7 = this.f6488b.f6486o;
                k7.W(y.f6522c);
                int i8 = k7.f6483r - k7.f6480o[k7.f6481p - 1].f6474a;
                int[] iArr = k7.f6482q;
                iArr[i8] = i7;
                iArr[i8 + 1] = i;
                this.i = -1;
            } else {
                int i9 = this.f6494k;
                int i10 = this.j;
                b();
                K k8 = this.f6488b.f6486o;
                k8.W(v.f6519c);
                int i11 = k8.f6483r - k8.f6480o[k8.f6481p - 1].f6474a;
                int[] iArr2 = k8.f6482q;
                iArr2[i11 + 1] = i9;
                iArr2[i11] = i10;
                iArr2[i11 + 2] = i;
                this.j = -1;
                this.f6494k = -1;
            }
            this.f6495l = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z5) {
        C0371o c0371o = this.f6487a;
        int i = z5 ? c0371o.f5444F.i : c0371o.f5444F.f5590g;
        int i7 = i - this.f;
        if (i7 < 0) {
            AbstractC0373p.c("Tried to seek backward");
        }
        if (i7 > 0) {
            K k7 = this.f6488b.f6486o;
            k7.W(C0413d.f6498c);
            k7.f6482q[k7.f6483r - k7.f6480o[k7.f6481p - 1].f6474a] = i7;
            this.f = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, int i7) {
        if (i7 > 0) {
            if (!(i >= 0)) {
                AbstractC0373p.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.f6495l += i7;
                return;
            }
            c();
            this.i = i;
            this.f6495l = i7;
        }
    }
}
