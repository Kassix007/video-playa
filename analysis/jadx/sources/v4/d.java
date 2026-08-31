package v4;

import C0.RunnableC0089m;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.wnapp.smspariaz.R;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17617e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f17618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f17619h;
    public EditText i;
    public final com.google.android.material.datepicker.m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC1766a f17620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f17621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f17622m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(m mVar) {
        super(mVar);
        this.j = new com.google.android.material.datepicker.m(1, this);
        this.f17620k = new ViewOnFocusChangeListenerC1766a(this, 0);
        this.f17617e = C3.a.M(mVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = C3.a.M(mVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f17618g = C3.a.N(mVar.getContext(), R.attr.motionEasingLinearInterpolator, W3.a.f8108a);
        this.f17619h = C3.a.N(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, W3.a.f8111d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void a() {
        if (this.f17665b.f17647F != null) {
            return;
        }
        t(u());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final View.OnFocusChangeListener e() {
        return this.f17620k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final View.OnClickListener f() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final View.OnFocusChangeListener g() {
        return this.f17620k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void m(EditText editText) {
        this.i = editText;
        this.f17664a.setEndIconVisible(u());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void p(boolean z5) {
        if (this.f17665b.f17647F == null) {
            return;
        }
        t(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f17619h);
        valueAnimatorOfFloat.setDuration(this.f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: v4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f17614b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f17614b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        d dVar = this.f17614b;
                        dVar.getClass();
                        dVar.f17667d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f17614b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f17667d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f17618g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i7 = this.f17617e;
        valueAnimatorOfFloat2.setDuration(i7);
        final int i8 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: v4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f17614b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f17614b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i8) {
                    case 0:
                        d dVar = this.f17614b;
                        dVar.getClass();
                        dVar.f17667d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f17614b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f17667d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17621l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f17621l.addListener(new c(this, i8));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i7);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: v4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f17614b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f17614b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i8) {
                    case 0:
                        d dVar = this.f17614b;
                        dVar.getClass();
                        dVar.f17667d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f17614b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f17667d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f17622m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new RunnableC0089m(22, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(boolean z5) {
        boolean z6 = this.f17665b.d() == z5;
        if (z5 && !this.f17621l.isRunning()) {
            this.f17622m.cancel();
            this.f17621l.start();
            if (z6) {
                this.f17621l.end();
                return;
            }
            return;
        }
        if (z5) {
            return;
        }
        this.f17621l.cancel();
        this.f17622m.start();
        if (z6) {
            this.f17622m.end();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f17667d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
