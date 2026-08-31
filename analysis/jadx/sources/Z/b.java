package Z;

import B0.G0;
import P.S;
import P.w0;
import a0.o;
import com.google.android.gms.internal.measurement.P1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f8286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f8287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f8288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f8289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object[] f8290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f8291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final A0.d f8292w = new A0.d(16, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(l lVar, i iVar, String str, Object obj, Object[] objArr) {
        this.f8286q = lVar;
        this.f8287r = iVar;
        this.f8288s = str;
        this.f8289t = obj;
        this.f8290u = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() throws Throwable {
        String strA;
        i iVar = this.f8287r;
        if (this.f8291v != null) {
            throw new IllegalArgumentException(("entry(" + this.f8291v + ") is not null").toString());
        }
        if (iVar != null) {
            A0.d dVar = this.f8292w;
            Object objInvoke = dVar.invoke();
            if (objInvoke == null || iVar.a(objInvoke)) {
                this.f8291v = iVar.d(this.f8288s, dVar);
                return;
            }
            if (objInvoke instanceof o) {
                o oVar = (o) objInvoke;
                if (oVar.a() == S.f5374s || oVar.a() == S.f5377v || oVar.a() == S.f5375t) {
                    strA = "MutableState containing " + oVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = P1.A(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void b() throws Throwable {
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void c() {
        h hVar = this.f8291v;
        if (hVar != null) {
            ((G0) hVar).a0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void e() {
        h hVar = this.f8291v;
        if (hVar != null) {
            ((G0) hVar).a0();
        }
    }
}
