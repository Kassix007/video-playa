package T1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f7379r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l(int i, Bundle bundle) {
        this.f7378q = i;
        this.f7379r = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        boolean zContainsKey;
        String argName = (String) obj;
        switch (this.f7378q) {
            case 0:
                kotlin.jvm.internal.m.e(argName, "argName");
                Bundle source = this.f7379r;
                kotlin.jvm.internal.m.e(source, "source");
                zContainsKey = source.containsKey(argName);
                break;
            default:
                kotlin.jvm.internal.m.e(argName, "key");
                Bundle source2 = this.f7379r;
                kotlin.jvm.internal.m.e(source2, "source");
                zContainsKey = source2.containsKey(argName);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
