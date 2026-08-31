package E;

import B0.G0;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import g.AbstractC1066a;
import j2.InterfaceC1155a;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import k2.C1178b;
import m.AbstractC1313j0;
import m.C1328r;
import r.C1543B;
import w1.AbstractC1835K;
import y4.AbstractC1918b;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1521d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [D.u.<init>(java.lang.String):void, a0.n.<clinit>():void] */
    public /* synthetic */ Y(int i, byte b7) {
        this.f1518a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r1 = r0.f1067a;
        r0 = r0.f1068b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0200, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0202, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0204, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0218, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f1067a, r0.f1068b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022d, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022f, code lost:
    
        r1 = r0.f1067a;
        r0 = r0.f1068b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0236, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0239, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0250, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025c, code lost:
    
        return new E.Y(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new C0.C0092n0(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new C0.C0092n0(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new C0.C0092n0(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static E.Y d(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r30
            r1 = r32
            android.content.res.XmlResourceParser r2 = r30.getXml(r31)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        Lc:
            int r4 = r2.next()
            r5 = 1
            r6 = 2
            if (r4 == r6) goto L17
            if (r4 == r5) goto L17
            goto Lc
        L17:
            if (r4 != r6) goto L285
            java.lang.String r4 = r2.getName()
            r4.getClass()
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L5d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L3f
            android.content.res.ColorStateList r0 = m1.c.b(r0, r2, r3, r1)
            E.Y r1 = new E.Y
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L3f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L265
            int[] r4 = j1.AbstractC1154a.f13736d
            android.content.res.TypedArray r4 = m1.b.g(r0, r1, r3, r4)
            java.lang.String r7 = "http://schemas.android.com/apk/res/android"
            java.lang.String r8 = "startX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            r10 = 0
            if (r8 == 0) goto L80
            r8 = 8
            float r8 = r4.getFloat(r8, r10)
            r12 = r8
            goto L81
        L80:
            r12 = r10
        L81:
            java.lang.String r8 = "startY"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto L91
            r8 = 9
            float r8 = r4.getFloat(r8, r10)
            r13 = r8
            goto L92
        L91:
            r13 = r10
        L92:
            java.lang.String r8 = "endX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto La2
            r8 = 10
            float r8 = r4.getFloat(r8, r10)
            r14 = r8
            goto La3
        La2:
            r14 = r10
        La3:
            java.lang.String r8 = "endY"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto Lb3
            r8 = 11
            float r8 = r4.getFloat(r8, r10)
            r15 = r8
            goto Lb4
        Lb3:
            r15 = r10
        Lb4:
            java.lang.String r8 = "centerX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            r11 = 3
            if (r8 == 0) goto Lc2
            float r8 = r4.getFloat(r11, r10)
            goto Lc3
        Lc2:
            r8 = r10
        Lc3:
            java.lang.String r9 = "centerY"
            java.lang.String r9 = r2.getAttributeValue(r7, r9)
            if (r9 == 0) goto Ld1
            r9 = 4
            float r9 = r4.getFloat(r9, r10)
            goto Ld2
        Ld1:
            r9 = r10
        Ld2:
            java.lang.String r11 = "type"
            java.lang.String r11 = r2.getAttributeValue(r7, r11)
            r10 = 0
            if (r11 == 0) goto Le0
            int r11 = r4.getInt(r6, r10)
            goto Le1
        Le0:
            r11 = r10
        Le1:
            java.lang.String r6 = "startColor"
            java.lang.String r6 = r2.getAttributeValue(r7, r6)
            if (r6 == 0) goto Lee
            int r6 = r4.getColor(r10, r10)
            goto Lef
        Lee:
            r6 = r10
        Lef:
            java.lang.String r5 = "centerColor"
            java.lang.String r20 = r2.getAttributeValue(r7, r5)
            if (r20 == 0) goto Lfa
            r20 = 1
            goto Lfc
        Lfa:
            r20 = r10
        Lfc:
            java.lang.String r5 = r2.getAttributeValue(r7, r5)
            if (r5 == 0) goto L108
            r5 = 7
            int r5 = r4.getColor(r5, r10)
            goto L109
        L108:
            r5 = r10
        L109:
            java.lang.String r10 = "endColor"
            java.lang.String r10 = r2.getAttributeValue(r7, r10)
            if (r10 == 0) goto L11c
            r21 = r12
            r10 = 0
            r12 = 1
            int r23 = r4.getColor(r12, r10)
            r12 = r23
            goto L120
        L11c:
            r21 = r12
            r10 = 0
            r12 = r10
        L120:
            java.lang.String r10 = "tileMode"
            java.lang.String r10 = r2.getAttributeValue(r7, r10)
            if (r10 == 0) goto L131
            r10 = 6
            r22 = r13
            r13 = 0
            int r10 = r4.getInt(r10, r13)
            goto L134
        L131:
            r22 = r13
            r10 = 0
        L134:
            java.lang.String r13 = "gradientRadius"
            java.lang.String r7 = r2.getAttributeValue(r7, r13)
            if (r7 == 0) goto L144
            r7 = 5
            r13 = 0
            float r7 = r4.getFloat(r7, r13)
            r13 = r7
            goto L145
        L144:
            r13 = 0
        L145:
            r4.recycle()
            int r4 = r2.getDepth()
            r7 = 1
            int r4 = r4 + r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r24 = r2
            r2 = 20
            r7.<init>(r2)
            r25 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
        L15e:
            int r2 = r24.next()
            r26 = r14
            r14 = 1
            if (r2 == r14) goto L1d4
            int r14 = r24.getDepth()
            r27 = r15
            if (r14 >= r4) goto L172
            r15 = 3
            if (r2 == r15) goto L1d6
        L172:
            r15 = 2
            if (r2 == r15) goto L17a
        L175:
            r14 = r26
            r15 = r27
            goto L15e
        L17a:
            if (r14 > r4) goto L175
            java.lang.String r2 = r24.getName()
            java.lang.String r14 = "item"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L189
            goto L175
        L189:
            int[] r2 = j1.AbstractC1154a.f13737e
            android.content.res.TypedArray r2 = m1.b.g(r0, r1, r3, r2)
            r14 = 0
            boolean r15 = r2.hasValue(r14)
            r14 = 1
            boolean r19 = r2.hasValue(r14)
            if (r15 == 0) goto L1b9
            if (r19 == 0) goto L1b9
            r15 = 0
            int r28 = r2.getColor(r15, r15)
            r15 = 0
            float r29 = r2.getFloat(r14, r15)
            r2.recycle()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r13.add(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r29)
            r7.add(r2)
            goto L175
        L1b9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r24.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1d4:
            r27 = r15
        L1d6:
            int r0 = r13.size()
            if (r0 <= 0) goto L1e2
            C0.n0 r0 = new C0.n0
            r0.<init>(r13, r7)
            goto L1e3
        L1e2:
            r0 = 0
        L1e3:
            if (r0 == 0) goto L1e7
        L1e5:
            r14 = 1
            goto L1f5
        L1e7:
            if (r20 == 0) goto L1ef
            C0.n0 r0 = new C0.n0
            r0.<init>(r6, r5, r12)
            goto L1e5
        L1ef:
            C0.n0 r0 = new C0.n0
            r0.<init>(r6, r12)
            goto L1e5
        L1f5:
            if (r11 == r14) goto L229
            r15 = 2
            if (r11 == r15) goto L21f
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            int[] r1 = r0.f1067a
            float[] r0 = r0.f1068b
            if (r10 == r14) goto L218
            if (r10 == r15) goto L215
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
        L206:
            r17 = r0
            r16 = r1
            r18 = r2
            r12 = r21
            r13 = r22
            r14 = r26
            r15 = r27
            goto L21b
        L215:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L206
        L218:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            goto L206
        L21b:
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L255
        L21f:
            android.graphics.SweepGradient r11 = new android.graphics.SweepGradient
            int[] r1 = r0.f1067a
            float[] r0 = r0.f1068b
            r11.<init>(r8, r9, r1, r0)
            goto L255
        L229:
            r17 = 0
            int r1 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r1 <= 0) goto L25d
            android.graphics.RadialGradient r16 = new android.graphics.RadialGradient
            int[] r1 = r0.f1067a
            float[] r0 = r0.f1068b
            r14 = 1
            if (r10 == r14) goto L24d
            r15 = 2
            if (r10 == r15) goto L24a
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
        L23d:
            r21 = r0
            r20 = r1
            r22 = r2
            r17 = r8
            r18 = r9
            r19 = r25
            goto L250
        L24a:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L23d
        L24d:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            goto L23d
        L250:
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r11 = r16
        L255:
            E.Y r0 = new E.Y
            r1 = 0
            r13 = 0
            r0.<init>(r11, r1, r13)
            return r0
        L25d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L265:
            r24 = r2
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r24.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L285:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.Y.d(android.content.res.Resources, int, android.content.res.Resources$Theme):E.Y");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z5 = false;
        while (i <= length) {
            boolean z6 = kotlin.jvm.internal.m.f(str.charAt(!z5 ? i : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                } else {
                    length--;
                }
            } else if (z6) {
                i++;
            } else {
                z5 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e7) {
            Log.w("SupportSQLite", "delete failed: ", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(Y y6, int i, int i7, int i8, int i9, int i10, int i11) {
        long[] jArr = (long[]) y6.f1520c;
        int i12 = y6.f1519b;
        int i13 = i12 + 3;
        y6.f1519b = i13;
        int length = jArr.length;
        if (length <= i13) {
            int iMax = Math.max(length * 2, i13);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            y6.f1520c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) y6.f1521d, iMax);
            kotlin.jvm.internal.m.d(jArrCopyOf2, "copyOf(...)");
            y6.f1521d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) y6.f1520c;
        jArr2[i12] = (((long) i7) << 32) | (((long) i8) & 4294967295L);
        jArr2[i12 + 1] = (((long) i10) & 4294967295L) | (((long) i9) << 32);
        int i14 = i11 & 67108863;
        jArr2[i12 + 2] = (((long) 0) << 63) | (((long) 0) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i14) << 26) | ((long) (i & 67108863));
        if (i11 < 0) {
            return;
        }
        for (int i15 = i12 - 3; i15 >= 0; i15 -= 3) {
            int i16 = i15 + 2;
            long j = jArr2[i16];
            if ((((int) j) & 67108863) == i14) {
                jArr2[i16] = (j & (-2301339409586323457L)) | (((long) ((i12 - i15) & 511)) << 52);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(int i, InterfaceC0134q interfaceC0134q) {
        if (i < 0) {
            AbstractC1923a.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        C0126i c0126i = new C0126i(this.f1519b, i, interfaceC0134q);
        this.f1519b += i;
        ((R.e) this.f1520c).c(c0126i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        d6.h hVar;
        ImageView imageView = (ImageView) this.f1520c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1313j0.a(drawable);
        }
        if (drawable == null || (hVar = (d6.h) this.f1521d) == null) {
            return;
        }
        C1328r.e(drawable, hVar, imageView.getDrawableState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H4.m c() {
        H4.e eVar = (H4.e) this.f1521d;
        if (eVar != null) {
            throw eVar.a();
        }
        H4.m mVarA = H4.m.a(this.f1519b, (Object[]) this.f1520c, this);
        H4.e eVar2 = (H4.e) this.f1521d;
        if (eVar2 == null) {
            return mVarA;
        }
        throw eVar2.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0126i f(int i) {
        if (i < 0 || i >= this.f1519b) {
            StringBuilder sbL = k1.i.l("Index ", ", size ", i);
            sbL.append(this.f1519b);
            AbstractC1923a.d(sbL.toString());
        }
        C0126i c0126i = (C0126i) this.f1521d;
        if (c0126i != null) {
            int i7 = c0126i.f1567a;
            if (i < c0126i.f1568b + i7 && i7 <= i) {
                return c0126i;
            }
        }
        R.e eVar = (R.e) this.f1520c;
        C0126i c0126i2 = (C0126i) eVar.f6676q[C.e(i, eVar)];
        this.f1521d = c0126i2;
        return c0126i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int g(Object obj) {
        C1543B c1543b = (C1543B) this.f1520c;
        int iD = c1543b.d(obj);
        if (iD >= 0) {
            return c1543b.f16111c[iD];
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object h(int i) {
        Object[] objArr = (Object[]) this.f1521d;
        int i7 = i - this.f1519b;
        if (i7 < 0) {
            return null;
        }
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (i7 <= objArr.length - 1) {
            return objArr[i7];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String i() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f1519b + 1;
        for (int i7 = 0; i7 < i; i7++) {
            Object obj = ((Object[]) this.f1520c)[i7];
            if (obj instanceof X5.f) {
                X5.f fVar = (X5.f) obj;
                if (!kotlin.jvm.internal.m.a(fVar.c(), X5.i.f8195d)) {
                    int i8 = ((int[]) this.f1521d)[i7];
                    if (i8 >= 0) {
                        sb.append(".");
                        sb.append(fVar.e(i8));
                    }
                } else if (((int[]) this.f1521d)[i7] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f1521d)[i7]);
                    sb.append("]");
                }
            } else if (obj != b6.f.f10025a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean k() {
        ColorStateList colorStateList;
        return ((Shader) this.f1520c) == null && (colorStateList = (ColorStateList) this.f1521d) != null && colorStateList.isStateful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1520c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1066a.f;
        G0 g0N = G0.N(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        AbstractC1835K.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) g0N.f235s, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0597a.C(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1313j0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(g0N.w(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1313j0.b(typedArray.getInt(3, -1), null));
            }
            g0N.R();
        } catch (Throwable th) {
            g0N.R();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public void m(InterfaceC1155a interfaceC1155a) throws IOException {
        androidx.room.x xVar = (androidx.room.x) this.f1521d;
        C1178b c1178b = (C1178b) interfaceC1155a;
        Cursor cursorV = c1178b.V("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z5 = false;
            if (cursorV.moveToFirst()) {
                if (cursorV.getInt(0) == 0) {
                    z5 = true;
                }
            }
            cursorV.close();
            xVar.createAllTables(interfaceC1155a);
            if (!z5) {
                androidx.room.y yVarOnValidateSchema = xVar.onValidateSchema(interfaceC1155a);
                if (!yVarOnValidateSchema.f9782a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + yVarOnValidateSchema.f9783b);
                }
            }
            c1178b.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c1178b.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            xVar.onCreate(interfaceC1155a);
        } finally {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(j2.InterfaceC1155a r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1521d
            androidx.room.x r0 = (androidx.room.x) r0
            r1 = r7
            k2.b r1 = (k2.C1178b) r1
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r2 = r1.V(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            if (r3 == 0) goto L1f
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1f
            r3 = 1
            goto L20
        L1c:
            r7 = move-exception
            goto L96
        L1f:
            r3 = r4
        L20:
            r2.close()
            r2 = 0
            if (r3 == 0) goto L65
            Z.m r3 = new Z.m
            java.lang.String r5 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r3.<init>(r5)
            android.database.Cursor r1 = r1.P(r3)
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L3e
            java.lang.String r3 = r1.getString(r4)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r7 = move-exception
            goto L5f
        L3e:
            r3 = r2
        L3f:
            r1.close()
            java.lang.String r1 = "86254750241babac4b8d52996a675549"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7a
            java.lang.String r1 = "1cbd3130fa23b59692c061c594c16cc0"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L53
            goto L7a
        L53:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: "
            java.lang.String r0 = C0.S.w(r0, r3)
            r7.<init>(r0)
            throw r7
        L5f:
            throw r7     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r1, r7)
            throw r0
        L65:
            androidx.room.y r3 = r0.onValidateSchema(r7)
            boolean r4 = r3.f9782a
            if (r4 == 0) goto L80
            r0.onPostMigrate(r7)
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r1.l(r3)
            java.lang.String r3 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')"
            r1.l(r3)
        L7a:
            r0.onOpen(r7)
            r6.f1520c = r2
            return
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.String r1 = r3.f9783b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r2, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.Y.n(j2.a):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0083 A[EDGE_INSN: B:70:0x0083->B:37:0x0083 BREAK  A[LOOP:1: B:12:0x0022->B:73:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(j2.InterfaceC1155a r13, int r14, int r15) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f1521d
            androidx.room.x r0 = (androidx.room.x) r0
            java.lang.Object r1 = r12.f1520c
            androidx.room.h r1 = (androidx.room.h) r1
            if (r1 == 0) goto Lcf
            D2.o r1 = r1.f9737d
            r1.getClass()
            if (r14 != r15) goto L15
            n5.s r1 = n5.s.f15299q
            goto L86
        L15:
            r2 = 0
            r3 = 1
            if (r15 <= r14) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r2
        L1c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r14
        L22:
            if (r4 == 0) goto L27
            if (r6 >= r15) goto L85
            goto L29
        L27:
            if (r6 <= r15) goto L85
        L29:
            java.util.LinkedHashMap r7 = r1.f1433a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r7.get(r8)
            java.util.TreeMap r7 = (java.util.TreeMap) r7
            if (r7 != 0) goto L38
            goto L83
        L38:
            if (r4 == 0) goto L3f
            java.util.NavigableSet r8 = r7.descendingKeySet()
            goto L43
        L3f:
            java.util.Set r8 = r7.keySet()
        L43:
            java.util.Iterator r8 = r8.iterator()
        L47:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L80
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r10 = "targetVersion"
            if (r4 == 0) goto L65
            int r11 = r6 + 1
            kotlin.jvm.internal.m.d(r9, r10)
            int r10 = r9.intValue()
            if (r11 > r10) goto L47
            if (r10 > r15) goto L47
            goto L70
        L65:
            kotlin.jvm.internal.m.d(r9, r10)
            int r10 = r9.intValue()
            if (r15 > r10) goto L47
            if (r10 >= r6) goto L47
        L70:
            java.lang.Object r6 = r7.get(r9)
            kotlin.jvm.internal.m.b(r6)
            r5.add(r6)
            int r6 = r9.intValue()
            r7 = r3
            goto L81
        L80:
            r7 = r2
        L81:
            if (r7 != 0) goto L22
        L83:
            r1 = 0
            goto L86
        L85:
            r1 = r5
        L86:
            if (r1 == 0) goto Lcf
            r0.onPreMigrate(r13)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r14 = r1.iterator()
        L91:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto La1
            java.lang.Object r15 = r14.next()
            e2.b r15 = (e2.AbstractC1037b) r15
            r15.migrate(r13)
            goto L91
        La1:
            androidx.room.y r14 = r0.onValidateSchema(r13)
            boolean r15 = r14.f9782a
            if (r15 == 0) goto Lb9
            r0.onPostMigrate(r13)
            k2.b r13 = (k2.C1178b) r13
            java.lang.String r14 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r13.l(r14)
            java.lang.String r14 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')"
            r13.l(r14)
            return
        Lb9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Migration didn't properly handle: "
            r15.<init>(r0)
            java.lang.String r14 = r14.f9783b
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            r13.<init>(r14)
            throw r13
        Lcf:
            java.lang.Object r1 = r12.f1520c
            androidx.room.h r1 = (androidx.room.h) r1
            if (r1 == 0) goto Lf5
            if (r14 <= r15) goto Ldc
            boolean r2 = r1.f9741k
            if (r2 == 0) goto Ldc
            goto Lee
        Ldc:
            boolean r2 = r1.j
            if (r2 == 0) goto Lee
            java.util.Set r1 = r1.f9742l
            if (r1 == 0) goto Lf5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Lf5
        Lee:
            r0.dropAllTables(r13)
            r0.createAllTables(r13)
            return
        Lf5:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A migration from "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = " to "
            r0.append(r14)
            r0.append(r15)
            java.lang.String r14 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: E.Y.o(j2.a, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p(Object obj, Object obj2) {
        int i = (this.f1519b + 1) * 2;
        Object[] objArr = (Object[]) this.f1520c;
        if (i > objArr.length) {
            this.f1520c = Arrays.copyOf(objArr, AbstractC1918b.n(objArr.length, i));
        }
        l6.d.j(obj, obj2);
        Object[] objArr2 = (Object[]) this.f1520c;
        int i7 = this.f1519b;
        int i8 = i7 * 2;
        objArr2[i8] = obj;
        objArr2[i8 + 1] = obj2;
        this.f1519b = i7 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.f1519b) * 2;
            Object[] objArr = (Object[]) this.f1520c;
            if (size > objArr.length) {
                this.f1520c = Arrays.copyOf(objArr, AbstractC1918b.n(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            p(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r() {
        int i = this.f1519b * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f1520c, i);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        this.f1520c = objArrCopyOf;
        int[] iArr = new int[i];
        for (int i7 = 0; i7 < i; i7++) {
            iArr[i7] = -1;
        }
        n5.k.F0(0, 0, 14, (int[]) this.f1521d, iArr);
        this.f1521d = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(int i, B5.g gVar) {
        int i7 = i & 67108863;
        long[] jArr = (long[]) this.f1520c;
        int i8 = this.f1519b;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            if ((((int) jArr[i9 + 2]) & 67108863) == i7) {
                long j = jArr[i9];
                long j7 = jArr[i9 + 1];
                gVar.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f1518a) {
            case 6:
                return i();
            case 7:
                StringBuilder sb = new StringBuilder();
                if (((d6.r) this.f1520c) == d6.r.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1519b);
                sb.append(' ');
                sb.append((String) this.f1521d);
                String string = sb.toString();
                kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Y(d6.r rVar, int i, String str) {
        this.f1518a = 7;
        this.f1520c = rVar;
        this.f1519b = i;
        this.f1521d = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(androidx.room.h configuration, androidx.room.x xVar) {
        this(xVar.version, 5);
        this.f1518a = 5;
        kotlin.jvm.internal.m.e(configuration, "configuration");
        this.f1520c = configuration;
        this.f1521d = xVar;
    }

    public Y(ImageView imageView) {
        this.f1518a = 8;
        this.f1519b = 0;
        this.f1520c = imageView;
    }

    public Y(G5.d dVar, C c7) {
        this.f1518a = 1;
        Y yK = c7.k();
        int i = dVar.f2017q;
        if (i < 0) {
            AbstractC1923a.c("negative nearestRange.first");
        }
        int iMin = Math.min(dVar.f2018r, yK.f1519b - 1);
        if (iMin < i) {
            C1543B c1543b = r.L.f16158a;
            kotlin.jvm.internal.m.c(c1543b, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f1520c = c1543b;
            this.f1521d = new Object[0];
            this.f1519b = 0;
            return;
        }
        int i7 = (iMin - i) + 1;
        this.f1521d = new Object[i7];
        this.f1519b = i;
        C1543B c1543b2 = new C1543B(i7);
        Z z5 = new Z(i, iMin, c1543b2, this);
        R.e eVar = (R.e) yK.f1520c;
        if (i < 0 || i >= yK.f1519b) {
            StringBuilder sbL = k1.i.l("Index ", ", size ", i);
            sbL.append(yK.f1519b);
            AbstractC1923a.d(sbL.toString());
        }
        if (iMin < 0 || iMin >= yK.f1519b) {
            StringBuilder sbL2 = k1.i.l("Index ", ", size ", iMin);
            sbL2.append(yK.f1519b);
            AbstractC1923a.d(sbL2.toString());
        }
        if (iMin < i) {
            AbstractC1923a.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iE = C.e(i, eVar);
        int i8 = ((C0126i) eVar.f6676q[iE]).f1567a;
        while (i8 <= iMin) {
            C0126i c0126i = (C0126i) eVar.f6676q[iE];
            z5.invoke(c0126i);
            i8 += c0126i.f1568b;
            iE++;
        }
        this.f1520c = c1543b2;
    }

    public Y(Shader shader, ColorStateList colorStateList, int i) {
        this.f1518a = 9;
        this.f1520c = shader;
        this.f1521d = colorStateList;
        this.f1519b = i;
    }

    public Y() {
        this.f1518a = 0;
        this.f1520c = new R.e(new C0126i[16]);
    }

    public Y(int i, int i7) {
        this.f1518a = i7;
        switch (i7) {
            case 5:
                this.f1519b = i;
                break;
            default:
                this.f1520c = new Object[i * 2];
                this.f1519b = 0;
                break;
        }
    }
}
