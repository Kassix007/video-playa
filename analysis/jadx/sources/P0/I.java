package p0;

import j0.AbstractC1145B;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I extends G {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f15505A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f15506B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float f15507C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final float f15508D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f15509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f15510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC1145B f15512t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f15513u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AbstractC1145B f15514v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f15515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f15516x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f15517y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f15518z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(String str, List list, int i, AbstractC1145B abstractC1145B, float f, AbstractC1145B abstractC1145B2, float f7, float f8, int i7, int i8, float f9, float f10, float f11, float f12) {
        this.f15509q = str;
        this.f15510r = list;
        this.f15511s = i;
        this.f15512t = abstractC1145B;
        this.f15513u = f;
        this.f15514v = abstractC1145B2;
        this.f15515w = f7;
        this.f15516x = f8;
        this.f15517y = i7;
        this.f15518z = i8;
        this.f15505A = f9;
        this.f15506B = f10;
        this.f15507C = f11;
        this.f15508D = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I.class == obj.getClass()) {
            I i = (I) obj;
            return kotlin.jvm.internal.m.a(this.f15509q, i.f15509q) && kotlin.jvm.internal.m.a(this.f15512t, i.f15512t) && this.f15513u == i.f15513u && kotlin.jvm.internal.m.a(this.f15514v, i.f15514v) && this.f15515w == i.f15515w && this.f15516x == i.f15516x && this.f15517y == i.f15517y && this.f15518z == i.f15518z && this.f15505A == i.f15505A && this.f15506B == i.f15506B && this.f15507C == i.f15507C && this.f15508D == i.f15508D && this.f15511s == i.f15511s && kotlin.jvm.internal.m.a(this.f15510r, i.f15510r);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f15510r.hashCode() + (this.f15509q.hashCode() * 31)) * 31;
        AbstractC1145B abstractC1145B = this.f15512t;
        int iB = k1.i.b(this.f15513u, (iHashCode + (abstractC1145B != null ? abstractC1145B.hashCode() : 0)) * 31, 31);
        AbstractC1145B abstractC1145B2 = this.f15514v;
        return Integer.hashCode(this.f15511s) + k1.i.b(this.f15508D, k1.i.b(this.f15507C, k1.i.b(this.f15506B, k1.i.b(this.f15505A, k1.i.c(this.f15518z, k1.i.c(this.f15517y, k1.i.b(this.f15516x, k1.i.b(this.f15515w, (iB + (abstractC1145B2 != null ? abstractC1145B2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
