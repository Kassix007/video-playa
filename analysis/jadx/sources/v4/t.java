package v4;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.wnapp.smspariaz.R;

/* JADX INFO: loaded from: classes.dex */
public final class t extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17710e;
    public EditText f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.m f17711g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(m mVar, int i) {
        super(mVar);
        this.f17710e = R.drawable.design_password_eye;
        this.f17711g = new com.google.android.material.datepicker.m(3, this);
        if (i != 0) {
            this.f17710e = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void b() {
        q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final int d() {
        return this.f17710e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final View.OnClickListener f() {
        return this.f17711g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final boolean k() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
