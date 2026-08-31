package D4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends E4.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E4.f f1461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S3.e f1462e;
    public final /* synthetic */ f f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(f fVar, S3.e eVar) {
        E4.f fVar2 = new E4.f("OnRequestInstallCallback", 0);
        this.f = fVar;
        super(0);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f1461d = fVar2;
        this.f1462e = eVar;
    }
}
