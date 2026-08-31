package c4;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.i;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class d extends K1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1.b f10242d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d(i1.b bVar, int i) {
        this.f10241c = i;
        this.f10242d = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void E(int i) {
        switch (this.f10241c) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f10242d;
                    if (bottomSheetBehavior.f11372K) {
                        bottomSheetBehavior.C(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10242d;
                    if (sideSheetBehavior.f11580g) {
                        sideSheetBehavior.r(1);
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void F(View view, int i, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f10241c) {
            case 0:
                ((BottomSheetBehavior) this.f10242d).u(i7);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10242d;
                WeakReference weakReference = sideSheetBehavior.f11588q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f11575a.H0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f11592u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f11575a.L(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw i.h(it);
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // com.google.android.gms.internal.measurement.K1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            int r0 = r5.f10241c
            switch(r0) {
                case 0: goto L62;
                default: goto L5;
            }
        L5:
            i1.b r0 = r5.f10242d
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            com.google.android.gms.internal.measurement.I1 r1 = r0.f11575a
            boolean r1 = r1.r0(r7)
            if (r1 == 0) goto L12
            goto L5a
        L12:
            com.google.android.gms.internal.measurement.I1 r1 = r0.f11575a
            boolean r1 = r1.C0(r6, r7)
            if (r1 == 0) goto L2b
            com.google.android.gms.internal.measurement.I1 r1 = r0.f11575a
            boolean r7 = r1.u0(r7, r8)
            if (r7 != 0) goto L5c
            com.google.android.gms.internal.measurement.I1 r7 = r0.f11575a
            boolean r7 = r7.t0(r6)
            if (r7 == 0) goto L5a
            goto L5c
        L2b:
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L3d
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L3d
            goto L5c
        L3d:
            int r7 = r6.getLeft()
            com.google.android.gms.internal.measurement.I1 r8 = r0.f11575a
            int r8 = r8.e0()
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            com.google.android.gms.internal.measurement.I1 r1 = r0.f11575a
            int r1 = r1.f0()
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L5c
        L5a:
            r7 = 3
            goto L5d
        L5c:
            r7 = 5
        L5d:
            r8 = 1
            r0.t(r6, r7, r8)
            return
        L62:
            i1.b r0 = r5.f10242d
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r3 = 6
            r4 = 3
            if (r2 >= 0) goto L84
            boolean r7 = r0.f11390b
            if (r7 == 0) goto L74
        L71:
            r3 = r4
            goto L145
        L74:
            int r7 = r6.getTop()
            java.lang.System.currentTimeMillis()
            r0.getClass()
            int r8 = r0.f11366E
            if (r7 <= r8) goto L71
            goto L145
        L84:
            boolean r2 = r0.f11370I
            if (r2 == 0) goto Ld3
            boolean r2 = r0.D(r6, r8)
            if (r2 == 0) goto Ld3
            float r7 = java.lang.Math.abs(r7)
            float r1 = java.lang.Math.abs(r8)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto La1
            int r7 = r0.f11394d
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto Lb0
        La1:
            int r7 = r6.getTop()
            int r8 = r0.f11381T
            int r1 = r0.x()
            int r1 = r1 + r8
            int r1 = r1 / 2
            if (r7 <= r1) goto Lb3
        Lb0:
            r3 = 5
            goto L145
        Lb3:
            boolean r7 = r0.f11390b
            if (r7 == 0) goto Lb8
            goto L71
        Lb8:
            int r7 = r6.getTop()
            int r8 = r0.x()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r1 = r0.f11366E
            int r8 = r8 - r1
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L145
            goto L71
        Ld3:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r2 = 4
            if (r1 == 0) goto L104
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto Le5
            goto L104
        Le5:
            boolean r7 = r0.f11390b
            if (r7 == 0) goto Leb
        Le9:
            r3 = r2
            goto L145
        Leb:
            int r7 = r6.getTop()
            int r8 = r0.f11366E
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r0.f11368G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Le9
            r0.getClass()
            goto L145
        L104:
            int r7 = r6.getTop()
            boolean r8 = r0.f11390b
            if (r8 == 0) goto L11f
            int r8 = r0.f11365D
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r0.f11368G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Le9
            goto L71
        L11f:
            int r8 = r0.f11366E
            if (r7 >= r8) goto L133
            int r8 = r0.f11368G
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L12f
            goto L71
        L12f:
            r0.getClass()
            goto L145
        L133:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r0.f11368G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Le9
            r0.getClass()
        L145:
            r0.getClass()
            r7 = 1
            r0.E(r6, r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.d.G(android.view.View, float, float):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // com.google.android.gms.internal.measurement.K1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f10241c
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            i1.b r6 = r4.f10242d
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f11581h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.f11587p
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            i1.b r0 = r4.f10242d
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.f11373L
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f11389a0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.f11386Y
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.f11383V
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.f11382U
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.d.N(android.view.View, int):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final int k(View view, int i) {
        switch (this.f10241c) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10242d;
                return AbstractC1397A.n(i, sideSheetBehavior.f11575a.h0(), sideSheetBehavior.f11575a.g0());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final int l(View view, int i) {
        switch (this.f10241c) {
            case 0:
                return AbstractC1397A.n(i, ((BottomSheetBehavior) this.f10242d).x(), t());
            default:
                return view.getTop();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public int s(View view) {
        switch (this.f10241c) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10242d;
                return sideSheetBehavior.f11583l + sideSheetBehavior.f11586o;
            default:
                return super.s(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public int t() {
        switch (this.f10241c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f10242d;
                return bottomSheetBehavior.f11370I ? bottomSheetBehavior.f11381T : bottomSheetBehavior.f11368G;
            default:
                return super.t();
        }
    }
}
