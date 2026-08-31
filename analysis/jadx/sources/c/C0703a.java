package c;

import P.C0345b;
import P.C0371o;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0703a extends n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f10051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f10052r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0703a(boolean z5, B5.a aVar, int i) {
        super(2);
        this.f10051q = z5;
        this.f10052r = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iW = C0345b.w(1);
        l6.d.d(this.f10051q, this.f10052r, (C0371o) obj, iW);
        return C1386y.f15098a;
    }
}
