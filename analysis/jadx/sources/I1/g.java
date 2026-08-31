package i1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class g extends C1.c {
    public static final Parcelable.Creator<g> CREATOR = new C1.b(4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SparseArray f13551s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f13551s = new SparseArray(i);
        for (int i7 = 0; i7 < i; i7++) {
            this.f13551s.append(iArr[i7], parcelableArray[i7]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f13551s;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = this.f13551s.keyAt(i7);
            parcelableArr[i7] = (Parcelable) this.f13551s.valueAt(i7);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
