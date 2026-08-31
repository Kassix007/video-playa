package T1;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@y("activity")
public class b extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f7352c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(Context context) {
        Object next;
        kotlin.jvm.internal.m.e(context, "context");
        Iterator it = I5.k.R(context, new I5.m(11)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f7352c = (Activity) next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final p a() {
        return new C0529a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final p c(p pVar) {
        throw new IllegalStateException(("Destination " + ((C0529a) pVar).f7404r.f8091a + " does not have an Intent set.").toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final boolean f() {
        Activity activity = this.f7352c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
