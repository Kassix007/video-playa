package y4;

import E1.t;
import android.os.Bundle;
import z4.InterfaceC1974h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends E4.a implements InterfaceC1974h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f18640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S3.e f18641e;
    public final /* synthetic */ j f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, t tVar, S3.e eVar) {
        super(4);
        this.f = jVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f18640d = tVar;
        this.f18641e = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.InterfaceC1974h
    public void a(Bundle bundle) {
        this.f.f18644a.c(this.f18641e);
        this.f18640d.e("onCompleteUpdate", new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.InterfaceC1974h
    public void f(Bundle bundle) {
        this.f.f18644a.c(this.f18641e);
        this.f18640d.e("onRequestInfo", new Object[0]);
    }
}
