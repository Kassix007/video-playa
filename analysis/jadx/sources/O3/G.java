package O3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0887y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G extends I3.a implements I {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void B(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void C(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 26);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void D(a2 a2Var, M1 m12, M m4) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        AbstractC0887y.b(parcelK, m12);
        AbstractC0887y.c(parcelK, m4);
        L(parcelK, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void E(a2 a2Var, Bundle bundle) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, bundle);
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void F(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void H(C0328v c0328v, a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, c0328v);
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void e(V1 v12, a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, v12);
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final C0290i g(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        Parcel parcelJ = J(parcelK, 21);
        C0290i c0290i = (C0290i) AbstractC0887y.a(parcelJ, C0290i.CREATOR);
        parcelJ.recycle();
        return c0290i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final List i(String str, String str2, String str3, boolean z5) {
        Parcel parcelK = K();
        parcelK.writeString(null);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        ClassLoader classLoader = AbstractC0887y.f11126a;
        parcelK.writeInt(z5 ? 1 : 0);
        Parcel parcelJ = J(parcelK, 15);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(V1.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void k(C0278e c0278e, a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, c0278e);
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void l(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final byte[] m(C0328v c0328v, String str) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, c0328v);
        parcelK.writeString(str);
        Parcel parcelJ = J(parcelK, 9);
        byte[] bArrCreateByteArray = parcelJ.createByteArray();
        parcelJ.recycle();
        return bArrCreateByteArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void n(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void p(a2 a2Var, C0275d c0275d) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        AbstractC0887y.b(parcelK, c0275d);
        L(parcelK, 30);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void q(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 27);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void r(long j, String str, String str2, String str3) {
        Parcel parcelK = K();
        parcelK.writeLong(j);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        L(parcelK, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void s(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        L(parcelK, 25);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final List t(String str, String str2, boolean z5, a2 a2Var) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ClassLoader classLoader = AbstractC0887y.f11126a;
        parcelK.writeInt(z5 ? 1 : 0);
        AbstractC0887y.b(parcelK, a2Var);
        Parcel parcelJ = J(parcelK, 14);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(V1.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final List v(String str, String str2, String str3) {
        Parcel parcelK = K();
        parcelK.writeString(null);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        Parcel parcelJ = J(parcelK, 17);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C0278e.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final String x(a2 a2Var) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        Parcel parcelJ = J(parcelK, 11);
        String string = parcelJ.readString();
        parcelJ.recycle();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void y(a2 a2Var, Bundle bundle, K k7) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, a2Var);
        AbstractC0887y.b(parcelK, bundle);
        AbstractC0887y.c(parcelK, k7);
        L(parcelK, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final List z(String str, String str2, a2 a2Var) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        AbstractC0887y.b(parcelK, a2Var);
        Parcel parcelJ = J(parcelK, 16);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C0278e.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }
}
