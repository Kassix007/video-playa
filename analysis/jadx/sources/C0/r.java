package C0;

import android.content.res.Resources;
import i0.C1133e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.k implements B5.f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        A a7 = (A) this.receiver;
        Resources resources = a7.getContext().getResources();
        return Boolean.valueOf(P.f911a.a(a7, null, new f0.b(new W0.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((C1133e) obj2).f13533a, (B5.c) obj3)));
    }
}
