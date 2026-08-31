package v3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.O1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O1 f17608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3.e f17609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f17610d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z(O1 o12, S3.e eVar, r6.f fVar) {
        super(2);
        this.f17609c = eVar;
        this.f17608b = o12;
        this.f17610d = fVar;
        if (o12.f10679a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void a(Status status) {
        this.f17609c.a(this.f17610d.getException(status));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void b(Exception exc) {
        this.f17609c.a(exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void c(o oVar) throws DeadObjectException {
        S3.e eVar = this.f17609c;
        try {
            this.f17608b.c(oVar.f17583d, eVar);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            a(B.e(e8));
        } catch (RuntimeException e9) {
            eVar.a(e9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.B
    public final void d(l lVar, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Map map = (Map) lVar.f17580s;
        S3.e eVar = this.f17609c;
        map.put(eVar, boolValueOf);
        eVar.f7306a.e(new Z.m(29, lVar, eVar, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.u
    public final boolean f(o oVar) {
        return this.f17608b.f10679a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.u
    public final com.google.android.gms.common.d[] g(o oVar) {
        return (com.google.android.gms.common.d[]) this.f17608b.f10680b;
    }
}
