.class public final LE2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:LE2/f;

.field public final synthetic r:Landroid/view/ViewTreeObserver;

.field public final synthetic s:LE2/k;


# direct methods
.method public constructor <init>(LE2/f;Landroid/view/ViewTreeObserver;LE2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE2/j;->q:LE2/f;

    .line 5
    .line 6
    iput-object p2, p0, LE2/j;->r:Landroid/view/ViewTreeObserver;

    .line 7
    .line 8
    iput-object p3, p0, LE2/j;->s:LE2/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object p1, p0, LE2/j;->r:Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, LE2/j;->s:LE2/k;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, LE2/j;->q:LE2/f;

    .line 18
    .line 19
    iget-object p1, p1, LE2/f;->q:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 29
    .line 30
    return-object p1
.end method
