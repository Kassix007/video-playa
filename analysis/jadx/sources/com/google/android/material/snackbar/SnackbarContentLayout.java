package com.google.android.material.snackbar;

import C3.a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wnapp.smspariaz.R;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f11595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Button f11596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11597s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.N(context, R.attr.motionEasingEmphasizedInterpolator, W3.a.f8109b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(int i, int i7, int i8) {
        boolean z5;
        if (i != getOrientation()) {
            setOrientation(i);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f11595q.getPaddingTop() == i7 && this.f11595q.getPaddingBottom() == i8) {
            return z5;
        }
        TextView textView = this.f11595q;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i7, textView.getPaddingEnd(), i8);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i7, textView.getPaddingRight(), i8);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Button getActionView() {
        return this.f11596r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextView getMessageView() {
        return this.f11595q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f11595q = (TextView) findViewById(R.id.snackbar_text);
        this.f11596r = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        super.onMeasure(i, i7);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f11595q.getLayout();
        boolean z5 = layout != null && layout.getLineCount() > 1;
        if (!z5 || this.f11597s <= 0 || this.f11596r.getMeasuredWidth() <= this.f11597s) {
            if (!z5) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxInlineActionWidth(int i) {
        this.f11597s = i;
    }
}
