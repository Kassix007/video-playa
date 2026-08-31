package M;

import java.util.LinkedHashMap;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f3424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f3425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I0 f3426s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(float f, long j, I0 i02) {
        super(1);
        this.f3424q = f;
        this.f3425r = j;
        this.f3426s = i02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        N.t tVar = (N.t) obj;
        float f = this.f3424q;
        Float fValueOf = Float.valueOf(f);
        LinkedHashMap linkedHashMap = tVar.f3980a;
        LinkedHashMap linkedHashMap2 = tVar.f3980a;
        linkedHashMap.put(J0.f3323q, fValueOf);
        int i = (int) (this.f3425r & 4294967295L);
        float f7 = i;
        if (f7 > f / 2 && !this.f3426s.f3320a) {
            linkedHashMap2.put(J0.f3325s, Float.valueOf(f / 2.0f));
        }
        if (i != 0) {
            linkedHashMap2.put(J0.f3324r, Float.valueOf(Math.max(0.0f, f - f7)));
        }
        return C1386y.f15098a;
    }
}
