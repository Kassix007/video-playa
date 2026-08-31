package k1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f14084q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f14085r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(Context context) {
        this.f14085r = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(ComponentName componentName) {
        Context context = this.f14085r;
        ArrayList arrayList = this.f14084q;
        int size = arrayList.size();
        try {
            for (Intent intentC = AbstractC1175c.c(context, componentName); intentC != null; intentC = AbstractC1175c.c(context, intentC.getComponent())) {
                arrayList.add(size, intentC);
            }
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        ArrayList arrayList = this.f14084q;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f14085r.startActivities(intentArr, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14084q.iterator();
    }
}
