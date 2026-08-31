package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.List;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class M1 extends AbstractC1915a {
    public static final Parcelable.Creator<M1> CREATOR = new A1.i(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f4518q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public M1(ArrayList arrayList) {
        this.f4518q = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static M1 W(EnumC0292i1... enumC0292i1Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC0292i1Arr[0].f4916q));
        return new M1(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        List list = this.f4518q;
        if (list != null) {
            int iY2 = AbstractC0836n2.Y(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i7 = 0; i7 < size; i7++) {
                parcel.writeInt(((Integer) list.get(i7)).intValue());
            }
            AbstractC0836n2.a0(parcel, iY2);
        }
        AbstractC0836n2.a0(parcel, iY);
    }
}
