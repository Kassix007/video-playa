package v4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class y extends C1.c {
    public static final Parcelable.Creator<y> CREATOR = new C1.b(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f17726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17727t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f17726s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f17727t = parcel.readInt() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f17726s) + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f17726s, parcel, i);
        parcel.writeInt(this.f17727t ? 1 : 0);
    }
}
