package d6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12361a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12364d;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f12366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f12367h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12362b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12363c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12365e = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n a() {
        ArrayList arrayList;
        String str = this.f12361a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = b.e(this.f12362b, 0, 0, 7);
        String strE2 = b.e(this.f12363c, 0, 0, 7);
        String str2 = this.f12364d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(n5.m.c0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(b.e((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.f12366g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(n5.m.c0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList4.get(i7);
                i7++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? b.e(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f12367h;
        return new n(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? b.e(str4, 0, 0, 7) : null, toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        int i = this.f12365e;
        if (i != -1) {
            return i;
        }
        String str = this.f12361a;
        kotlin.jvm.internal.m.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(d6.n r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            byte[] r3 = e6.b.f12673a
            int r3 = r2.length()
            r4 = 0
            int r3 = e6.b.k(r2, r4, r3)
            int r5 = r2.length()
            int r5 = e6.b.l(r2, r3, r5)
            int r6 = r5 - r3
            r7 = 91
            r8 = 58
            r9 = -1
            r10 = 2
            if (r6 >= r10) goto L24
            goto L78
        L24:
            char r6 = r2.charAt(r3)
            r11 = 97
            int r12 = kotlin.jvm.internal.m.f(r6, r11)
            r13 = 65
            if (r12 < 0) goto L3a
            r12 = 122(0x7a, float:1.71E-43)
            int r12 = kotlin.jvm.internal.m.f(r6, r12)
            if (r12 <= 0) goto L49
        L3a:
            int r12 = kotlin.jvm.internal.m.f(r6, r13)
            if (r12 < 0) goto L78
            r12 = 90
            int r6 = kotlin.jvm.internal.m.f(r6, r12)
            if (r6 <= 0) goto L49
            goto L78
        L49:
            int r6 = r3 + 1
        L4b:
            if (r6 >= r5) goto L78
            char r12 = r2.charAt(r6)
            if (r11 > r12) goto L58
            r14 = 123(0x7b, float:1.72E-43)
            if (r12 >= r14) goto L58
            goto L72
        L58:
            if (r13 > r12) goto L5d
            if (r12 >= r7) goto L5d
            goto L72
        L5d:
            r14 = 48
            if (r14 > r12) goto L64
            if (r12 >= r8) goto L64
            goto L72
        L64:
            r14 = 43
            if (r12 != r14) goto L69
            goto L72
        L69:
            r14 = 45
            if (r12 != r14) goto L6e
            goto L72
        L6e:
            r14 = 46
            if (r12 != r14) goto L75
        L72:
            int r6 = r6 + 1
            goto L4b
        L75:
            if (r12 != r8) goto L78
            goto L79
        L78:
            r6 = r9
        L79:
            java.lang.String r11 = "http"
            java.lang.String r12 = "https"
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            r14 = 1
            if (r6 == r9) goto Lbc
            java.lang.String r15 = "https:"
            boolean r15 = J5.t.F0(r2, r15, r3, r14)
            if (r15 == 0) goto L8f
            r0.f12361a = r12
            int r3 = r3 + 6
            goto Lc2
        L8f:
            java.lang.String r15 = "http:"
            boolean r15 = J5.t.F0(r2, r15, r3, r14)
            if (r15 == 0) goto L9c
            r0.f12361a = r11
            int r3 = r3 + 5
            goto Lc2
        L9c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Expected URL scheme 'http' or 'https' but was '"
            r3.<init>(r5)
            java.lang.String r2 = r2.substring(r4, r6)
            kotlin.jvm.internal.m.d(r2, r13)
            r3.append(r2)
            r2 = 39
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        Lbc:
            if (r1 == 0) goto L380
            java.lang.String r6 = r1.f12368a
            r0.f12361a = r6
        Lc2:
            r6 = r3
            r15 = r4
            r16 = r14
        Lc6:
            r14 = 47
            r7 = 92
            if (r6 >= r5) goto Ldd
            char r8 = r2.charAt(r6)
            if (r8 == r7) goto Ld4
            if (r8 != r14) goto Ldd
        Ld4:
            int r15 = r15 + 1
            int r6 = r6 + 1
            r7 = 91
            r8 = 58
            goto Lc6
        Ldd:
            java.lang.String r6 = " \"'<>#"
            java.lang.String r8 = ""
            java.util.ArrayList r7 = r0.f
            r14 = 35
            if (r15 >= r10) goto L130
            if (r1 == 0) goto L130
            java.lang.String r10 = r1.f12368a
            java.lang.String r9 = r0.f12361a
            boolean r9 = kotlin.jvm.internal.m.a(r10, r9)
            if (r9 != 0) goto Lf4
            goto L130
        Lf4:
            java.lang.String r9 = r1.e()
            r0.f12362b = r9
            java.lang.String r9 = r1.a()
            r0.f12363c = r9
            java.lang.String r9 = r1.f12371d
            r0.f12364d = r9
            int r9 = r1.f12372e
            r0.f12365e = r9
            r7.clear()
            java.util.ArrayList r9 = r1.c()
            r7.addAll(r9)
            if (r3 == r5) goto L11a
            char r9 = r2.charAt(r3)
            if (r9 != r14) goto L25e
        L11a:
            java.lang.String r1 = r1.d()
            if (r1 == 0) goto L12b
            r9 = 211(0xd3, float:2.96E-43)
            java.lang.String r1 = d6.b.b(r1, r4, r4, r6, r9)
            java.util.ArrayList r1 = d6.b.f(r1)
            goto L12c
        L12b:
            r1 = 0
        L12c:
            r0.f12366g = r1
            goto L25e
        L130:
            int r3 = r3 + r15
            r1 = r4
            r9 = r1
        L133:
            java.lang.String r10 = "@/\\?#"
            int r10 = e6.b.d(r3, r5, r2, r10)
            if (r10 == r5) goto L141
            char r15 = r2.charAt(r10)
        L13f:
            r4 = -1
            goto L143
        L141:
            r15 = -1
            goto L13f
        L143:
            if (r15 == r4) goto L1c4
            if (r15 == r14) goto L1c4
            r4 = 47
            if (r15 == r4) goto L1c4
            r4 = 92
            if (r15 == r4) goto L1c4
            r4 = 63
            if (r15 == r4) goto L1c4
            r4 = 64
            if (r15 == r4) goto L159
            r4 = 0
            goto L133
        L159:
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            java.lang.String r15 = "%40"
            if (r1 != 0) goto L19b
            r18 = r1
            r14 = 58
            int r1 = e6.b.e(r2, r14, r3, r10)
            r14 = 240(0xf0, float:3.36E-43)
            java.lang.String r3 = d6.b.b(r2, r3, r1, r4, r14)
            if (r9 == 0) goto L183
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = r0.f12362b
            r9.append(r14)
            r9.append(r15)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
        L183:
            r0.f12362b = r3
            if (r1 == r10) goto L194
            int r1 = r1 + 1
            r14 = 240(0xf0, float:3.36E-43)
            java.lang.String r1 = d6.b.b(r2, r1, r10, r4, r14)
            r0.f12363c = r1
            r1 = r16
            goto L198
        L194:
            r14 = 240(0xf0, float:3.36E-43)
            r1 = r18
        L198:
            r9 = r16
            goto L1bd
        L19b:
            r18 = r1
            r14 = 240(0xf0, float:3.36E-43)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r14 = r0.f12363c
            r1.append(r14)
            r1.append(r15)
            r14 = 240(0xf0, float:3.36E-43)
            java.lang.String r3 = d6.b.b(r2, r3, r10, r4, r14)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.f12363c = r1
            r1 = r18
        L1bd:
            int r3 = r10 + 1
            r4 = 0
            r14 = 35
            goto L133
        L1c4:
            r1 = r3
        L1c5:
            if (r1 >= r10) goto L1e6
            char r4 = r2.charAt(r1)
            r9 = 91
            if (r4 != r9) goto L1de
        L1cf:
            int r1 = r1 + 1
            if (r1 >= r10) goto L1db
            char r4 = r2.charAt(r1)
            r14 = 93
            if (r4 != r14) goto L1cf
        L1db:
            r14 = 58
            goto L1e3
        L1de:
            r14 = 58
            if (r4 != r14) goto L1e3
            goto L1e7
        L1e3:
            int r1 = r1 + 1
            goto L1c5
        L1e6:
            r1 = r10
        L1e7:
            int r4 = r1 + 1
            r9 = 4
            r14 = 34
            if (r4 >= r10) goto L234
            java.lang.String r9 = d6.b.e(r2, r3, r1, r9)
            java.lang.String r9 = a.AbstractC0597a.T(r9)
            r0.f12364d = r9
            r9 = 248(0xf8, float:3.48E-43)
            java.lang.String r9 = d6.b.b(r2, r4, r10, r8, r9)     // Catch: java.lang.NumberFormatException -> L20b
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L20b
            r11 = r16
            if (r11 > r9) goto L20b
            r11 = 65536(0x10000, float:9.18355E-41)
            if (r9 >= r11) goto L20b
            goto L20c
        L20b:
            r9 = -1
        L20c:
            r0.f12365e = r9
            r15 = -1
            if (r9 == r15) goto L212
            goto L259
        L212:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid URL port: \""
            r1.<init>(r3)
            java.lang.String r2 = r2.substring(r4, r10)
            kotlin.jvm.internal.m.d(r2, r13)
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L234:
            r15 = -1
            java.lang.String r4 = d6.b.e(r2, r3, r1, r9)
            java.lang.String r4 = a.AbstractC0597a.T(r4)
            r0.f12364d = r4
            java.lang.String r4 = r0.f12361a
            kotlin.jvm.internal.m.b(r4)
            boolean r9 = r4.equals(r11)
            if (r9 == 0) goto L24d
            r9 = 80
            goto L257
        L24d:
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L256
            r9 = 443(0x1bb, float:6.21E-43)
            goto L257
        L256:
            r9 = r15
        L257:
            r0.f12365e = r9
        L259:
            java.lang.String r4 = r0.f12364d
            if (r4 == 0) goto L35e
            r3 = r10
        L25e:
            java.lang.String r1 = "?#"
            int r1 = e6.b.d(r3, r5, r2, r1)
            if (r3 != r1) goto L268
            goto L328
        L268:
            char r4 = r2.charAt(r3)
            r9 = 47
            if (r4 == r9) goto L281
            r9 = 92
            if (r4 != r9) goto L275
            goto L281
        L275:
            int r4 = r7.size()
            r16 = 1
            int r4 = r4 + (-1)
            r7.set(r4, r8)
            goto L289
        L281:
            r7.clear()
            r7.add(r8)
            int r3 = r3 + 1
        L289:
            if (r3 >= r1) goto L328
            java.lang.String r4 = "/\\"
            int r4 = e6.b.d(r3, r1, r2, r4)
            if (r4 >= r1) goto L295
            r11 = 1
            goto L296
        L295:
            r11 = 0
        L296:
            java.lang.String r9 = " \"<>^`{}|/\\?#"
            r14 = 240(0xf0, float:3.36E-43)
            java.lang.String r3 = d6.b.b(r2, r3, r4, r9, r14)
            java.lang.String r9 = "."
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "%2e"
            boolean r9 = r3.equalsIgnoreCase(r9)
            if (r9 == 0) goto L2b0
            goto L31f
        L2b0:
            java.lang.String r9 = ".."
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L2f8
            java.lang.String r9 = "%2e."
            boolean r9 = r3.equalsIgnoreCase(r9)
            if (r9 != 0) goto L2f8
            java.lang.String r9 = ".%2e"
            boolean r9 = r3.equalsIgnoreCase(r9)
            if (r9 != 0) goto L2f8
            java.lang.String r9 = "%2e%2e"
            boolean r9 = r3.equalsIgnoreCase(r9)
            if (r9 == 0) goto L2d1
            goto L2f8
        L2d1:
            int r9 = r7.size()
            r16 = 1
            int r9 = r9 + (-1)
            java.lang.Object r9 = r7.get(r9)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 != 0) goto L2ef
            int r9 = r7.size()
            int r9 = r9 + (-1)
            r7.set(r9, r3)
            goto L2f2
        L2ef:
            r7.add(r3)
        L2f2:
            if (r11 == 0) goto L31f
            r7.add(r8)
            goto L31f
        L2f8:
            int r3 = r7.size()
            r16 = 1
            int r3 = r3 + (-1)
            java.lang.Object r3 = r7.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L31c
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L31c
            int r3 = r7.size()
            int r3 = r3 + (-1)
            r7.set(r3, r8)
            goto L31f
        L31c:
            r7.add(r8)
        L31f:
            if (r11 == 0) goto L325
            int r3 = r4 + 1
            goto L289
        L325:
            r3 = r4
            goto L289
        L328:
            if (r1 >= r5) goto L347
            char r3 = r2.charAt(r1)
            r4 = 63
            if (r3 != r4) goto L347
            r3 = 35
            int r4 = e6.b.e(r2, r3, r1, r5)
            int r1 = r1 + 1
            r3 = 208(0xd0, float:2.91E-43)
            java.lang.String r1 = d6.b.b(r2, r1, r4, r6, r3)
            java.util.ArrayList r1 = d6.b.f(r1)
            r0.f12366g = r1
            r1 = r4
        L347:
            if (r1 >= r5) goto L35d
            char r3 = r2.charAt(r1)
            r4 = 35
            if (r3 != r4) goto L35d
            r16 = 1
            int r1 = r1 + 1
            r3 = 176(0xb0, float:2.47E-43)
            java.lang.String r1 = d6.b.b(r2, r1, r5, r8, r3)
            r0.f12367h = r1
        L35d:
            return
        L35e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid URL host: \""
            r4.<init>(r5)
            java.lang.String r1 = r2.substring(r3, r1)
            kotlin.jvm.internal.m.d(r1, r13)
            r4.append(r1)
            r4.append(r14)
            java.lang.String r1 = r4.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L380:
            int r1 = r2.length()
            r3 = 6
            if (r1 <= r3) goto L392
            java.lang.String r1 = J5.m.m1(r3, r2)
            java.lang.String r2 = "..."
            java.lang.String r1 = r1.concat(r2)
            goto L393
        L392:
            r1 = r2
        L393:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
            java.lang.String r1 = C0.S.w(r3, r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.m.c(d6.n, java.lang.String):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f12361a
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r6.f12362b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r6.f12363c
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r6.f12362b
            r0.append(r1)
            java.lang.String r1 = r6.f12363c
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r6.f12363c
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r6.f12364d
            if (r1 == 0) goto L63
            boolean r1 = J5.m.J0(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r6.f12364d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r6.f12364d
            r0.append(r1)
        L63:
            int r1 = r6.f12365e
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r6.f12361a
            if (r1 == 0) goto L91
        L6c:
            int r1 = r6.b()
            java.lang.String r4 = r6.f12361a
            if (r4 == 0) goto L8b
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L7f
            r3 = 80
            goto L89
        L7f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L89
            r3 = 443(0x1bb, float:6.21E-43)
        L89:
            if (r1 == r3) goto L91
        L8b:
            r0.append(r2)
            r0.append(r1)
        L91:
            java.lang.String r1 = "<this>"
            java.util.ArrayList r2 = r6.f
            kotlin.jvm.internal.m.e(r2, r1)
            int r1 = r2.size()
            r3 = 0
        L9d:
            if (r3 >= r1) goto Lb0
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto L9d
        Lb0:
            java.util.ArrayList r1 = r6.f12366g
            if (r1 == 0) goto Lc1
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r6.f12366g
            kotlin.jvm.internal.m.b(r1)
            d6.b.g(r1, r0)
        Lc1:
            java.lang.String r1 = r6.f12367h
            if (r1 == 0) goto Lcf
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.f12367h
            r0.append(r1)
        Lcf:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.m.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.m.toString():java.lang.String");
    }
}
