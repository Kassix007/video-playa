package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.wnapp.smspariaz.R;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: m.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1325p0 extends ListView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public A1.e f14845A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public A1.b f14846B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f14847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1321n0 f14853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f14855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14856z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1325p0(Context context, boolean z5) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f14847q = new Rect();
        this.f14848r = 0;
        this.f14849s = 0;
        this.f14850t = 0;
        this.f14851u = 0;
        this.f14855y = z5;
        setCacheColorHint(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i, int i7) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i7) {
                return i7;
            }
        }
        return measuredHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            int r3 = r2.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L1a
            r0 = 2
            if (r3 == r0) goto L18
            r0 = 3
            if (r3 == r0) goto L15
            r0 = r4
            goto L148
        L15:
            r0 = r5
            goto L148
        L18:
            r0 = r4
            goto L1b
        L1a:
            r0 = r5
        L1b:
            int r6 = r18.findPointerIndex(r19)
            if (r6 >= 0) goto L22
            goto L15
        L22:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L36
            r5 = r4
            goto L148
        L36:
            int r0 = r1.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f14856z = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            m.AbstractC1315k0.a(r1, r7, r6)
            boolean r11 = r1.isPressed()
            if (r11 != 0) goto L52
            r1.setPressed(r4)
        L52:
            r1.layoutChildren()
            int r11 = r1.f14852v
            if (r11 == r9) goto L6f
            int r12 = r1.getFirstVisiblePosition()
            int r11 = r11 - r12
            android.view.View r11 = r1.getChildAt(r11)
            if (r11 == 0) goto L6f
            if (r11 == r10) goto L6f
            boolean r12 = r11.isPressed()
            if (r12 == 0) goto L6f
            r11.setPressed(r5)
        L6f:
            r1.f14852v = r8
            int r11 = r10.getLeft()
            float r11 = (float) r11
            float r11 = r7 - r11
            int r12 = r10.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            m.AbstractC1315k0.a(r10, r11, r12)
            boolean r11 = r10.isPressed()
            if (r11 != 0) goto L8b
            r10.setPressed(r4)
        L8b:
            android.graphics.drawable.Drawable r11 = r1.getSelector()
            if (r11 == 0) goto L95
            if (r8 == r9) goto L95
            r12 = r4
            goto L96
        L95:
            r12 = r5
        L96:
            if (r12 == 0) goto L9b
            r11.setVisible(r5, r5)
        L9b:
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            r16 = r4
            int r4 = r10.getBottom()
            android.graphics.Rect r5 = r1.f14847q
            r5.set(r13, r14, r15, r4)
            int r4 = r5.left
            int r13 = r1.f14848r
            int r4 = r4 - r13
            r5.left = r4
            int r4 = r5.top
            int r13 = r1.f14849s
            int r4 = r4 - r13
            r5.top = r4
            int r4 = r5.right
            int r13 = r1.f14850t
            int r4 = r4 + r13
            r5.right = r4
            int r4 = r5.bottom
            int r13 = r1.f14851u
            int r4 = r4 + r13
            r5.bottom = r4
            r4 = 33
            if (r0 < r4) goto Ld7
            boolean r0 = m.AbstractC1319m0.a(r1)
            goto Le5
        Ld7:
            java.lang.reflect.Field r0 = m.AbstractC1323o0.f14840a
            if (r0 == 0) goto Le4
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.IllegalAccessException -> Le0
            goto Le5
        Le0:
            r0 = move-exception
            r0.printStackTrace()
        Le4:
            r0 = 0
        Le5:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L10a
            r0 = r0 ^ 1
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r4) goto Lf5
            m.AbstractC1319m0.b(r1, r0)
            goto L105
        Lf5:
            java.lang.reflect.Field r4 = m.AbstractC1323o0.f14840a
            if (r4 == 0) goto L105
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> L101
            r4.set(r1, r0)     // Catch: java.lang.IllegalAccessException -> L101
            goto L105
        L101:
            r0 = move-exception
            r0.printStackTrace()
        L105:
            if (r8 == r9) goto L10a
            r1.refreshDrawableState()
        L10a:
            if (r12 == 0) goto L126
            float r0 = r5.exactCenterX()
            float r4 = r5.exactCenterY()
            int r5 = r1.getVisibility()
            if (r5 != 0) goto L11e
            r5 = r16
        L11c:
            r12 = 0
            goto L120
        L11e:
            r5 = 0
            goto L11c
        L120:
            r11.setVisible(r5, r12)
            r11.setHotspot(r0, r4)
        L126:
            android.graphics.drawable.Drawable r0 = r1.getSelector()
            if (r0 == 0) goto L131
            if (r8 == r9) goto L131
            r0.setHotspot(r7, r6)
        L131:
            m.n0 r0 = r1.f14853w
            if (r0 == 0) goto L138
            r12 = 0
            r0.f14836r = r12
        L138:
            r1.refreshDrawableState()
            r4 = r16
            if (r3 != r4) goto L146
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L146:
            r0 = 1
            r5 = 0
        L148:
            if (r0 == 0) goto L14c
            if (r5 == 0) goto L165
        L14c:
            r12 = 0
            r1.f14856z = r12
            r1.setPressed(r12)
            r1.drawableStateChanged()
            int r3 = r1.f14852v
            int r4 = r1.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L165
            r3.setPressed(r12)
        L165:
            if (r0 == 0) goto L17d
            A1.e r3 = r1.f14845A
            if (r3 != 0) goto L172
            A1.e r3 = new A1.e
            r3.<init>(r1)
            r1.f14845A = r3
        L172:
            A1.e r3 = r1.f14845A
            boolean r4 = r3.f188F
            r4 = 1
            r3.f188F = r4
            r3.onTouch(r1, r2)
            goto L18b
        L17d:
            A1.e r2 = r1.f14845A
            if (r2 == 0) goto L18b
            boolean r3 = r2.f188F
            if (r3 == 0) goto L188
            r2.d()
        L188:
            r12 = 0
            r2.f188F = r12
        L18b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1325p0.b(android.view.MotionEvent, int):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f14847q;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f14846B != null) {
            return;
        }
        super.drawableStateChanged();
        C1321n0 c1321n0 = this.f14853w;
        if (c1321n0 != null) {
            c1321n0.f14836r = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f14856z && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f14855y || super.hasFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f14855y || super.hasWindowFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isFocused() {
        return this.f14855y || super.isFocused();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f14855y && this.f14854x) || super.isInTouchMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f14846B = null;
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f14846B == null) {
            A1.b bVar = new A1.b(19, this);
            this.f14846B = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC1317l0.f14830d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1317l0.f14827a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1317l0.f14828b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC1317l0.f14829c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (InvocationTargetException e8) {
                        e8.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f14856z && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f14852v = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        A1.b bVar = this.f14846B;
        if (bVar != null) {
            C1325p0 c1325p0 = (C1325p0) bVar.f181r;
            c1325p0.f14846B = null;
            c1325p0.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setListSelectionHidden(boolean z5) {
        this.f14854x = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1321n0 c1321n0 = null;
        if (drawable != null) {
            C1321n0 c1321n02 = new C1321n0();
            Drawable drawable2 = c1321n02.f14835q;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1321n02.f14835q = drawable;
            drawable.setCallback(c1321n02);
            c1321n02.f14836r = true;
            c1321n0 = c1321n02;
        }
        this.f14853w = c1321n0;
        super.setSelector(c1321n0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f14848r = rect.left;
        this.f14849s = rect.top;
        this.f14850t = rect.right;
        this.f14851u = rect.bottom;
    }
}
