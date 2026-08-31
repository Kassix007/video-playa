package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.p;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: e.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1008a implements Parcelable {
    public static final Parcelable.Creator<C1008a> CREATOR = new p(4);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f12454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Intent f12455r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1008a(Intent intent, int i) {
        this.f12454q = i;
        this.f12455r = intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f12454q;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f12455r);
        sb.append('}');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        m.e(dest, "dest");
        dest.writeInt(this.f12454q);
        Intent intent = this.f12455r;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i);
        }
    }
}
