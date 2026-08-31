package m;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: m.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1261J implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14666r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1261J(int i, Object obj) {
        this.f14665q = i;
        this.f14666r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f14665q) {
            case 0:
                C1265L c1265l = (C1265L) this.f14666r;
                C1271O c1271o = c1265l.f14680W;
                c1271o.setSelection(i);
                if (c1271o.getOnItemClickListener() != null) {
                    c1271o.performItemClick(view, i, c1265l.f14677T.getItemId(i));
                }
                c1265l.dismiss();
                break;
            default:
                v4.s sVar = (v4.s) this.f14666r;
                C1248C0 c1248c0 = sVar.f17704u;
                v4.s.a(sVar, i < 0 ? !c1248c0.f14636P.isShowing() ? null : c1248c0.f14639s.getSelectedItem() : sVar.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = sVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c1248c0.f14636P.isShowing() ? null : c1248c0.f14639s.getSelectedView();
                        i = !c1248c0.f14636P.isShowing() ? -1 : c1248c0.f14639s.getSelectedItemPosition();
                        j = !c1248c0.f14636P.isShowing() ? Long.MIN_VALUE : c1248c0.f14639s.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c1248c0.f14639s, view, i, j);
                }
                c1248c0.dismiss();
                break;
        }
    }
}
