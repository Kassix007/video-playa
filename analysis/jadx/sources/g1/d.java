package G1;

import E1.l;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1985b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(TextView textView) {
        this.f1984a = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i7, Spanned spanned, int i8, int i9) {
        TextView textView = this.f1984a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = l.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i9 == 0 && i8 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i7 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i7);
                }
                return l.a().f(0, charSequence.length(), 0, charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        l lVarA = l.a();
        if (this.f1985b == null) {
            this.f1985b = new c(textView, this);
        }
        lVarA.g(this.f1985b);
        return charSequence;
    }
}
