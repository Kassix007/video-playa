package v3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: v3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1762A extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S3.e f17548b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1762A(S3.e eVar) {
        super(4);
        this.f17548b = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void a(Status status) {
        this.f17548b.a(new com.google.android.gms.common.g(status));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void b(Exception exc) {
        this.f17548b.a(exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void c(o oVar) throws DeadObjectException {
        try {
            h(oVar);
        } catch (DeadObjectException e7) {
            a(B.e(e7));
            throw e7;
        } catch (RemoteException e8) {
            a(B.e(e8));
        } catch (RuntimeException e9) {
            this.f17548b.a(e9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.u
    public final boolean f(o oVar) {
        if (oVar.f17586h.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.u
    public final com.google.android.gms.common.d[] g(o oVar) {
        if (oVar.f17586h.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(o oVar) {
        if (oVar.f17586h.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f17548b.b(Boolean.FALSE);
    }

    @Override // v3.B
    public final /* bridge */ /* synthetic */ void d(l lVar, boolean z5) {
    }
}
