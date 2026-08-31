package E1;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z extends SpannableStringBuilder {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Class f1674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f1675r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1675r = new ArrayList();
        E3.h.p(cls, "watcherClass cannot be null");
        this.f1674q = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1675r;
            if (i >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i)).f1673r.incrementAndGet();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1675r;
            if (i >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final y c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1675r;
            if (i >= arrayList.size()) {
                return null;
            }
            y yVar = (y) arrayList.get(i);
            if (yVar.f1672q == obj) {
                return yVar;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f1674q == obj.getClass();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i7) {
        super.delete(i, i7);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1675r;
            if (i >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i)).f1673r.decrementAndGet();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        y yVarC;
        if (d(obj) && (yVarC = c(obj)) != null) {
            obj = yVarC;
        }
        return super.getSpanEnd(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        y yVarC;
        if (d(obj) && (yVarC = c(obj)) != null) {
            obj = yVarC;
        }
        return super.getSpanFlags(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        y yVarC;
        if (d(obj) && (yVarC = c(obj)) != null) {
            obj = yVarC;
        }
        return super.getSpanStart(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i7, Class cls) {
        if (this.f1674q != cls) {
            return super.getSpans(i, i7, cls);
        }
        y[] yVarArr = (y[]) super.getSpans(i, i7, y.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, yVarArr.length);
        for (int i8 = 0; i8 < yVarArr.length; i8++) {
            objArr[i8] = yVarArr[i8].f1672q;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i7, Class cls) {
        if (cls == null || this.f1674q == cls) {
            cls = y.class;
        }
        return super.nextSpanTransition(i, i7, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        y yVarC;
        if (d(obj)) {
            yVarC = c(obj);
            if (yVarC != null) {
                obj = yVarC;
            }
        } else {
            yVarC = null;
        }
        super.removeSpan(obj);
        if (yVarC != null) {
            this.f1675r.remove(yVarC);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i7, CharSequence charSequence) {
        replace(i, i7, charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i7, int i8) {
        if (d(obj)) {
            y yVar = new y(obj);
            this.f1675r.add(yVar);
            obj = yVar;
        }
        super.setSpan(obj, i, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i7) {
        return new z(this.f1674q, this, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i7) {
        super.delete(i, i7);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i7, CharSequence charSequence, int i8, int i9) {
        replace(i, i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i7, int i8) {
        super.insert(i, charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i7, CharSequence charSequence) {
        a();
        super.replace(i, i7, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i7, int i8) {
        super.insert(i, charSequence, i7, i8);
        return this;
    }

    public z(Class cls, z zVar, int i, int i7) {
        super(zVar, i, i7);
        this.f1675r = new ArrayList();
        E3.h.p(cls, "watcherClass cannot be null");
        this.f1674q = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i7, CharSequence charSequence, int i8, int i9) {
        a();
        super.replace(i, i7, charSequence, i8, i9);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i7) {
        super.append(charSequence, i, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i7) {
        super.append(charSequence, i, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i7) {
        super.append(charSequence, i, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
