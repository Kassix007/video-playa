package D1;

import C0.E;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import g4.C1087d;
import g4.C1089f;
import i1.C1134a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s4.e;
import w1.AbstractC1835K;
import w1.C1839b;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C1839b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f1324n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f1325o = new e(2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1899k f1326p = new C1899k(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f1330h;
    public final Chip i;
    public E j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1327d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1328e = new Rect();
    public final Rect f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1329g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1331k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1332l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1333m = Integer.MIN_VALUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(Chip chip) {
        this.i = chip;
        this.f1330h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final C1134a b(View view) {
        if (this.j == null) {
            this.j = new E(this, 1);
        }
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void d(View view, x1.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f18345a;
        this.f18187a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C1087d) this).f13072q;
        C1089f c1089f = chip.f11460u;
        accessibilityNodeInfo.setCheckable(c1089f != null && c1089f.f13113g0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        eVar.i(chip.getAccessibilityClassName());
        eVar.n(chip.getText());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j(int i) {
        if (this.f1332l != i) {
            return false;
        }
        this.f1332l = Integer.MIN_VALUE;
        C1087d c1087d = (C1087d) this;
        if (i == 1) {
            Chip chip = c1087d.f13072q;
            chip.f11450C = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x1.e k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        x1.e eVar = new x1.e(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        eVar.i("android.view.View");
        Rect rect = f1324n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        eVar.f18346b = -1;
        Chip chip = this.i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i, eVar);
        if (eVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1328e;
        eVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        eVar.f18347c = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f1331k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            eVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            eVar.a(64);
        }
        boolean z5 = this.f1332l == i;
        if (z5) {
            eVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            eVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z5);
        int[] iArr = this.f1329g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f1327d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            eVar.f(rect3);
            if (eVar.f18346b != -1) {
                x1.e eVar2 = new x1.e(AccessibilityNodeInfo.obtain());
                for (int i7 = eVar.f18346b; i7 != -1; i7 = eVar2.f18346b) {
                    eVar2.f18346b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = eVar2.f18345a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i7, eVar2);
                    eVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f18345a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return eVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l(r3)
            r.S r4 = new r.S
            r5 = 0
            r4.<init>(r5)
            r6 = r5
        L15:
            int r7 = r3.size()
            if (r6 >= r7) goto L39
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            x1.e r7 = r0.k(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.e(r8, r7)
            int r6 = r6 + 1
            goto L15
        L39:
            int r3 = r0.f1332l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L41
            r3 = 0
            goto L47
        L41:
            java.lang.Object r3 = r4.c(r3)
            x1.e r3 = (x1.e) r3
        L47:
            s4.e r8 = D1.a.f1325o
            x3.k r9 = D1.a.f1326p
            com.google.android.material.chip.Chip r10 = r0.i
            r11 = 2
            r13 = 1
            if (r1 == r13) goto L15c
            if (r1 == r11) goto L15c
            r11 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r6 = 17
            if (r1 == r6) goto L63
            if (r1 == r15) goto L63
            if (r1 == r14) goto L63
            if (r1 != r11) goto L66
        L63:
            r17 = r13
            goto L6e
        L66:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L6e:
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            int r5 = r0.f1332l
            java.lang.String r12 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r5 == r7) goto L82
            x1.e r2 = r0.n(r5)
            r2.f(r13)
        L80:
            r10 = -1
            goto Lb5
        L82:
            if (r2 == 0) goto L88
            r13.set(r2)
            goto L80
        L88:
            int r2 = r10.getWidth()
            int r5 = r10.getHeight()
            if (r1 == r6) goto Lb0
            if (r1 == r15) goto Laa
            if (r1 == r14) goto La4
            if (r1 != r11) goto L9e
            r5 = 0
            r10 = -1
            r13.set(r5, r10, r2, r10)
            goto Lb5
        L9e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r12)
            throw r1
        La4:
            r2 = 0
            r10 = -1
            r13.set(r10, r2, r10, r5)
            goto Lb5
        Laa:
            r7 = 0
            r10 = -1
            r13.set(r7, r5, r2, r5)
            goto Lb5
        Lb0:
            r7 = 0
            r10 = -1
            r13.set(r2, r7, r2, r5)
        Lb5:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r13)
            if (r1 == r6) goto Leb
            if (r1 == r15) goto Le0
            if (r1 == r14) goto Ld4
            if (r1 != r11) goto Lce
            int r5 = r13.height()
            int r5 = r5 + 1
            int r5 = -r5
            r7 = 0
            r2.offset(r7, r5)
            goto Lf5
        Lce:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r12)
            throw r1
        Ld4:
            r7 = 0
            int r5 = r13.width()
            int r5 = r5 + 1
            int r5 = -r5
            r2.offset(r5, r7)
            goto Lf5
        Le0:
            r7 = 0
            int r5 = r13.height()
            int r5 = r5 + 1
            r2.offset(r7, r5)
            goto Lf5
        Leb:
            r7 = 0
            int r5 = r13.width()
            int r5 = r5 + 1
            r2.offset(r5, r7)
        Lf5:
            r9.getClass()
            int r5 = r4.f()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r9 = r7
            r16 = 0
        L104:
            if (r9 >= r5) goto L157
            java.lang.Object r11 = r4.g(r9)
            x1.e r11 = (x1.e) r11
            if (r11 != r3) goto L10f
            goto L154
        L10f:
            r8.getClass()
            r11.f(r6)
            boolean r12 = com.google.android.gms.internal.measurement.I1.p0(r1, r13, r6)
            if (r12 != 0) goto L11c
            goto L154
        L11c:
            boolean r12 = com.google.android.gms.internal.measurement.I1.p0(r1, r13, r2)
            if (r12 != 0) goto L123
            goto L14f
        L123:
            boolean r12 = com.google.android.gms.internal.measurement.I1.H(r1, r13, r6, r2)
            if (r12 == 0) goto L12a
            goto L14f
        L12a:
            boolean r12 = com.google.android.gms.internal.measurement.I1.H(r1, r13, r2, r6)
            if (r12 == 0) goto L131
            goto L154
        L131:
            int r12 = com.google.android.gms.internal.measurement.I1.w0(r1, r13, r6)
            int r14 = com.google.android.gms.internal.measurement.I1.x0(r1, r13, r6)
            int r15 = r12 * 13
            int r15 = r15 * r12
            int r14 = r14 * r14
            int r14 = r14 + r15
            int r12 = com.google.android.gms.internal.measurement.I1.w0(r1, r13, r2)
            int r15 = com.google.android.gms.internal.measurement.I1.x0(r1, r13, r2)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r14 >= r15) goto L154
        L14f:
            r2.set(r6)
            r16 = r11
        L154:
            int r9 = r9 + 1
            goto L104
        L157:
            r2 = r10
        L158:
            r1 = r16
            goto L1ce
        L15c:
            r7 = r5
            r17 = r13
            r2 = -1
            java.util.WeakHashMap r5 = w1.AbstractC1835K.f18149a
            int r5 = r10.getLayoutDirection()
            r6 = r17
            if (r5 != r6) goto L16c
            r5 = 1
            goto L16d
        L16c:
            r5 = r7
        L16d:
            r9.getClass()
            int r6 = r4.f()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r6)
            r10 = r7
        L17a:
            if (r10 >= r6) goto L188
            java.lang.Object r12 = r4.g(r10)
            x1.e r12 = (x1.e) r12
            r9.add(r12)
            int r10 = r10 + 1
            goto L17a
        L188:
            D1.b r6 = new D1.b
            r6.<init>(r5, r8)
            java.util.Collections.sort(r9, r6)
            r6 = 1
            if (r1 == r6) goto L1b3
            if (r1 != r11) goto L1ab
            int r1 = r9.size()
            if (r3 != 0) goto L19d
            r10 = r2
            goto L1a1
        L19d:
            int r10 = r9.lastIndexOf(r3)
        L1a1:
            int r10 = r10 + r6
            if (r10 >= r1) goto L1a9
            java.lang.Object r6 = r9.get(r10)
            goto L1c9
        L1a9:
            r6 = 0
            goto L1c9
        L1ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L1b3:
            int r1 = r9.size()
            if (r3 != 0) goto L1bc
        L1b9:
            r17 = 1
            goto L1c1
        L1bc:
            int r1 = r9.indexOf(r3)
            goto L1b9
        L1c1:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L1a9
            java.lang.Object r6 = r9.get(r1)
        L1c9:
            r16 = r6
            x1.e r16 = (x1.e) r16
            goto L158
        L1ce:
            if (r1 != 0) goto L1d3
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1ef
        L1d3:
            boolean r3 = r4.f16167q
            if (r3 == 0) goto L1da
            r.r.a(r4)
        L1da:
            int r3 = r4.f16170t
            r5 = r7
        L1dd:
            if (r5 >= r3) goto L1ea
            java.lang.Object[] r6 = r4.f16169s
            r6 = r6[r5]
            if (r6 != r1) goto L1e7
            r12 = r5
            goto L1eb
        L1e7:
            int r5 = r5 + 1
            goto L1dd
        L1ea:
            r12 = r2
        L1eb:
            int r7 = r4.d(r12)
        L1ef:
            boolean r1 = r0.p(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.a.m(int, android.graphics.Rect):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x1.e n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        x1.e eVar = new x1.e(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            eVar.f18345a.addChild(chip, ((Integer) arrayList.get(i7)).intValue());
        }
        return eVar;
    }

    public abstract void o(int i, x1.e eVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p(int i) {
        int i7;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i7 = this.f1332l) == i) {
            return false;
        }
        if (i7 != Integer.MIN_VALUE) {
            j(i7);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f1332l = i;
        C1087d c1087d = (C1087d) this;
        if (i == 1) {
            Chip chip2 = c1087d.f13072q;
            chip2.f11450C = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(int i, int i7) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f1330h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i7);
            x1.e eVarN = n(i);
            accessibilityEventObtain.getText().add(eVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = eVarN.f18345a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i7);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
