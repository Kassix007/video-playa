package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import l.C1206i;
import l.C1211n;
import l.MenuC1209l;

/* JADX INFO: renamed from: m.G0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1256G0 extends C1325p0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f14653C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f14654D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC1250D0 f14655E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C1211n f14656F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1256G0(Context context, boolean z5) {
        super(context, z5);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f14653C = 21;
            this.f14654D = 22;
        } else {
            this.f14653C = 22;
            this.f14654D = 21;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1325p0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1206i c1206i;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f14655E != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1206i = (C1206i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1206i = (C1206i) adapter;
                headersCount = 0;
            }
            C1211n c1211nB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c1206i.getCount()) ? null : c1206i.getItem(i);
            C1211n c1211n = this.f14656F;
            if (c1211n != c1211nB) {
                MenuC1209l menuC1209l = c1206i.f14345a;
                if (c1211n != null) {
                    this.f14655E.n(menuC1209l, c1211n);
                }
                this.f14656F = c1211nB;
                if (c1211nB != null) {
                    this.f14655E.l(menuC1209l, c1211nB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f14653C) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f14654D) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1206i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1206i) adapter).f14345a.c(false);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHoverListener(InterfaceC1250D0 interfaceC1250D0) {
        this.f14655E = interfaceC1250D0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1325p0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
