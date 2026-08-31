package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11508r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m(int i, Object obj) {
        this.f11507q = i;
        this.f11508r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11507q) {
            case 0:
                ((n) this.f11508r).H();
                throw null;
            case 1:
                v4.d dVar = (v4.d) this.f11508r;
                EditText editText = dVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.q();
                return;
            case 2:
                ((v4.j) this.f11508r).u();
                return;
            default:
                v4.t tVar = (v4.t) this.f11508r;
                EditText editText2 = tVar.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = tVar.f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    tVar.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    tVar.f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    tVar.f.setSelection(selectionEnd);
                }
                tVar.q();
                return;
        }
    }
}
