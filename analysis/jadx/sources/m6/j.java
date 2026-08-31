package m6;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m6.l
    public final boolean a(SSLSocket sSLSocket) {
        return l6.h.f14598d && Conscrypt.isConscrypt(sSLSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m6.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
