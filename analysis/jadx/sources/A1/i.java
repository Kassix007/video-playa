package A1;

import J1.C0170b;
import J1.C0171c;
import J1.E;
import J1.I;
import J1.M;
import O3.C0275d;
import O3.C0278e;
import O3.C0290i;
import O3.C0325u;
import O3.C0328v;
import O3.I1;
import O3.L1;
import O3.M1;
import O3.N1;
import O3.V1;
import O3.a2;
import a3.C0629h;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.common.r;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import com.google.android.material.datepicker.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import x3.t;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [B2.a.<clinit>():void, D4.a.<clinit>():void, O3.I1.<clinit>():void, O3.N1.<clinit>():void, O3.u.<clinit>():void, com.google.android.gms.common.d.<clinit>():void] */
    public /* synthetic */ i(int i) {
        this.f201a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(C0328v c0328v, Parcel parcel, int i) {
        String str = c0328v.f5091q;
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.V(parcel, 2, str);
        AbstractC0836n2.U(parcel, 3, c0328v.f5092r, i);
        AbstractC0836n2.V(parcel, 4, c0328v.f5093s);
        long j = c0328v.f5094t;
        AbstractC0836n2.b0(parcel, 5, 8);
        parcel.writeLong(j);
        AbstractC0836n2.a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(V1 v12, Parcel parcel) {
        int i = v12.f4646q;
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(i);
        AbstractC0836n2.V(parcel, 2, v12.f4647r);
        long j = v12.f4648s;
        AbstractC0836n2.b0(parcel, 3, 8);
        parcel.writeLong(j);
        Long l7 = v12.f4649t;
        if (l7 != null) {
            AbstractC0836n2.b0(parcel, 4, 8);
            parcel.writeLong(l7.longValue());
        }
        AbstractC0836n2.V(parcel, 6, v12.f4650u);
        AbstractC0836n2.V(parcel, 7, v12.f4651v);
        Double d5 = v12.f4652w;
        if (d5 != null) {
            AbstractC0836n2.b0(parcel, 8, 8);
            parcel.writeDouble(d5.doubleValue());
        }
        AbstractC0836n2.a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f201a) {
            case 0:
                j jVar = new j(parcel);
                jVar.f202q = parcel.readInt();
                return jVar;
            case 1:
                String string = parcel.readString();
                kotlin.jvm.internal.m.b(string);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i7 = 0; i7 < i; i7++) {
                    String string2 = parcel.readString();
                    kotlin.jvm.internal.m.b(string2);
                    String string3 = parcel.readString();
                    kotlin.jvm.internal.m.b(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new B2.a(string, linkedHashMap);
            case 2:
                return new D4.b((PendingIntent) parcel.readParcelable(D4.a.class.getClassLoader()), parcel.readInt() != 0);
            case 3:
                return new C0170b(parcel);
            case 4:
                return new C0171c(parcel);
            case 5:
                E e7 = new E();
                e7.f2508q = parcel.readString();
                e7.f2509r = parcel.readInt();
                return e7;
            case 6:
                I i8 = new I();
                i8.f2552u = null;
                i8.f2553v = new ArrayList();
                i8.f2554w = new ArrayList();
                i8.f2548q = parcel.createStringArrayList();
                i8.f2549r = parcel.createStringArrayList();
                i8.f2550s = (C0170b[]) parcel.createTypedArray(C0170b.CREATOR);
                i8.f2551t = parcel.readInt();
                i8.f2552u = parcel.readString();
                i8.f2553v = parcel.createStringArrayList();
                i8.f2554w = parcel.createTypedArrayList(C0171c.CREATOR);
                i8.f2555x = parcel.createTypedArrayList(E.CREATOR);
                return i8;
            case 7:
                return new M(parcel);
            case 8:
                int iF0 = P1.f0(parcel);
                long jN = 0;
                long jN2 = 0;
                int iM = 0;
                while (parcel.dataPosition() < iF0) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        jN = P1.N(parcel, i9);
                    } else if (c7 == 2) {
                        iM = P1.M(parcel, i9);
                    } else if (c7 != 3) {
                        P1.c0(parcel, i9);
                    } else {
                        jN2 = P1.N(parcel, i9);
                    }
                }
                P1.y(parcel, iF0);
                return new C0275d(iM, jN, jN2);
            case 9:
                int iF02 = P1.f0(parcel);
                String strU = null;
                String strU2 = null;
                V1 v12 = null;
                String strU3 = null;
                C0328v c0328v = null;
                C0328v c0328v2 = null;
                C0328v c0328v3 = null;
                long jN3 = 0;
                long jN4 = 0;
                long jN5 = 0;
                boolean zK = false;
                while (parcel.dataPosition() < iF02) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strU = P1.u(parcel, i10);
                            break;
                        case 3:
                            strU2 = P1.u(parcel, i10);
                            break;
                        case 4:
                            v12 = (V1) P1.t(parcel, i10, V1.CREATOR);
                            break;
                        case 5:
                            jN3 = P1.N(parcel, i10);
                            break;
                        case 6:
                            zK = P1.K(parcel, i10);
                            break;
                        case 7:
                            strU3 = P1.u(parcel, i10);
                            break;
                        case '\b':
                            c0328v = (C0328v) P1.t(parcel, i10, C0328v.CREATOR);
                            break;
                        case '\t':
                            jN4 = P1.N(parcel, i10);
                            break;
                        case '\n':
                            c0328v2 = (C0328v) P1.t(parcel, i10, C0328v.CREATOR);
                            break;
                        case 11:
                            jN5 = P1.N(parcel, i10);
                            break;
                        case '\f':
                            c0328v3 = (C0328v) P1.t(parcel, i10, C0328v.CREATOR);
                            break;
                        default:
                            P1.c0(parcel, i10);
                            break;
                    }
                }
                P1.y(parcel, iF02);
                return new C0278e(strU, strU2, v12, jN3, zK, strU3, c0328v, jN4, c0328v2, jN5, c0328v3);
            case 10:
                int iF03 = P1.f0(parcel);
                Bundle bundleO = null;
                while (parcel.dataPosition() < iF03) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        P1.c0(parcel, i11);
                    } else {
                        bundleO = P1.o(parcel, i11);
                    }
                }
                P1.y(parcel, iF03);
                return new C0290i(bundleO);
            case 11:
                int iF04 = P1.f0(parcel);
                Bundle bundleO2 = null;
                while (parcel.dataPosition() < iF04) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        P1.c0(parcel, i12);
                    } else {
                        bundleO2 = P1.o(parcel, i12);
                    }
                }
                P1.y(parcel, iF04);
                return new C0325u(bundleO2);
            case 12:
                int iF05 = P1.f0(parcel);
                long jN6 = 0;
                String strU4 = null;
                C0325u c0325u = null;
                String strU5 = null;
                while (parcel.dataPosition() < iF05) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 2) {
                        strU4 = P1.u(parcel, i13);
                    } else if (c8 == 3) {
                        c0325u = (C0325u) P1.t(parcel, i13, C0325u.CREATOR);
                    } else if (c8 == 4) {
                        strU5 = P1.u(parcel, i13);
                    } else if (c8 != 5) {
                        P1.c0(parcel, i13);
                    } else {
                        jN6 = P1.N(parcel, i13);
                    }
                }
                P1.y(parcel, iF05);
                return new C0328v(strU4, c0325u, strU5, jN6);
            case 13:
                int iF06 = P1.f0(parcel);
                int iM2 = 0;
                long jN7 = 0;
                String strU6 = null;
                while (parcel.dataPosition() < iF06) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        strU6 = P1.u(parcel, i14);
                    } else if (c9 == 2) {
                        jN7 = P1.N(parcel, i14);
                    } else if (c9 != 3) {
                        P1.c0(parcel, i14);
                    } else {
                        iM2 = P1.M(parcel, i14);
                    }
                }
                P1.y(parcel, iF06);
                return new I1(strU6, jN7, iM2);
            case 14:
                int iF07 = P1.f0(parcel);
                byte[] bArrP = null;
                String strU7 = null;
                Bundle bundleO3 = null;
                String strU8 = null;
                long jN8 = 0;
                long jN9 = 0;
                int iM3 = 0;
                while (parcel.dataPosition() < iF07) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            jN8 = P1.N(parcel, i15);
                            break;
                        case 2:
                            bArrP = P1.p(parcel, i15);
                            break;
                        case 3:
                            strU7 = P1.u(parcel, i15);
                            break;
                        case 4:
                            bundleO3 = P1.o(parcel, i15);
                            break;
                        case 5:
                            iM3 = P1.M(parcel, i15);
                            break;
                        case 6:
                            jN9 = P1.N(parcel, i15);
                            break;
                        case 7:
                            strU8 = P1.u(parcel, i15);
                            break;
                        default:
                            P1.c0(parcel, i15);
                            break;
                    }
                }
                P1.y(parcel, iF07);
                return new L1(jN8, bArrP, strU7, bundleO3, iM3, jN9, strU8);
            case 15:
                int iF08 = P1.f0(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < iF08) {
                        int i16 = parcel.readInt();
                        if (((char) i16) != 1) {
                            P1.c0(parcel, i16);
                        } else {
                            int iO = P1.O(parcel, i16);
                            int iDataPosition = parcel.dataPosition();
                            if (iO == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i17 = parcel.readInt();
                            for (int i18 = 0; i18 < i17; i18++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iO);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                    P1.y(parcel, iF08);
                    return new M1(arrayList);
                }
                break;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                int iF09 = P1.f0(parcel);
                ArrayList arrayListW = null;
                while (parcel.dataPosition() < iF09) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        P1.c0(parcel, i19);
                    } else {
                        arrayListW = P1.w(parcel, i19, L1.CREATOR);
                    }
                }
                P1.y(parcel, iF09);
                return new N1(arrayListW);
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                int iF010 = P1.f0(parcel);
                String strU9 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strU10 = null;
                String strU11 = null;
                Double dValueOf = null;
                long jN10 = 0;
                int iM4 = 0;
                while (parcel.dataPosition() < iF010) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iM4 = P1.M(parcel, i20);
                            break;
                        case 2:
                            strU9 = P1.u(parcel, i20);
                            break;
                        case 3:
                            jN10 = P1.N(parcel, i20);
                            break;
                        case 4:
                            int iO2 = P1.O(parcel, i20);
                            if (iO2 == 0) {
                                lValueOf = null;
                            } else {
                                P1.i0(parcel, iO2, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iO3 = P1.O(parcel, i20);
                            if (iO3 == 0) {
                                fValueOf = null;
                            } else {
                                P1.i0(parcel, iO3, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strU10 = P1.u(parcel, i20);
                            break;
                        case 7:
                            strU11 = P1.u(parcel, i20);
                            break;
                        case '\b':
                            int iO4 = P1.O(parcel, i20);
                            if (iO4 == 0) {
                                dValueOf = null;
                            } else {
                                P1.i0(parcel, iO4, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            P1.c0(parcel, i20);
                            break;
                    }
                }
                P1.y(parcel, iF010);
                return new V1(iM4, strU9, jN10, lValueOf, fValueOf, strU10, strU11, dValueOf);
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                int iF011 = P1.f0(parcel);
                boolean zK2 = false;
                int iM5 = 0;
                boolean zK3 = false;
                boolean zK4 = false;
                int iM6 = 0;
                int iM7 = 0;
                long jN11 = 0;
                long jN12 = 0;
                long jN13 = 0;
                long jN14 = 0;
                long jN15 = 0;
                long jN16 = 0;
                long jN17 = 0;
                String strU12 = "";
                String strU13 = strU12;
                String strU14 = strU13;
                String strU15 = strU14;
                String strU16 = null;
                String strU17 = null;
                String strU18 = null;
                String strU19 = null;
                String strU20 = null;
                String strU21 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strU22 = null;
                String strU23 = null;
                int iM8 = 100;
                boolean zK5 = true;
                boolean zK6 = true;
                long jN18 = -2147483648L;
                while (parcel.dataPosition() < iF011) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            strU16 = P1.u(parcel, i21);
                            break;
                        case 3:
                            strU17 = P1.u(parcel, i21);
                            break;
                        case 4:
                            strU18 = P1.u(parcel, i21);
                            break;
                        case 5:
                            strU19 = P1.u(parcel, i21);
                            break;
                        case 6:
                            jN11 = P1.N(parcel, i21);
                            break;
                        case 7:
                            jN12 = P1.N(parcel, i21);
                            break;
                        case '\b':
                            strU20 = P1.u(parcel, i21);
                            break;
                        case '\t':
                            zK5 = P1.K(parcel, i21);
                            break;
                        case '\n':
                            zK2 = P1.K(parcel, i21);
                            break;
                        case 11:
                            jN18 = P1.N(parcel, i21);
                            break;
                        case '\f':
                            strU21 = P1.u(parcel, i21);
                            break;
                        case '\r':
                        case WorkDatabaseVersions.VERSION_17 /* 17 */:
                        case WorkDatabaseVersions.VERSION_19 /* 19 */:
                        case 20:
                        case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                        case '!':
                        default:
                            P1.c0(parcel, i21);
                            break;
                        case 14:
                            jN13 = P1.N(parcel, i21);
                            break;
                        case 15:
                            iM5 = P1.M(parcel, i21);
                            break;
                        case WorkDatabaseVersions.VERSION_16 /* 16 */:
                            zK6 = P1.K(parcel, i21);
                            break;
                        case WorkDatabaseVersions.VERSION_18 /* 18 */:
                            zK3 = P1.K(parcel, i21);
                            break;
                        case WorkDatabaseVersions.VERSION_21 /* 21 */:
                            int iO5 = P1.O(parcel, i21);
                            if (iO5 == 0) {
                                boolValueOf = null;
                            } else {
                                P1.i0(parcel, iO5, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jN14 = P1.N(parcel, i21);
                            break;
                        case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                            int iO6 = P1.O(parcel, i21);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iO6 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition2 + iO6);
                                arrayList3 = arrayListCreateStringArrayList;
                            }
                            break;
                        case 25:
                            strU12 = P1.u(parcel, i21);
                            break;
                        case 26:
                            strU13 = P1.u(parcel, i21);
                            break;
                        case 27:
                            strU22 = P1.u(parcel, i21);
                            break;
                        case 28:
                            zK4 = P1.K(parcel, i21);
                            break;
                        case 29:
                            jN15 = P1.N(parcel, i21);
                            break;
                        case 30:
                            iM8 = P1.M(parcel, i21);
                            break;
                        case 31:
                            strU14 = P1.u(parcel, i21);
                            break;
                        case ' ':
                            iM6 = P1.M(parcel, i21);
                            break;
                        case '\"':
                            jN16 = P1.N(parcel, i21);
                            break;
                        case '#':
                            strU23 = P1.u(parcel, i21);
                            break;
                        case '$':
                            strU15 = P1.u(parcel, i21);
                            break;
                        case '%':
                            jN17 = P1.N(parcel, i21);
                            break;
                        case '&':
                            iM7 = P1.M(parcel, i21);
                            break;
                    }
                }
                P1.y(parcel, iF011);
                return new a2(strU16, strU17, strU18, strU19, jN11, jN12, strU20, zK5, zK2, jN18, strU21, jN13, iM5, zK6, zK3, boolValueOf, jN14, arrayList3, strU12, strU13, strU22, zK4, jN15, iM8, strU14, iM6, jN16, strU23, strU15, jN17, iM7);
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                int iF012 = P1.f0(parcel);
                String strU24 = null;
                byte[] bArrP2 = null;
                byte[][] bArrQ = null;
                byte[][] bArrQ2 = null;
                byte[][] bArrQ3 = null;
                byte[][] bArrQ4 = null;
                int[] iArrS = null;
                byte[][] bArrQ5 = null;
                while (parcel.dataPosition() < iF012) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strU24 = P1.u(parcel, i22);
                            break;
                        case 3:
                            bArrP2 = P1.p(parcel, i22);
                            break;
                        case 4:
                            bArrQ = P1.q(parcel, i22);
                            break;
                        case 5:
                            bArrQ2 = P1.q(parcel, i22);
                            break;
                        case 6:
                            bArrQ3 = P1.q(parcel, i22);
                            break;
                        case 7:
                            bArrQ4 = P1.q(parcel, i22);
                            break;
                        case '\b':
                            iArrS = P1.s(parcel, i22);
                            break;
                        case '\t':
                            bArrQ5 = P1.q(parcel, i22);
                            break;
                        default:
                            P1.c0(parcel, i22);
                            break;
                    }
                }
                P1.y(parcel, iF012);
                return new P3.a(strU24, bArrP2, bArrQ, bArrQ2, bArrQ3, bArrQ4, iArrS, bArrQ5);
            case 20:
                int iF013 = P1.f0(parcel);
                Intent intent = null;
                int iM9 = 0;
                int iM10 = 0;
                while (parcel.dataPosition() < iF013) {
                    int i23 = parcel.readInt();
                    char c10 = (char) i23;
                    if (c10 == 1) {
                        iM9 = P1.M(parcel, i23);
                    } else if (c10 == 2) {
                        iM10 = P1.M(parcel, i23);
                    } else if (c10 != 3) {
                        P1.c0(parcel, i23);
                    } else {
                        intent = (Intent) P1.t(parcel, i23, Intent.CREATOR);
                    }
                }
                P1.y(parcel, iF013);
                return new R3.b(iM9, iM10, intent);
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                int iF014 = P1.f0(parcel);
                ArrayList<String> arrayList4 = null;
                String strU25 = null;
                while (parcel.dataPosition() < iF014) {
                    int i24 = parcel.readInt();
                    char c11 = (char) i24;
                    if (c11 == 1) {
                        int iO7 = P1.O(parcel, i24);
                        int iDataPosition3 = parcel.dataPosition();
                        if (iO7 == 0) {
                            arrayList4 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition3 + iO7);
                            arrayList4 = arrayListCreateStringArrayList2;
                        }
                    } else if (c11 != 2) {
                        P1.c0(parcel, i24);
                    } else {
                        strU25 = P1.u(parcel, i24);
                    }
                }
                P1.y(parcel, iF014);
                return new R3.d(arrayList4, strU25);
            case 22:
                int iF015 = P1.f0(parcel);
                com.google.android.gms.common.b bVar = null;
                int iM11 = 0;
                t tVar = null;
                while (parcel.dataPosition() < iF015) {
                    int i25 = parcel.readInt();
                    char c12 = (char) i25;
                    if (c12 == 1) {
                        iM11 = P1.M(parcel, i25);
                    } else if (c12 == 2) {
                        bVar = (com.google.android.gms.common.b) P1.t(parcel, i25, com.google.android.gms.common.b.CREATOR);
                    } else if (c12 != 3) {
                        P1.c0(parcel, i25);
                    } else {
                        tVar = (t) P1.t(parcel, i25, t.CREATOR);
                    }
                }
                P1.y(parcel, iF015);
                return new R3.e(iM11, bVar, tVar);
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                Y3.b bVar2 = new Y3.b();
                bVar2.f8258y = 255;
                bVar2.f8230A = -2;
                bVar2.f8231B = -2;
                bVar2.f8232C = -2;
                bVar2.f8239J = Boolean.TRUE;
                bVar2.f8250q = parcel.readInt();
                bVar2.f8251r = (Integer) parcel.readSerializable();
                bVar2.f8252s = (Integer) parcel.readSerializable();
                bVar2.f8253t = (Integer) parcel.readSerializable();
                bVar2.f8254u = (Integer) parcel.readSerializable();
                bVar2.f8255v = (Integer) parcel.readSerializable();
                bVar2.f8256w = (Integer) parcel.readSerializable();
                bVar2.f8257x = (Integer) parcel.readSerializable();
                bVar2.f8258y = parcel.readInt();
                bVar2.f8259z = parcel.readString();
                bVar2.f8230A = parcel.readInt();
                bVar2.f8231B = parcel.readInt();
                bVar2.f8232C = parcel.readInt();
                bVar2.f8234E = parcel.readString();
                bVar2.f8235F = parcel.readString();
                bVar2.f8236G = parcel.readInt();
                bVar2.f8238I = (Integer) parcel.readSerializable();
                bVar2.f8240K = (Integer) parcel.readSerializable();
                bVar2.f8241L = (Integer) parcel.readSerializable();
                bVar2.f8242M = (Integer) parcel.readSerializable();
                bVar2.f8243N = (Integer) parcel.readSerializable();
                bVar2.f8244O = (Integer) parcel.readSerializable();
                bVar2.f8245P = (Integer) parcel.readSerializable();
                bVar2.f8248S = (Integer) parcel.readSerializable();
                bVar2.f8246Q = (Integer) parcel.readSerializable();
                bVar2.f8247R = (Integer) parcel.readSerializable();
                bVar2.f8239J = (Boolean) parcel.readSerializable();
                bVar2.f8233D = (Locale) parcel.readSerializable();
                bVar2.f8249T = (Boolean) parcel.readSerializable();
                return bVar2;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                C0629h c0629h = new C0629h(parcel);
                c0629h.f8817q = parcel.readString();
                c0629h.f8819s = parcel.readFloat();
                c0629h.f8820t = parcel.readInt() == 1;
                c0629h.f8821u = parcel.readString();
                c0629h.f8822v = parcel.readInt();
                c0629h.f8823w = parcel.readInt();
                return c0629h;
            case 25:
                int iF016 = P1.f0(parcel);
                PendingIntent pendingIntent = null;
                int iM12 = 0;
                int iM13 = 0;
                String strU26 = null;
                while (parcel.dataPosition() < iF016) {
                    int i26 = parcel.readInt();
                    char c13 = (char) i26;
                    if (c13 == 1) {
                        iM12 = P1.M(parcel, i26);
                    } else if (c13 == 2) {
                        iM13 = P1.M(parcel, i26);
                    } else if (c13 == 3) {
                        pendingIntent = (PendingIntent) P1.t(parcel, i26, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        P1.c0(parcel, i26);
                    } else {
                        strU26 = P1.u(parcel, i26);
                    }
                }
                P1.y(parcel, iF016);
                return new com.google.android.gms.common.b(iM12, iM13, pendingIntent, strU26);
            case 26:
                int iF017 = P1.f0(parcel);
                long jN19 = -1;
                int iM14 = 0;
                String strU27 = null;
                while (parcel.dataPosition() < iF017) {
                    int i27 = parcel.readInt();
                    char c14 = (char) i27;
                    if (c14 == 1) {
                        strU27 = P1.u(parcel, i27);
                    } else if (c14 == 2) {
                        iM14 = P1.M(parcel, i27);
                    } else if (c14 != 3) {
                        P1.c0(parcel, i27);
                    } else {
                        jN19 = P1.N(parcel, i27);
                    }
                }
                P1.y(parcel, iF017);
                return new com.google.android.gms.common.d(strU27, jN19, iM14);
            case 27:
                int iF018 = P1.f0(parcel);
                boolean zK7 = false;
                int iM15 = 0;
                String strU28 = null;
                int iM16 = 0;
                while (parcel.dataPosition() < iF018) {
                    int i28 = parcel.readInt();
                    char c15 = (char) i28;
                    if (c15 == 1) {
                        zK7 = P1.K(parcel, i28);
                    } else if (c15 == 2) {
                        strU28 = P1.u(parcel, i28);
                    } else if (c15 == 3) {
                        iM16 = P1.M(parcel, i28);
                    } else if (c15 != 4) {
                        P1.c0(parcel, i28);
                    } else {
                        iM15 = P1.M(parcel, i28);
                    }
                }
                P1.y(parcel, iF018);
                return new r(iM16, iM15, strU28, zK7);
            case 28:
                return new com.google.android.material.datepicker.b((q) parcel.readParcelable(q.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), parcel.readInt());
            default:
                return new com.google.android.material.datepicker.d(parcel.readLong());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f201a) {
            case 0:
                return new j[i];
            case 1:
                return new B2.a[i];
            case 2:
                return new D4.a[i];
            case 3:
                return new C0170b[i];
            case 4:
                return new C0171c[i];
            case 5:
                return new E[i];
            case 6:
                return new I[i];
            case 7:
                return new M[i];
            case 8:
                return new C0275d[i];
            case 9:
                return new C0278e[i];
            case 10:
                return new C0290i[i];
            case 11:
                return new C0325u[i];
            case 12:
                return new C0328v[i];
            case 13:
                return new I1[i];
            case 14:
                return new L1[i];
            case 15:
                return new M1[i];
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                return new N1[i];
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                return new V1[i];
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                return new a2[i];
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                return new P3.a[i];
            case 20:
                return new R3.b[i];
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                return new R3.d[i];
            case 22:
                return new R3.e[i];
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                return new Y3.b[i];
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                return new C0629h[i];
            case 25:
                return new com.google.android.gms.common.b[i];
            case 26:
                return new com.google.android.gms.common.d[i];
            case 27:
                return new r[i];
            case 28:
                return new com.google.android.material.datepicker.b[i];
            default:
                return new com.google.android.material.datepicker.d[i];
        }
    }
}
