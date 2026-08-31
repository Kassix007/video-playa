package y4;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y4.g, z4.InterfaceC1974h
    public final void a(Bundle bundle) {
        super.a(bundle);
        int i = bundle.getInt("error.code", -2);
        S3.e eVar = this.f18641e;
        if (i != 0) {
            eVar.a(new A4.a(bundle.getInt("error.code", -2)));
        } else {
            eVar.b(null);
        }
    }
}
