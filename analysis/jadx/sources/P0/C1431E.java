package p0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: p0.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1431E extends G implements Iterable, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f15487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f15488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f15489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f15490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f15491u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f15492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f15493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f15494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f15495y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f15496z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1431E(String str, float f, float f7, float f8, float f9, float f10, float f11, float f12, List list, ArrayList arrayList) {
        this.f15487q = str;
        this.f15488r = f;
        this.f15489s = f7;
        this.f15490t = f8;
        this.f15491u = f9;
        this.f15492v = f10;
        this.f15493w = f11;
        this.f15494x = f12;
        this.f15495y = list;
        this.f15496z = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1431E)) {
            C1431E c1431e = (C1431E) obj;
            return kotlin.jvm.internal.m.a(this.f15487q, c1431e.f15487q) && this.f15488r == c1431e.f15488r && this.f15489s == c1431e.f15489s && this.f15490t == c1431e.f15490t && this.f15491u == c1431e.f15491u && this.f15492v == c1431e.f15492v && this.f15493w == c1431e.f15493w && this.f15494x == c1431e.f15494x && kotlin.jvm.internal.m.a(this.f15495y, c1431e.f15495y) && kotlin.jvm.internal.m.a(this.f15496z, c1431e.f15496z);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15496z.hashCode() + ((this.f15495y.hashCode() + k1.i.b(this.f15494x, k1.i.b(this.f15493w, k1.i.b(this.f15492v, k1.i.b(this.f15491u, k1.i.b(this.f15490t, k1.i.b(this.f15489s, k1.i.b(this.f15488r, this.f15487q.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new U.g(this);
    }
}
