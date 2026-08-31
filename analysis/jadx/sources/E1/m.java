package E1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.InterfaceC0643f;
import androidx.lifecycle.InterfaceC0660x;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC0643f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC0654q f1646q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(EmojiCompatInitializer emojiCompatInitializer, AbstractC0654q abstractC0654q) {
        this.f1646q = abstractC0654q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void b(InterfaceC0660x interfaceC0660x) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC0144b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new q(0), 500L);
        this.f1646q.c(this);
    }
}
