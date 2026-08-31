package v4;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f17641a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(m mVar) {
        this.f17641a = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.f17641a;
        k kVar = mVar.f17653L;
        if (mVar.f17650I == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.f17650I;
        if (editText != null) {
            editText.removeTextChangedListener(kVar);
            if (mVar.f17650I.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.f17650I.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.f17650I = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(kVar);
        }
        mVar.b().m(mVar.f17650I);
        mVar.j(mVar.b());
    }
}
