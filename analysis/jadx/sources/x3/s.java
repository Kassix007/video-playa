package x3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC1915a {
    public static final Parcelable.Creator<s> CREATOR = new com.google.android.material.datepicker.p(20);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Account f18511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final GoogleSignInAccount f18513t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(int i, Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this.f18510q = i;
        this.f18511r = account;
        this.f18512s = i7;
        this.f18513t = googleSignInAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f18510q);
        AbstractC0836n2.U(parcel, 2, this.f18511r, i);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f18512s);
        AbstractC0836n2.U(parcel, 4, this.f18513t, i);
        AbstractC0836n2.a0(parcel, iY);
    }
}
