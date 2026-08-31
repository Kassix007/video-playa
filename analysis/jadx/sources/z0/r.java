package Z0;

import B0.G0;
import B0.t0;
import C0.AbstractC0065a;
import P.C0367m;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class r extends j {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final View f8388P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final u0.d f8389Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Z.h f8390R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public B5.c f8391S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public B5.c f8392T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public B5.c f8393U;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(Context context, B5.c cVar, C0367m c0367m, Z.i iVar, int i, t0 t0Var) {
        View view = (View) cVar.invoke(context);
        u0.d dVar = new u0.d();
        super(context, c0367m, i, dVar, view, t0Var);
        this.f8388P = view;
        this.f8389Q = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objC = iVar != null ? iVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (iVar != null) {
            setSavableRegistryEntry(iVar.d(strValueOf, new i(this, 2)));
        }
        b bVar = b.f8320u;
        this.f8391S = bVar;
        this.f8392T = bVar;
        this.f8393U = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(r rVar) {
        rVar.setSavableRegistryEntry(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setSavableRegistryEntry(Z.h hVar) {
        Z.h hVar2 = this.f8390R;
        if (hVar2 != null) {
            ((G0) hVar2).a0();
        }
        this.f8390R = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final u0.d getDispatcher() {
        return this.f8389Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.c getReleaseBlock() {
        return this.f8393U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.c getResetBlock() {
        return this.f8392T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ /* synthetic */ AbstractC0065a getSubCompositionView() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.c getUpdateBlock() {
        return this.f8391S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReleaseBlock(B5.c cVar) {
        this.f8393U = cVar;
        setRelease(new i(this, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setResetBlock(B5.c cVar) {
        this.f8392T = cVar;
        setReset(new i(this, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpdateBlock(B5.c cVar) {
        this.f8391S = cVar;
        setUpdate(new i(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
