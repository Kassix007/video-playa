package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: h.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1099a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1103e f13245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1100b f13246r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1099a(C1100b c1100b, C1103e c1103e) {
        this.f13246r = c1100b;
        this.f13245q = c1103e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1100b c1100b = this.f13246r;
        DialogInterface.OnClickListener onClickListener = c1100b.f13260q;
        C1103e c1103e = this.f13245q;
        onClickListener.onClick(c1103e.f13269b, i);
        if (c1100b.f13261r) {
            return;
        }
        c1103e.f13269b.dismiss();
    }
}
