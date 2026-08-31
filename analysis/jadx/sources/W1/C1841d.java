package w1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: w1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1841d implements InterfaceC1840c, InterfaceC1842e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18190q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ClipData f18191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Uri f18194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bundle f18195v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1841d() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1840c
    public C1843f build() {
        return new C1843f(new C1841d(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1842e
    public ClipData d() {
        return this.f18191r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1842e
    public int h() {
        return this.f18193t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1842e
    public ContentInfo j() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1840c
    public void k(Uri uri) {
        this.f18194u = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1842e
    public int o() {
        return this.f18192s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1840c
    public void p(int i) {
        this.f18193t = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1840c
    public void setExtras(Bundle bundle) {
        this.f18195v = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str;
        switch (this.f18190q) {
            case 1:
                Uri uri = this.f18194u;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f18191r.getDescription());
                sb.append(", source=");
                int i = this.f18192s;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i7 = this.f18193t;
                sb.append((i7 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i7));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return k1.i.k(sb, this.f18195v != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1841d(C1841d c1841d) {
        ClipData clipData = c1841d.f18191r;
        clipData.getClass();
        this.f18191r = clipData;
        int i = c1841d.f18192s;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f18192s = i;
        int i7 = c1841d.f18193t;
        if ((i7 & 1) == i7) {
            this.f18193t = i7;
            this.f18194u = c1841d.f18194u;
            this.f18195v = c1841d.f18195v;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i7) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
