package m;

import B0.C0050o;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import g.AbstractC1066a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o1.InterfaceC1413a;

/* JADX INFO: renamed from: m.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1344z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f14912d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14913a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14915c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1344z() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0050o) ((k3.d) this.f14915c).f14122r).getClass();
        if (keyListener instanceof G1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new G1.e(keyListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(AttributeSet attributeSet, int i) {
        switch (this.f14913a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f14914b;
                B0.G0 g0N = B0.G0.N(absSeekBar.getContext(), attributeSet, f14912d, i);
                Drawable drawableZ = g0N.z(0);
                if (drawableZ != null) {
                    if (drawableZ instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableZ;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i7 = 0; i7 < numberOfFrames; i7++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i7), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i7));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableZ = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableZ);
                }
                Drawable drawableZ2 = g0N.z(1);
                if (drawableZ2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableZ2, false));
                }
                g0N.R();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f14914b).getContext().obtainStyledAttributes(attributeSet, AbstractC1066a.i, i, 0);
                try {
                    boolean z5 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z5 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z5);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        k3.d dVar = (k3.d) this.f14915c;
        if (inputConnection == null) {
            dVar.getClass();
            inputConnection = null;
        } else {
            C0050o c0050o = (C0050o) dVar.f14122r;
            c0050o.getClass();
            if (!(inputConnection instanceof G1.b)) {
                inputConnection = new G1.b((EditText) c0050o.f499q, inputConnection, editorInfo);
            }
        }
        return (G1.b) inputConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(boolean z5) {
        G1.i iVar = (G1.i) ((C0050o) ((k3.d) this.f14915c).f14122r).f500r;
        if (iVar.f1995s != z5) {
            if (iVar.f1994r != null) {
                E1.l lVarA = E1.l.a();
                G1.h hVar = iVar.f1994r;
                lVarA.getClass();
                E3.h.p(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lVarA.f1639a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lVarA.f1640b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f1995s = z5;
            if (z5) {
                G1.i.a(iVar.f1993q, E1.l.a().b());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z5) {
        if (drawable instanceof InterfaceC1413a) {
            ((o1.b) ((InterfaceC1413a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    layerDrawable2.setId(i7, layerDrawable.getId(i7));
                    layerDrawable2.setLayerGravity(i7, layerDrawable.getLayerGravity(i7));
                    layerDrawable2.setLayerWidth(i7, layerDrawable.getLayerWidth(i7));
                    layerDrawable2.setLayerHeight(i7, layerDrawable.getLayerHeight(i7));
                    layerDrawable2.setLayerInsetLeft(i7, layerDrawable.getLayerInsetLeft(i7));
                    layerDrawable2.setLayerInsetRight(i7, layerDrawable.getLayerInsetRight(i7));
                    layerDrawable2.setLayerInsetTop(i7, layerDrawable.getLayerInsetTop(i7));
                    layerDrawable2.setLayerInsetBottom(i7, layerDrawable.getLayerInsetBottom(i7));
                    layerDrawable2.setLayerInsetStart(i7, layerDrawable.getLayerInsetStart(i7));
                    layerDrawable2.setLayerInsetEnd(i7, layerDrawable.getLayerInsetEnd(i7));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f14915c) == null) {
                    this.f14915c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z5 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1344z(AbsSeekBar absSeekBar) {
        this.f14914b = absSeekBar;
    }

    public C1344z(EditText editText) {
        this.f14914b = editText;
        this.f14915c = new k3.d(editText);
    }
}
