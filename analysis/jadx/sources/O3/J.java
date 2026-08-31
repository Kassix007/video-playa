package O3;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J extends I3.a implements K {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.K
    public final void A(List list) {
        Parcel parcelK = K();
        parcelK.writeTypedList(list);
        M(parcelK);
    }
}
