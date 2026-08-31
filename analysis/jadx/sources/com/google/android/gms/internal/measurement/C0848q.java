package com.google.android.gms.internal.measurement;

import androidx.work.impl.WorkDatabaseVersions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0848q implements Iterable, InterfaceC0833n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f11014q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0848q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f11014q = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Double b() {
        String str = this.f11014q;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Boolean c() {
        return Boolean.valueOf(!this.f11014q.isEmpty());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Iterator d() {
        return new C0843p(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0848q) {
            return this.f11014q.equals(((C0848q) obj).f11014q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:264:? */
    /* JADX DEBUG: Multi-variable search result rejected for r9v21, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r9v22, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r9v23, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r9v24, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r9v29, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r9v30, resolved type: int */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n g(String str, E.c0 c0Var, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte b7;
        int i;
        String strZzc;
        int i7;
        int i8;
        int i9;
        E.c0 c0Var2;
        int iP0;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                b7 = str.equals(str4) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str6)) {
                    b7 = 14;
                    str4 = str2;
                } else {
                    str4 = str2;
                }
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b7 = 12;
                    str4 = str2;
                    str6 = "toString";
                }
                str4 = str2;
                str6 = "toString";
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    str6 = "toString";
                    b7 = 0;
                }
                str4 = str2;
                str6 = "toString";
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    b7 = 1;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b7 = 13;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    b7 = 7;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b7 = 11;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b7 = 4;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b7 = 15;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b7 = 16;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b7 = 5;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b7 = 8;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b7 = 9;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b7 = 10;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b7 = 6;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    b7 = 3;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
        }
        byte b8 = b7;
        String str7 = this.f11014q;
        switch (b8) {
            case 0:
                I1.K0(str5, 1, arrayList);
                int iP02 = !arrayList.isEmpty() ? (int) I1.P0(((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).b().doubleValue()) : 0;
                return (iP02 < 0 || iP02 >= str7.length()) ? InterfaceC0833n.f10911k : new C0848q(String.valueOf(str7.charAt(iP02)));
            case 1:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str7);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        sb.append(((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(i10)).zzc());
                    }
                    return new C0848q(sb.toString());
                }
                return this;
            case 2:
                I1.I0(1, str4, arrayList);
                InterfaceC0833n interfaceC0833nC = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0));
                boolean zEquals = "length".equals(interfaceC0833nC.zzc());
                C0788e c0788e = InterfaceC0833n.i;
                if (zEquals) {
                    return c0788e;
                }
                double dDoubleValue = interfaceC0833nC.b().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str7.length()) ? InterfaceC0833n.j : c0788e;
            case 3:
                I1.K0("indexOf", 2, arrayList);
                return new C0798g(Double.valueOf(str7.indexOf(arrayList.size() > 0 ? ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).zzc() : "undefined", (int) I1.P0(arrayList.size() < 2 ? 0.0d : ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(1)).b().doubleValue()))));
            case 4:
                I1.K0("lastIndexOf", 2, arrayList);
                String strZzc2 = arrayList.size() > 0 ? ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).zzc() : "undefined";
                return new C0798g(Double.valueOf(str7.lastIndexOf(strZzc2, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(1)).b().doubleValue()) ? Double.POSITIVE_INFINITY : I1.P0(r3)))));
            case 5:
                I1.K0("match", 1, arrayList);
                Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).zzc()).matcher(str7);
                return matcher.find() ? new C0783d(Arrays.asList(new C0848q(matcher.group()))) : InterfaceC0833n.f10908e;
            case 6:
                I1.K0("replace", 2, arrayList);
                boolean zIsEmpty = arrayList.isEmpty();
                InterfaceC0833n interfaceC0833nA = InterfaceC0833n.f10907d;
                if (!zIsEmpty) {
                    strZzc = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).zzc();
                    if (arrayList.size() > 1) {
                        interfaceC0833nA = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(1));
                    }
                }
                String str8 = strZzc;
                int iIndexOf = str7.indexOf(str8);
                if (iIndexOf >= 0) {
                    if (interfaceC0833nA instanceof AbstractC0803h) {
                        i7 = 0;
                        interfaceC0833nA = ((AbstractC0803h) interfaceC0833nA).a(c0Var, Arrays.asList(new C0848q(str8), new C0798g(Double.valueOf(iIndexOf)), this));
                    } else {
                        i7 = 0;
                    }
                    String strSubstring = str7.substring(i7, iIndexOf);
                    String strZzc3 = interfaceC0833nA.zzc();
                    String strSubstring2 = str7.substring(str8.length() + iIndexOf);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc3).length() + String.valueOf(strSubstring2).length());
                    sb2.append(strSubstring);
                    sb2.append(strZzc3);
                    sb2.append(strSubstring2);
                    return new C0848q(sb2.toString());
                }
                return this;
            case 7:
                I1.K0(FirebaseAnalytics.Event.SEARCH, 1, arrayList);
                return Pattern.compile(arrayList.isEmpty() ? "undefined" : ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).zzc()).matcher(str7).find() ? new C0798g(Double.valueOf(r1.start())) : new C0798g(Double.valueOf(-1.0d));
            case 8:
                I1.K0("slice", 2, arrayList);
                double dP0 = I1.P0(!arrayList.isEmpty() ? ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).b().doubleValue() : 0.0d);
                double dMax = dP0 < 0.0d ? Math.max(((double) str7.length()) + dP0, 0.0d) : Math.min(dP0, str7.length());
                double dP02 = I1.P0(arrayList.size() > 1 ? ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(1)).b().doubleValue() : str7.length());
                int i11 = (int) dMax;
                return new C0848q(str7.substring(i11, Math.max(0, ((int) (dP02 < 0.0d ? Math.max(((double) str7.length()) + dP02, 0.0d) : Math.min(dP02, str7.length()))) - i11) + i11));
            case 9:
                I1.K0("split", 2, arrayList);
                if (str7.length() == 0) {
                    return new C0783d(Arrays.asList(this));
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String strZzc4 = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).zzc();
                    long jO0 = arrayList.size() > 1 ? ((long) I1.O0(((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(1)).b().doubleValue())) & 4294967295L : 2147483647L;
                    if (jO0 == 0) {
                        return new C0783d();
                    }
                    String[] strArrSplit = str7.split(Pattern.quote(strZzc4), ((int) jO0) + 1);
                    int length = strArrSplit.length;
                    if (!strZzc4.isEmpty() || length <= 0) {
                        i8 = length;
                        i9 = 0;
                    } else {
                        boolean zIsEmpty2 = strArrSplit[0].isEmpty();
                        i8 = length - 1;
                        i9 = zIsEmpty2;
                        if (!strArrSplit[i8].isEmpty()) {
                            i8 = length;
                            i9 = zIsEmpty2;
                        }
                    }
                    if (length > jO0) {
                        i8--;
                    }
                    while (i9 < i8) {
                        arrayList2.add(new C0848q(strArrSplit[i9]));
                        i9++;
                    }
                }
                return new C0783d(arrayList2);
            case 10:
                I1.K0("substring", 2, arrayList);
                if (arrayList.isEmpty()) {
                    c0Var2 = c0Var;
                    iP0 = 0;
                } else {
                    c0Var2 = c0Var;
                    iP0 = (int) I1.P0(((C0862t) c0Var2.f1553r).c(c0Var2, (InterfaceC0833n) arrayList.get(0)).b().doubleValue());
                }
                int iP03 = arrayList.size() > 1 ? (int) I1.P0(((C0862t) c0Var2.f1553r).c(c0Var2, (InterfaceC0833n) arrayList.get(1)).b().doubleValue()) : str7.length();
                int iMin = Math.min(Math.max(iP0, 0), str7.length());
                int iMin2 = Math.min(Math.max(iP03, 0), str7.length());
                return new C0848q(str7.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                I1.I0(0, "toLocaleUpperCase", arrayList);
                return new C0848q(str7.toUpperCase());
            case 12:
                I1.I0(0, "toLocaleLowerCase", arrayList);
                return new C0848q(str7.toLowerCase());
            case 13:
                I1.I0(0, "toLowerCase", arrayList);
                return new C0848q(str7.toLowerCase(Locale.ENGLISH));
            case 14:
                I1.I0(0, str6, arrayList);
                return this;
            case 15:
                I1.I0(0, "toUpperCase", arrayList);
                return new C0848q(str7.toUpperCase(Locale.ENGLISH));
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                I1.I0(0, "toUpperCase", arrayList);
                return new C0848q(str7.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11014q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0843p(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n l() {
        return new C0848q(this.f11014q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f11014q;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final String zzc() {
        return this.f11014q;
    }
}
