package p0;

import android.graphics.Path;
import j0.AbstractC1145B;
import j0.C1152g;
import j0.C1153h;
import java.util.List;
import l0.C1224g;
import l0.InterfaceC1221d;
import m5.AbstractC1362a;
import m5.EnumC1370i;

/* JADX INFO: renamed from: p0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1439g extends AbstractC1428B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1145B f15560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15561c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f15562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15563e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC1145B f15564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15565h;
    public int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1224g f15572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1152g f15573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1152g f15574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15575t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1439g() {
        int i = AbstractC1432F.f15497a;
        this.f15562d = n5.s.f15299q;
        this.f15563e = 1.0f;
        this.f15565h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.f15567l = 1.0f;
        this.f15569n = true;
        this.f15570o = true;
        C1152g c1152gA = j0.i.a();
        this.f15573r = c1152gA;
        this.f15574s = c1152gA;
        this.f15575t = AbstractC1362a.c(EnumC1370i.f15078r, C1438f.f15557r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p0.AbstractC1428B
    public final void a(InterfaceC1221d interfaceC1221d) {
        InterfaceC1221d interfaceC1221d2;
        C1224g c1224g;
        if (this.f15569n) {
            AbstractC1434b.c(this.f15562d, this.f15573r);
            e();
        } else if (this.f15571p) {
            e();
        }
        this.f15569n = false;
        this.f15571p = false;
        AbstractC1145B abstractC1145B = this.f15560b;
        if (abstractC1145B != null) {
            interfaceC1221d2 = interfaceC1221d;
            InterfaceC1221d.j(interfaceC1221d2, this.f15574s, abstractC1145B, this.f15561c, null, 56);
        } else {
            interfaceC1221d2 = interfaceC1221d;
        }
        AbstractC1145B abstractC1145B2 = this.f15564g;
        if (abstractC1145B2 != null) {
            C1224g c1224g2 = this.f15572q;
            if (this.f15570o || c1224g2 == null) {
                C1224g c1224g3 = new C1224g(this.f, this.j, this.f15565h, this.i, 16);
                this.f15572q = c1224g3;
                this.f15570o = false;
                c1224g = c1224g3;
            } else {
                c1224g = c1224g2;
            }
            InterfaceC1221d.j(interfaceC1221d2, this.f15574s, abstractC1145B2, this.f15563e, c1224g, 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, m5.h] */
    public final void e() {
        float f = this.f15566k;
        C1152g c1152g = this.f15573r;
        if (f == 0.0f && this.f15567l == 1.0f) {
            this.f15574s = c1152g;
            return;
        }
        if (kotlin.jvm.internal.m.a(this.f15574s, c1152g)) {
            this.f15574s = j0.i.a();
        } else {
            Path.FillType fillType = this.f15574s.f13707a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z5 = fillType == fillType2;
            this.f15574s.f13707a.rewind();
            Path path = this.f15574s.f13707a;
            if (!z5) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f15575t;
        ((C1153h) r02.getValue()).f13710a.setPath(c1152g != null ? c1152g.f13707a : null, false);
        float length = ((C1153h) r02.getValue()).f13710a.getLength();
        float f7 = this.f15566k;
        float f8 = this.f15568m;
        float f9 = ((f7 + f8) % 1.0f) * length;
        float f10 = ((this.f15567l + f8) % 1.0f) * length;
        if (f9 <= f10) {
            ((C1153h) r02.getValue()).a(f9, f10, this.f15574s);
        } else {
            ((C1153h) r02.getValue()).a(f9, length, this.f15574s);
            ((C1153h) r02.getValue()).a(0.0f, f10, this.f15574s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f15573r.toString();
    }
}
