package com.google.android.material.datepicker;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.clearcut.C0;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import d2.C0993s;
import d2.b0;
import d2.c0;
import e.C1008a;
import e.C1015h;
import java.util.ArrayList;
import l4.C1236f;
import m.C1267M;
import m.C1310i;
import x3.C1894f;
import x3.C1895g;
import x3.C1898j;
import x3.C1900l;
import x3.C1901m;
import x3.H;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11533a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.material.datepicker.q.<clinit>():void, d2.c0.<clinit>():void, d2.s.<clinit>():void, x3.t.<clinit>():void] */
    public /* synthetic */ p(int i) {
        this.f11533a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(C1895g c1895g, Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        int i7 = c1895g.f18453q;
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(i7);
        int i8 = c1895g.f18454r;
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(i8);
        int i9 = c1895g.f18455s;
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(i9);
        AbstractC0836n2.V(parcel, 4, c1895g.f18456t);
        AbstractC0836n2.S(parcel, 5, c1895g.f18457u);
        AbstractC0836n2.W(parcel, 6, c1895g.f18458v, i);
        AbstractC0836n2.P(parcel, 7, c1895g.f18459w);
        AbstractC0836n2.U(parcel, 8, c1895g.f18460x, i);
        AbstractC0836n2.W(parcel, 10, c1895g.f18461y, i);
        AbstractC0836n2.W(parcel, 11, c1895g.f18462z, i);
        boolean z5 = c1895g.f18449A;
        AbstractC0836n2.b0(parcel, 12, 4);
        parcel.writeInt(z5 ? 1 : 0);
        int i10 = c1895g.f18450B;
        AbstractC0836n2.b0(parcel, 13, 4);
        parcel.writeInt(i10);
        boolean z6 = c1895g.f18451C;
        AbstractC0836n2.b0(parcel, 14, 4);
        parcel.writeInt(z6 ? 1 : 0);
        AbstractC0836n2.V(parcel, 15, c1895g.f18452D);
        AbstractC0836n2.a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11533a) {
            case 0:
                return q.a(parcel.readInt(), parcel.readInt());
            case 1:
                C0993s c0993s = new C0993s();
                c0993s.f12198q = parcel.readInt();
                c0993s.f12199r = parcel.readInt();
                c0993s.f12200s = parcel.readInt() == 1;
                return c0993s;
            case 2:
                b0 b0Var = new b0();
                b0Var.f12066q = parcel.readInt();
                b0Var.f12067r = parcel.readInt();
                b0Var.f12069t = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    b0Var.f12068s = iArr;
                    parcel.readIntArray(iArr);
                }
                return b0Var;
            case 3:
                c0 c0Var = new c0();
                c0Var.f12075q = parcel.readInt();
                c0Var.f12076r = parcel.readInt();
                int i7 = parcel.readInt();
                c0Var.f12077s = i7;
                if (i7 > 0) {
                    int[] iArr2 = new int[i7];
                    c0Var.f12078t = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i8 = parcel.readInt();
                c0Var.f12079u = i8;
                if (i8 > 0) {
                    int[] iArr3 = new int[i8];
                    c0Var.f12080v = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0Var.f12082x = parcel.readInt() == 1;
                c0Var.f12083y = parcel.readInt() == 1;
                c0Var.f12084z = parcel.readInt() == 1;
                c0Var.f12081w = parcel.readArrayList(b0.class.getClassLoader());
                return c0Var;
            case 4:
                kotlin.jvm.internal.m.e(parcel, "parcel");
                return new C1008a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 5:
                kotlin.jvm.internal.m.e(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.m.b(parcelable);
                return new C1015h((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 6:
                f4.b bVar = new f4.b(parcel);
                bVar.f12720q = ((Integer) parcel.readValue(f4.b.class.getClassLoader())).intValue();
                return bVar;
            case 7:
                C1310i c1310i = new C1310i();
                c1310i.f14794q = parcel.readInt();
                return c1310i;
            case 8:
                C1267M c1267m = new C1267M(parcel);
                c1267m.f14688q = parcel.readByte() != 0;
                return c1267m;
            case 9:
                n4.f fVar = new n4.f();
                fVar.f15276q = parcel.readInt();
                fVar.f15277r = (C1236f) parcel.readParcelable(n4.f.class.getClassLoader());
                return fVar;
            case 10:
                return new o2.l(parcel);
            case 11:
                int iF0 = P1.f0(parcel);
                String strU = null;
                String strU2 = null;
                String strU3 = null;
                String strU4 = null;
                Uri uri = null;
                String strU5 = null;
                String strU6 = null;
                ArrayList arrayListW = null;
                String strU7 = null;
                String strU8 = null;
                long jN = 0;
                int iM = 0;
                while (parcel.dataPosition() < iF0) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iM = P1.M(parcel, i9);
                            break;
                        case 2:
                            strU = P1.u(parcel, i9);
                            break;
                        case 3:
                            strU2 = P1.u(parcel, i9);
                            break;
                        case 4:
                            strU3 = P1.u(parcel, i9);
                            break;
                        case 5:
                            strU4 = P1.u(parcel, i9);
                            break;
                        case 6:
                            uri = (Uri) P1.t(parcel, i9, Uri.CREATOR);
                            break;
                        case 7:
                            strU5 = P1.u(parcel, i9);
                            break;
                        case '\b':
                            jN = P1.N(parcel, i9);
                            break;
                        case '\t':
                            strU6 = P1.u(parcel, i9);
                            break;
                        case '\n':
                            arrayListW = P1.w(parcel, i9, Scope.CREATOR);
                            break;
                        case 11:
                            strU7 = P1.u(parcel, i9);
                            break;
                        case '\f':
                            strU8 = P1.u(parcel, i9);
                            break;
                        default:
                            P1.c0(parcel, i9);
                            break;
                    }
                }
                P1.y(parcel, iF0);
                return new GoogleSignInAccount(iM, strU, strU2, strU3, strU4, uri, strU5, jN, strU6, arrayListW, strU7, strU8);
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                int iF02 = P1.f0(parcel);
                boolean zK = false;
                long jN2 = 0;
                long jN3 = 0;
                while (parcel.dataPosition() < iF02) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        zK = P1.K(parcel, i10);
                    } else if (c7 == 2) {
                        jN3 = P1.N(parcel, i10);
                    } else if (c7 != 3) {
                        P1.c0(parcel, i10);
                    } else {
                        jN2 = P1.N(parcel, i10);
                    }
                }
                P1.y(parcel, iF02);
                return new t3.b(jN2, jN3, zK);
            case 14:
                int iF03 = P1.f0(parcel);
                C0 c02 = null;
                byte[] bArrP = null;
                int[] iArrS = null;
                String[] strArrCreateStringArray = null;
                int[] iArrS2 = null;
                byte[][] bArrQ = null;
                P3.a[] aVarArr = null;
                boolean zK2 = true;
                while (parcel.dataPosition() < iF03) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            c02 = (C0) P1.t(parcel, i11, C0.CREATOR);
                            break;
                        case 3:
                            bArrP = P1.p(parcel, i11);
                            break;
                        case 4:
                            iArrS = P1.s(parcel, i11);
                            break;
                        case 5:
                            int iO = P1.O(parcel, i11);
                            int iDataPosition = parcel.dataPosition();
                            if (iO == 0) {
                                strArrCreateStringArray = null;
                            } else {
                                strArrCreateStringArray = parcel.createStringArray();
                                parcel.setDataPosition(iDataPosition + iO);
                            }
                            break;
                        case 6:
                            iArrS2 = P1.s(parcel, i11);
                            break;
                        case 7:
                            bArrQ = P1.q(parcel, i11);
                            break;
                        case '\b':
                            zK2 = P1.K(parcel, i11);
                            break;
                        case '\t':
                            aVarArr = (P3.a[]) P1.v(parcel, i11, P3.a.CREATOR);
                            break;
                        default:
                            P1.c0(parcel, i11);
                            break;
                    }
                }
                P1.y(parcel, iF03);
                return new t3.c(c02, bArrP, iArrS, strArrCreateStringArray, iArrS2, bArrQ, zK2, aVarArr);
            case 15:
                int iF04 = P1.f0(parcel);
                String strU9 = null;
                int iM2 = 0;
                while (parcel.dataPosition() < iF04) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        iM2 = P1.M(parcel, i12);
                    } else if (c8 != 2) {
                        P1.c0(parcel, i12);
                    } else {
                        strU9 = P1.u(parcel, i12);
                    }
                }
                P1.y(parcel, iF04);
                return new Scope(iM2, strU9);
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                int iF05 = P1.f0(parcel);
                String strU10 = null;
                com.google.android.gms.common.b bVar2 = null;
                int iM3 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iF05) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iM3 = P1.M(parcel, i13);
                    } else if (c9 == 2) {
                        strU10 = P1.u(parcel, i13);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) P1.t(parcel, i13, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        P1.c0(parcel, i13);
                    } else {
                        bVar2 = (com.google.android.gms.common.b) P1.t(parcel, i13, com.google.android.gms.common.b.CREATOR);
                    }
                }
                P1.y(parcel, iF05);
                return new Status(iM3, strU10, pendingIntent, bVar2);
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                int iF06 = P1.f0(parcel);
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleO = null;
                int iM4 = 0;
                int iM5 = 0;
                while (parcel.dataPosition() < iF06) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        int iO2 = P1.O(parcel, i14);
                        int iDataPosition2 = parcel.dataPosition();
                        if (iO2 == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray2 = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition2 + iO2);
                            strArr = strArrCreateStringArray2;
                        }
                    } else if (c10 == 2) {
                        cursorWindowArr = (CursorWindow[]) P1.v(parcel, i14, CursorWindow.CREATOR);
                    } else if (c10 == 3) {
                        iM5 = P1.M(parcel, i14);
                    } else if (c10 == 4) {
                        bundleO = P1.o(parcel, i14);
                    } else if (c10 != 1000) {
                        P1.c0(parcel, i14);
                    } else {
                        iM4 = P1.M(parcel, i14);
                    }
                }
                P1.y(parcel, iF06);
                DataHolder dataHolder = new DataHolder(iM4, strArr, cursorWindowArr, iM5, bundleO);
                dataHolder.f10334s = new Bundle();
                int i15 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.f10333r;
                    if (i15 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.f10335t;
                        dataHolder.f10338w = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i16 = 0; i16 < cursorWindowArr2.length; i16++) {
                            dataHolder.f10338w[i16] = numRows;
                            numRows += cursorWindowArr2[i16].getNumRows() - (numRows - cursorWindowArr2[i16].getStartPosition());
                        }
                        return dataHolder;
                    }
                    dataHolder.f10334s.putInt(strArr2[i15], i15);
                    i15++;
                }
                break;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                int iF07 = P1.f0(parcel);
                ArrayList arrayListW2 = null;
                int iM6 = 0;
                while (parcel.dataPosition() < iF07) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        iM6 = P1.M(parcel, i17);
                    } else if (c11 != 2) {
                        P1.c0(parcel, i17);
                    } else {
                        arrayListW2 = P1.w(parcel, i17, C1898j.CREATOR);
                    }
                }
                P1.y(parcel, iF07);
                return new C1901m(iM6, arrayListW2);
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                int iF08 = P1.f0(parcel);
                int iM7 = -1;
                int iM8 = 0;
                int iM9 = 0;
                int iM10 = 0;
                int iM11 = 0;
                String strU11 = null;
                String strU12 = null;
                long jN4 = 0;
                long jN5 = 0;
                while (parcel.dataPosition() < iF08) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iM8 = P1.M(parcel, i18);
                            break;
                        case 2:
                            iM9 = P1.M(parcel, i18);
                            break;
                        case 3:
                            iM10 = P1.M(parcel, i18);
                            break;
                        case 4:
                            jN4 = P1.N(parcel, i18);
                            break;
                        case 5:
                            jN5 = P1.N(parcel, i18);
                            break;
                        case 6:
                            strU11 = P1.u(parcel, i18);
                            break;
                        case 7:
                            strU12 = P1.u(parcel, i18);
                            break;
                        case '\b':
                            iM11 = P1.M(parcel, i18);
                            break;
                        case '\t':
                            iM7 = P1.M(parcel, i18);
                            break;
                        default:
                            P1.c0(parcel, i18);
                            break;
                    }
                }
                P1.y(parcel, iF08);
                return new C1898j(iM8, iM9, iM10, jN4, jN5, strU11, strU12, iM11, iM7);
            case 20:
                int iF09 = P1.f0(parcel);
                Account account = null;
                int iM12 = 0;
                int iM13 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iF09) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        iM12 = P1.M(parcel, i19);
                    } else if (c12 == 2) {
                        account = (Account) P1.t(parcel, i19, Account.CREATOR);
                    } else if (c12 == 3) {
                        iM13 = P1.M(parcel, i19);
                    } else if (c12 != 4) {
                        P1.c0(parcel, i19);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) P1.t(parcel, i19, GoogleSignInAccount.CREATOR);
                    }
                }
                P1.y(parcel, iF09);
                return new x3.s(iM12, account, iM13, googleSignInAccount);
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                int iF010 = P1.f0(parcel);
                int iM14 = 0;
                boolean zK3 = false;
                boolean zK4 = false;
                IBinder iBinderL = null;
                com.google.android.gms.common.b bVar3 = null;
                while (parcel.dataPosition() < iF010) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        iM14 = P1.M(parcel, i20);
                    } else if (c13 == 2) {
                        iBinderL = P1.L(parcel, i20);
                    } else if (c13 == 3) {
                        bVar3 = (com.google.android.gms.common.b) P1.t(parcel, i20, com.google.android.gms.common.b.CREATOR);
                    } else if (c13 == 4) {
                        zK3 = P1.K(parcel, i20);
                    } else if (c13 != 5) {
                        P1.c0(parcel, i20);
                    } else {
                        zK4 = P1.K(parcel, i20);
                    }
                }
                P1.y(parcel, iF010);
                return new x3.t(iM14, iBinderL, bVar3, zK3, zK4);
            case 22:
                int iF011 = P1.f0(parcel);
                int iM15 = 0;
                int iM16 = 0;
                int iM17 = 0;
                boolean zK5 = false;
                boolean zK6 = false;
                while (parcel.dataPosition() < iF011) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        iM15 = P1.M(parcel, i21);
                    } else if (c14 == 2) {
                        zK5 = P1.K(parcel, i21);
                    } else if (c14 == 3) {
                        zK6 = P1.K(parcel, i21);
                    } else if (c14 == 4) {
                        iM16 = P1.M(parcel, i21);
                    } else if (c14 != 5) {
                        P1.c0(parcel, i21);
                    } else {
                        iM17 = P1.M(parcel, i21);
                    }
                }
                P1.y(parcel, iF011);
                return new C1900l(iM15, iM16, iM17, zK5, zK6);
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                int iF012 = P1.f0(parcel);
                Bundle bundleO2 = null;
                C1894f c1894f = null;
                int iM18 = 0;
                com.google.android.gms.common.d[] dVarArr = null;
                while (parcel.dataPosition() < iF012) {
                    int i22 = parcel.readInt();
                    char c15 = (char) i22;
                    if (c15 == 1) {
                        bundleO2 = P1.o(parcel, i22);
                    } else if (c15 == 2) {
                        dVarArr = (com.google.android.gms.common.d[]) P1.v(parcel, i22, com.google.android.gms.common.d.CREATOR);
                    } else if (c15 == 3) {
                        iM18 = P1.M(parcel, i22);
                    } else if (c15 != 4) {
                        P1.c0(parcel, i22);
                    } else {
                        c1894f = (C1894f) P1.t(parcel, i22, C1894f.CREATOR);
                    }
                }
                P1.y(parcel, iF012);
                H h4 = new H();
                h4.f18393q = bundleO2;
                h4.f18394r = dVarArr;
                h4.f18395s = iM18;
                h4.f18396t = c1894f;
                return h4;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                int iF013 = P1.f0(parcel);
                C1900l c1900l = null;
                int[] iArrS3 = null;
                int[] iArrS4 = null;
                boolean zK7 = false;
                boolean zK8 = false;
                int iM19 = 0;
                while (parcel.dataPosition() < iF013) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            c1900l = (C1900l) P1.t(parcel, i23, C1900l.CREATOR);
                            break;
                        case 2:
                            zK7 = P1.K(parcel, i23);
                            break;
                        case 3:
                            zK8 = P1.K(parcel, i23);
                            break;
                        case 4:
                            iArrS3 = P1.s(parcel, i23);
                            break;
                        case 5:
                            iM19 = P1.M(parcel, i23);
                            break;
                        case 6:
                            iArrS4 = P1.s(parcel, i23);
                            break;
                        default:
                            P1.c0(parcel, i23);
                            break;
                    }
                }
                P1.y(parcel, iF013);
                return new C1894f(c1900l, zK7, zK8, iArrS3, iM19, iArrS4);
            default:
                int iF014 = P1.f0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = C1895g.f18447E;
                String strU13 = null;
                IBinder iBinderL2 = null;
                Account account2 = null;
                String strU14 = null;
                int iM20 = 0;
                int iM21 = 0;
                int iM22 = 0;
                boolean zK9 = false;
                int iM23 = 0;
                boolean zK10 = false;
                com.google.android.gms.common.d[] dVarArr2 = C1895g.f18448F;
                com.google.android.gms.common.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < iF014) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            iM20 = P1.M(parcel, i24);
                            break;
                        case 2:
                            iM21 = P1.M(parcel, i24);
                            break;
                        case 3:
                            iM22 = P1.M(parcel, i24);
                            break;
                        case 4:
                            strU13 = P1.u(parcel, i24);
                            break;
                        case 5:
                            iBinderL2 = P1.L(parcel, i24);
                            break;
                        case 6:
                            scopeArr = (Scope[]) P1.v(parcel, i24, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = P1.o(parcel, i24);
                            break;
                        case '\b':
                            account2 = (Account) P1.t(parcel, i24, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            P1.c0(parcel, i24);
                            break;
                        case '\n':
                            dVarArr2 = (com.google.android.gms.common.d[]) P1.v(parcel, i24, com.google.android.gms.common.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (com.google.android.gms.common.d[]) P1.v(parcel, i24, com.google.android.gms.common.d.CREATOR);
                            break;
                        case '\f':
                            zK9 = P1.K(parcel, i24);
                            break;
                        case '\r':
                            iM23 = P1.M(parcel, i24);
                            break;
                        case 14:
                            zK10 = P1.K(parcel, i24);
                            break;
                        case 15:
                            strU14 = P1.u(parcel, i24);
                            break;
                    }
                }
                P1.y(parcel, iF014);
                return new C1895g(iM20, iM21, iM22, strU13, iBinderL2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zK9, iM23, zK10, strU14);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f11533a) {
            case 0:
                return new q[i];
            case 1:
                return new C0993s[i];
            case 2:
                return new b0[i];
            case 3:
                return new c0[i];
            case 4:
                return new C1008a[i];
            case 5:
                return new C1015h[i];
            case 6:
                return new f4.b[i];
            case 7:
                return new C1310i[i];
            case 8:
                return new C1267M[i];
            case 9:
                return new n4.f[i];
            case 10:
                return new o2.l[i];
            case 11:
                return new GoogleSignInAccount[i];
            case 12:
                return new ParcelImpl[i];
            case 13:
                return new t3.b[i];
            case 14:
                return new t3.c[i];
            case 15:
                return new Scope[i];
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                return new Status[i];
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                return new DataHolder[i];
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                return new C1901m[i];
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                return new C1898j[i];
            case 20:
                return new x3.s[i];
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                return new x3.t[i];
            case 22:
                return new C1900l[i];
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                return new H[i];
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                return new C1894f[i];
            default:
                return new C1895g[i];
        }
    }
}
