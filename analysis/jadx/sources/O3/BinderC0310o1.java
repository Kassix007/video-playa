package O3;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC0882x;
import com.google.android.gms.internal.measurement.AbstractC0887y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: O3.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0310o1 extends AbstractBinderC0882x implements K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5004c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0310o1(C0333w1 c0333w1, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f5004c = atomicReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.K
    public final void A(List list) {
        AtomicReference atomicReference = this.f5004c;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0882x
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(I1.CREATOR);
        AbstractC0887y.d(parcel);
        A(arrayListCreateTypedArrayList);
        return true;
    }
}
