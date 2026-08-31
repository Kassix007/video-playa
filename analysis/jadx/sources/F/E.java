package F;

import P.C0354f0;
import p3.z0;
import w.InterfaceC1788i0;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC1788i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1782a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1783b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E(InterfaceC1788i0 interfaceC1788i0, N n7) {
        this.f1783b = interfaceC1788i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // w.InterfaceC1788i0
    public final float a(float f) {
        switch (this.f1782a) {
            case 0:
                return ((InterfaceC1788i0) this.f1783b).a(f);
            default:
                z0 z0Var = (z0) this.f1783b;
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                float fFloatValue = ((Number) ((kotlin.jvm.internal.n) z0Var.f15875a).invoke(Float.valueOf(f))).floatValue();
                ((C0354f0) z0Var.f15879e).setValue(Boolean.valueOf(fFloatValue > 0.0f));
                ((C0354f0) z0Var.f).setValue(Boolean.valueOf(fFloatValue < 0.0f));
                return fFloatValue;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public E(z0 z0Var) {
        this.f1783b = z0Var;
    }
}
