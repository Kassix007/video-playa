package C0;

import i2.C1135a;
import m5.C1386y;

/* JADX INFO: renamed from: C0.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0113y0 extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f1155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z.m f1156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f1157s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113y0(boolean z5, Z.m mVar, String str) {
        super(0);
        this.f1155q = z5;
        this.f1156r = mVar;
        this.f1157s = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        if (this.f1155q) {
            Z.m mVar = this.f1156r;
            String str = this.f1157s;
            C1135a c1135a = (C1135a) mVar.f8312r;
            synchronized (c1135a.f13556c) {
            }
        }
        return C1386y.f15098a;
    }
}
