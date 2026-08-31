package q2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: q2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1501f extends AbstractC1509n {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String[] f15943Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final C1497b f15944R = new C1497b(PointF.class, "topLeft", 0);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C1497b f15945S = new C1497b(PointF.class, "bottomRight", 1);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final C1497b f15946T = new C1497b(PointF.class, "bottomRight", 2);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final C1497b f15947U = new C1497b(PointF.class, "topLeft", 3);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final C1497b f15948V = new C1497b(PointF.class, "position", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void I(C1517v c1517v) {
        View view = c1517v.f16003b;
        HashMap map = c1517v.f16002a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c1517v.f16003b.getParent());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void d(C1517v c1517v) {
        I(c1517v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void g(C1517v c1517v) {
        I(c1517v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final Animator k(ViewGroup viewGroup, C1517v c1517v, C1517v c1517v2) {
        int i;
        C1501f c1501f;
        Animator animatorA;
        if (c1517v != null) {
            HashMap map = c1517v.f16002a;
            if (c1517v2 != null) {
                HashMap map2 = c1517v2.f16002a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c1517v2.f16003b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i7 = rect.left;
                    int i8 = rect2.left;
                    int i9 = rect.top;
                    int i10 = rect2.top;
                    int i11 = rect.right;
                    int i12 = rect2.right;
                    int i13 = rect.bottom;
                    int i14 = rect2.bottom;
                    int i15 = i11 - i7;
                    int i16 = i13 - i9;
                    int i17 = i12 - i8;
                    int i18 = i14 - i10;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i15 == 0 || i16 == 0) && (i17 == 0 || i18 == 0)) {
                        i = 0;
                    } else {
                        i = (i7 == i8 && i9 == i10) ? 0 : 1;
                        if (i11 != i12 || i13 != i14) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i19 = i;
                    if (i19 > 0) {
                        x.a(view, i7, i9, i11, i13);
                        if (i19 != 2) {
                            c1501f = this;
                            if (i7 == i8 && i9 == i10) {
                                c1501f.f15981L.getClass();
                                animatorA = AbstractC1504i.a(view, f15946T, O3.B.i(i11, i13, i12, i14));
                            } else {
                                c1501f.f15981L.getClass();
                                animatorA = AbstractC1504i.a(view, f15947U, O3.B.i(i7, i9, i8, i10));
                            }
                        } else if (i15 == i17 && i16 == i18) {
                            c1501f = this;
                            c1501f.f15981L.getClass();
                            animatorA = AbstractC1504i.a(view, f15948V, O3.B.i(i7, i9, i8, i10));
                        } else {
                            c1501f = this;
                            C1500e c1500e = new C1500e(view);
                            c1501f.f15981L.getClass();
                            ObjectAnimator objectAnimatorA = AbstractC1504i.a(c1500e, f15944R, O3.B.i(i7, i9, i8, i10));
                            c1501f.f15981L.getClass();
                            ObjectAnimator objectAnimatorA2 = AbstractC1504i.a(c1500e, f15945S, O3.B.i(i11, i13, i12, i14));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                            animatorSet.addListener(new C1498c(c1500e));
                            animatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            C3.a.T(viewGroup4, true);
                            c1501f.o().a(new C1499d(viewGroup4));
                        }
                        return animatorA;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final String[] q() {
        return f15943Q;
    }
}
