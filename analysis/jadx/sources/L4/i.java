package L4;

import android.animation.Animator;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Animator.AnimatorPauseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IconicsAnimationProcessor f3269a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(IconicsAnimationProcessor iconicsAnimationProcessor) {
        this.f3269a = iconicsAnimationProcessor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animation) {
        m.e(animation, "animation");
        List list = this.f3269a.pauseListeners;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw k1.i.h(it);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animation) {
        m.e(animation, "animation");
        List list = this.f3269a.pauseListeners;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw k1.i.h(it);
            }
        }
    }
}
