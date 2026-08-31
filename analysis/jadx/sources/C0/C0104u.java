package C0;

import h0.C1115h;

/* JADX INFO: renamed from: C0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0104u extends kotlin.jvm.internal.p implements H5.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1131q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0104u(int i, int i7, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f1131q = i7;
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
        switch (this.f1131q) {
            case 0:
                return ((A) this.receiver).getLayoutDirection();
            default:
                return ((C1115h) this.receiver).j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        return get();
    }
}
