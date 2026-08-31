package y3;

import android.os.Parcel;

/* JADX INFO: renamed from: y3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1916b extends RuntimeException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1916b(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
