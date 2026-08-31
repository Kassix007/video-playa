package v4;

import C0.RunnableC0089m;
import R4.L0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.material.textfield.TextInputLayout;
import com.wnapp.smspariaz.R;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17629e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f17630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f17631h;
    public final com.google.android.material.datepicker.m i;
    public final ViewOnFocusChangeListenerC1766a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L0 f17632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f17636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f17637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f17638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f17639r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(m mVar) {
        super(mVar);
        this.i = new com.google.android.material.datepicker.m(2, this);
        this.j = new ViewOnFocusChangeListenerC1766a(this, 1);
        this.f17632k = new L0(10, this);
        this.f17636o = Long.MAX_VALUE;
        this.f = C3.a.M(mVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f17629e = C3.a.M(mVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f17630g = C3.a.N(mVar.getContext(), R.attr.motionEasingLinearInterpolator, W3.a.f8108a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void a() {
        if (this.f17637p.isTouchExplorationEnabled() && I1.q0(this.f17631h) && !this.f17667d.hasFocus()) {
            this.f17631h.dismissDropDown();
        }
        this.f17631h.post(new RunnableC0089m(23, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final View.OnClickListener f() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final L0 h() {
        return this.f17632k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final boolean i(int i) {
        return i != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final boolean j() {
        return this.f17633l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final boolean l() {
        return this.f17635n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f17631h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: v4.h
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    j jVar = this.f17627q;
                    long j = jCurrentTimeMillis - jVar.f17636o;
                    if (j < 0 || j > 300) {
                        jVar.f17634m = false;
                    }
                    jVar.u();
                    jVar.f17634m = true;
                    jVar.f17636o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f17631h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: v4.i
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                j jVar = this.f17628a;
                jVar.f17634m = true;
                jVar.f17636o = System.currentTimeMillis();
                jVar.t(false);
            }
        });
        this.f17631h.setThreshold(0);
        TextInputLayout textInputLayout = this.f17664a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!I1.q0(editText) && this.f17637p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            this.f17667d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void n(x1.e eVar) {
        if (!I1.q0(this.f17631h)) {
            eVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? eVar.f18345a.isShowingHintText() : eVar.e(4)) {
            eVar.l(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f17637p.isEnabled() || I1.q0(this.f17631h)) {
            return;
        }
        boolean z5 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f17635n && !this.f17631h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z5) {
            u();
            this.f17634m = true;
            this.f17636o = System.currentTimeMillis();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f17630g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new a3.w(i, this));
        this.f17639r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f17629e);
        valueAnimatorOfFloat2.addUpdateListener(new a3.w(i, this));
        this.f17638q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new Z3.a(4, this));
        this.f17637p = (AccessibilityManager) this.f17666c.getSystemService("accessibility");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f17631h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f17631h.setOnDismissListener(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(boolean z5) {
        if (this.f17635n != z5) {
            this.f17635n = z5;
            this.f17639r.cancel();
            this.f17638q.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        if (this.f17631h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17636o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f17634m = false;
        }
        if (this.f17634m) {
            this.f17634m = false;
            return;
        }
        t(!this.f17635n);
        if (!this.f17635n) {
            this.f17631h.dismissDropDown();
        } else {
            this.f17631h.requestFocus();
            this.f17631h.showDropDown();
        }
    }
}
