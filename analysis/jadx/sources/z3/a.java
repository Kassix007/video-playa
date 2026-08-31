package Z3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import f4.C1064a;
import f4.c;
import java.util.ArrayList;
import q2.AbstractC1509n;
import r2.e;
import v4.j;
import w1.P;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8430b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(int i, Object obj) {
        this.f8429a = i;
        this.f8430b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f8429a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f8430b;
                actionBarOverlayLayout.f9130M = null;
                actionBarOverlayLayout.f9145z = false;
                break;
            case 5:
                ((P) this.f8430b).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8429a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f8430b).f11355h = null;
                break;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f8430b;
                actionBarOverlayLayout.f9130M = null;
                actionBarOverlayLayout.f9145z = false;
                break;
            case 2:
                ((AbstractC1509n) this.f8430b).m();
                animator.removeListener(this);
                break;
            case 3:
                e eVar = (e) this.f8430b;
                ArrayList arrayList = new ArrayList(eVar.f16293u);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C1064a) arrayList.get(i)).f12719b.f12729E;
                    if (colorStateList != null) {
                        eVar.setTintList(colorStateList);
                    }
                }
                break;
            case 4:
                j jVar = (j) this.f8430b;
                jVar.q();
                jVar.f17639r.start();
                break;
            default:
                ((P) this.f8430b).a();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f8429a) {
            case 3:
                e eVar = (e) this.f8430b;
                ArrayList arrayList = new ArrayList(eVar.f16293u);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    c cVar = ((C1064a) arrayList.get(i)).f12719b;
                    ColorStateList colorStateList = cVar.f12729E;
                    if (colorStateList != null) {
                        eVar.setTint(colorStateList.getColorForState(cVar.f12733I, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 4:
            default:
                super.onAnimationStart(animator);
                break;
            case 5:
                ((P) this.f8430b).c();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public a(P p7, View view) {
        this.f8429a = 5;
        this.f8430b = p7;
    }
}
