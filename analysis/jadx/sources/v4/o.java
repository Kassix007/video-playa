package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import m.C1292Z;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f17669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f17671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f17672e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(q qVar, int i, TextView textView, int i7, TextView textView2) {
        this.f17672e = qVar;
        this.f17668a = i;
        this.f17669b = textView;
        this.f17670c = i7;
        this.f17671d = textView2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1292Z c1292z;
        int i = this.f17668a;
        q qVar = this.f17672e;
        qVar.f17686n = i;
        qVar.f17684l = null;
        TextView textView = this.f17669b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f17670c == 1 && (c1292z = qVar.f17690r) != null) {
                c1292z.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f17671d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f17671d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
