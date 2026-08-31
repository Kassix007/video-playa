package v4;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.C1292Z;
import w1.C1839b;

/* JADX INFO: loaded from: classes.dex */
public final class w extends C1839b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f17725d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(TextInputLayout textInputLayout) {
        this.f17725d = textInputLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void d(View view, x1.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f18345a;
        this.f18187a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f17725d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z5 = textInputLayout.f11621K0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z6 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        u uVar = textInputLayout.f11659r;
        C1292Z c1292z = uVar.f17713r;
        if (c1292z.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c1292z);
            accessibilityNodeInfo.setTraversalAfter(c1292z);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.f17715t);
        }
        if (!zIsEmpty) {
            eVar.n(text);
        } else if (!TextUtils.isEmpty(string)) {
            eVar.n(string);
            if (!z5 && placeholderText != null) {
                eVar.n(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            eVar.n(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                eVar.l(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                eVar.n(string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                eVar.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z6) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C1292Z c1292z2 = textInputLayout.f11675z.f17697y;
        if (c1292z2 != null) {
            accessibilityNodeInfo.setLabelFor(c1292z2);
        }
        textInputLayout.f11661s.b().n(eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f17725d.f11661s.b().o(accessibilityEvent);
    }
}
