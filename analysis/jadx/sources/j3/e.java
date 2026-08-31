package j3;

import C0.S;
import L0.l;
import Z.m;
import a3.C0632k;
import h3.C1122a;
import h3.C1123b;
import h3.C1125d;
import i3.C1136a;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0632k f13791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13794e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13796h;
    public final C1125d i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f13799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f13800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f13801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f13802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1122a f13803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f13804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1123b f13805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f13806t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f13807u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f13808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1136a f13809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f13810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f13811y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(List list, C0632k c0632k, String str, long j, int i, long j7, String str2, List list2, C1125d c1125d, int i7, int i8, int i9, float f, float f7, float f8, float f9, C1122a c1122a, m mVar, List list3, int i10, C1123b c1123b, boolean z5, C1136a c1136a, l lVar, int i11) {
        this.f13790a = list;
        this.f13791b = c0632k;
        this.f13792c = str;
        this.f13793d = j;
        this.f13794e = i;
        this.f = j7;
        this.f13795g = str2;
        this.f13796h = list2;
        this.i = c1125d;
        this.j = i7;
        this.f13797k = i8;
        this.f13798l = i9;
        this.f13799m = f;
        this.f13800n = f7;
        this.f13801o = f8;
        this.f13802p = f9;
        this.f13803q = c1122a;
        this.f13804r = mVar;
        this.f13806t = list3;
        this.f13807u = i10;
        this.f13805s = c1123b;
        this.f13808v = z5;
        this.f13809w = c1136a;
        this.f13810x = lVar;
        this.f13811y = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a(String str) {
        int i;
        StringBuilder sbQ = S.q(str);
        sbQ.append(this.f13792c);
        sbQ.append("\n");
        long j = this.f;
        C0632k c0632k = this.f13791b;
        e eVar = (e) c0632k.i.b(j);
        if (eVar != null) {
            sbQ.append("\t\tParents: ");
            sbQ.append(eVar.f13792c);
            for (e eVar2 = (e) c0632k.i.b(eVar.f); eVar2 != null; eVar2 = (e) c0632k.i.b(eVar2.f)) {
                sbQ.append("->");
                sbQ.append(eVar2.f13792c);
            }
            sbQ.append(str);
            sbQ.append("\n");
        }
        List list = this.f13796h;
        if (!list.isEmpty()) {
            sbQ.append(str);
            sbQ.append("\tMasks: ");
            sbQ.append(list.size());
            sbQ.append("\n");
        }
        int i7 = this.j;
        if (i7 != 0 && (i = this.f13797k) != 0) {
            sbQ.append(str);
            sbQ.append("\tBackground: ");
            sbQ.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i7), Integer.valueOf(i), Integer.valueOf(this.f13798l)));
        }
        List list2 = this.f13790a;
        if (!list2.isEmpty()) {
            sbQ.append(str);
            sbQ.append("\tShapes:\n");
            for (Object obj : list2) {
                sbQ.append(str);
                sbQ.append("\t\t");
                sbQ.append(obj);
                sbQ.append("\n");
            }
        }
        return sbQ.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return a("");
    }
}
