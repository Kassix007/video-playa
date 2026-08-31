package O3;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC0882x;
import com.google.android.gms.internal.measurement.AbstractC0887y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: O3.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0313p1 extends AbstractBinderC0882x implements M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0333w1 f5020d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0313p1(C0333w1 c0333w1, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f5019c = atomicReference;
        this.f5020d = c0333w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0882x
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        N1 n12 = (N1) AbstractC0887y.a(parcel, N1.CREATOR);
        AbstractC0887y.d(parcel);
        w(n12);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.M
    public final void w(N1 n12) {
        AtomicReference atomicReference = this.f5019c;
        synchronized (atomicReference) {
            X x6 = ((C0323t0) this.f5020d.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4666E.c(Integer.valueOf(n12.f4540q.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(n12);
            atomicReference.notifyAll();
        }
    }
}
