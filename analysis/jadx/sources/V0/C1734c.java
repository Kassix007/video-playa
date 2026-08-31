package v0;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: v0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1734c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseLongArray f17440b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f17441c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17442d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17443e = -1;
    public int f = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Z.m a(C0.A r49, android.view.MotionEvent r50) {
        /*
            r48 = this;
            r0 = r48
            r1 = r49
            r2 = r50
            int r3 = r2.getActionMasked()
            android.util.SparseLongArray r4 = r0.f17440b
            android.util.SparseBooleanArray r5 = r0.f17441c
            r6 = 3
            if (r3 == r6) goto L299
            r7 = 4
            if (r3 == r7) goto L299
            int r8 = r2.getPointerCount()
            r9 = 0
            r10 = 1
            if (r8 == r10) goto L1d
            goto L37
        L1d:
            int r8 = r2.getToolType(r9)
            int r11 = r2.getSource()
            int r12 = r0.f17443e
            if (r8 != r12) goto L2d
            int r12 = r0.f
            if (r11 == r12) goto L37
        L2d:
            r0.f17443e = r8
            r0.f = r11
            r5.clear()
            r4.clear()
        L37:
            int r8 = r2.getActionMasked()
            r13 = 9
            if (r8 == 0) goto L5d
            r14 = 5
            if (r8 == r14) goto L5d
            if (r8 == r13) goto L47
        L44:
            r16 = 1
            goto L80
        L47:
            int r8 = r2.getPointerId(r9)
            int r14 = r4.indexOfKey(r8)
            if (r14 >= 0) goto L44
            long r14 = r0.f17439a
            r16 = 1
            long r11 = r14 + r16
            r0.f17439a = r11
            r4.put(r8, r14)
            goto L80
        L5d:
            r16 = 1
            int r8 = r2.getActionIndex()
            int r11 = r2.getPointerId(r8)
            int r12 = r4.indexOfKey(r11)
            if (r12 >= 0) goto L80
            long r14 = r0.f17439a
            long r9 = r14 + r16
            r0.f17439a = r9
            r4.put(r11, r14)
            int r8 = r2.getToolType(r8)
            if (r8 != r6) goto L80
            r8 = 1
            r5.put(r11, r8)
        L80:
            r8 = 10
            if (r3 == r13) goto L8c
            r9 = 7
            if (r3 == r9) goto L8c
            if (r3 != r8) goto L8a
            goto L8c
        L8a:
            r9 = 0
            goto L8d
        L8c:
            r9 = 1
        L8d:
            r10 = 8
            if (r3 != r10) goto L93
            r11 = 1
            goto L94
        L93:
            r11 = 0
        L94:
            if (r9 == 0) goto La3
            int r14 = r2.getActionIndex()
            int r14 = r2.getPointerId(r14)
            r15 = 1
            r5.put(r14, r15)
            goto La4
        La3:
            r15 = 1
        La4:
            r12 = 6
            if (r3 == r15) goto Lb0
            if (r3 == r12) goto Lab
            r3 = -1
            goto Lb1
        Lab:
            int r3 = r2.getActionIndex()
            goto Lb1
        Lb0:
            r3 = 0
        Lb1:
            java.util.ArrayList r15 = r0.f17442d
            r15.clear()
            int r14 = r2.getPointerCount()
            r12 = 0
        Lbb:
            if (r12 >= r14) goto L23a
            if (r9 != 0) goto Lcc
            if (r12 == r3) goto Lcc
            if (r11 == 0) goto Lc9
            int r19 = r2.getButtonState()
            if (r19 == 0) goto Lcc
        Lc9:
            r29 = 1
            goto Lce
        Lcc:
            r29 = 0
        Lce:
            int r13 = r2.getPointerId(r12)
            int r8 = r4.indexOfKey(r13)
            if (r8 < 0) goto Le3
            long r20 = r4.valueAt(r8)
            r39 = r9
            r38 = r11
            r21 = r20
            goto Lf2
        Le3:
            r38 = r11
            long r10 = r0.f17439a
            r39 = r9
            long r8 = r10 + r16
            r0.f17439a = r8
            r4.put(r13, r10)
            r21 = r10
        Lf2:
            float r30 = r2.getPressure(r12)
            float r8 = r2.getX(r12)
            float r9 = r2.getY(r12)
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r10 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            r13 = 32
            long r10 = r10 << r13
            r23 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r23
            long r8 = r8 | r10
            long r36 = i0.C1130b.a(r6, r8)
            if (r12 != 0) goto L138
            float r8 = r2.getRawX()
            float r9 = r2.getRawY()
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r10 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            long r10 = r10 << r13
            long r8 = r8 & r23
            long r8 = r8 | r10
            long r10 = r1.M(r8)
        L133:
            r25 = r8
            r27 = r10
            goto L161
        L138:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r10 < r11) goto L159
            float r8 = t1.AbstractC1614a.a(r2, r12)
            float r9 = t1.AbstractC1614a.q(r2, r12)
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r10 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            long r10 = r10 << r13
            long r8 = r8 & r23
            long r8 = r8 | r10
            long r10 = r1.M(r8)
            goto L133
        L159:
            long r10 = r1.y(r8)
            r27 = r8
            r25 = r10
        L161:
            int r8 = r2.getToolType(r12)
            if (r8 == 0) goto L171
            r9 = 1
            if (r8 == r9) goto L17d
            r9 = 2
            if (r8 == r9) goto L17a
            if (r8 == r6) goto L177
            if (r8 == r7) goto L174
        L171:
            r31 = 0
            goto L17f
        L174:
            r31 = r7
            goto L17f
        L177:
            r31 = r9
            goto L17f
        L17a:
            r31 = r6
            goto L17f
        L17d:
            r31 = 1
        L17f:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = r2.getHistorySize()
            r8.<init>(r9)
            int r9 = r2.getHistorySize()
            r10 = 0
        L18d:
            if (r10 >= r9) goto L1de
            float r11 = r2.getHistoricalX(r12, r10)
            float r32 = r2.getHistoricalY(r12, r10)
            int r33 = java.lang.Float.floatToRawIntBits(r11)
            r34 = 2147483647(0x7fffffff, float:NaN)
            r6 = r33 & r34
            r7 = 2139095040(0x7f800000, float:Infinity)
            if (r6 >= r7) goto L1d1
            int r6 = java.lang.Float.floatToRawIntBits(r32)
            r6 = r6 & r34
            if (r6 >= r7) goto L1d1
            int r6 = java.lang.Float.floatToRawIntBits(r11)
            long r6 = (long) r6
            int r11 = java.lang.Float.floatToRawIntBits(r32)
            r32 = r13
            r40 = r14
            long r13 = (long) r11
            long r6 = r6 << r32
            long r13 = r13 & r23
            long r44 = r6 | r13
            v0.b r41 = new v0.b
            long r42 = r2.getHistoricalEventTime(r10)
            r46 = r44
            r41.<init>(r42, r44, r46)
            r6 = r41
            r8.add(r6)
            goto L1d5
        L1d1:
            r32 = r13
            r40 = r14
        L1d5:
            int r10 = r10 + 1
            r13 = r32
            r14 = r40
            r6 = 3
            r7 = 4
            goto L18d
        L1de:
            r32 = r13
            r40 = r14
            int r6 = r2.getActionMasked()
            r7 = 8
            if (r6 != r7) goto L20b
            r6 = 10
            float r9 = r2.getAxisValue(r6)
            r10 = 9
            float r11 = r2.getAxisValue(r10)
            float r11 = -r11
            r13 = 0
            float r11 = r11 + r13
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r13 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r11)
            long r6 = (long) r9
            long r13 = r13 << r32
            long r6 = r6 & r23
            long r6 = r6 | r13
        L208:
            r34 = r6
            goto L210
        L20b:
            r10 = 9
            r6 = 0
            goto L208
        L210:
            int r6 = r2.getPointerId(r12)
            r7 = 0
            boolean r32 = r5.get(r6, r7)
            v0.n r20 = new v0.n
            long r23 = r2.getEventTime()
            r33 = r8
            r20.<init>(r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r36)
            r6 = r20
            r15.add(r6)
            int r12 = r12 + 1
            r13 = r10
            r11 = r38
            r9 = r39
            r14 = r40
            r6 = 3
            r7 = 4
            r8 = 10
            r10 = 8
            goto Lbb
        L23a:
            int r1 = r2.getActionMasked()
            r8 = 1
            if (r1 == r8) goto L246
            r3 = 6
            if (r1 == r3) goto L246
            r7 = 0
            goto L25b
        L246:
            int r1 = r2.getActionIndex()
            int r1 = r2.getPointerId(r1)
            r7 = 0
            boolean r3 = r5.get(r1, r7)
            if (r3 != 0) goto L25b
            r4.delete(r1)
            r5.delete(r1)
        L25b:
            int r1 = r4.size()
            int r3 = r2.getPointerCount()
            if (r1 <= r3) goto L28e
            int r1 = r4.size()
            r18 = 1
            int r1 = r1 + (-1)
            r3 = -1
        L26e:
            if (r3 >= r1) goto L28e
            int r6 = r4.keyAt(r1)
            int r8 = r2.getPointerCount()
            r9 = r7
        L279:
            if (r9 >= r8) goto L285
            int r10 = r2.getPointerId(r9)
            if (r10 != r6) goto L282
            goto L28b
        L282:
            int r9 = r9 + 1
            goto L279
        L285:
            r4.removeAt(r1)
            r5.delete(r6)
        L28b:
            int r1 = r1 + (-1)
            goto L26e
        L28e:
            Z.m r1 = new Z.m
            r2.getEventTime()
            r3 = 28
            r1.<init>(r3, r15, r2)
            return r1
        L299:
            r4.clear()
            r5.clear()
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1734c.a(C0.A, android.view.MotionEvent):Z.m");
    }
}
