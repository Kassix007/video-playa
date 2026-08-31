package G3;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f1999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2001d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(SharedPreferences sharedPreferences, String str, Object obj, int i) {
        this.f1998a = i;
        this.f1999b = sharedPreferences;
        this.f2000c = str;
        this.f2001d = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f1998a) {
            case 0:
                return Boolean.valueOf(this.f1999b.getBoolean(this.f2000c, ((Boolean) this.f2001d).booleanValue()));
            case 1:
                return Integer.valueOf(this.f1999b.getInt(this.f2000c, ((Integer) this.f2001d).intValue()));
            case 2:
                return Long.valueOf(this.f1999b.getLong(this.f2000c, ((Long) this.f2001d).longValue()));
            default:
                return this.f1999b.getString(this.f2000c, (String) this.f2001d);
        }
    }
}
