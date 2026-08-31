package L0;

import C0.C0111x0;
import C0.S;
import O3.D0;
import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import c3.C0733c;
import com.google.android.gms.internal.measurement.P1;
import d2.C0975a;
import d2.C0998x;
import h3.C1122a;
import h3.C1123b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3128e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l(C1122a c1122a, D0 d02, C1123b c1123b, C1123b c1123b2, D0 d03) {
        this.f3125b = c1122a;
        this.f3126c = d02;
        this.f3127d = c1123b;
        this.f3128e = c1123b2;
        this.f3124a = d03;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // L0.p
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f3124a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o) arrayList.get(i)).f3163a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m5.h] */
    @Override // L0.p
    public float b() {
        return ((Number) this.f3128e.getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d6.s c() {
        Map mapUnmodifiableMap;
        d6.n nVar = (d6.n) this.f3125b;
        if (nVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f3126c;
        d6.l lVarD = ((C0733c) this.f3127d).d();
        k3.c cVar = (k3.c) this.f3128e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3124a;
        byte[] bArr = e6.b.f12673a;
        kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = n5.t.f15300q;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.m.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new d6.s(nVar, str, lVarD, cVar, mapUnmodifiableMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(d6.c cacheControl) {
        kotlin.jvm.internal.m.e(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        if (string.length() == 0) {
            ((C0733c) this.f3127d).e("Cache-Control");
        } else {
            m("Cache-Control", string);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean e(int i) {
        ArrayList arrayList = (ArrayList) this.f3126c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0975a c0975a = (C0975a) arrayList.get(i7);
            int i8 = c0975a.f12059a;
            if (i8 != 8) {
                if (i8 == 1) {
                    int i9 = c0975a.f12060b;
                    int i10 = c0975a.f12061c + i9;
                    while (i9 < i10) {
                        if (i(i9, i7 + 1) == i) {
                            return true;
                        }
                        i9++;
                    }
                } else {
                    continue;
                }
            } else {
                if (i(c0975a.f12061c, i7 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f() {
        C0998x c0998x = (C0998x) this.f3127d;
        ArrayList arrayList = (ArrayList) this.f3126c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0998x) this.f3127d).a((C0975a) arrayList.get(i));
        }
        r(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f3124a;
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            C0975a c0975a = (C0975a) arrayList2.get(i7);
            int i8 = c0975a.f12059a;
            if (i8 == 1) {
                c0998x.a(c0975a);
                c0998x.d(c0975a.f12060b, c0975a.f12061c);
            } else if (i8 == 2) {
                c0998x.a(c0975a);
                int i9 = c0975a.f12060b;
                int i10 = c0975a.f12061c;
                RecyclerView recyclerView = c0998x.f12220a;
                recyclerView.O(i9, i10, true);
                recyclerView.f9659v0 = true;
                recyclerView.f9653s0.f12015c += i10;
            } else if (i8 == 4) {
                c0998x.a(c0975a);
                c0998x.c(c0975a.f12060b, c0975a.f12061c);
            } else if (i8 == 8) {
                c0998x.a(c0975a);
                c0998x.e(c0975a.f12060b, c0975a.f12061c);
            }
        }
        r(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(C0975a c0975a) {
        int i;
        b1.d dVar = (b1.d) this.f3125b;
        int i7 = c0975a.f12059a;
        if (i7 == 1 || i7 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iT = t(c0975a.f12060b, i7);
        int i8 = c0975a.f12060b;
        int i9 = c0975a.f12059a;
        if (i9 == 2) {
            i = 0;
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0975a);
            }
            i = 1;
        }
        int i10 = 1;
        for (int i11 = 1; i11 < c0975a.f12061c; i11++) {
            int iT2 = t((i * i11) + c0975a.f12060b, c0975a.f12059a);
            int i12 = c0975a.f12059a;
            if (i12 == 2 ? iT2 != iT : !(i12 == 4 && iT2 == iT + 1)) {
                C0975a c0975aP = p(i12, iT, i10);
                h(c0975aP, i8);
                dVar.c(c0975aP);
                if (c0975a.f12059a == 4) {
                    i8 += i10;
                }
                i10 = 1;
                iT = iT2;
            } else {
                i10++;
            }
        }
        dVar.c(c0975a);
        if (i10 > 0) {
            C0975a c0975aP2 = p(c0975a.f12059a, iT, i10);
            h(c0975aP2, i8);
            dVar.c(c0975aP2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(C0975a c0975a, int i) {
        C0998x c0998x = (C0998x) this.f3127d;
        c0998x.a(c0975a);
        int i7 = c0975a.f12059a;
        if (i7 != 2) {
            if (i7 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0998x.c(i, c0975a.f12061c);
        } else {
            int i8 = c0975a.f12061c;
            RecyclerView recyclerView = c0998x.f12220a;
            recyclerView.O(i, i8, true);
            recyclerView.f9659v0 = true;
            recyclerView.f9653s0.f12015c += i8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int i(int i, int i7) {
        ArrayList arrayList = (ArrayList) this.f3126c;
        int size = arrayList.size();
        while (i7 < size) {
            C0975a c0975a = (C0975a) arrayList.get(i7);
            int i8 = c0975a.f12059a;
            if (i8 == 8) {
                int i9 = c0975a.f12060b;
                if (i9 == i) {
                    i = c0975a.f12061c;
                } else {
                    if (i9 < i) {
                        i--;
                    }
                    if (c0975a.f12061c <= i) {
                        i++;
                    }
                }
            } else {
                int i10 = c0975a.f12060b;
                if (i10 > i) {
                    continue;
                } else if (i8 == 2) {
                    int i11 = c0975a.f12061c;
                    if (i < i10 + i11) {
                        return -1;
                    }
                    i -= i11;
                } else if (i8 == 1) {
                    i += c0975a.f12061c;
                }
            }
            i7++;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float j(int i, boolean z5) {
        Layout layout = (Layout) this.f3125b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z5 ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float k(int r29, boolean r30, boolean r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            java.lang.Object r2 = r0.f3124a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r0.f3125b
            android.text.Layout r3 = (android.text.Layout) r3
            if (r31 != 0) goto L13
            float r1 = r28.j(r29, r30)
            return r1
        L13:
            if (r1 > 0) goto L17
            r4 = 0
            goto L43
        L17:
            java.lang.CharSequence r4 = r3.getText()
            int r4 = r4.length()
            if (r1 < r4) goto L28
            int r4 = r3.getLineCount()
        L25:
            int r4 = r4 + (-1)
            goto L43
        L28:
            int r4 = r3.getLineForOffset(r1)
            int r5 = r3.getLineStart(r4)
            int r6 = r3.getLineEnd(r4)
            if (r5 == r1) goto L39
            if (r6 == r1) goto L39
            goto L43
        L39:
            if (r5 != r1) goto L3e
            if (r31 == 0) goto L43
            goto L25
        L3e:
            if (r31 == 0) goto L41
            goto L43
        L41:
            int r4 = r4 + 1
        L43:
            int r5 = r3.getLineStart(r4)
            int r6 = r3.getLineEnd(r4)
            if (r1 == r5) goto L54
            if (r1 == r6) goto L54
            float r1 = r28.j(r29, r30)
            return r1
        L54:
            if (r1 == 0) goto L28a
            java.lang.CharSequence r7 = r3.getText()
            int r7 = r7.length()
            if (r1 != r7) goto L62
            goto L28a
        L62:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            int r7 = com.google.android.gms.internal.measurement.AbstractC0836n2.f(r2, r7)
            r8 = 1
            if (r7 >= 0) goto L70
            int r7 = r7 + r8
            int r7 = -r7
            goto L71
        L70:
            int r7 = r7 + r8
        L71:
            if (r31 == 0) goto L84
            if (r7 <= 0) goto L84
            int r9 = r7 + (-1)
            java.lang.Object r10 = r2.get(r9)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r1 != r10) goto L84
            r7 = r9
        L84:
            if (r7 != 0) goto L88
            r10 = 0
            goto L94
        L88:
            int r10 = r7 + (-1)
            java.lang.Object r10 = r2.get(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
        L94:
            int r10 = r3.getLineForOffset(r10)
            int r10 = r3.getParagraphDirection(r10)
            r11 = -1
            if (r10 != r11) goto La1
            r10 = r8
            goto La2
        La1:
            r10 = 0
        La2:
            int r6 = r0.n(r6, r5)
            if (r7 != 0) goto Laa
            r12 = 0
            goto Lb6
        Laa:
            int r12 = r7 + (-1)
            java.lang.Object r12 = r2.get(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
        Lb6:
            int r13 = r5 - r12
            int r12 = r6 - r12
            java.lang.Object r14 = r0.f3126c
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r0.f3127d
            boolean[] r15 = (boolean[]) r15
            boolean r16 = r15[r7]
            r17 = 0
            if (r16 == 0) goto Ld5
            java.lang.Object r2 = r14.get(r7)
            java.text.Bidi r2 = (java.text.Bidi) r2
            r27 = r4
            r26 = r6
            r4 = r11
            goto L162
        Ld5:
            if (r7 != 0) goto Ld9
            r8 = 0
            goto Le5
        Ld9:
            int r8 = r7 + (-1)
            java.lang.Object r8 = r2.get(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
        Le5:
            java.lang.Object r18 = r2.get(r7)
            java.lang.Number r18 = (java.lang.Number) r18
            int r11 = r18.intValue()
            int r9 = r11 - r8
            r25 = r15
            java.lang.Object r15 = r0.f3128e
            char[] r15 = (char[]) r15
            r26 = r6
            if (r15 == 0) goto Lfe
            int r6 = r15.length
            if (r6 >= r9) goto L100
        Lfe:
            char[] r15 = new char[r9]
        L100:
            java.lang.CharSequence r6 = r3.getText()
            r27 = r4
            r4 = 0
            android.text.TextUtils.getChars(r6, r8, r11, r15, r4)
            boolean r6 = java.text.Bidi.requiresBidi(r15, r4, r9)
            if (r6 == 0) goto L14c
            if (r7 != 0) goto L114
            r4 = 0
            goto L120
        L114:
            int r4 = r7 + (-1)
            java.lang.Object r2 = r2.get(r4)
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
        L120:
            int r2 = r3.getLineForOffset(r4)
            int r2 = r3.getParagraphDirection(r2)
            r4 = -1
            if (r2 != r4) goto L12e
            r24 = 1
            goto L130
        L12e:
            r24 = 0
        L130:
            java.text.Bidi r18 = new java.text.Bidi
            r21 = 0
            r22 = 0
            r20 = 0
            r23 = r9
            r19 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24)
            int r2 = r18.getRunCount()
            r6 = 1
            if (r2 != r6) goto L149
        L146:
            r2 = r17
            goto L14f
        L149:
            r2 = r18
            goto L14f
        L14c:
            r4 = -1
            r6 = 1
            goto L146
        L14f:
            r14.set(r7, r2)
            r25[r7] = r6
            if (r2 == 0) goto L160
            java.lang.Object r6 = r0.f3128e
            char[] r6 = (char[]) r6
            if (r15 != r6) goto L15f
            r15 = r17
            goto L160
        L15f:
            r15 = r6
        L160:
            r0.f3128e = r15
        L162:
            if (r2 == 0) goto L168
            java.text.Bidi r17 = r2.createLineBidi(r13, r12)
        L168:
            r2 = r17
            if (r2 == 0) goto L262
            int r6 = r2.getRunCount()
            r7 = 1
            if (r6 != r7) goto L17a
            r16 = r7
        L175:
            r8 = r27
            r11 = 0
            goto L266
        L17a:
            int r6 = r2.getRunCount()
            M0.d[] r7 = new M0.d[r6]
            r8 = 0
        L181:
            if (r8 >= r6) goto L1a3
            M0.d r9 = new M0.d
            int r11 = r2.getRunStart(r8)
            int r11 = r11 + r5
            int r12 = r2.getRunLimit(r8)
            int r12 = r12 + r5
            int r13 = r2.getRunLevel(r8)
            int r13 = r13 % 2
            r14 = 1
            if (r13 != r14) goto L19a
            r13 = 1
            goto L19b
        L19a:
            r13 = 0
        L19b:
            r9.<init>(r11, r12, r13)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L181
        L1a3:
            int r8 = r2.getRunCount()
            byte[] r9 = new byte[r8]
            r11 = 0
        L1aa:
            if (r11 >= r8) goto L1b6
            int r12 = r2.getRunLevel(r11)
            byte r12 = (byte) r12
            r9[r11] = r12
            int r11 = r11 + 1
            goto L1aa
        L1b6:
            r11 = 0
            java.text.Bidi.reorderVisually(r9, r11, r7, r11, r6)
            if (r1 != r5) goto L20c
            r2 = r11
        L1bd:
            if (r2 >= r6) goto L1c9
            r5 = r7[r2]
            int r5 = r5.f3695a
            if (r5 != r1) goto L1c6
            goto L1ca
        L1c6:
            int r2 = r2 + 1
            goto L1bd
        L1c9:
            r2 = r4
        L1ca:
            r1 = r7[r2]
            if (r30 != 0) goto L1d5
            boolean r1 = r1.f3697c
            if (r10 != r1) goto L1d3
            goto L1d5
        L1d3:
            r9 = r10
            goto L1da
        L1d5:
            if (r10 != 0) goto L1d9
            r9 = 1
            goto L1da
        L1d9:
            r9 = r11
        L1da:
            if (r2 != 0) goto L1e5
            if (r9 == 0) goto L1e5
            r8 = r27
            float r1 = r3.getLineLeft(r8)
            return r1
        L1e5:
            r8 = r27
            r16 = 1
            int r6 = r6 + (-1)
            if (r2 != r6) goto L1f4
            if (r9 != 0) goto L1f4
            float r1 = r3.getLineRight(r8)
            return r1
        L1f4:
            if (r9 == 0) goto L201
            int r2 = r2 + (-1)
            r1 = r7[r2]
            int r1 = r1.f3695a
            float r1 = r3.getPrimaryHorizontal(r1)
            return r1
        L201:
            int r2 = r2 + 1
            r1 = r7[r2]
            int r1 = r1.f3695a
            float r1 = r3.getPrimaryHorizontal(r1)
            return r1
        L20c:
            r2 = r26
            r8 = r27
            if (r1 <= r2) goto L216
            int r1 = r0.n(r1, r5)
        L216:
            r2 = r11
        L217:
            if (r2 >= r6) goto L223
            r5 = r7[r2]
            int r5 = r5.f3696b
            if (r5 != r1) goto L220
            goto L224
        L220:
            int r2 = r2 + 1
            goto L217
        L223:
            r2 = r4
        L224:
            r1 = r7[r2]
            if (r30 != 0) goto L233
            boolean r1 = r1.f3697c
            if (r10 != r1) goto L22d
            goto L233
        L22d:
            if (r10 != 0) goto L231
            r9 = 1
            goto L234
        L231:
            r9 = r11
            goto L234
        L233:
            r9 = r10
        L234:
            if (r2 != 0) goto L23d
            if (r9 == 0) goto L23d
            float r1 = r3.getLineLeft(r8)
            return r1
        L23d:
            r16 = 1
            int r6 = r6 + (-1)
            if (r2 != r6) goto L24a
            if (r9 != 0) goto L24a
            float r1 = r3.getLineRight(r8)
            return r1
        L24a:
            if (r9 == 0) goto L257
            int r2 = r2 + (-1)
            r1 = r7[r2]
            int r1 = r1.f3696b
            float r1 = r3.getPrimaryHorizontal(r1)
            return r1
        L257:
            int r2 = r2 + 1
            r1 = r7[r2]
            int r1 = r1.f3696b
            float r1 = r3.getPrimaryHorizontal(r1)
            return r1
        L262:
            r16 = 1
            goto L175
        L266:
            boolean r2 = r3.isRtlCharAt(r5)
            if (r30 != 0) goto L26e
            if (r10 != r2) goto L274
        L26e:
            if (r10 != 0) goto L273
            r10 = r16
            goto L274
        L273:
            r10 = r11
        L274:
            if (r1 != r5) goto L279
            r16 = r10
            goto L27e
        L279:
            if (r10 != 0) goto L27c
            goto L27e
        L27c:
            r16 = r11
        L27e:
            if (r16 == 0) goto L285
            float r1 = r3.getLineLeft(r8)
            return r1
        L285:
            float r1 = r3.getLineRight(r8)
            return r1
        L28a:
            float r1 = r28.j(r29, r30)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.l.k(int, boolean, boolean):float");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean l() {
        return ((ArrayList) this.f3124a).size() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m(String str, String value) {
        kotlin.jvm.internal.m.e(value, "value");
        C0733c c0733c = (C0733c) this.f3127d;
        c0733c.getClass();
        P1.h(str);
        P1.k(value, str);
        c0733c.e(str);
        c0733c.a(str, value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int n(int i, int i7) {
        while (i > i7) {
            char cCharAt = ((Layout) this.f3125b).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((kotlin.jvm.internal.m.f(cCharAt, 8192) < 0 || kotlin.jvm.internal.m.f(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o(String method, k3.c cVar) {
        kotlin.jvm.internal.m.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (cVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(S.n("method ", method, " must have a request body.").toString());
            }
        } else if (!D5.a.A(method)) {
            throw new IllegalArgumentException(S.n("method ", method, " must not have a request body.").toString());
        }
        this.f3126c = method;
        this.f3128e = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0975a p(int i, int i7, int i8) {
        C0975a c0975a = (C0975a) ((b1.d) this.f3125b).a();
        if (c0975a != null) {
            c0975a.f12059a = i;
            c0975a.f12060b = i7;
            c0975a.f12061c = i8;
            return c0975a;
        }
        C0975a c0975a2 = new C0975a();
        c0975a2.f12059a = i;
        c0975a2.f12060b = i7;
        c0975a2.f12061c = i8;
        return c0975a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(C0975a c0975a) {
        C0998x c0998x = (C0998x) this.f3127d;
        ((ArrayList) this.f3126c).add(c0975a);
        int i = c0975a.f12059a;
        if (i == 1) {
            c0998x.d(c0975a.f12060b, c0975a.f12061c);
            return;
        }
        if (i == 2) {
            int i7 = c0975a.f12060b;
            int i8 = c0975a.f12061c;
            RecyclerView recyclerView = c0998x.f12220a;
            recyclerView.O(i7, i8, false);
            recyclerView.f9659v0 = true;
            return;
        }
        if (i == 4) {
            c0998x.c(c0975a.f12060b, c0975a.f12061c);
        } else if (i == 8) {
            c0998x.e(c0975a.f12060b, c0975a.f12061c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0975a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0975a c0975a = (C0975a) arrayList.get(i);
            c0975a.getClass();
            ((b1.d) this.f3125b).c(c0975a);
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(Object obj, String key) {
        kotlin.jvm.internal.m.e(key, "key");
        ((LinkedHashMap) this.f3125b).put(key, obj);
        P5.C c7 = (P5.C) ((LinkedHashMap) this.f3127d).get(key);
        if (c7 != null) {
            ((P5.S) c7).g(obj);
        }
        P5.C c8 = (P5.C) ((LinkedHashMap) this.f3128e).get(key);
        if (c8 != null) {
            ((P5.S) c8).g(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int t(int i, int i7) {
        int i8;
        int i9;
        b1.d dVar = (b1.d) this.f3125b;
        ArrayList arrayList = (ArrayList) this.f3126c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0975a c0975a = (C0975a) arrayList.get(size);
            int i10 = c0975a.f12059a;
            if (i10 == 8) {
                int i11 = c0975a.f12060b;
                int i12 = c0975a.f12061c;
                if (i11 < i12) {
                    i9 = i11;
                    i8 = i12;
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                if (i < i9 || i > i8) {
                    if (i < i11) {
                        if (i7 == 1) {
                            c0975a.f12060b = i11 + 1;
                            c0975a.f12061c = i12 + 1;
                        } else if (i7 == 2) {
                            c0975a.f12060b = i11 - 1;
                            c0975a.f12061c = i12 - 1;
                        }
                    }
                } else if (i9 == i11) {
                    if (i7 == 1) {
                        c0975a.f12061c = i12 + 1;
                    } else if (i7 == 2) {
                        c0975a.f12061c = i12 - 1;
                    }
                    i++;
                } else {
                    if (i7 == 1) {
                        c0975a.f12060b = i11 + 1;
                    } else if (i7 == 2) {
                        c0975a.f12060b = i11 - 1;
                    }
                    i--;
                }
            } else {
                int i13 = c0975a.f12060b;
                if (i13 <= i) {
                    if (i10 == 1) {
                        i -= c0975a.f12061c;
                    } else if (i10 == 2) {
                        i += c0975a.f12061c;
                    }
                } else if (i7 == 1) {
                    c0975a.f12060b = i13 + 1;
                } else if (i7 == 2) {
                    c0975a.f12060b = i13 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0975a c0975a2 = (C0975a) arrayList.get(size2);
            if (c0975a2.f12059a == 8) {
                int i14 = c0975a2.f12061c;
                if (i14 == c0975a2.f12060b || i14 < 0) {
                    arrayList.remove(size2);
                    dVar.c(c0975a2);
                }
            } else if (c0975a2.f12061c <= 0) {
                arrayList.remove(size2);
                dVar.c(c0975a2);
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(String url) {
        kotlin.jvm.internal.m.e(url, "url");
        if (J5.t.G0(url, "ws:", true)) {
            String strSubstring = url.substring(3);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            url = "http:".concat(strSubstring);
        } else if (J5.t.G0(url, "wss:", true)) {
            String strSubstring2 = url.substring(4);
            kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            url = "https:".concat(strSubstring2);
        }
        kotlin.jvm.internal.m.e(url, "<this>");
        d6.m mVar = new d6.m();
        mVar.c(null, url);
        this.f3125b = mVar.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public l(Map initialState) {
        kotlin.jvm.internal.m.e(initialState, "initialState");
        this.f3125b = n5.x.P(initialState);
        this.f3126c = new LinkedHashMap();
        this.f3127d = new LinkedHashMap();
        this.f3128e = new LinkedHashMap();
        this.f3124a = new C0111x0(2, this);
    }

    public l() {
        this.f3124a = new LinkedHashMap();
        this.f3126c = "GET";
        this.f3127d = new C0733c(1);
    }
}
