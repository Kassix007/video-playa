package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.material.datepicker.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC1915a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new p(11);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f10290A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f10291B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final HashSet f10292C = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f10295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f10296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f10297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uri f10298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f10299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f10300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f10301y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f10302z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f10293q = i;
        this.f10294r = str;
        this.f10295s = str2;
        this.f10296t = str3;
        this.f10297u = str4;
        this.f10298v = uri;
        this.f10299w = str5;
        this.f10300x = j;
        this.f10301y = str6;
        this.f10302z = arrayList;
        this.f10290A = str7;
        this.f10291B = str8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GoogleSignInAccount W(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC1887A.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f10299w = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f10301y.equals(this.f10301y)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f10302z);
        hashSet.addAll(googleSignInAccount.f10292C);
        HashSet hashSet2 = new HashSet(this.f10302z);
        hashSet2.addAll(this.f10292C);
        return hashSet.equals(hashSet2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f10301y.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f10302z);
        hashSet.addAll(this.f10292C);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f10293q);
        AbstractC0836n2.V(parcel, 2, this.f10294r);
        AbstractC0836n2.V(parcel, 3, this.f10295s);
        AbstractC0836n2.V(parcel, 4, this.f10296t);
        AbstractC0836n2.V(parcel, 5, this.f10297u);
        AbstractC0836n2.U(parcel, 6, this.f10298v, i);
        AbstractC0836n2.V(parcel, 7, this.f10299w);
        AbstractC0836n2.b0(parcel, 8, 8);
        parcel.writeLong(this.f10300x);
        AbstractC0836n2.V(parcel, 9, this.f10301y);
        AbstractC0836n2.X(parcel, 10, this.f10302z);
        AbstractC0836n2.V(parcel, 11, this.f10290A);
        AbstractC0836n2.V(parcel, 12, this.f10291B);
        AbstractC0836n2.a0(parcel, iY);
    }
}
