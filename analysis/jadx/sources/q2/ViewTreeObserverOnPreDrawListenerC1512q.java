package q2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: renamed from: q2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1512q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC1509n f15994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f15995r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f0 A[EDGE_INSN: B:133:0x01f0->B:89:0x01f0 BREAK  A[LOOP:1: B:18:0x0086->B:88:0x01e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021a  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            r19 = this;
            r0 = r19
            q2.n r1 = r0.f15994q
            android.view.ViewGroup r2 = r0.f15995r
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            r3.removeOnPreDrawListener(r0)
            r2.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r2 = q2.AbstractC1513r.f15998c
            android.view.ViewGroup r3 = r0.f15995r
            boolean r2 = r2.remove(r3)
            r7 = 1
            if (r2 != 0) goto L1c
            return r7
        L1c:
            r.e r2 = q2.AbstractC1513r.b()
            java.lang.Object r4 = r2.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L32
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.put(r3, r4)
        L30:
            r6 = 0
            goto L3d
        L32:
            int r6 = r4.size()
            if (r6 <= 0) goto L30
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
        L3d:
            r4.add(r1)
            q2.p r4 = new q2.p
            r4.<init>(r0, r2)
            r1.a(r4)
            r2 = 0
            r1.h(r3, r2)
            if (r6 == 0) goto L61
            int r4 = r6.size()
            r8 = r2
        L53:
            if (r8 >= r4) goto L61
            java.lang.Object r9 = r6.get(r8)
            int r8 = r8 + 1
            q2.n r9 = (q2.AbstractC1509n) r9
            r9.y(r3)
            goto L53
        L61:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15970A = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15971B = r4
            E.c0 r4 = r1.f15988w
            E.c0 r6 = r1.f15989x
            r.e r8 = new r.e
            java.lang.Object r9 = r4.f1552q
            r.e r9 = (r.C1554e) r9
            r8.<init>(r9)
            r.e r9 = new r.e
            java.lang.Object r10 = r6.f1552q
            r.e r10 = (r.C1554e) r10
            r9.<init>(r10)
            r10 = r2
        L86:
            int[] r11 = r1.f15991z
            int r12 = r11.length
            if (r10 >= r12) goto L1f0
            r11 = r11[r10]
            if (r11 == r7) goto L1ac
            r12 = 2
            if (r11 == r12) goto L158
            r12 = 3
            if (r11 == r12) goto L102
            r12 = 4
            if (r11 == r12) goto L9e
        L98:
            r16 = r3
            r18 = r7
            goto L1e7
        L9e:
            java.lang.Object r11 = r4.f1554s
            r.q r11 = (r.C1566q) r11
            java.lang.Object r12 = r6.f1554s
            r.q r12 = (r.C1566q) r12
            int r13 = r11.g()
            r14 = r2
        Lab:
            if (r14 >= r13) goto L98
            java.lang.Object r15 = r11.h(r14)
            android.view.View r15 = (android.view.View) r15
            if (r15 == 0) goto Lf7
            boolean r16 = r1.t(r15)
            if (r16 == 0) goto Lf7
            r16 = r3
            long r2 = r11.d(r14)
            java.lang.Object r2 = r12.b(r2)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto Lf4
            boolean r3 = r1.t(r2)
            if (r3 == 0) goto Lf4
            java.lang.Object r3 = r8.get(r15)
            q2.v r3 = (q2.C1517v) r3
            java.lang.Object r17 = r9.get(r2)
            r18 = r7
            r7 = r17
            q2.v r7 = (q2.C1517v) r7
            if (r3 == 0) goto Lfa
            if (r7 == 0) goto Lfa
            java.util.ArrayList r5 = r1.f15970A
            r5.add(r3)
            java.util.ArrayList r3 = r1.f15971B
            r3.add(r7)
            r8.remove(r15)
            r9.remove(r2)
            goto Lfa
        Lf4:
            r18 = r7
            goto Lfa
        Lf7:
            r16 = r3
            goto Lf4
        Lfa:
            int r14 = r14 + 1
            r3 = r16
            r7 = r18
            r2 = 0
            goto Lab
        L102:
            r16 = r3
            r18 = r7
            java.lang.Object r2 = r4.f1553r
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            java.lang.Object r3 = r6.f1553r
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            int r5 = r2.size()
            r7 = 0
        L113:
            if (r7 >= r5) goto L1e7
            java.lang.Object r11 = r2.valueAt(r7)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L155
            boolean r12 = r1.t(r11)
            if (r12 == 0) goto L155
            int r12 = r2.keyAt(r7)
            java.lang.Object r12 = r3.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L155
            boolean r13 = r1.t(r12)
            if (r13 == 0) goto L155
            java.lang.Object r13 = r8.get(r11)
            q2.v r13 = (q2.C1517v) r13
            java.lang.Object r14 = r9.get(r12)
            q2.v r14 = (q2.C1517v) r14
            if (r13 == 0) goto L155
            if (r14 == 0) goto L155
            java.util.ArrayList r15 = r1.f15970A
            r15.add(r13)
            java.util.ArrayList r13 = r1.f15971B
            r13.add(r14)
            r8.remove(r11)
            r9.remove(r12)
        L155:
            int r7 = r7 + 1
            goto L113
        L158:
            r16 = r3
            r18 = r7
            java.lang.Object r2 = r4.f1555t
            r.e r2 = (r.C1554e) r2
            java.lang.Object r3 = r6.f1555t
            r.e r3 = (r.C1554e) r3
            int r5 = r2.f16166s
            r7 = 0
        L167:
            if (r7 >= r5) goto L1e7
            java.lang.Object r11 = r2.i(r7)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L1a9
            boolean r12 = r1.t(r11)
            if (r12 == 0) goto L1a9
            java.lang.Object r12 = r2.f(r7)
            java.lang.Object r12 = r3.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L1a9
            boolean r13 = r1.t(r12)
            if (r13 == 0) goto L1a9
            java.lang.Object r13 = r8.get(r11)
            q2.v r13 = (q2.C1517v) r13
            java.lang.Object r14 = r9.get(r12)
            q2.v r14 = (q2.C1517v) r14
            if (r13 == 0) goto L1a9
            if (r14 == 0) goto L1a9
            java.util.ArrayList r15 = r1.f15970A
            r15.add(r13)
            java.util.ArrayList r13 = r1.f15971B
            r13.add(r14)
            r8.remove(r11)
            r9.remove(r12)
        L1a9:
            int r7 = r7 + 1
            goto L167
        L1ac:
            r16 = r3
            r18 = r7
            int r2 = r8.f16166s
            int r2 = r2 + (-1)
        L1b4:
            if (r2 < 0) goto L1e7
            java.lang.Object r3 = r8.f(r2)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L1e4
            boolean r5 = r1.t(r3)
            if (r5 == 0) goto L1e4
            java.lang.Object r3 = r9.remove(r3)
            q2.v r3 = (q2.C1517v) r3
            if (r3 == 0) goto L1e4
            android.view.View r5 = r3.f16003b
            boolean r5 = r1.t(r5)
            if (r5 == 0) goto L1e4
            java.lang.Object r5 = r8.g(r2)
            q2.v r5 = (q2.C1517v) r5
            java.util.ArrayList r7 = r1.f15970A
            r7.add(r5)
            java.util.ArrayList r5 = r1.f15971B
            r5.add(r3)
        L1e4:
            int r2 = r2 + (-1)
            goto L1b4
        L1e7:
            int r10 = r10 + 1
            r3 = r16
            r7 = r18
            r2 = 0
            goto L86
        L1f0:
            r16 = r3
            r18 = r7
            r2 = 0
        L1f5:
            int r3 = r8.f16166s
            if (r2 >= r3) goto L215
            java.lang.Object r3 = r8.i(r2)
            q2.v r3 = (q2.C1517v) r3
            android.view.View r4 = r3.f16003b
            boolean r4 = r1.t(r4)
            if (r4 == 0) goto L212
            java.util.ArrayList r4 = r1.f15970A
            r4.add(r3)
            java.util.ArrayList r3 = r1.f15971B
            r4 = 0
            r3.add(r4)
        L212:
            int r2 = r2 + 1
            goto L1f5
        L215:
            r2 = 0
        L216:
            int r3 = r9.f16166s
            if (r2 >= r3) goto L238
            java.lang.Object r3 = r9.i(r2)
            q2.v r3 = (q2.C1517v) r3
            android.view.View r4 = r3.f16003b
            boolean r4 = r1.t(r4)
            if (r4 == 0) goto L234
            java.util.ArrayList r4 = r1.f15971B
            r4.add(r3)
            java.util.ArrayList r3 = r1.f15970A
            r4 = 0
            r3.add(r4)
            goto L235
        L234:
            r4 = 0
        L235:
            int r2 = r2 + 1
            goto L216
        L238:
            r.e r2 = q2.AbstractC1509n.p()
            int r3 = r2.f16166s
            android.view.WindowId r4 = r16.getWindowId()
            int r3 = r3 + (-1)
        L244:
            if (r3 < 0) goto L2ab
            java.lang.Object r5 = r2.f(r3)
            android.animation.Animator r5 = (android.animation.Animator) r5
            if (r5 == 0) goto L2a6
            java.lang.Object r6 = r2.get(r5)
            q2.k r6 = (q2.C1506k) r6
            if (r6 == 0) goto L2a6
            q2.n r7 = r6.f15960e
            android.view.View r8 = r6.f15956a
            if (r8 == 0) goto L2a6
            android.view.WindowId r9 = r6.f15959d
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L2a6
            q2.v r6 = r6.f15958c
            r9 = r18
            q2.v r10 = r1.r(r8, r9)
            q2.v r11 = r1.n(r8, r9)
            if (r10 != 0) goto L281
            if (r11 != 0) goto L281
            E.c0 r9 = r1.f15989x
            java.lang.Object r9 = r9.f1552q
            r.e r9 = (r.C1554e) r9
            java.lang.Object r8 = r9.get(r8)
            r11 = r8
            q2.v r11 = (q2.C1517v) r11
        L281:
            if (r10 != 0) goto L285
            if (r11 == 0) goto L2a6
        L285:
            boolean r6 = r7.s(r6, r11)
            if (r6 == 0) goto L2a6
            q2.n r6 = r7.o()
            r6.getClass()
            boolean r6 = r5.isRunning()
            if (r6 != 0) goto L2a3
            boolean r6 = r5.isStarted()
            if (r6 == 0) goto L29f
            goto L2a3
        L29f:
            r2.remove(r5)
            goto L2a6
        L2a3:
            r5.cancel()
        L2a6:
            int r3 = r3 + (-1)
            r18 = 1
            goto L244
        L2ab:
            E.c0 r3 = r1.f15988w
            E.c0 r4 = r1.f15989x
            java.util.ArrayList r5 = r1.f15970A
            java.util.ArrayList r6 = r1.f15971B
            r2 = r16
            r1.l(r2, r3, r4, r5, r6)
            r1.z()
            r18 = 1
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.ViewTreeObserverOnPreDrawListenerC1512q.onPreDraw():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f15995r;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC1513r.f15998c;
        ViewGroup viewGroup2 = this.f15995r;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) AbstractC1513r.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((AbstractC1509n) obj).y(viewGroup2);
            }
        }
        this.f15994q.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
