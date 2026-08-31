package k5;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: k5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1189a extends WebChromeClient {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        m.e(consoleMessage, "consoleMessage");
        return super.onConsoleMessage(consoleMessage);
    }
}
