package com.google.android.gms.common;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import x3.AbstractC1887A;
import x3.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends E4.a implements v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10357d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        AbstractC1887A.a(bArr.length == 25);
        this.f10357d = Arrays.hashCode(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] J(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E4.a
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            D3.a aVarB = b();
            parcel2.writeNoException();
            J3.a.c(parcel2, aVarB);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f10357d);
        return true;
    }

    public abstract byte[] K();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.v
    public final D3.a b() {
        return new D3.b(K());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        D3.a aVarB;
        if (obj != null && (obj instanceof v)) {
            try {
                v vVar = (v) obj;
                if (vVar.zzc() == this.f10357d && (aVarB = vVar.b()) != null) {
                    return Arrays.equals(K(), (byte[]) D3.b.K(aVarB));
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10357d;
    }

    @Override // x3.v
    public final int zzc() {
        return this.f10357d;
    }
}
