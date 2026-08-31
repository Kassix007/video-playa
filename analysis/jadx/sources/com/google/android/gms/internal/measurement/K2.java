package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public abstract class K2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f10653a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        char[] cArr = new char[80];
        f10653a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(sb, i);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i7 = 1; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0796f2 c0796f2 = C0796f2.f10840s;
            sb.append(AbstractC1397A.I(new C0796f2(((String) obj).getBytes(AbstractC0885x2.f11122a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0796f2) {
            sb.append(": \"");
            sb.append(AbstractC1397A.I((C0796f2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0851q2) {
            sb.append(" {");
            b((AbstractC0851q2) obj, sb, i + 2);
            sb.append("\n");
            c(sb, i);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i8 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i8, "key", entry.getKey());
        a(sb, i8, FirebaseAnalytics.Param.VALUE, entry.getValue());
        sb.append("\n");
        c(sb, i);
        sb.append("}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.google.android.gms.internal.measurement.AbstractC0851q2 r19, java.lang.StringBuilder r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r0.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L20:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L89
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L36
            goto L86
        L36:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 < r13) goto L86
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L52
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L86
        L52:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L86
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L86
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L75
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L86
        L75:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L86
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L86:
            int r9 = r9 + 1
            goto L20
        L89:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L91:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L209
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto Le9
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto Le9
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto Le9
            java.lang.Object r14 = r7.getValue()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto Le9
            java.lang.Class r15 = r14.getReturnType()
            r16 = r13
            java.lang.Class<java.util.List> r13 = java.util.List.class
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto Leb
            int r7 = r9.length()
            int r7 = r7 + (-4)
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.android.gms.internal.measurement.AbstractC0851q2.n(r14, r0, r9)
            a(r1, r2, r7, r9)
        Le6:
            r13 = r16
            goto L91
        Le9:
            r16 = r13
        Leb:
            java.lang.String r13 = "Map"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L133
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L133
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L133
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L133
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L133
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L133
            int r7 = r9.length()
            int r7 = r7 + (-3)
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.android.gms.internal.measurement.AbstractC0851q2.n(r13, r0, r9)
            a(r1, r2, r7, r9)
            goto Le6
        L133:
            java.lang.String r13 = r12.concat(r9)
            boolean r13 = r3.contains(r13)
            if (r13 == 0) goto Le6
            java.lang.String r13 = "Bytes"
            boolean r13 = r9.endsWith(r13)
            if (r13 == 0) goto L15d
            int r13 = r9.length()
            int r13 = r13 + (-5)
            java.lang.String r13 = r9.substring(r8, r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r10.concat(r13)
            boolean r13 = r5.containsKey(r13)
            if (r13 != 0) goto Le6
        L15d:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r13 = r11.concat(r9)
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r7 == 0) goto Le6
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.measurement.AbstractC0851q2.n(r7, r0, r14)
            if (r13 != 0) goto L1f6
            boolean r13 = r7 instanceof java.lang.Boolean
            if (r13 == 0) goto L186
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Le6
            goto L204
        L186:
            boolean r13 = r7 instanceof java.lang.Integer
            if (r13 == 0) goto L195
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 == 0) goto Le6
            goto L204
        L195:
            boolean r13 = r7 instanceof java.lang.Float
            if (r13 == 0) goto L1a7
            r13 = r7
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            if (r13 == 0) goto Le6
            goto L204
        L1a7:
            boolean r13 = r7 instanceof java.lang.Double
            if (r13 == 0) goto L1bd
            r13 = r7
            java.lang.Double r13 = (java.lang.Double) r13
            double r13 = r13.doubleValue()
            long r13 = java.lang.Double.doubleToRawLongBits(r13)
            r17 = 0
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 == 0) goto Le6
            goto L204
        L1bd:
            boolean r13 = r7 instanceof java.lang.String
            if (r13 == 0) goto L1c8
            java.lang.String r13 = ""
            boolean r13 = r7.equals(r13)
            goto L1d2
        L1c8:
            boolean r13 = r7 instanceof com.google.android.gms.internal.measurement.C0796f2
            if (r13 == 0) goto L1d5
            com.google.android.gms.internal.measurement.f2 r13 = com.google.android.gms.internal.measurement.C0796f2.f10840s
            boolean r13 = r7.equals(r13)
        L1d2:
            if (r13 != 0) goto Le6
            goto L204
        L1d5:
            boolean r13 = r7 instanceof com.google.android.gms.internal.measurement.Y1
            if (r13 == 0) goto L1e8
            r13 = r7
            com.google.android.gms.internal.measurement.Y1 r13 = (com.google.android.gms.internal.measurement.Y1) r13
            com.google.android.gms.internal.measurement.q2 r13 = (com.google.android.gms.internal.measurement.AbstractC0851q2) r13
            r14 = 6
            java.lang.Object r13 = r13.o(r14)
            com.google.android.gms.internal.measurement.q2 r13 = (com.google.android.gms.internal.measurement.AbstractC0851q2) r13
            if (r7 == r13) goto Le6
            goto L204
        L1e8:
            boolean r13 = r7 instanceof java.lang.Enum
            if (r13 == 0) goto L204
            r13 = r7
            java.lang.Enum r13 = (java.lang.Enum) r13
            int r13 = r13.ordinal()
            if (r13 == 0) goto Le6
            goto L204
        L1f6:
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r13 = com.google.android.gms.internal.measurement.AbstractC0851q2.n(r13, r0, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Le6
        L204:
            a(r1, r2, r9, r7)
            goto Le6
        L209:
            r16 = r13
            com.google.android.gms.internal.measurement.Y2 r0 = r0.zzc
            if (r0 == 0) goto L227
        L20f:
            int r3 = r0.f10772a
            if (r8 >= r3) goto L227
            int[] r3 = r0.f10773b
            r3 = r3[r8]
            int r3 = r3 >>> 3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r4 = r0.f10774c
            r4 = r4[r8]
            a(r1, r2, r3, r4)
            int r8 = r8 + 1
            goto L20f
        L227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K2.b(com.google.android.gms.internal.measurement.q2, java.lang.StringBuilder, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(StringBuilder sb, int i) {
        while (i > 0) {
            int i7 = 80;
            if (i <= 80) {
                i7 = i;
            }
            sb.append(f10653a, 0, i7);
            i -= i7;
        }
    }
}
