package L4;

import android.animation.Animator;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IconicsAnimationProcessor f3268a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(IconicsAnimationProcessor iconicsAnimationProcessor) {
        this.f3268a = iconicsAnimationProcessor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        m.e(animation, "animation");
        List list = this.f3268a.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw k1.i.h(it);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z5) {
        m.e(animation, "animation");
        List list = this.f3268a.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw k1.i.h(it);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        m.e(animation, "animation");
        List list = this.f3268a.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw k1.i.h(it);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation, boolean z5) {
        m.e(animation, "animation");
        List list = this.f3268a.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw k1.i.h(it);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        m.e(animation, "animation");
        List list = this.f3268a.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw k1.i.h(it);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        m.e(animation, "animation");
        List list = this.f3268a.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw k1.i.h(it);
            }
        }
    }
}
