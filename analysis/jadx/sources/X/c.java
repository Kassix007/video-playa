package X;

import M5.AbstractC0263y;
import P.C0371o;
import W0.p;
import kotlin.jvm.internal.C1192a;
import m5.C1386y;
import w.C1815w0;
import w.C1821z0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c extends C1192a implements B5.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8130x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj, Class cls, String str, String str2, int i7, int i8) {
        super(i, i7, cls, obj, str, str2);
        this.f8130x = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8130x) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((e) this.f14249q).a(iIntValue, (C0371o) obj);
                break;
            default:
                long j = ((p) obj).f8030a;
                C1821z0 c1821z0 = (C1821z0) this.f14249q;
                AbstractC0263y.t(c1821z0.f18121Q.c(), null, null, new C1815w0(c1821z0, j, null), 3);
                break;
        }
        return C1386y.f15098a;
    }
}
