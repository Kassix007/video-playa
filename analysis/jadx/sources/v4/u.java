package v4;

import B0.G0;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.wnapp.smspariaz.R;
import java.util.WeakHashMap;
import m.C1292Z;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class u extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextInputLayout f17712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1292Z f17713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f17714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CheckableImageButton f17715t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f17716u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f17717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView.ScaleType f17719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View.OnLongClickListener f17720y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17721z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(TextInputLayout textInputLayout, G0 g02) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f17712q = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f17715t = checkableImageButton;
        C1292Z c1292z = new C1292Z(getContext(), null);
        this.f17713r = c1292z;
        if (I1.s0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f17720y;
        checkableImageButton.setOnClickListener(null);
        K1.L(checkableImageButton, onLongClickListener);
        this.f17720y = null;
        checkableImageButton.setOnLongClickListener(null);
        K1.L(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) g02.f235s;
        if (typedArray.hasValue(69)) {
            this.f17716u = I1.Y(getContext(), g02, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f17717v = l4.m.i(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(g02.y(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f17718w) {
            this.f17718w = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM = K1.m(typedArray.getInt(68, -1));
            this.f17719x = scaleTypeM;
            checkableImageButton.setScaleType(scaleTypeM);
        }
        c1292z.setVisibility(8);
        c1292z.setId(R.id.textinput_prefix_text);
        c1292z.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        c1292z.setAccessibilityLiveRegion(1);
        c1292z.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c1292z.setTextColor(g02.w(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f17714s = TextUtils.isEmpty(text2) ? null : text2;
        c1292z.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c1292z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f17715t;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        return this.f17713r.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f17715t;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f17716u;
            PorterDuff.Mode mode = this.f17717v;
            TextInputLayout textInputLayout = this.f17712q;
            K1.e(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            K1.J(textInputLayout, checkableImageButton, this.f17716u);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f17720y;
        checkableImageButton.setOnClickListener(null);
        K1.L(checkableImageButton, onLongClickListener);
        this.f17720y = null;
        checkableImageButton.setOnLongClickListener(null);
        K1.L(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(boolean z5) {
        CheckableImageButton checkableImageButton = this.f17715t;
        if ((checkableImageButton.getVisibility() == 0) != z5) {
            checkableImageButton.setVisibility(z5 ? 0 : 8);
            d();
            e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        int paddingStart;
        EditText editText = this.f17712q.f11663t;
        if (editText == null) {
            return;
        }
        if (this.f17715t.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
        this.f17713r.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        int i = (this.f17714s == null || this.f17721z) ? 8 : 0;
        setVisibility((this.f17715t.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f17713r.setVisibility(i);
        this.f17712q.q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        super.onMeasure(i, i7);
        d();
    }
}
