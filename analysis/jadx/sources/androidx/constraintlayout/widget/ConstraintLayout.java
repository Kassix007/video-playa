package androidx.constraintlayout.widget;

import Z.m;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import b1.c;
import d1.C0953d;
import d1.e;
import d1.h;
import g1.AbstractC1073c;
import g1.AbstractC1074d;
import g1.C1075e;
import g1.C1076f;
import g1.n;
import g1.o;
import g1.p;
import g1.r;
import g1.s;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static s f9381F;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public m f9382A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9383B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public HashMap f9384C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final SparseArray f9385D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1076f f9386E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SparseArray f9387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f9388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f9389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9395y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n f9396z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9387q = new SparseArray();
        this.f9388r = new ArrayList(4);
        this.f9389s = new e();
        this.f9390t = 0;
        this.f9391u = 0;
        this.f9392v = Integer.MAX_VALUE;
        this.f9393w = Integer.MAX_VALUE;
        this.f9394x = true;
        this.f9395y = 257;
        this.f9396z = null;
        this.f9382A = null;
        this.f9383B = -1;
        this.f9384C = new HashMap();
        this.f9385D = new SparseArray();
        this.f9386E = new C1076f(this, this);
        e(attributeSet, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static s getSharedValues() {
        if (f9381F == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f9381F = sVar;
        }
        return f9381F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0953d c(View view) {
        if (view == this) {
            return this.f9389s;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1075e) {
            return ((C1075e) view.getLayoutParams()).f12895p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1075e) {
            return ((C1075e) view.getLayoutParams()).f12895p0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1075e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f9388r;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC1073c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i8 = Integer.parseInt(strArrSplit[0]);
                        int i9 = Integer.parseInt(strArrSplit[1]);
                        int i10 = Integer.parseInt(strArrSplit[2]);
                        int i11 = (int) ((i8 / 1080.0f) * width);
                        int i12 = (int) ((i9 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i11;
                        float f7 = i12;
                        float f8 = i11 + ((int) ((i10 / 1080.0f) * width));
                        canvas.drawLine(f, f7, f8, f7, paint);
                        float f9 = i12 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f8, f7, f8, f9, paint);
                        canvas.drawLine(f8, f9, f, f9, paint);
                        canvas.drawLine(f, f9, f, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f7, f8, f9, paint);
                        canvas.drawLine(f, f9, f8, f7, paint);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(AttributeSet attributeSet, int i) {
        e eVar = this.f9389s;
        eVar.f11860f0 = this;
        C1076f c1076f = this.f9386E;
        eVar.f11904u0 = c1076f;
        eVar.f11902s0.f12517h = c1076f;
        this.f9387q.put(getId(), this);
        this.f9396z = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f13026b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 16) {
                    this.f9390t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9390t);
                } else if (index == 17) {
                    this.f9391u = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9391u);
                } else if (index == 14) {
                    this.f9392v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9392v);
                } else if (index == 15) {
                    this.f9393w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9393w);
                } else if (index == 113) {
                    this.f9395y = typedArrayObtainStyledAttributes.getInt(index, this.f9395y);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f9382A = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f9396z = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f9396z = null;
                    }
                    this.f9383B = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f9395y;
        c.f9940q = eVar.W(512);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r13) {
        /*
            r12 = this;
            Z.m r0 = new Z.m
            android.content.Context r1 = r12.getContext()
            r2 = 11
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f8312r = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f8313s = r2
            java.lang.String r2 = "Error parsing resource: "
            java.lang.String r3 = "ConstraintLayoutStates"
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.XmlResourceParser r4 = r4.getXml(r13)
            int r5 = r4.getEventType()     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r6 = 0
        L2b:
            r7 = 1
            if (r5 == r7) goto Lc5
            r8 = 2
            if (r5 == r8) goto L33
            goto La1
        L33:
            java.lang.String r5 = r4.getName()     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            int r9 = r5.hashCode()     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r10 = 4
            r11 = 3
            switch(r9) {
                case -1349929691: goto L6d;
                case 80204913: goto L63;
                case 1382829617: goto L5a;
                case 1657696882: goto L50;
                case 1901439077: goto L41;
                default: goto L40;
            }     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
        L40:
            goto L77
        L41:
            java.lang.String r7 = "Variant"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            r7 = r11
            goto L78
        L4b:
            r1 = move-exception
            goto La6
        L4d:
            r1 = move-exception
            goto Lb6
        L50:
            java.lang.String r7 = "layoutDescription"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            r7 = 0
            goto L78
        L5a:
            java.lang.String r9 = "StateSet"
            boolean r5 = r5.equals(r9)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            goto L78
        L63:
            java.lang.String r7 = "State"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            r7 = r8
            goto L78
        L6d:
            java.lang.String r7 = "ConstraintSet"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            r7 = r10
            goto L78
        L77:
            r7 = -1
        L78:
            if (r7 == r8) goto L92
            if (r7 == r11) goto L83
            if (r7 == r10) goto L7f
            goto La1
        L7f:
            r0.y(r1, r4)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            goto La1
        L83:
            g1.g r5 = new g1.g     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r6 == 0) goto La1
            java.lang.Object r7 = r6.f5382s     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r7.add(r5)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            goto La1
        L92:
            P.Y r5 = new P.Y     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            java.lang.Object r6 = r0.f8312r     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            int r7 = r5.f5380q     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r6.put(r7, r5)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r6 = r5
        La1:
            int r5 = r4.next()     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            goto L2b
        La6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            android.util.Log.e(r3, r13, r1)
            goto Lc5
        Lb6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            android.util.Log.e(r3, r13, r1)
        Lc5:
            r12.f9382A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.f(int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void forceLayout() {
        this.f9394x = true;
        super.forceLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0372  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(d1.e r29, int r30, int r31, int r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            int r3 = android.view.View.MeasureSpec.getMode(r31)
            int r4 = android.view.View.MeasureSpec.getSize(r31)
            int r5 = android.view.View.MeasureSpec.getMode(r32)
            int r6 = android.view.View.MeasureSpec.getSize(r32)
            int r7 = r0.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r0.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r0.getPaddingWidth()
            g1.f r12 = r0.f9386E
            r12.f12907b = r7
            r12.f12908c = r9
            r12.f12909d = r11
            r12.f12910e = r10
            r9 = r31
            r12.f = r9
            r9 = r32
            r12.f12911g = r9
            int r9 = r0.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r13 = r0.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            r14 = 1
            if (r9 > 0) goto L5e
            if (r13 <= 0) goto L55
            goto L5e
        L55:
            int r9 = r0.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L75
        L5e:
            android.content.Context r15 = r0.getContext()
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()
            int r15 = r15.flags
            r16 = 4194304(0x400000, float:5.877472E-39)
            r15 = r15 & r16
            if (r15 == 0) goto L75
            int r15 = r0.getLayoutDirection()
            if (r14 != r15) goto L75
            r9 = r13
        L75:
            int r4 = r4 - r11
            int r6 = r6 - r10
            int r10 = r12.f12910e
            int r11 = r12.f12909d
            int r12 = r0.getChildCount()
            r15 = 1073741824(0x40000000, float:2.0)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r13) goto La6
            if (r3 == 0) goto L97
            if (r3 == r15) goto L8c
            r17 = r8
            goto Lb2
        L8c:
            int r14 = r0.f9392v
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r4)
            r17 = r14
            r14 = 1
            goto Lb2
        L97:
            if (r12 != 0) goto La3
            int r14 = r0.f9390t
            int r14 = java.lang.Math.max(r8, r14)
        L9f:
            r17 = r14
        La1:
            r14 = 2
            goto Lb2
        La3:
            r17 = r8
            goto La1
        La6:
            if (r12 != 0) goto Laf
            int r14 = r0.f9390t
            int r14 = java.lang.Math.max(r8, r14)
            goto L9f
        Laf:
            r17 = r4
            goto La1
        Lb2:
            if (r5 == r13) goto Ld1
            if (r5 == 0) goto Lc4
            if (r5 == r15) goto Lbb
            r13 = r8
        Lb9:
            r12 = 1
            goto Ldc
        Lbb:
            int r12 = r0.f9393w
            int r12 = r12 - r10
            int r12 = java.lang.Math.min(r12, r6)
            r13 = r12
            goto Lb9
        Lc4:
            if (r12 != 0) goto Lcf
            int r12 = r0.f9391u
            int r12 = java.lang.Math.max(r8, r12)
        Lcc:
            r13 = r12
        Lcd:
            r12 = 2
            goto Ldc
        Lcf:
            r13 = r8
            goto Lcd
        Ld1:
            if (r12 != 0) goto Lda
            int r12 = r0.f9391u
            int r12 = java.lang.Math.max(r8, r12)
            goto Lcc
        Lda:
            r13 = r6
            goto Lcd
        Ldc:
            int r15 = r1.q()
            int[] r8 = r1.f11826C
            r19 = r8
            e1.e r8 = r1.f11902s0
            r20 = r10
            r10 = r17
            if (r10 != r15) goto Lf2
            int r15 = r1.k()
            if (r13 == r15) goto Lf4
        Lf2:
            r15 = 1
            goto Lf8
        Lf4:
            r32 = 1
        Lf6:
            r15 = 0
            goto Lfd
        Lf8:
            r8.f12513c = r15
            r32 = r15
            goto Lf6
        Lfd:
            r1.f11848Y = r15
            r1.f11849Z = r15
            r18 = r15
            int r15 = r0.f9392v
            int r15 = r15 - r11
            r19[r18] = r15
            int r15 = r0.f9393w
            int r15 = r15 - r20
            r19[r32] = r15
            r15 = r18
            r1.f11853b0 = r15
            r1.f11855c0 = r15
            r1.M(r14)
            r1.O(r10)
            r1.N(r12)
            r1.L(r13)
            int r10 = r0.f9390t
            int r10 = r10 - r11
            if (r10 >= 0) goto L128
            r1.f11853b0 = r15
            goto L12a
        L128:
            r1.f11853b0 = r10
        L12a:
            int r10 = r0.f9391u
            int r10 = r10 - r20
            if (r10 >= 0) goto L133
            r1.f11855c0 = r15
            goto L135
        L133:
            r1.f11855c0 = r10
        L135:
            r1.f11907x0 = r9
            r1.f11908y0 = r7
            B0.G0 r7 = r1.f11901r0
            java.lang.Object r9 = r7.f235s
            d1.e r9 = (d1.e) r9
            java.lang.Object r10 = r7.f236t
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            g1.f r11 = r1.f11904u0
            java.util.ArrayList r12 = r1.f11900q0
            int r12 = r12.size()
            int r13 = r1.q()
            int r14 = r1.k()
            r15 = 128(0x80, float:1.794E-43)
            boolean r15 = d1.j.c(r2, r15)
            r0 = 64
            if (r15 != 0) goto L166
            boolean r2 = d1.j.c(r2, r0)
            if (r2 == 0) goto L164
            goto L166
        L164:
            r2 = 0
            goto L167
        L166:
            r2 = 1
        L167:
            r17 = 0
            if (r2 == 0) goto L1d2
            r0 = 0
        L16c:
            if (r0 >= r12) goto L1d2
            r21 = r2
            java.util.ArrayList r2 = r1.f11900q0
            java.lang.Object r2 = r2.get(r0)
            d1.d r2 = (d1.C0953d) r2
            r22 = r0
            int[] r0 = r2.f11878p0
            r23 = r0
            r18 = 0
            r0 = r23[r18]
            r24 = r12
            r12 = 3
            if (r0 != r12) goto L18c
            r26 = 1
        L189:
            r25 = 1
            goto L18f
        L18c:
            r26 = 0
            goto L189
        L18f:
            r0 = r23[r25]
            if (r0 != r12) goto L195
            r0 = 1
            goto L196
        L195:
            r0 = 0
        L196:
            if (r26 == 0) goto L1a2
            if (r0 == 0) goto L1a2
            float r0 = r2.f11846W
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L1a2
            r0 = 1
            goto L1a3
        L1a2:
            r0 = 0
        L1a3:
            boolean r12 = r2.x()
            if (r12 == 0) goto L1b0
            if (r0 == 0) goto L1b0
        L1ab:
            r0 = 1073741824(0x40000000, float:2.0)
            r21 = 0
            goto L1d8
        L1b0:
            boolean r12 = r2.y()
            if (r12 == 0) goto L1b9
            if (r0 == 0) goto L1b9
            goto L1ab
        L1b9:
            boolean r0 = r2 instanceof d1.g
            if (r0 == 0) goto L1be
            goto L1ab
        L1be:
            boolean r0 = r2.x()
            if (r0 != 0) goto L1ab
            boolean r0 = r2.y()
            if (r0 == 0) goto L1cb
            goto L1ab
        L1cb:
            int r0 = r22 + 1
            r2 = r21
            r12 = r24
            goto L16c
        L1d2:
            r21 = r2
            r24 = r12
            r0 = 1073741824(0x40000000, float:2.0)
        L1d8:
            if (r3 != r0) goto L1dc
            if (r5 == r0) goto L1de
        L1dc:
            if (r15 == 0) goto L1e0
        L1de:
            r0 = 1
            goto L1e1
        L1e0:
            r0 = 0
        L1e1:
            r0 = r21 & r0
            if (r0 == 0) goto L450
            r18 = 0
            r12 = r19[r18]
            int r4 = java.lang.Math.min(r12, r4)
            r12 = 1
            r2 = r19[r12]
            int r2 = java.lang.Math.min(r2, r6)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 != r6) goto L207
            int r6 = r1.q()
            if (r6 == r4) goto L205
            r1.O(r4)
            e1.e r4 = r1.f11902s0
            r4.f12512b = r12
        L205:
            r6 = 1073741824(0x40000000, float:2.0)
        L207:
            if (r5 != r6) goto L216
            int r4 = r1.k()
            if (r4 == r2) goto L216
            r1.L(r2)
            e1.e r2 = r1.f11902s0
            r2.f12512b = r12
        L216:
            if (r3 != r6) goto L3af
            if (r5 != r6) goto L3af
            java.io.Serializable r2 = r8.f
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r8.f12514d
            d1.e r4 = (d1.e) r4
            boolean r6 = r8.f12512b
            if (r6 != 0) goto L22f
            boolean r6 = r8.f12513c
            if (r6 == 0) goto L22b
            goto L22f
        L22b:
            r19 = r0
            r6 = 0
            goto L26f
        L22f:
            java.util.ArrayList r6 = r4.f11900q0
            int r12 = r6.size()
            r19 = r0
            r0 = 0
        L238:
            if (r0 >= r12) goto L25d
            java.lang.Object r22 = r6.get(r0)
            int r0 = r0 + 1
            r23 = r0
            r0 = r22
            d1.d r0 = (d1.C0953d) r0
            r0.h()
            r22 = r6
            r6 = 0
            r0.f11850a = r6
            e1.k r6 = r0.f11856d
            r6.n()
            e1.m r0 = r0.f11858e
            r0.m()
            r6 = r22
            r0 = r23
            goto L238
        L25d:
            r4.h()
            r6 = 0
            r4.f11850a = r6
            e1.k r0 = r4.f11856d
            r0.n()
            e1.m r0 = r4.f11858e
            r0.m()
            r8.f12513c = r6
        L26f:
            java.lang.Object r0 = r8.f12515e
            d1.e r0 = (d1.e) r0
            r8.b(r0)
            r4.f11848Y = r6
            int[] r0 = r4.f11878p0
            r4.f11849Z = r6
            int r12 = r4.j(r6)
            r22 = r0
            r6 = 1
            int r0 = r4.j(r6)
            boolean r6 = r8.f12512b
            if (r6 == 0) goto L28e
            r8.c()
        L28e:
            int r6 = r4.r()
            r23 = r11
            int r11 = r4.s()
            r25 = r10
            e1.k r10 = r4.f11856d
            e1.f r10 = r10.f12545h
            r10.d(r6)
            e1.m r10 = r4.f11858e
            e1.f r10 = r10.f12545h
            r10.d(r11)
            r8.g()
            r10 = 2
            if (r12 == r10) goto L2b7
            if (r0 != r10) goto L2b1
            goto L2b7
        L2b1:
            r26 = r6
        L2b3:
            r6 = 1
        L2b4:
            r18 = 0
            goto L30c
        L2b7:
            if (r15 == 0) goto L2d2
            int r10 = r2.size()
            r26 = r6
            r6 = 0
        L2c0:
            if (r6 >= r10) goto L2d4
            java.lang.Object r27 = r2.get(r6)
            int r6 = r6 + 1
            e1.o r27 = (e1.AbstractC1035o) r27
            boolean r27 = r27.k()
            if (r27 != 0) goto L2c0
            r15 = 0
            goto L2d4
        L2d2:
            r26 = r6
        L2d4:
            if (r15 == 0) goto L2f0
            r10 = 2
            if (r12 != r10) goto L2f0
            r6 = 1
            r4.M(r6)
            r6 = 0
            int r10 = r8.d(r4, r6)
            r4.O(r10)
            e1.k r6 = r4.f11856d
            e1.g r6 = r6.f12543e
            int r10 = r4.q()
            r6.d(r10)
        L2f0:
            if (r15 == 0) goto L2b3
            r10 = 2
            if (r0 != r10) goto L2b3
            r6 = 1
            r4.N(r6)
            int r10 = r8.d(r4, r6)
            r4.L(r10)
            e1.m r10 = r4.f11858e
            e1.g r10 = r10.f12543e
            int r15 = r4.k()
            r10.d(r15)
            goto L2b4
        L30c:
            r10 = r22[r18]
            if (r10 == r6) goto L316
            r6 = 4
            if (r10 != r6) goto L314
            goto L316
        L314:
            r6 = 0
            goto L34f
        L316:
            int r6 = r4.q()
            int r6 = r6 + r26
            e1.k r10 = r4.f11856d
            e1.f r10 = r10.i
            r10.d(r6)
            e1.k r10 = r4.f11856d
            e1.g r10 = r10.f12543e
            int r6 = r6 - r26
            r10.d(r6)
            r8.g()
            r6 = 1
            r10 = r22[r6]
            if (r10 == r6) goto L337
            r6 = 4
            if (r10 != r6) goto L34b
        L337:
            int r6 = r4.k()
            int r6 = r6 + r11
            e1.m r10 = r4.f11858e
            e1.f r10 = r10.i
            r10.d(r6)
            e1.m r10 = r4.f11858e
            e1.g r10 = r10.f12543e
            int r6 = r6 - r11
            r10.d(r6)
        L34b:
            r8.g()
            r6 = 1
        L34f:
            int r8 = r2.size()
            r10 = 0
        L354:
            if (r10 >= r8) goto L36b
            java.lang.Object r11 = r2.get(r10)
            int r10 = r10 + 1
            e1.o r11 = (e1.AbstractC1035o) r11
            d1.d r15 = r11.f12540b
            if (r15 != r4) goto L367
            boolean r15 = r11.f12544g
            if (r15 != 0) goto L367
            goto L354
        L367:
            r11.e()
            goto L354
        L36b:
            int r8 = r2.size()
            r10 = 0
        L370:
            if (r10 >= r8) goto L3a3
            java.lang.Object r11 = r2.get(r10)
            int r10 = r10 + 1
            e1.o r11 = (e1.AbstractC1035o) r11
            if (r6 != 0) goto L381
            d1.d r15 = r11.f12540b
            if (r15 != r4) goto L381
            goto L370
        L381:
            e1.f r15 = r11.f12545h
            boolean r15 = r15.j
            if (r15 != 0) goto L389
        L387:
            r2 = 0
            goto L3a4
        L389:
            e1.f r15 = r11.i
            boolean r15 = r15.j
            if (r15 != 0) goto L394
            boolean r15 = r11 instanceof e1.C1029i
            if (r15 != 0) goto L394
            goto L387
        L394:
            e1.g r15 = r11.f12543e
            boolean r15 = r15.j
            if (r15 != 0) goto L370
            boolean r15 = r11 instanceof e1.C1023c
            if (r15 != 0) goto L370
            boolean r11 = r11 instanceof e1.C1029i
            if (r11 != 0) goto L370
            goto L387
        L3a3:
            r2 = 1
        L3a4:
            r4.M(r12)
            r4.N(r0)
            r0 = 2
            r6 = 1073741824(0x40000000, float:2.0)
            goto L440
        L3af:
            r19 = r0
            r25 = r10
            r23 = r11
            java.lang.Object r0 = r8.f12514d
            d1.e r0 = (d1.e) r0
            boolean r2 = r8.f12512b
            if (r2 == 0) goto L40f
            java.util.ArrayList r2 = r0.f11900q0
            int r4 = r2.size()
            r6 = 0
        L3c4:
            if (r6 >= r4) goto L3ef
            java.lang.Object r10 = r2.get(r6)
            int r6 = r6 + 1
            d1.d r10 = (d1.C0953d) r10
            r10.h()
            r11 = 0
            r10.f11850a = r11
            e1.k r12 = r10.f11856d
            r18 = r2
            e1.g r2 = r12.f12543e
            r2.j = r11
            r12.f12544g = r11
            r12.n()
            e1.m r2 = r10.f11858e
            e1.g r10 = r2.f12543e
            r10.j = r11
            r2.f12544g = r11
            r2.m()
            r2 = r18
            goto L3c4
        L3ef:
            r11 = 0
            r0.h()
            r0.f11850a = r11
            e1.k r2 = r0.f11856d
            e1.g r4 = r2.f12543e
            r4.j = r11
            r2.f12544g = r11
            r2.n()
            e1.m r2 = r0.f11858e
            e1.g r4 = r2.f12543e
            r4.j = r11
            r2.f12544g = r11
            r2.m()
            r8.c()
            goto L410
        L40f:
            r11 = 0
        L410:
            java.lang.Object r2 = r8.f12515e
            d1.e r2 = (d1.e) r2
            r8.b(r2)
            r0.f11848Y = r11
            r0.f11849Z = r11
            e1.k r2 = r0.f11856d
            e1.f r2 = r2.f12545h
            r2.d(r11)
            e1.m r0 = r0.f11858e
            e1.f r0 = r0.f12545h
            r0.d(r11)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 != r6) goto L434
            boolean r0 = r1.T(r11, r15)
            r2 = r0
            r0 = 1
            goto L436
        L434:
            r0 = 0
            r2 = 1
        L436:
            if (r5 != r6) goto L440
            r12 = 1
            boolean r4 = r1.T(r12, r15)
            r2 = r2 & r4
            int r0 = r0 + 1
        L440:
            if (r2 == 0) goto L458
            if (r3 != r6) goto L446
            r3 = 1
            goto L447
        L446:
            r3 = 0
        L447:
            if (r5 != r6) goto L44b
            r4 = 1
            goto L44c
        L44b:
            r4 = 0
        L44c:
            r1.P(r3, r4)
            goto L458
        L450:
            r19 = r0
            r25 = r10
            r23 = r11
            r0 = 0
            r2 = 0
        L458:
            if (r2 == 0) goto L45f
            r10 = 2
            if (r0 == r10) goto L45e
            goto L45f
        L45e:
            return
        L45f:
            int r0 = r1.D0
            if (r24 <= 0) goto L527
            java.util.ArrayList r2 = r1.f11900q0
            int r2 = r2.size()
            r3 = 64
            boolean r3 = r1.W(r3)
            g1.f r4 = r1.f11904u0
            r15 = 0
        L472:
            if (r15 >= r2) goto L501
            java.util.ArrayList r5 = r1.f11900q0
            java.lang.Object r5 = r5.get(r15)
            d1.d r5 = (d1.C0953d) r5
            boolean r6 = r5 instanceof d1.h
            if (r6 == 0) goto L483
        L480:
            r12 = 3
            goto L4fd
        L483:
            boolean r6 = r5 instanceof d1.C0950a
            if (r6 == 0) goto L488
            goto L480
        L488:
            boolean r6 = r5.f11829F
            if (r6 == 0) goto L48d
            goto L480
        L48d:
            if (r3 == 0) goto L4a4
            e1.k r6 = r5.f11856d
            if (r6 == 0) goto L4a4
            e1.m r8 = r5.f11858e
            if (r8 == 0) goto L4a4
            e1.g r6 = r6.f12543e
            boolean r6 = r6.j
            if (r6 == 0) goto L4a4
            e1.g r6 = r8.f12543e
            boolean r6 = r6.j
            if (r6 == 0) goto L4a4
            goto L480
        L4a4:
            r6 = 0
            int r8 = r5.j(r6)
            r6 = 1
            int r10 = r5.j(r6)
            r12 = 3
            if (r8 != r12) goto L4bd
            int r11 = r5.f11880r
            if (r11 == r6) goto L4bd
            if (r10 != r12) goto L4bd
            int r11 = r5.f11881s
            if (r11 == r6) goto L4bd
            r11 = r6
            goto L4be
        L4bd:
            r11 = 0
        L4be:
            if (r11 != 0) goto L4f5
            boolean r12 = r1.W(r6)
            if (r12 == 0) goto L4f5
            boolean r6 = r5 instanceof d1.g
            if (r6 != 0) goto L4f5
            r12 = 3
            if (r8 != r12) goto L4da
            int r6 = r5.f11880r
            if (r6 != 0) goto L4da
            if (r10 == r12) goto L4da
            boolean r6 = r5.x()
            if (r6 != 0) goto L4da
            r11 = 1
        L4da:
            if (r10 != r12) goto L4e9
            int r6 = r5.f11881s
            if (r6 != 0) goto L4e9
            if (r8 == r12) goto L4e9
            boolean r6 = r5.x()
            if (r6 != 0) goto L4e9
            r11 = 1
        L4e9:
            if (r8 == r12) goto L4ed
            if (r10 != r12) goto L4f6
        L4ed:
            float r6 = r5.f11846W
            int r6 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r6 <= 0) goto L4f6
            r11 = 1
            goto L4f6
        L4f5:
            r12 = 3
        L4f6:
            if (r11 == 0) goto L4f9
            goto L4fd
        L4f9:
            r6 = 0
            r7.L(r6, r5, r4)
        L4fd:
            int r15 = r15 + 1
            goto L472
        L501:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r4.f12906a
            int r3 = r2.getChildCount()
            java.util.ArrayList r4 = r2.f9388r
            r15 = 0
        L50a:
            if (r15 >= r3) goto L512
            r2.getChildAt(r15)
            int r15 = r15 + 1
            goto L50a
        L512:
            int r2 = r4.size()
            if (r2 <= 0) goto L527
            r15 = 0
        L519:
            if (r15 >= r2) goto L527
            java.lang.Object r3 = r4.get(r15)
            g1.c r3 = (g1.AbstractC1073c) r3
            r3.getClass()
            int r15 = r15 + 1
            goto L519
        L527:
            r7.b0(r1)
            int r2 = r25.size()
            r6 = 0
            if (r24 <= 0) goto L534
            r7.Y(r1, r6, r13, r14)
        L534:
            if (r2 <= 0) goto L6e5
            int[] r3 = r1.f11878p0
            r4 = r3[r6]
            r10 = 2
            if (r4 != r10) goto L540
            r15 = 1
        L53e:
            r12 = 1
            goto L542
        L540:
            r15 = r6
            goto L53e
        L542:
            r3 = r3[r12]
            if (r3 != r10) goto L548
            r3 = 1
            goto L549
        L548:
            r3 = r6
        L549:
            int r4 = r1.q()
            int r5 = r9.f11853b0
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r1.k()
            int r8 = r9.f11855c0
            int r5 = java.lang.Math.max(r5, r8)
            r8 = r6
            r9 = r8
        L55f:
            if (r8 >= r2) goto L5f4
            r11 = r25
            java.lang.Object r12 = r11.get(r8)
            d1.d r12 = (d1.C0953d) r12
            boolean r6 = r12 instanceof d1.g
            if (r6 != 0) goto L575
            r16 = r3
            r17 = r8
            r3 = r23
            goto L5e9
        L575:
            int r6 = r12.q()
            int r10 = r12.k()
            r16 = r3
            r17 = r8
            r3 = r23
            r8 = 1
            boolean r20 = r7.L(r8, r12, r3)
            r8 = r9 | r20
            int r9 = r12.q()
            r20 = r8
            int r8 = r12.k()
            if (r9 == r6) goto L5bb
            r12.O(r9)
            if (r15 == 0) goto L5b9
            int r6 = r12.r()
            int r9 = r12.f11844U
            int r6 = r6 + r9
            if (r6 <= r4) goto L5b9
            int r6 = r12.r()
            int r9 = r12.f11844U
            int r6 = r6 + r9
            r9 = 4
            d1.c r20 = r12.i(r9)
            int r9 = r20.e()
            int r9 = r9 + r6
            int r4 = java.lang.Math.max(r4, r9)
        L5b9:
            r20 = 1
        L5bb:
            if (r8 == r10) goto L5e2
            r12.L(r8)
            if (r16 == 0) goto L5e0
            int r6 = r12.s()
            int r8 = r12.f11845V
            int r6 = r6 + r8
            if (r6 <= r5) goto L5e0
            int r6 = r12.s()
            int r8 = r12.f11845V
            int r6 = r6 + r8
            r8 = 5
            d1.c r8 = r12.i(r8)
            int r8 = r8.e()
            int r8 = r8 + r6
            int r5 = java.lang.Math.max(r5, r8)
        L5e0:
            r20 = 1
        L5e2:
            d1.g r12 = (d1.g) r12
            boolean r6 = r12.f11957y0
            r6 = r20 | r6
            r9 = r6
        L5e9:
            int r8 = r17 + 1
            r23 = r3
            r25 = r11
            r3 = r16
            r6 = 0
            goto L55f
        L5f4:
            r16 = r3
            r11 = r25
            r6 = 0
        L5f9:
            r3 = r23
            r10 = 2
            if (r6 >= r10) goto L6e5
            r8 = 0
        L5ff:
            if (r8 >= r2) goto L6ce
            java.lang.Object r12 = r11.get(r8)
            d1.d r12 = (d1.C0953d) r12
            boolean r10 = r12 instanceof d1.i
            if (r10 == 0) goto L613
            boolean r10 = r12 instanceof d1.g
            if (r10 == 0) goto L610
            goto L613
        L610:
            r17 = r2
            goto L638
        L613:
            boolean r10 = r12 instanceof d1.h
            if (r10 == 0) goto L618
            goto L610
        L618:
            int r10 = r12.f11862g0
            r17 = r2
            r2 = 8
            if (r10 != r2) goto L621
            goto L638
        L621:
            if (r19 == 0) goto L634
            e1.k r2 = r12.f11856d
            e1.g r2 = r2.f12543e
            boolean r2 = r2.j
            if (r2 == 0) goto L634
            e1.m r2 = r12.f11858e
            e1.g r2 = r2.f12543e
            boolean r2 = r2.j
            if (r2 == 0) goto L634
            goto L638
        L634:
            boolean r2 = r12 instanceof d1.g
            if (r2 == 0) goto L642
        L638:
            r23 = r3
            r24 = r6
            r20 = r8
            r3 = 4
            r6 = 5
            goto L6c3
        L642:
            int r2 = r12.q()
            int r10 = r12.k()
            r20 = r8
            int r8 = r12.f11851a0
            r22 = r9
            r9 = 1
            if (r6 != r9) goto L654
            r9 = 2
        L654:
            boolean r9 = r7.L(r9, r12, r3)
            r9 = r22 | r9
            r23 = r3
            int r3 = r12.q()
            r24 = r6
            int r6 = r12.k()
            if (r3 == r2) goto L68f
            r12.O(r3)
            if (r15 == 0) goto L68c
            int r2 = r12.r()
            int r3 = r12.f11844U
            int r2 = r2 + r3
            if (r2 <= r4) goto L68c
            int r2 = r12.r()
            int r3 = r12.f11844U
            int r2 = r2 + r3
            r3 = 4
            d1.c r9 = r12.i(r3)
            int r9 = r9.e()
            int r9 = r9 + r2
            int r4 = java.lang.Math.max(r4, r9)
            goto L68d
        L68c:
            r3 = 4
        L68d:
            r9 = 1
            goto L690
        L68f:
            r3 = 4
        L690:
            if (r6 == r10) goto L6b9
            r12.L(r6)
            if (r16 == 0) goto L6b6
            int r2 = r12.s()
            int r6 = r12.f11845V
            int r2 = r2 + r6
            if (r2 <= r5) goto L6b6
            int r2 = r12.s()
            int r6 = r12.f11845V
            int r2 = r2 + r6
            r6 = 5
            d1.c r9 = r12.i(r6)
            int r9 = r9.e()
            int r9 = r9 + r2
            int r5 = java.lang.Math.max(r5, r9)
            goto L6b7
        L6b6:
            r6 = 5
        L6b7:
            r9 = 1
            goto L6ba
        L6b9:
            r6 = 5
        L6ba:
            boolean r2 = r12.f11828E
            if (r2 == 0) goto L6c3
            int r2 = r12.f11851a0
            if (r8 == r2) goto L6c3
            r9 = 1
        L6c3:
            int r8 = r20 + 1
            r2 = r17
            r3 = r23
            r6 = r24
            r10 = 2
            goto L5ff
        L6ce:
            r17 = r2
            r23 = r3
            r24 = r6
            r22 = r9
            r3 = 4
            r6 = 5
            if (r22 == 0) goto L6e5
            int r2 = r24 + 1
            r7.Y(r1, r2, r13, r14)
            r6 = r2
            r2 = r17
            r9 = 0
            goto L5f9
        L6e5:
            r1.D0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.W(r0)
            b1.c.f9940q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.g(d1.e, int, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1075e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1075e c1075e = new C1075e(context, attributeSet);
        c1075e.f12867a = -1;
        c1075e.f12869b = -1;
        c1075e.f12871c = -1.0f;
        c1075e.f12873d = true;
        c1075e.f12875e = -1;
        c1075e.f = -1;
        c1075e.f12878g = -1;
        c1075e.f12880h = -1;
        c1075e.i = -1;
        c1075e.j = -1;
        c1075e.f12884k = -1;
        c1075e.f12886l = -1;
        c1075e.f12888m = -1;
        c1075e.f12890n = -1;
        c1075e.f12892o = -1;
        c1075e.f12894p = -1;
        c1075e.f12896q = 0;
        c1075e.f12897r = 0.0f;
        c1075e.f12898s = -1;
        c1075e.f12899t = -1;
        c1075e.f12900u = -1;
        c1075e.f12901v = -1;
        c1075e.f12902w = Integer.MIN_VALUE;
        c1075e.f12903x = Integer.MIN_VALUE;
        c1075e.f12904y = Integer.MIN_VALUE;
        c1075e.f12905z = Integer.MIN_VALUE;
        c1075e.f12841A = Integer.MIN_VALUE;
        c1075e.f12842B = Integer.MIN_VALUE;
        c1075e.f12843C = Integer.MIN_VALUE;
        c1075e.f12844D = 0;
        c1075e.f12845E = 0.5f;
        c1075e.f12846F = 0.5f;
        c1075e.f12847G = null;
        c1075e.f12848H = -1.0f;
        c1075e.f12849I = -1.0f;
        c1075e.f12850J = 0;
        c1075e.f12851K = 0;
        c1075e.f12852L = 0;
        c1075e.f12853M = 0;
        c1075e.f12854N = 0;
        c1075e.f12855O = 0;
        c1075e.f12856P = 0;
        c1075e.f12857Q = 0;
        c1075e.f12858R = 1.0f;
        c1075e.f12859S = 1.0f;
        c1075e.f12860T = -1;
        c1075e.f12861U = -1;
        c1075e.f12862V = -1;
        c1075e.f12863W = false;
        c1075e.f12864X = false;
        c1075e.f12865Y = null;
        c1075e.f12866Z = 0;
        c1075e.f12868a0 = true;
        c1075e.f12870b0 = true;
        c1075e.f12872c0 = false;
        c1075e.f12874d0 = false;
        c1075e.f12876e0 = false;
        c1075e.f12877f0 = -1;
        c1075e.f12879g0 = -1;
        c1075e.f12881h0 = -1;
        c1075e.f12882i0 = -1;
        c1075e.f12883j0 = Integer.MIN_VALUE;
        c1075e.f12885k0 = Integer.MIN_VALUE;
        c1075e.f12887l0 = 0.5f;
        c1075e.f12895p0 = new C0953d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f13026b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i7 = AbstractC1074d.f12840a.get(index);
            switch (i7) {
                case 1:
                    c1075e.f12862V = typedArrayObtainStyledAttributes.getInt(index, c1075e.f12862V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12894p);
                    c1075e.f12894p = resourceId;
                    if (resourceId == -1) {
                        c1075e.f12894p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c1075e.f12896q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12896q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c1075e.f12897r) % 360.0f;
                    c1075e.f12897r = f;
                    if (f < 0.0f) {
                        c1075e.f12897r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c1075e.f12867a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1075e.f12867a);
                    break;
                case 6:
                    c1075e.f12869b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1075e.f12869b);
                    break;
                case 7:
                    c1075e.f12871c = typedArrayObtainStyledAttributes.getFloat(index, c1075e.f12871c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12875e);
                    c1075e.f12875e = resourceId2;
                    if (resourceId2 == -1) {
                        c1075e.f12875e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f);
                    c1075e.f = resourceId3;
                    if (resourceId3 == -1) {
                        c1075e.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12878g);
                    c1075e.f12878g = resourceId4;
                    if (resourceId4 == -1) {
                        c1075e.f12878g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12880h);
                    c1075e.f12880h = resourceId5;
                    if (resourceId5 == -1) {
                        c1075e.f12880h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.i);
                    c1075e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c1075e.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.j);
                    c1075e.j = resourceId7;
                    if (resourceId7 == -1) {
                        c1075e.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12884k);
                    c1075e.f12884k = resourceId8;
                    if (resourceId8 == -1) {
                        c1075e.f12884k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12886l);
                    c1075e.f12886l = resourceId9;
                    if (resourceId9 == -1) {
                        c1075e.f12886l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case WorkDatabaseVersions.VERSION_16 /* 16 */:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12888m);
                    c1075e.f12888m = resourceId10;
                    if (resourceId10 == -1) {
                        c1075e.f12888m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case WorkDatabaseVersions.VERSION_17 /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12898s);
                    c1075e.f12898s = resourceId11;
                    if (resourceId11 == -1) {
                        c1075e.f12898s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case WorkDatabaseVersions.VERSION_18 /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12899t);
                    c1075e.f12899t = resourceId12;
                    if (resourceId12 == -1) {
                        c1075e.f12899t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case WorkDatabaseVersions.VERSION_19 /* 19 */:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12900u);
                    c1075e.f12900u = resourceId13;
                    if (resourceId13 == -1) {
                        c1075e.f12900u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12901v);
                    c1075e.f12901v = resourceId14;
                    if (resourceId14 == -1) {
                        c1075e.f12901v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case WorkDatabaseVersions.VERSION_21 /* 21 */:
                    c1075e.f12902w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12902w);
                    break;
                case 22:
                    c1075e.f12903x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12903x);
                    break;
                case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                    c1075e.f12904y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12904y);
                    break;
                case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                    c1075e.f12905z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12905z);
                    break;
                case 25:
                    c1075e.f12841A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12841A);
                    break;
                case 26:
                    c1075e.f12842B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12842B);
                    break;
                case 27:
                    c1075e.f12863W = typedArrayObtainStyledAttributes.getBoolean(index, c1075e.f12863W);
                    break;
                case 28:
                    c1075e.f12864X = typedArrayObtainStyledAttributes.getBoolean(index, c1075e.f12864X);
                    break;
                case 29:
                    c1075e.f12845E = typedArrayObtainStyledAttributes.getFloat(index, c1075e.f12845E);
                    break;
                case 30:
                    c1075e.f12846F = typedArrayObtainStyledAttributes.getFloat(index, c1075e.f12846F);
                    break;
                case 31:
                    int i8 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1075e.f12852L = i8;
                    if (i8 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i9 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1075e.f12853M = i9;
                    if (i9 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c1075e.f12854N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12854N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1075e.f12854N) == -2) {
                            c1075e.f12854N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c1075e.f12856P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12856P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1075e.f12856P) == -2) {
                            c1075e.f12856P = -2;
                        }
                    }
                    break;
                case 35:
                    c1075e.f12858R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1075e.f12858R));
                    c1075e.f12852L = 2;
                    break;
                case 36:
                    try {
                        c1075e.f12855O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12855O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1075e.f12855O) == -2) {
                            c1075e.f12855O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c1075e.f12857Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12857Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1075e.f12857Q) == -2) {
                            c1075e.f12857Q = -2;
                        }
                    }
                    break;
                case 38:
                    c1075e.f12859S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1075e.f12859S));
                    c1075e.f12853M = 2;
                    break;
                default:
                    switch (i7) {
                        case 44:
                            n.h(c1075e, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1075e.f12848H = typedArrayObtainStyledAttributes.getFloat(index, c1075e.f12848H);
                            break;
                        case 46:
                            c1075e.f12849I = typedArrayObtainStyledAttributes.getFloat(index, c1075e.f12849I);
                            break;
                        case 47:
                            c1075e.f12850J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1075e.f12851K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1075e.f12860T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1075e.f12860T);
                            break;
                        case Scheduler.MAX_SCHEDULER_LIMIT /* 50 */:
                            c1075e.f12861U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1075e.f12861U);
                            break;
                        case 51:
                            c1075e.f12865Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12890n);
                            c1075e.f12890n = resourceId15;
                            if (resourceId15 == -1) {
                                c1075e.f12890n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1075e.f12892o);
                            c1075e.f12892o = resourceId16;
                            if (resourceId16 == -1) {
                                c1075e.f12892o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c1075e.f12844D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12844D);
                            break;
                        case 55:
                            c1075e.f12843C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1075e.f12843C);
                            break;
                        default:
                            switch (i7) {
                                case 64:
                                    n.g(c1075e, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c1075e, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1075e.f12866Z = typedArrayObtainStyledAttributes.getInt(index, c1075e.f12866Z);
                                    break;
                                case 67:
                                    c1075e.f12873d = typedArrayObtainStyledAttributes.getBoolean(index, c1075e.f12873d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1075e.a();
        return c1075e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxHeight() {
        return this.f9393w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxWidth() {
        return this.f9392v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMinHeight() {
        return this.f9391u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMinWidth() {
        return this.f9390t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getOptimizationLevel() {
        return this.f9389s.D0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f9389s;
        if (eVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.j = "parent";
            }
        }
        if (eVar.f11864h0 == null) {
            eVar.f11864h0 = eVar.j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f11864h0);
        }
        ArrayList arrayList = eVar.f11900q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0953d c0953d = (C0953d) obj;
            View view = c0953d.f11860f0;
            if (view != null) {
                if (c0953d.j == null && (id = view.getId()) != -1) {
                    c0953d.j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0953d.f11864h0 == null) {
                    c0953d.f11864h0 = c0953d.j;
                    Log.v("ConstraintLayout", " setDebugName " + c0953d.f11864h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(C0953d c0953d, C1075e c1075e, SparseArray sparseArray, int i, int i7) {
        View view = (View) this.f9387q.get(i);
        C0953d c0953d2 = (C0953d) sparseArray.get(i);
        if (c0953d2 == null || view == null || !(view.getLayoutParams() instanceof C1075e)) {
            return;
        }
        c1075e.f12872c0 = true;
        if (i7 == 6) {
            C1075e c1075e2 = (C1075e) view.getLayoutParams();
            c1075e2.f12872c0 = true;
            c1075e2.f12895p0.f11828E = true;
        }
        c0953d.i(6).b(c0953d2.i(i7), c1075e.f12844D, c1075e.f12843C, true);
        c0953d.f11828E = true;
        c0953d.i(3).j();
        c0953d.i(5).j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C1075e c1075e = (C1075e) childAt.getLayoutParams();
            C0953d c0953d = c1075e.f12895p0;
            if (childAt.getVisibility() != 8 || c1075e.f12874d0 || c1075e.f12876e0 || zIsInEditMode) {
                int iR = c0953d.r();
                int iS = c0953d.s();
                childAt.layout(iR, iS, c0953d.q() + iR, c0953d.k() + iS);
            }
        }
        ArrayList arrayList = this.f9388r;
        int size = arrayList.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((AbstractC1073c) arrayList.get(i11)).getClass();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0552  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            r6 = r35
            r7 = r36
            boolean r1 = r0.f9394x
            r0.f9394x = r1
            r8 = 1
            r9 = 0
            if (r1 != 0) goto L25
            int r1 = r0.getChildCount()
            r2 = r9
        L13:
            if (r2 >= r1) goto L25
            android.view.View r3 = r0.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L22
            r0.f9394x = r8
            goto L25
        L22:
            int r2 = r2 + 1
            goto L13
        L25:
            android.content.Context r1 = r0.getContext()
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.flags
            r2 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r2
            if (r1 == 0) goto L3c
            int r1 = r0.getLayoutDirection()
            if (r8 != r1) goto L3c
            r1 = r8
            goto L3d
        L3c:
            r1 = r9
        L3d:
            d1.e r10 = r0.f9389s
            r10.f11905v0 = r1
            boolean r1 = r0.f9394x
            if (r1 == 0) goto L5d3
            r0.f9394x = r9
            int r1 = r0.getChildCount()
            r2 = r9
        L4c:
            if (r2 >= r1) goto L5d
            android.view.View r3 = r0.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L5a
            r11 = r8
            goto L5e
        L5a:
            int r2 = r2 + 1
            goto L4c
        L5d:
            r11 = r9
        L5e:
            if (r11 == 0) goto L5ca
            boolean r12 = r0.isInEditMode()
            int r13 = r0.getChildCount()
            r1 = r9
        L69:
            if (r1 >= r13) goto L7c
            android.view.View r2 = r0.getChildAt(r1)
            d1.d r2 = r0.c(r2)
            if (r2 != 0) goto L76
            goto L79
        L76:
            r2.C()
        L79:
            int r1 = r1 + 1
            goto L69
        L7c:
            r1 = 0
            r14 = -1
            if (r12 == 0) goto L10e
            r2 = r9
        L81:
            if (r2 >= r13) goto L10e
            android.view.View r3 = r0.getChildAt(r2)
            android.content.res.Resources r4 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            java.lang.String r4 = r4.getResourceName(r5)     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            if (r4 == 0) goto Lc4
            java.util.HashMap r15 = r0.f9384C     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            if (r15 != 0) goto La8
            java.util.HashMap r15 = new java.util.HashMap     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            r15.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            r0.f9384C = r15     // Catch: android.content.res.Resources.NotFoundException -> Lb9
        La8:
            java.lang.String r15 = "/"
            int r15 = r4.indexOf(r15)     // Catch: android.content.res.Resources.NotFoundException -> Lb9
            if (r15 == r14) goto Lbc
            int r15 = r15 + 1
            java.lang.String r15 = r4.substring(r15)     // Catch: android.content.res.Resources.NotFoundException -> Lb9
        Lb6:
            r16 = r8
            goto Lbe
        Lb9:
            r16 = r8
            goto L108
        Lbc:
            r15 = r4
            goto Lb6
        Lbe:
            java.util.HashMap r8 = r0.f9384C     // Catch: android.content.res.Resources.NotFoundException -> L108
            r8.put(r15, r5)     // Catch: android.content.res.Resources.NotFoundException -> L108
            goto Lc6
        Lc4:
            r16 = r8
        Lc6:
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch: android.content.res.Resources.NotFoundException -> L108
            if (r5 == r14) goto Ld4
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch: android.content.res.Resources.NotFoundException -> L108
        Ld4:
            int r3 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L108
            if (r3 != 0) goto Ldc
        Lda:
            r3 = r10
            goto L106
        Ldc:
            android.util.SparseArray r5 = r0.f9387q     // Catch: android.content.res.Resources.NotFoundException -> L108
            java.lang.Object r5 = r5.get(r3)     // Catch: android.content.res.Resources.NotFoundException -> L108
            android.view.View r5 = (android.view.View) r5     // Catch: android.content.res.Resources.NotFoundException -> L108
            if (r5 != 0) goto Lf7
            android.view.View r5 = r0.findViewById(r3)     // Catch: android.content.res.Resources.NotFoundException -> L108
            if (r5 == 0) goto Lf7
            if (r5 == r0) goto Lf7
            android.view.ViewParent r3 = r5.getParent()     // Catch: android.content.res.Resources.NotFoundException -> L108
            if (r3 != r0) goto Lf7
            r0.onViewAdded(r5)     // Catch: android.content.res.Resources.NotFoundException -> L108
        Lf7:
            if (r5 != r0) goto Lfa
            goto Lda
        Lfa:
            if (r5 != 0) goto Lfe
            r3 = r1
            goto L106
        Lfe:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()     // Catch: android.content.res.Resources.NotFoundException -> L108
            g1.e r3 = (g1.C1075e) r3     // Catch: android.content.res.Resources.NotFoundException -> L108
            d1.d r3 = r3.f12895p0     // Catch: android.content.res.Resources.NotFoundException -> L108
        L106:
            r3.f11864h0 = r4     // Catch: android.content.res.Resources.NotFoundException -> L108
        L108:
            int r2 = r2 + 1
            r8 = r16
            goto L81
        L10e:
            r16 = r8
            int r2 = r0.f9383B
            if (r2 == r14) goto L121
            r2 = r9
        L115:
            if (r2 >= r13) goto L121
            android.view.View r3 = r0.getChildAt(r2)
            r3.getId()
            int r2 = r2 + 1
            goto L115
        L121:
            g1.n r2 = r0.f9396z
            if (r2 == 0) goto L128
            r2.a(r0)
        L128:
            java.util.ArrayList r2 = r10.f11900q0
            r2.clear()
            java.util.ArrayList r2 = r0.f9388r
            int r3 = r2.size()
            if (r3 <= 0) goto L1ec
            r4 = r9
        L136:
            if (r4 >= r3) goto L1ec
            java.lang.Object r5 = r2.get(r4)
            g1.c r5 = (g1.AbstractC1073c) r5
            java.util.HashMap r15 = r5.f12839w
            boolean r17 = r5.isInEditMode()
            if (r17 == 0) goto L14e
            r17 = 2
            java.lang.String r8 = r5.f12837u
            r5.setIds(r8)
            goto L150
        L14e:
            r17 = 2
        L150:
            d1.i r8 = r5.f12836t
            if (r8 != 0) goto L15a
            r20 = r2
            r21 = r3
            goto L1e1
        L15a:
            r8.f11966r0 = r9
            d1.d[] r8 = r8.f11965q0
            java.util.Arrays.fill(r8, r1)
            r8 = r9
        L162:
            int r1 = r5.f12834r
            if (r8 >= r1) goto L1d8
            int[] r1 = r5.f12833q
            r1 = r1[r8]
            android.util.SparseArray r14 = r0.f9387q
            java.lang.Object r14 = r14.get(r1)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L198
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r15.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r9 = r5.f(r0, r1)
            if (r9 == 0) goto L198
            int[] r14 = r5.f12833q
            r14[r8] = r9
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            r15.put(r14, r1)
            android.util.SparseArray r1 = r0.f9387q
            java.lang.Object r1 = r1.get(r9)
            r14 = r1
            android.view.View r14 = (android.view.View) r14
        L198:
            if (r14 == 0) goto L1cb
            d1.i r1 = r5.f12836t
            d1.d r9 = r0.c(r14)
            r1.getClass()
            if (r9 == r1) goto L1cb
            if (r9 != 0) goto L1a8
            goto L1cb
        L1a8:
            int r14 = r1.f11966r0
            int r14 = r14 + 1
            r20 = r2
            d1.d[] r2 = r1.f11965q0
            r21 = r3
            int r3 = r2.length
            if (r14 <= r3) goto L1c0
            int r3 = r2.length
            int r3 = r3 * 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            d1.d[] r2 = (d1.C0953d[]) r2
            r1.f11965q0 = r2
        L1c0:
            d1.d[] r2 = r1.f11965q0
            int r3 = r1.f11966r0
            r2[r3] = r9
            int r3 = r3 + 1
            r1.f11966r0 = r3
            goto L1cf
        L1cb:
            r20 = r2
            r21 = r3
        L1cf:
            int r8 = r8 + 1
            r2 = r20
            r3 = r21
            r9 = 0
            r14 = -1
            goto L162
        L1d8:
            r20 = r2
            r21 = r3
            d1.i r1 = r5.f12836t
            r1.S()
        L1e1:
            int r4 = r4 + 1
            r2 = r20
            r3 = r21
            r1 = 0
            r9 = 0
            r14 = -1
            goto L136
        L1ec:
            r17 = 2
            r1 = 0
        L1ef:
            if (r1 >= r13) goto L1f7
            r0.getChildAt(r1)
            int r1 = r1 + 1
            goto L1ef
        L1f7:
            android.util.SparseArray r3 = r0.f9385D
            r3.clear()
            r1 = 0
            r3.put(r1, r10)
            int r1 = r0.getId()
            r3.put(r1, r10)
            r1 = 0
        L208:
            if (r1 >= r13) goto L21c
            android.view.View r2 = r0.getChildAt(r1)
            d1.d r4 = r0.c(r2)
            int r2 = r2.getId()
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto L208
        L21c:
            r8 = 0
        L21d:
            if (r8 >= r13) goto L5ca
            android.view.View r1 = r0.getChildAt(r8)
            d1.d r2 = r0.c(r1)
            if (r2 != 0) goto L232
        L229:
            r18 = r8
            r29 = r11
            r4 = r17
            r15 = -1
            goto L5c2
        L232:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            g1.e r4 = (g1.C1075e) r4
            java.util.ArrayList r5 = r10.f11900q0
            r5.add(r2)
            d1.d r5 = r2.f11843T
            if (r5 == 0) goto L24b
            d1.e r5 = (d1.e) r5
            java.util.ArrayList r5 = r5.f11900q0
            r5.remove(r2)
            r2.C()
        L24b:
            r2.f11843T = r10
            r4.a()
            int r5 = r1.getVisibility()
            r2.f11862g0 = r5
            r2.f11860f0 = r1
            boolean r5 = r1 instanceof g1.AbstractC1073c
            if (r5 == 0) goto L263
            g1.c r1 = (g1.AbstractC1073c) r1
            boolean r5 = r10.f11905v0
            r1.h(r2, r5)
        L263:
            boolean r1 = r4.f12874d0
            if (r1 == 0) goto L29e
            d1.h r2 = (d1.h) r2
            int r1 = r4.f12889m0
            int r5 = r4.f12891n0
            float r4 = r4.f12893o0
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r14 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r14 == 0) goto L27f
            if (r14 <= 0) goto L229
            r2.f11959q0 = r4
            r4 = -1
            r2.f11960r0 = r4
            r2.f11961s0 = r4
            goto L28a
        L27f:
            r4 = -1
            if (r1 == r4) goto L293
            if (r1 <= r4) goto L28a
            r2.f11959q0 = r9
            r2.f11960r0 = r1
            r2.f11961s0 = r4
        L28a:
            r15 = r4
            r18 = r8
            r29 = r11
            r4 = r17
            goto L5c2
        L293:
            if (r5 == r4) goto L28a
            if (r5 <= r4) goto L28a
            r2.f11959q0 = r9
            r2.f11960r0 = r4
            r2.f11961s0 = r5
            goto L229
        L29e:
            int r1 = r4.f12877f0
            int r5 = r4.f12879g0
            int r9 = r4.f12881h0
            int r14 = r4.f12882i0
            int r15 = r4.f12883j0
            int r0 = r4.f12885k0
            r18 = r8
            float r8 = r4.f12887l0
            r26 = r0
            int r0 = r4.f12894p
            r27 = 4
            r28 = 2
            r29 = r11
            r30 = 5
            r31 = 3
            r11 = -1
            r32 = 0
            if (r0 == r11) goto L2ec
            java.lang.Object r0 = r3.get(r0)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L2de
            float r0 = r4.f12897r
            int r1 = r4.f12896q
            r21 = 7
            r24 = 0
            r22 = r21
            r23 = r1
            r20 = r2
            r20.v(r21, r22, r23, r24, r25)
            r2.f11827D = r0
        L2de:
            r0 = r34
            r1 = r2
            r2 = r4
            r14 = r27
            r9 = r28
            r5 = r30
            r15 = r31
            goto L429
        L2ec:
            if (r1 == r11) goto L311
            java.lang.Object r0 = r3.get(r1)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L308
            int r0 = r4.leftMargin
            r22 = r28
            r23 = r0
            r20 = r2
            r24 = r15
            r21 = r28
            r20.v(r21, r22, r23, r24, r25)
            goto L30c
        L308:
            r20 = r2
            r21 = r28
        L30c:
            r22 = r21
            r21 = r27
            goto L332
        L311:
            r20 = r2
            r24 = r15
            r21 = r28
            if (r5 == r11) goto L30c
            java.lang.Object r0 = r3.get(r5)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L30c
            int r0 = r4.leftMargin
            r23 = r0
            r22 = r27
            r20.v(r21, r22, r23, r24, r25)
            r33 = r22
            r22 = r21
            r21 = r33
        L332:
            if (r9 == r11) goto L34c
            java.lang.Object r0 = r3.get(r9)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L347
            int r0 = r4.rightMargin
            r23 = r0
            r24 = r26
            r20.v(r21, r22, r23, r24, r25)
        L347:
            r9 = r22
        L349:
            r14 = r21
            goto L366
        L34c:
            r9 = r22
            r24 = r26
            if (r14 == r11) goto L349
            java.lang.Object r0 = r3.get(r14)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L349
            int r0 = r4.rightMargin
            r22 = r21
            r23 = r0
            r20.v(r21, r22, r23, r24, r25)
            goto L349
        L366:
            int r0 = r4.i
            if (r0 == r11) goto L38c
            java.lang.Object r0 = r3.get(r0)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L384
            int r0 = r4.topMargin
            int r1 = r4.f12903x
            r22 = r31
            r23 = r0
            r24 = r1
            r21 = r31
            r20.v(r21, r22, r23, r24, r25)
            goto L386
        L384:
            r21 = r31
        L386:
            r5 = r21
            r21 = r30
            r11 = -1
            goto L3b3
        L38c:
            r21 = r31
            int r0 = r4.j
            r11 = -1
            if (r0 == r11) goto L3af
            java.lang.Object r0 = r3.get(r0)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L3af
            int r0 = r4.topMargin
            int r1 = r4.f12903x
            r23 = r0
            r24 = r1
            r22 = r30
            r20.v(r21, r22, r23, r24, r25)
            r5 = r21
            r21 = r22
            goto L3b3
        L3af:
            r5 = r21
            r21 = r30
        L3b3:
            int r0 = r4.f12884k
            if (r0 == r11) goto L3d4
            java.lang.Object r0 = r3.get(r0)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L3d1
            int r0 = r4.bottomMargin
            int r1 = r4.f12905z
            r23 = r0
            r24 = r1
            r22 = r5
            r20.v(r21, r22, r23, r24, r25)
            r15 = r22
            goto L3d2
        L3d1:
            r15 = r5
        L3d2:
            r2 = r4
            goto L3f1
        L3d4:
            r15 = r5
            int r0 = r4.f12886l
            if (r0 == r11) goto L3d2
            java.lang.Object r0 = r3.get(r0)
            r25 = r0
            d1.d r25 = (d1.C0953d) r25
            if (r25 == 0) goto L3d2
            int r0 = r4.bottomMargin
            int r1 = r4.f12905z
            r22 = r21
            r23 = r0
            r24 = r1
            r20.v(r21, r22, r23, r24, r25)
            goto L3d2
        L3f1:
            int r4 = r2.f12888m
            r11 = -1
            if (r4 == r11) goto L401
            r5 = 6
            r0 = r34
            r1 = r20
            r0.k(r1, r2, r3, r4, r5)
        L3fe:
            r5 = r21
            goto L41b
        L401:
            int r4 = r2.f12890n
            if (r4 == r11) goto L40e
            r0 = r34
            r5 = r15
            r1 = r20
            r0.k(r1, r2, r3, r4, r5)
            goto L3fe
        L40e:
            int r4 = r2.f12892o
            r0 = r34
            r1 = r20
            r5 = r21
            if (r4 == r11) goto L41b
            r0.k(r1, r2, r3, r4, r5)
        L41b:
            int r4 = (r8 > r32 ? 1 : (r8 == r32 ? 0 : -1))
            if (r4 < 0) goto L421
            r1.f11857d0 = r8
        L421:
            float r4 = r2.f12846F
            int r8 = (r4 > r32 ? 1 : (r4 == r32 ? 0 : -1))
            if (r8 < 0) goto L429
            r1.f11859e0 = r4
        L429:
            if (r12 == 0) goto L43a
            int r4 = r2.f12860T
            r11 = -1
            if (r4 != r11) goto L434
            int r8 = r2.f12861U
            if (r8 == r11) goto L43a
        L434:
            int r8 = r2.f12861U
            r1.f11848Y = r4
            r1.f11849Z = r8
        L43a:
            boolean r4 = r2.f12868a0
            r8 = 3
            r11 = -2
            r5 = 4
            if (r4 != 0) goto L46a
            int r4 = r2.width
            r15 = -1
            if (r4 != r15) goto L462
            boolean r4 = r2.f12863W
            if (r4 == 0) goto L44e
            r1.M(r8)
            goto L451
        L44e:
            r1.M(r5)
        L451:
            d1.c r4 = r1.i(r9)
            int r9 = r2.leftMargin
            r4.f11822g = r9
            d1.c r4 = r1.i(r14)
            int r9 = r2.rightMargin
            r4.f11822g = r9
            goto L47d
        L462:
            r1.M(r8)
            r4 = 0
            r1.O(r4)
            goto L47d
        L46a:
            r4 = r16
            r1.M(r4)
            int r4 = r2.width
            r1.O(r4)
            int r4 = r2.width
            if (r4 != r11) goto L47d
            r4 = r17
            r1.M(r4)
        L47d:
            boolean r4 = r2.f12870b0
            if (r4 != 0) goto L4ad
            int r4 = r2.height
            r15 = -1
            if (r4 != r15) goto L4a5
            boolean r4 = r2.f12864X
            if (r4 == 0) goto L48f
            r1.N(r8)
        L48d:
            r5 = 3
            goto L493
        L48f:
            r1.N(r5)
            goto L48d
        L493:
            d1.c r4 = r1.i(r5)
            int r5 = r2.topMargin
            r4.f11822g = r5
            r5 = 5
            d1.c r4 = r1.i(r5)
            int r5 = r2.bottomMargin
            r4.f11822g = r5
            goto L4bf
        L4a5:
            r1.N(r8)
            r4 = 0
            r1.L(r4)
            goto L4bf
        L4ad:
            r4 = 1
            r15 = -1
            r1.N(r4)
            int r4 = r2.height
            r1.L(r4)
            int r4 = r2.height
            if (r4 != r11) goto L4bf
            r4 = 2
            r1.N(r4)
        L4bf:
            java.lang.String r4 = r2.f12847G
            if (r4 == 0) goto L4c9
            int r5 = r4.length()
            if (r5 != 0) goto L4cd
        L4c9:
            r4 = r32
            goto L557
        L4cd:
            int r5 = r4.length()
            r9 = 44
            int r9 = r4.indexOf(r9)
            if (r9 <= 0) goto L4fa
            int r11 = r5 + (-1)
            if (r9 >= r11) goto L4fa
            r11 = 0
            java.lang.String r14 = r4.substring(r11, r9)
            java.lang.String r11 = "W"
            boolean r11 = r14.equalsIgnoreCase(r11)
            if (r11 == 0) goto L4ec
            r11 = 0
            goto L4f7
        L4ec:
            java.lang.String r11 = "H"
            boolean r11 = r14.equalsIgnoreCase(r11)
            if (r11 == 0) goto L4f6
            r11 = 1
            goto L4f7
        L4f6:
            r11 = r15
        L4f7:
            int r9 = r9 + 1
            goto L4fc
        L4fa:
            r11 = r15
            r9 = 0
        L4fc:
            r14 = 58
            int r14 = r4.indexOf(r14)
            if (r14 < 0) goto L53d
            int r5 = r5 + (-1)
            if (r14 >= r5) goto L53d
            java.lang.String r5 = r4.substring(r9, r14)
            int r14 = r14 + 1
            java.lang.String r4 = r4.substring(r14)
            int r9 = r5.length()
            if (r9 <= 0) goto L54c
            int r9 = r4.length()
            if (r9 <= 0) goto L54c
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L54c
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L54c
            int r9 = (r5 > r32 ? 1 : (r5 == r32 ? 0 : -1))
            if (r9 <= 0) goto L54c
            int r9 = (r4 > r32 ? 1 : (r4 == r32 ? 0 : -1))
            if (r9 <= 0) goto L54c
            r9 = 1
            if (r11 != r9) goto L537
            float r4 = r4 / r5
            float r4 = java.lang.Math.abs(r4)     // Catch: java.lang.NumberFormatException -> L54c
            goto L54e
        L537:
            float r5 = r5 / r4
            float r4 = java.lang.Math.abs(r5)     // Catch: java.lang.NumberFormatException -> L54c
            goto L54e
        L53d:
            java.lang.String r4 = r4.substring(r9)
            int r5 = r4.length()
            if (r5 <= 0) goto L54c
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L54c
            goto L54e
        L54c:
            r4 = r32
        L54e:
            int r5 = (r4 > r32 ? 1 : (r4 == r32 ? 0 : -1))
            if (r5 <= 0) goto L559
            r1.f11846W = r4
            r1.f11847X = r11
            goto L559
        L557:
            r1.f11846W = r4
        L559:
            float r4 = r2.f12848H
            float[] r5 = r1.f11868k0
            r19 = 0
            r5[r19] = r4
            float r4 = r2.f12849I
            r16 = 1
            r5[r16] = r4
            int r4 = r2.f12850J
            r1.f11865i0 = r4
            int r4 = r2.f12851K
            r1.f11866j0 = r4
            int r4 = r2.f12866Z
            if (r4 < 0) goto L577
            if (r4 > r8) goto L577
            r1.f11879q = r4
        L577:
            int r4 = r2.f12852L
            int r5 = r2.f12854N
            int r8 = r2.f12856P
            float r9 = r2.f12858R
            r1.f11880r = r4
            r1.f11883u = r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r8 != r5) goto L589
            r8 = 0
        L589:
            r1.f11884v = r8
            r1.f11885w = r9
            r32 = 0
            int r8 = (r9 > r32 ? 1 : (r9 == r32 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r8 <= 0) goto L59e
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 >= 0) goto L59e
            if (r4 != 0) goto L59e
            r4 = 2
            r1.f11880r = r4
        L59e:
            int r4 = r2.f12853M
            int r8 = r2.f12855O
            int r9 = r2.f12857Q
            float r2 = r2.f12859S
            r1.f11881s = r4
            r1.f11886x = r8
            if (r9 != r5) goto L5ad
            r9 = 0
        L5ad:
            r1.f11887y = r9
            r1.f11888z = r2
            r32 = 0
            int r5 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r5 <= 0) goto L5c1
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 >= 0) goto L5c1
            if (r4 != 0) goto L5c1
            r4 = 2
            r1.f11881s = r4
            goto L5c2
        L5c1:
            r4 = 2
        L5c2:
            int r8 = r18 + 1
            r17 = r4
            r11 = r29
            goto L21d
        L5ca:
            r29 = r11
            if (r29 == 0) goto L5d3
            B0.G0 r1 = r10.f11901r0
            r1.b0(r10)
        L5d3:
            b1.c r1 = r10.f11906w0
            r1.getClass()
            int r1 = r0.f9395y
            r0.g(r10, r1, r6, r7)
            int r1 = r10.q()
            int r2 = r10.k()
            boolean r3 = r10.f11892E0
            boolean r4 = r10.f11893F0
            g1.f r5 = r0.f9386E
            int r8 = r5.f12910e
            int r5 = r5.f12909d
            int r1 = r1 + r5
            int r2 = r2 + r8
            r11 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r6, r11)
            int r2 = android.view.View.resolveSizeAndState(r2, r7, r11)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r5
            r2 = r2 & r5
            int r5 = r0.f9392v
            int r1 = java.lang.Math.min(r5, r1)
            int r5 = r0.f9393w
            int r2 = java.lang.Math.min(r5, r2)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L610
            r1 = r1 | r5
        L610:
            if (r4 == 0) goto L613
            r2 = r2 | r5
        L613:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0953d c0953dC = c(view);
        if ((view instanceof p) && !(c0953dC instanceof h)) {
            C1075e c1075e = (C1075e) view.getLayoutParams();
            h hVar = new h();
            c1075e.f12895p0 = hVar;
            c1075e.f12874d0 = true;
            hVar.S(c1075e.f12862V);
        }
        if (view instanceof AbstractC1073c) {
            AbstractC1073c abstractC1073c = (AbstractC1073c) view;
            abstractC1073c.i();
            ((C1075e) view.getLayoutParams()).f12876e0 = true;
            ArrayList arrayList = this.f9388r;
            if (!arrayList.contains(abstractC1073c)) {
                arrayList.add(abstractC1073c);
            }
        }
        this.f9387q.put(view.getId(), view);
        this.f9394x = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f9387q.remove(view.getId());
        C0953d c0953dC = c(view);
        this.f9389s.f11900q0.remove(c0953dC);
        c0953dC.C();
        this.f9388r.remove(view);
        this.f9394x = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f9394x = true;
        super.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setConstraintSet(n nVar) {
        this.f9396z = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f9387q;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxHeight(int i) {
        if (i == this.f9393w) {
            return;
        }
        this.f9393w = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxWidth(int i) {
        if (i == this.f9392v) {
            return;
        }
        this.f9392v = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinHeight(int i) {
        if (i == this.f9391u) {
            return;
        }
        this.f9391u = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinWidth(int i) {
        if (i == this.f9390t) {
            return;
        }
        this.f9390t = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnConstraintsChanged(o oVar) {
        m mVar = this.f9382A;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOptimizationLevel(int i) {
        this.f9395y = i;
        e eVar = this.f9389s;
        eVar.D0 = i;
        c.f9940q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9387q = new SparseArray();
        this.f9388r = new ArrayList(4);
        this.f9389s = new e();
        this.f9390t = 0;
        this.f9391u = 0;
        this.f9392v = Integer.MAX_VALUE;
        this.f9393w = Integer.MAX_VALUE;
        this.f9394x = true;
        this.f9395y = 257;
        this.f9396z = null;
        this.f9382A = null;
        this.f9383B = -1;
        this.f9384C = new HashMap();
        this.f9385D = new SparseArray();
        this.f9386E = new C1076f(this, this);
        e(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1075e c1075e = new C1075e(layoutParams);
        c1075e.f12867a = -1;
        c1075e.f12869b = -1;
        c1075e.f12871c = -1.0f;
        c1075e.f12873d = true;
        c1075e.f12875e = -1;
        c1075e.f = -1;
        c1075e.f12878g = -1;
        c1075e.f12880h = -1;
        c1075e.i = -1;
        c1075e.j = -1;
        c1075e.f12884k = -1;
        c1075e.f12886l = -1;
        c1075e.f12888m = -1;
        c1075e.f12890n = -1;
        c1075e.f12892o = -1;
        c1075e.f12894p = -1;
        c1075e.f12896q = 0;
        c1075e.f12897r = 0.0f;
        c1075e.f12898s = -1;
        c1075e.f12899t = -1;
        c1075e.f12900u = -1;
        c1075e.f12901v = -1;
        c1075e.f12902w = Integer.MIN_VALUE;
        c1075e.f12903x = Integer.MIN_VALUE;
        c1075e.f12904y = Integer.MIN_VALUE;
        c1075e.f12905z = Integer.MIN_VALUE;
        c1075e.f12841A = Integer.MIN_VALUE;
        c1075e.f12842B = Integer.MIN_VALUE;
        c1075e.f12843C = Integer.MIN_VALUE;
        c1075e.f12844D = 0;
        c1075e.f12845E = 0.5f;
        c1075e.f12846F = 0.5f;
        c1075e.f12847G = null;
        c1075e.f12848H = -1.0f;
        c1075e.f12849I = -1.0f;
        c1075e.f12850J = 0;
        c1075e.f12851K = 0;
        c1075e.f12852L = 0;
        c1075e.f12853M = 0;
        c1075e.f12854N = 0;
        c1075e.f12855O = 0;
        c1075e.f12856P = 0;
        c1075e.f12857Q = 0;
        c1075e.f12858R = 1.0f;
        c1075e.f12859S = 1.0f;
        c1075e.f12860T = -1;
        c1075e.f12861U = -1;
        c1075e.f12862V = -1;
        c1075e.f12863W = false;
        c1075e.f12864X = false;
        c1075e.f12865Y = null;
        c1075e.f12866Z = 0;
        c1075e.f12868a0 = true;
        c1075e.f12870b0 = true;
        c1075e.f12872c0 = false;
        c1075e.f12874d0 = false;
        c1075e.f12876e0 = false;
        c1075e.f12877f0 = -1;
        c1075e.f12879g0 = -1;
        c1075e.f12881h0 = -1;
        c1075e.f12882i0 = -1;
        c1075e.f12883j0 = Integer.MIN_VALUE;
        c1075e.f12885k0 = Integer.MIN_VALUE;
        c1075e.f12887l0 = 0.5f;
        c1075e.f12895p0 = new C0953d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1075e).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c1075e).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c1075e).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c1075e).bottomMargin = marginLayoutParams.bottomMargin;
            c1075e.setMarginStart(marginLayoutParams.getMarginStart());
            c1075e.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C1075e)) {
            return c1075e;
        }
        C1075e c1075e2 = (C1075e) layoutParams;
        c1075e.f12867a = c1075e2.f12867a;
        c1075e.f12869b = c1075e2.f12869b;
        c1075e.f12871c = c1075e2.f12871c;
        c1075e.f12873d = c1075e2.f12873d;
        c1075e.f12875e = c1075e2.f12875e;
        c1075e.f = c1075e2.f;
        c1075e.f12878g = c1075e2.f12878g;
        c1075e.f12880h = c1075e2.f12880h;
        c1075e.i = c1075e2.i;
        c1075e.j = c1075e2.j;
        c1075e.f12884k = c1075e2.f12884k;
        c1075e.f12886l = c1075e2.f12886l;
        c1075e.f12888m = c1075e2.f12888m;
        c1075e.f12890n = c1075e2.f12890n;
        c1075e.f12892o = c1075e2.f12892o;
        c1075e.f12894p = c1075e2.f12894p;
        c1075e.f12896q = c1075e2.f12896q;
        c1075e.f12897r = c1075e2.f12897r;
        c1075e.f12898s = c1075e2.f12898s;
        c1075e.f12899t = c1075e2.f12899t;
        c1075e.f12900u = c1075e2.f12900u;
        c1075e.f12901v = c1075e2.f12901v;
        c1075e.f12902w = c1075e2.f12902w;
        c1075e.f12903x = c1075e2.f12903x;
        c1075e.f12904y = c1075e2.f12904y;
        c1075e.f12905z = c1075e2.f12905z;
        c1075e.f12841A = c1075e2.f12841A;
        c1075e.f12842B = c1075e2.f12842B;
        c1075e.f12843C = c1075e2.f12843C;
        c1075e.f12844D = c1075e2.f12844D;
        c1075e.f12845E = c1075e2.f12845E;
        c1075e.f12846F = c1075e2.f12846F;
        c1075e.f12847G = c1075e2.f12847G;
        c1075e.f12848H = c1075e2.f12848H;
        c1075e.f12849I = c1075e2.f12849I;
        c1075e.f12850J = c1075e2.f12850J;
        c1075e.f12851K = c1075e2.f12851K;
        c1075e.f12863W = c1075e2.f12863W;
        c1075e.f12864X = c1075e2.f12864X;
        c1075e.f12852L = c1075e2.f12852L;
        c1075e.f12853M = c1075e2.f12853M;
        c1075e.f12854N = c1075e2.f12854N;
        c1075e.f12856P = c1075e2.f12856P;
        c1075e.f12855O = c1075e2.f12855O;
        c1075e.f12857Q = c1075e2.f12857Q;
        c1075e.f12858R = c1075e2.f12858R;
        c1075e.f12859S = c1075e2.f12859S;
        c1075e.f12860T = c1075e2.f12860T;
        c1075e.f12861U = c1075e2.f12861U;
        c1075e.f12862V = c1075e2.f12862V;
        c1075e.f12868a0 = c1075e2.f12868a0;
        c1075e.f12870b0 = c1075e2.f12870b0;
        c1075e.f12872c0 = c1075e2.f12872c0;
        c1075e.f12874d0 = c1075e2.f12874d0;
        c1075e.f12877f0 = c1075e2.f12877f0;
        c1075e.f12879g0 = c1075e2.f12879g0;
        c1075e.f12881h0 = c1075e2.f12881h0;
        c1075e.f12882i0 = c1075e2.f12882i0;
        c1075e.f12883j0 = c1075e2.f12883j0;
        c1075e.f12885k0 = c1075e2.f12885k0;
        c1075e.f12887l0 = c1075e2.f12887l0;
        c1075e.f12865Y = c1075e2.f12865Y;
        c1075e.f12866Z = c1075e2.f12866Z;
        c1075e.f12895p0 = c1075e2.f12895p0;
        return c1075e;
    }
}
