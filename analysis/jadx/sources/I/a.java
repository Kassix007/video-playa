package I;

import B5.e;
import L0.F;
import P.C0345b;
import P.C0371o;
import c0.InterfaceC0725m;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f2211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f2212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ F f2213t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2214u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f2215v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f2218y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, InterfaceC0725m interfaceC0725m, F f, int i, boolean z5, int i7, int i8, int i9, int i10) {
        super(2);
        this.f2210q = i10;
        this.f2211r = str;
        this.f2212s = interfaceC0725m;
        this.f2213t = f;
        this.f2214u = i;
        this.f2215v = z5;
        this.f2216w = i7;
        this.f2217x = i8;
        this.f2218y = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2210q) {
            case 0:
                ((Number) obj2).intValue();
                D5.a.a(this.f2211r, this.f2212s, this.f2213t, this.f2214u, this.f2215v, this.f2216w, this.f2217x, (C0371o) obj, C0345b.w(this.f2218y | 1));
                break;
            default:
                ((Number) obj2).intValue();
                D5.a.b(this.f2211r, this.f2212s, this.f2213t, this.f2214u, this.f2215v, this.f2216w, this.f2217x, (C0371o) obj, C0345b.w(this.f2218y | 1));
                break;
        }
        return C1386y.f15098a;
    }
}
