package com.google.android.gms.common;

import C0.S;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.Arrays;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1915a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PendingIntent f10324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f10325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f10321u = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new A1.i(25);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(int i, int i7, PendingIntent pendingIntent, String str) {
        this.f10322q = i;
        this.f10323r = i7;
        this.f10324s = pendingIntent;
        this.f10325t = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String W(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case IconicsAnimationProcessor.INFINITE /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
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
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case WorkDatabaseVersions.VERSION_16 /* 16 */:
                        return "API_UNAVAILABLE";
                    case WorkDatabaseVersions.VERSION_17 /* 17 */:
                        return "SIGN_IN_FAILED";
                    case WorkDatabaseVersions.VERSION_18 /* 18 */:
                        return "SERVICE_UPDATING";
                    case WorkDatabaseVersions.VERSION_19 /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case WorkDatabaseVersions.VERSION_21 /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                        return "API_DISABLED";
                    case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return S.m("UNKNOWN_ERROR_CODE(", ")", i);
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10323r == bVar.f10323r && AbstractC1887A.j(this.f10324s, bVar.f10324s) && AbstractC1887A.j(this.f10325t, bVar.f10325t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10323r), this.f10324s, this.f10325t});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        v3.l lVar = new v3.l(this);
        lVar.a(W(this.f10323r), "statusCode");
        lVar.a(this.f10324s, "resolution");
        lVar.a(this.f10325t, "message");
        return lVar.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f10322q);
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(this.f10323r);
        AbstractC0836n2.U(parcel, 3, this.f10324s, i);
        AbstractC0836n2.V(parcel, 4, this.f10325t);
        AbstractC0836n2.a0(parcel, iY);
    }

    public b(int i) {
        this(1, i, null, null);
    }

    public b(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
