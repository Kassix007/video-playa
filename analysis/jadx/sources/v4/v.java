package v4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class v implements TextWatcher {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ EditText f17723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f17724s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v(TextInputLayout textInputLayout, EditText editText) {
        this.f17724s = textInputLayout;
        this.f17723r = editText;
        this.f17722q = editText.getLineCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f17724s;
        textInputLayout.u(!textInputLayout.f11633Q0, false);
        if (textInputLayout.f11601A) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f11616I) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f17723r;
        int lineCount = editText.getLineCount();
        int i = this.f17722q;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                int minimumHeight = editText.getMinimumHeight();
                int i7 = textInputLayout.f11619J0;
                if (minimumHeight != i7) {
                    editText.setMinimumHeight(i7);
                }
            }
            this.f17722q = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i7, int i8) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i7, int i8) {
    }
}
