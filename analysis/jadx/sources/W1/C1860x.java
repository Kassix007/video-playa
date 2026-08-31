package w1;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: w1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1860x extends F1.c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18248u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1860x(int i, Class cls, int i7, int i8, int i9) {
        this.f18248u = i9;
        this.f1941q = i;
        this.f1944t = cls;
        this.f1943s = i7;
        this.f1942r = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F1.c
    public final Object c(View view) {
        switch (this.f18248u) {
            case 0:
                return Boolean.valueOf(AbstractC1830F.c(view));
            case 1:
                return AbstractC1830F.a(view);
            default:
                return Boolean.valueOf(AbstractC1830F.b(view));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F1.c
    public final void d(View view, Object obj) {
        switch (this.f18248u) {
            case 0:
                AbstractC1830F.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC1830F.e(view, (CharSequence) obj);
                break;
            default:
                AbstractC1830F.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F1.c
    public final boolean g(Object obj, Object obj2) {
        switch (this.f18248u) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
