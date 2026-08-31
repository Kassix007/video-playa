package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkDatabaseVersions;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.material.datepicker.p;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.Arrays;
import k1.i;
import u3.h;
import v3.l;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC1915a implements h, ReflectedParcelable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PendingIntent f10314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f10315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Status f10309u = new Status(0, null, null, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Status f10310v = new Status(15, null, null, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Status f10311w = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new p(16);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.f10312q = i;
        this.f10313r = str;
        this.f10314s = pendingIntent;
        this.f10315t = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String W() {
        String str = this.f10313r;
        if (str != null) {
            return str;
        }
        int i = this.f10312q;
        switch (i) {
            case IconicsAnimationProcessor.INFINITE /* -1 */:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return i.i(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                return "CANCELED";
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                return "API_NOT_CONNECTED";
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                return "DEAD_CLIENT";
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f10312q == status.f10312q && AbstractC1887A.j(this.f10313r, status.f10313r) && AbstractC1887A.j(this.f10314s, status.f10314s) && AbstractC1887A.j(this.f10315t, status.f10315t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10312q), this.f10313r, this.f10314s, this.f10315t});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        l lVar = new l(this);
        lVar.a(W(), "statusCode");
        lVar.a(this.f10314s, "resolution");
        return lVar.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f10312q);
        AbstractC0836n2.V(parcel, 2, this.f10313r);
        AbstractC0836n2.U(parcel, 3, this.f10314s, i);
        AbstractC0836n2.U(parcel, 4, this.f10315t, i);
        AbstractC0836n2.a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.h
    public final Status z() {
        return this;
    }
}
