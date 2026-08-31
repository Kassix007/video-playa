package v4;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l4.l {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m f17640q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(m mVar) {
        this.f17640q = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f17640q.b().a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l4.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i7, int i8) {
        this.f17640q.b().b();
    }
}
