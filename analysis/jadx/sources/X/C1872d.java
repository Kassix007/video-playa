package x;

import kotlin.jvm.internal.n;
import kotlin.jvm.internal.v;
import m5.C1386y;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1872d extends n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f18290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.c f18291s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1872d(v vVar, B5.c cVar, int i) {
        super(1);
        this.f18289q = i;
        this.f18290r = vVar;
        this.f18291s = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f18289q) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                v vVar = this.f18290r;
                float f = vVar.f14265q - fFloatValue;
                vVar.f14265q = f;
                this.f18291s.invoke(Float.valueOf(f));
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                v vVar2 = this.f18290r;
                float f7 = vVar2.f14265q - fFloatValue2;
                vVar2.f14265q = f7;
                this.f18291s.invoke(Float.valueOf(f7));
                break;
        }
        return C1386y.f15098a;
    }
}
