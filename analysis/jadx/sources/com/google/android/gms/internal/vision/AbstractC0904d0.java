package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.clearcut.C0751j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0904d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11266a = {1, 2, 3, 4, 5, 6, 7};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean A(byte b7) {
        return b7 > -65;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(int i, byte[] bArr, int i7, int i8, InterfaceC0924n0 interfaceC0924n0, C0751j c0751j) {
        C0910g0 c0910g0 = (C0910g0) interfaceC0924n0;
        int iJ = j(bArr, i7, c0751j);
        c0910g0.g(c0751j.f10516a);
        while (iJ < i8) {
            int iJ2 = j(bArr, iJ, c0751j);
            if (i != c0751j.f10516a) {
                break;
            }
            iJ = j(bArr, iJ2, c0751j);
            c0910g0.g(c0751j.f10516a);
        }
        return iJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c(int i, byte[] bArr, int i7, int i8, O0 o02, C0751j c0751j) throws C0922m0 {
        if ((i >>> 3) == 0) {
            throw new C0922m0("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i & 7;
        if (i9 == 0) {
            int iT = t(bArr, i7, c0751j);
            o02.a(i, Long.valueOf(c0751j.f10517b));
            return iT;
        }
        if (i9 == 1) {
            o02.a(i, Long.valueOf(u(i7, bArr)));
            return i7 + 8;
        }
        if (i9 == 2) {
            int iJ = j(bArr, i7, c0751j);
            int i10 = c0751j.f10516a;
            if (i10 < 0) {
                throw C0922m0.b();
            }
            if (i10 > bArr.length - iJ) {
                throw C0922m0.a();
            }
            if (i10 == 0) {
                o02.a(i, P.f11218s);
            } else {
                o02.a(i, P.h(bArr, iJ, i10));
            }
            return iJ + i10;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new C0922m0("Protocol message contained an invalid tag (zero).");
            }
            o02.a(i, Integer.valueOf(a(i7, bArr)));
            return i7 + 4;
        }
        O0 o0B = O0.b();
        int i11 = (i & (-8)) | 4;
        int i12 = 0;
        while (true) {
            if (i7 >= i8) {
                break;
            }
            int iJ2 = j(bArr, i7, c0751j);
            int i13 = c0751j.f10516a;
            if (i13 == i11) {
                i12 = i13;
                i7 = iJ2;
                break;
            }
            i7 = c(i13, bArr, iJ2, i8, o0B, c0751j);
            i12 = i13;
        }
        if (i7 > i8 || i12 != i11) {
            throw new C0922m0("Failed to parse the message.");
        }
        o02.a(i, o0B);
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(int i, byte[] bArr, int i7, C0751j c0751j) {
        int i8 = i & 127;
        int i9 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            c0751j.f10516a = i8 | (b7 << 7);
            return i9;
        }
        int i10 = i8 | ((b7 & 127) << 7);
        int i11 = i7 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            c0751j.f10516a = i10 | (b8 << 14);
            return i11;
        }
        int i12 = i10 | ((b8 & 127) << 14);
        int i13 = i7 + 3;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            c0751j.f10516a = i12 | (b9 << 21);
            return i13;
        }
        int i14 = i12 | ((b9 & 127) << 21);
        int i15 = i7 + 4;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            c0751j.f10516a = i14 | (b10 << 28);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                c0751j.f10516a = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e(L0 l02, int i, byte[] bArr, int i7, int i8, InterfaceC0924n0 interfaceC0924n0, C0751j c0751j) throws C0922m0 {
        int iG = g(l02, bArr, i7, i8, c0751j);
        interfaceC0924n0.add(c0751j.f10518c);
        while (iG < i8) {
            int iJ = j(bArr, iG, c0751j);
            if (i != c0751j.f10516a) {
                break;
            }
            iG = g(l02, bArr, iJ, i8, c0751j);
            interfaceC0924n0.add(c0751j.f10518c);
        }
        return iG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(L0 l02, byte[] bArr, int i, int i7, int i8, C0751j c0751j) {
        C0 c02 = (C0) l02;
        Object objZza = c02.zza();
        int iK = c02.k(objZza, bArr, i, i7, i8, c0751j);
        c02.a(objZza);
        c0751j.f10518c = objZza;
        return iK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int g(L0 l02, byte[] bArr, int i, int i7, C0751j c0751j) throws C0922m0 {
        int iD = i + 1;
        int i8 = bArr[i];
        if (i8 < 0) {
            iD = d(i8, bArr, iD, c0751j);
            i8 = c0751j.f10516a;
        }
        int i9 = iD;
        if (i8 < 0 || i8 > i7 - i9) {
            throw C0922m0.a();
        }
        Object objZza = l02.zza();
        int i10 = i9 + i8;
        l02.e(objZza, bArr, i9, i10, c0751j);
        l02.a(objZza);
        c0751j.f10518c = objZza;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int j(byte[] bArr, int i, C0751j c0751j) {
        int i7 = i + 1;
        byte b7 = bArr[i];
        if (b7 < 0) {
            return d(b7, bArr, i7, c0751j);
        }
        c0751j.f10516a = b7;
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String k(P p7) {
        StringBuilder sb = new StringBuilder(p7.g());
        for (int i = 0; i < p7.g(); i++) {
            byte bD = p7.d(i);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                        } else {
                            sb.append((char) bD);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String l(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i) throws C0922m0 {
        if (!A(b8)) {
            if ((((b8 + 112) + (b7 << 28)) >> 30) == 0 && !A(b9) && !A(b10)) {
                int i7 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i] = (char) ((i7 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i7 & 1023) + 56320);
                return;
            }
        }
        throw C0922m0.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(byte b7, byte b8, byte b9, char[] cArr, int i) throws C0922m0 {
        if (A(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || A(b9)))) {
            throw C0922m0.c();
        }
        cArr[i] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void o(byte b7, byte b8, char[] cArr, int i) throws C0922m0 {
        if (b7 < -62 || A(b8)) {
            throw C0922m0.c();
        }
        cArr[i] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(com.google.android.gms.internal.vision.AbstractC0906e0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L1a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L49
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L46
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L46
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L46:
            int r6 = r6 + 1
            goto L1a
        L49:
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L270
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L65
            java.lang.String r6 = r3.substring(r4)
            goto L66
        L65:
            r6 = r3
        L66:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto Lca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto Lca
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto Lca
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 + (-4)
            java.lang.String r9 = r6.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto La2
            java.lang.String r8 = r8.concat(r9)
            goto La8
        La2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        La8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto Lca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto Lca
            java.lang.String r3 = l(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.vision.AbstractC0906e0.f(r9, r13, r4)
            r(r14, r15, r3, r4)
            goto L4d
        Lca:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L136
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L136
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto Lfc
            java.lang.String r4 = r8.concat(r4)
            goto L101
        Lfc:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L136
            java.lang.String r4 = l(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.android.gms.internal.vision.AbstractC0906e0.f(r3, r13, r6)
            r(r14, r15, r4, r3)
            goto L4d
        L136:
            int r3 = r6.length()
            java.lang.String r4 = "set"
            if (r3 == 0) goto L143
            java.lang.String r3 = r4.concat(r6)
            goto L148
        L143:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L148:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L4d
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L17c
            int r3 = r6.length()
            int r3 = r3 + (-5)
            java.lang.String r3 = r6.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L171
            java.lang.String r3 = r7.concat(r3)
            goto L176
        L171:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L176:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L4d
        L17c:
            java.lang.String r3 = r6.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r6.substring(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r8 = r4.length()
            if (r8 == 0) goto L19b
            java.lang.String r3 = r3.concat(r4)
            goto L1a1
        L19b:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L1a1:
            int r4 = r6.length()
            if (r4 == 0) goto L1ac
            java.lang.String r4 = r7.concat(r6)
            goto L1b1
        L1ac:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
        L1b1:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            int r8 = r6.length()
            java.lang.String r9 = "has"
            if (r8 == 0) goto L1c4
            java.lang.String r6 = r9.concat(r6)
            goto L1c9
        L1c4:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r9)
        L1c9:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L4d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.vision.AbstractC0906e0.f(r4, r13, r8)
            if (r6 != 0) goto L259
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L1ec
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L1e9
        L1e6:
            r6 = r10
            goto L254
        L1e9:
            r6 = r5
            goto L254
        L1ec:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L1fa
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L1e9
            goto L1e6
        L1fa:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L20b
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L1e9
            goto L1e6
        L20b:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L21d
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L1e9
            goto L1e6
        L21d:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L228
            java.lang.String r6 = ""
            boolean r6 = r4.equals(r6)
            goto L254
        L228:
            boolean r6 = r4 instanceof com.google.android.gms.internal.vision.P
            if (r6 == 0) goto L233
            com.google.android.gms.internal.vision.P r6 = com.google.android.gms.internal.vision.P.f11218s
            boolean r6 = r4.equals(r6)
            goto L254
        L233:
            boolean r6 = r4 instanceof com.google.android.gms.internal.vision.K
            if (r6 == 0) goto L246
            r6 = r4
            com.google.android.gms.internal.vision.K r6 = (com.google.android.gms.internal.vision.K) r6
            com.google.android.gms.internal.vision.e0 r6 = (com.google.android.gms.internal.vision.AbstractC0906e0) r6
            r8 = 6
            java.lang.Object r6 = r6.e(r8)
            com.google.android.gms.internal.vision.e0 r6 = (com.google.android.gms.internal.vision.AbstractC0906e0) r6
            if (r4 != r6) goto L1e9
            goto L1e6
        L246:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L1e9
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L1e9
            goto L1e6
        L254:
            if (r6 != 0) goto L257
            goto L265
        L257:
            r10 = r5
            goto L265
        L259:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.google.android.gms.internal.vision.AbstractC0906e0.f(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L265:
            if (r10 == 0) goto L4d
            java.lang.String r3 = l(r3)
            r(r14, r15, r3, r4)
            goto L4d
        L270:
            com.google.android.gms.internal.vision.O0 r13 = r13.zzb
            if (r13 == 0) goto L28b
        L274:
            int r0 = r13.f11213a
            if (r5 >= r0) goto L28b
            int[] r0 = r13.f11214b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f11215c
            r1 = r1[r5]
            r(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L274
        L28b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.AbstractC0904d0.p(com.google.android.gms.internal.vision.e0, java.lang.StringBuilder, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void r(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                r(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            P p7 = P.f11218s;
            sb.append(k(new P(((String) obj).getBytes(AbstractC0914i0.f11272a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof P) {
            sb.append(": \"");
            sb.append(k((P) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0906e0) {
            sb.append(" {");
            p((AbstractC0906e0) obj, sb, i + 2);
            sb.append("\n");
            while (i7 < i) {
                sb.append(' ');
                i7++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i9 = i + 2;
        r(sb, i9, "key", entry.getKey());
        r(sb, i9, FirebaseAnalytics.Param.VALUE, entry.getValue());
        sb.append("\n");
        while (i7 < i) {
            sb.append(' ');
            i7++;
        }
        sb.append("}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int t(byte[] bArr, int i, C0751j c0751j) {
        int i7 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c0751j.f10517b = j;
            return i7;
        }
        int i8 = i + 2;
        byte b7 = bArr[i7];
        long j7 = (j & 127) | (((long) (b7 & 127)) << 7);
        int i9 = 7;
        while (b7 < 0) {
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            i9 += 7;
            j7 |= ((long) (b8 & 127)) << i9;
            b7 = b8;
            i8 = i10;
        }
        c0751j.f10517b = j7;
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long u(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int w(byte[] bArr, int i, C0751j c0751j) throws C0922m0 {
        int iJ = j(bArr, i, c0751j);
        int i7 = c0751j.f10516a;
        if (i7 < 0) {
            throw C0922m0.b();
        }
        if (i7 == 0) {
            c0751j.f10518c = "";
            return iJ;
        }
        c0751j.f10518c = new String(bArr, iJ, i7, AbstractC0914i0.f11272a);
        return iJ + i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int x(byte[] bArr, int i, C0751j c0751j) throws C0922m0 {
        int iJ = j(bArr, i, c0751j);
        int i7 = c0751j.f10516a;
        if (i7 < 0) {
            throw C0922m0.b();
        }
        if (i7 == 0) {
            c0751j.f10518c = "";
            return iJ;
        }
        c0751j.f10518c = X0.f11248a.v(bArr, iJ, i7);
        return iJ + i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int y(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int z(byte[] bArr, int i, C0751j c0751j) throws C0922m0 {
        int iJ = j(bArr, i, c0751j);
        int i7 = c0751j.f10516a;
        if (i7 < 0) {
            throw C0922m0.b();
        }
        if (i7 > bArr.length - iJ) {
            throw C0922m0.a();
        }
        if (i7 == 0) {
            c0751j.f10518c = P.f11218s;
            return iJ;
        }
        c0751j.f10518c = P.h(bArr, iJ, i7);
        return iJ + i7;
    }

    public abstract int h(String str, byte[] bArr, int i, int i7);

    public abstract int i(byte[] bArr, int i, int i7);

    public abstract void q(Exception exc);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean s(byte[] bArr, int i, int i7) {
        return i(bArr, i, i7) == 0;
    }

    public abstract String v(byte[] bArr, int i, int i7);
}
