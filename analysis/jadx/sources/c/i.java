package C;

import P.S0;
import h0.C1115h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.t implements H5.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f607q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, int i7, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f607q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.d
    public final H5.b computeReflected() {
        kotlin.jvm.internal.z.f14269a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H5.h
    public final Object get() {
        switch (this.f607q) {
            case 0:
                return ((S0) this.receiver).getValue();
            case 1:
                return ((S0) this.receiver).getValue();
            case 2:
                return ((S0) this.receiver).getValue();
            case 3:
                return this.receiver.getClass().getSimpleName();
            default:
                return ((C1115h) this.receiver).f13411d.z0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        return get();
    }
}
