package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.p;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: e.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015h implements Parcelable {
    public static final Parcelable.Creator<C1015h> CREATOR = new p(5);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final IntentSender f12468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Intent f12469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12471t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1015h(IntentSender intentSender, Intent intent, int i, int i7) {
        this.f12468q = intentSender;
        this.f12469r = intent;
        this.f12470s = i;
        this.f12471t = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        m.e(dest, "dest");
        dest.writeParcelable(this.f12468q, i);
        dest.writeParcelable(this.f12469r, i);
        dest.writeInt(this.f12470s);
        dest.writeInt(this.f12471t);
    }
}
