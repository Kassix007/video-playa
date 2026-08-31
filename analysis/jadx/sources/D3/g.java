package d3;

import a3.J;
import o3.C1416b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Z.m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z.m f12237t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z.m mVar) {
        super(21);
        this.f12237t = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.m
    public final Object n(C1416b c1416b) {
        Float f = (Float) ((J) this.f12237t.f8313s);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
