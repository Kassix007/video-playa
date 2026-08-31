package C0;

import android.view.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public abstract class T0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
