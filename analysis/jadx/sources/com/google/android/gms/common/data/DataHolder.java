package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.material.datepicker.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class DataHolder extends AbstractC1915a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new p(17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String[] f10333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f10334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CursorWindow[] f10335t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f10336u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f10337v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f10338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10339x = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new ArrayList();
        new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i7, Bundle bundle) {
        this.f10332q = i;
        this.f10333r = strArr;
        this.f10335t = cursorWindowArr;
        this.f10336u = i7;
        this.f10337v = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f10339x) {
                    this.f10339x = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f10335t;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finalize() throws Throwable {
        boolean z5;
        try {
            if (this.f10335t.length > 0) {
                synchronized (this) {
                    z5 = this.f10339x;
                }
                if (!z5) {
                    close();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
                }
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        String[] strArr = this.f10333r;
        if (strArr != null) {
            int iY2 = AbstractC0836n2.Y(parcel, 1);
            parcel.writeStringArray(strArr);
            AbstractC0836n2.a0(parcel, iY2);
        }
        AbstractC0836n2.W(parcel, 2, this.f10335t, i);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f10336u);
        AbstractC0836n2.P(parcel, 4, this.f10337v);
        AbstractC0836n2.b0(parcel, 1000, 4);
        parcel.writeInt(this.f10332q);
        AbstractC0836n2.a0(parcel, iY);
        if ((i & 1) != 0) {
            close();
        }
    }
}
