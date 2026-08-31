package G1;

import E1.l;
import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1991a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(TextView textView) {
        this.f1991a = new f(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final void C(boolean z5) {
        if (l.c()) {
            this.f1991a.C(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final void D(boolean z5) {
        boolean zC = l.c();
        f fVar = this.f1991a;
        if (zC) {
            fVar.D(z5);
        } else {
            fVar.f1990c = z5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        return !l.c() ? inputFilterArr : this.f1991a.o(inputFilterArr);
    }
}
