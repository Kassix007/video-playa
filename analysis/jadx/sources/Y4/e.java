package y4;

import E1.t;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import z4.C1980n;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1919c f18634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f18635c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(j jVar, C1919c c1919c, Context context) {
        new Handler(Looper.getMainLooper());
        this.f18633a = jVar;
        this.f18634b = c1919c;
        this.f18635c = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        String packageName = this.f18635c.getPackageName();
        j jVar = this.f18633a;
        C1980n c1980n = jVar.f18644a;
        if (c1980n != null) {
            j.f18643e.e("completeUpdate(%s)", packageName);
            S3.e eVar = new S3.e();
            c1980n.a().post(new f(c1980n, eVar, eVar, new f(jVar, eVar, eVar, packageName, 1), 2));
            return;
        }
        t tVar = j.f18643e;
        Object[] objArr = {-9};
        tVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", t.f(tVar.f1656q, "onError(%d)", objArr));
        }
        new S3.k().f(new A4.a(-9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final S3.k b() {
        String packageName = this.f18635c.getPackageName();
        j jVar = this.f18633a;
        C1980n c1980n = jVar.f18644a;
        if (c1980n != null) {
            j.f18643e.e("requestUpdateInfo(%s)", packageName);
            S3.e eVar = new S3.e();
            c1980n.a().post(new f(c1980n, eVar, eVar, new f(jVar, eVar, packageName, eVar), 2));
            return eVar.f7306a;
        }
        t tVar = j.f18643e;
        Object[] objArr = {-9};
        tVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", t.f(tVar.f1656q, "onError(%d)", objArr));
        }
        A4.a aVar = new A4.a(-9);
        S3.k kVar = new S3.k();
        kVar.f(aVar);
        return kVar;
    }
}
