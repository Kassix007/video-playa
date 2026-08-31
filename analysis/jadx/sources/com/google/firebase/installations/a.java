package com.google.firebase.installations;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f11775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f11776s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(FirebaseInstallations firebaseInstallations, boolean z5, int i) {
        this.f11774q = i;
        this.f11775r = firebaseInstallations;
        this.f11776s = z5;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.installations.FirebaseInstallations.b(com.google.firebase.installations.FirebaseInstallations, boolean):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11774q) {
            case 0:
                this.f11775r.lambda$doRegistrationOrRefresh$3(this.f11776s);
                break;
            default:
                this.f11775r.lambda$getToken$2(this.f11776s);
                break;
        }
    }
}
