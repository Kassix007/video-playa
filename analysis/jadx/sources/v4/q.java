package v4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.material.textfield.TextInputLayout;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C1292Z;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f17674A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f17675B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f17679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f17680e;
    public final TimeInterpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f17681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f17682h;
    public LinearLayout i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f17683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f17684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f17685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f17688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1292Z f17690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f17691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f17694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f17695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C1292Z f17697y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f17698z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f17681g = context;
        this.f17682h = textInputLayout;
        this.f17685m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f17676a = C3.a.M(context, R.attr.motionDurationShort4, 217);
        this.f17677b = C3.a.M(context, R.attr.motionDurationMedium4, 167);
        this.f17678c = C3.a.M(context, R.attr.motionDurationShort4, 167);
        this.f17679d = C3.a.N(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, W3.a.f8111d);
        LinearInterpolator linearInterpolator = W3.a.f8108a;
        this.f17680e = C3.a.N(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = C3.a.N(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(C1292Z c1292z, int i) {
        if (this.i == null && this.f17683k == null) {
            Context context = this.f17681g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f17682h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f17683k = new FrameLayout(context);
            this.i.addView(this.f17683k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f17683k.setVisibility(0);
            this.f17683k.addView(c1292z);
        } else {
            this.i.addView(c1292z, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f17682h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f17681g;
                boolean zS0 = I1.s0(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                int paddingStart = editText.getPaddingStart();
                if (zS0) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zS0) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zS0) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        AnimatorSet animatorSet = this.f17684l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(ArrayList arrayList, boolean z5, C1292Z c1292z, int i, int i7, int i8) {
        if (c1292z == null || !z5) {
            return;
        }
        if (i == i8 || i == i7) {
            boolean z6 = i8 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1292z, (Property<C1292Z, Float>) View.ALPHA, z6 ? 1.0f : 0.0f);
            int i9 = this.f17678c;
            objectAnimatorOfFloat.setDuration(z6 ? this.f17677b : i9);
            objectAnimatorOfFloat.setInterpolator(z6 ? this.f17680e : this.f);
            if (i == i8 && i7 != 0) {
                objectAnimatorOfFloat.setStartDelay(i9);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i8 != i || i7 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1292z, (Property<C1292Z, Float>) View.TRANSLATION_Y, -this.f17685m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f17676a);
            objectAnimatorOfFloat2.setInterpolator(this.f17679d);
            objectAnimatorOfFloat2.setStartDelay(i9);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TextView e(int i) {
        if (i == 1) {
            return this.f17690r;
        }
        if (i != 2) {
            return null;
        }
        return this.f17697y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        this.f17688p = null;
        c();
        if (this.f17686n == 1) {
            if (!this.f17696x || TextUtils.isEmpty(this.f17695w)) {
                this.f17687o = 0;
            } else {
                this.f17687o = 2;
            }
        }
        i(this.f17686n, this.f17687o, h(this.f17690r, ""));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(C1292Z c1292z, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f17683k) != null) {
            frameLayout.removeView(c1292z);
        } else {
            linearLayout.removeView(c1292z);
        }
        int i7 = this.j - 1;
        this.j = i7;
        LinearLayout linearLayout2 = this.i;
        if (i7 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(C1292Z c1292z, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        TextInputLayout textInputLayout = this.f17682h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f17687o == this.f17686n && c1292z != null && TextUtils.equals(c1292z.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(int i, int i7, boolean z5) {
        TextView textViewE;
        TextView textViewE2;
        q qVar = this;
        if (i == i7) {
            return;
        }
        if (z5) {
            AnimatorSet animatorSet = new AnimatorSet();
            qVar.f17684l = animatorSet;
            ArrayList arrayList = new ArrayList();
            qVar.d(arrayList, qVar.f17696x, qVar.f17697y, 2, i, i7);
            qVar.d(arrayList, qVar.f17689q, qVar.f17690r, 1, i, i7);
            int size = arrayList.size();
            long jMax = 0;
            for (int i8 = 0; i8 < size; i8++) {
                Animator animator = (Animator) arrayList.get(i8);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            o oVar = new o(this, i7, e(i), i, qVar.e(i7));
            qVar = this;
            animatorSet.addListener(oVar);
            animatorSet.start();
        } else if (i != i7) {
            if (i7 != 0 && (textViewE2 = qVar.e(i7)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewE = e(i)) != null) {
                textViewE.setVisibility(4);
                if (i == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            qVar.f17686n = i7;
        }
        TextInputLayout textInputLayout = qVar.f17682h;
        textInputLayout.r();
        textInputLayout.u(z5, false);
        textInputLayout.x();
    }
}
