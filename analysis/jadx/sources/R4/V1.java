package R4;

import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import h.AbstractActivityC1106h;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class V1 extends com.google.android.gms.internal.measurement.I1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f6876c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Uri T0(AbstractActivityC1106h abstractActivityC1106h, String str) {
        Uri uriD = FileProvider.d(abstractActivityC1106h, "com.wnapp.smspariaz.provider", new File(abstractActivityC1106h.getCacheDir(), "captured_media_" + System.currentTimeMillis() + "." + str));
        kotlin.jvm.internal.m.d(uriD, "getUriForFile(...)");
        return uriD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final Object A0(Intent intent, int i) {
        if (i == -1) {
            return this.f6876c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final Intent P(AbstractActivityC1106h abstractActivityC1106h, Object obj) {
        String str = (String) obj;
        String str2 = kotlin.jvm.internal.m.a(str, "video") ? "mp4" : kotlin.jvm.internal.m.a(str, "audio") ? "mp3" : "jpg";
        Intent intent = kotlin.jvm.internal.m.a(str, "video") ? new Intent("android.media.action.VIDEO_CAPTURE") : kotlin.jvm.internal.m.a(str, "audio") ? new Intent("android.provider.MediaStore.RECORD_SOUND") : new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            Uri uriT0 = T0(abstractActivityC1106h, str2);
            this.f6876c = uriT0;
            kotlin.jvm.internal.m.b(intent.putExtra("output", uriT0));
        } catch (Exception unused) {
        }
        return intent;
    }
}
