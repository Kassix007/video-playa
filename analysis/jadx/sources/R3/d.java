package R3;

import A1.i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.List;
import u3.h;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1915a implements h {
    public static final Parcelable.Creator<d> CREATOR = new i(21);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f6712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f6713r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(ArrayList arrayList, String str) {
        this.f6712q = arrayList;
        this.f6713r = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        List<String> list = this.f6712q;
        if (list != null) {
            int iY2 = AbstractC0836n2.Y(parcel, 1);
            parcel.writeStringList(list);
            AbstractC0836n2.a0(parcel, iY2);
        }
        AbstractC0836n2.V(parcel, 2, this.f6713r);
        AbstractC0836n2.a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.h
    public final Status z() {
        return this.f6713r != null ? Status.f10309u : Status.f10311w;
    }
}
