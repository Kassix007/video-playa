package G1;

import E1.z;
import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1977a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f1978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f1979c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1979c;
        return cls != null ? new z(cls, charSequence) : super.newEditable(charSequence);
    }
}
