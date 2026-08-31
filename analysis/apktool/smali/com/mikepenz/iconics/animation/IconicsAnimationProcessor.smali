.class public abstract Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm2/b;"
    }
.end annotation


# static fields
.field public static final Companion:LL4/f;

.field public static final DEFAULT_INTERPOLATOR:Landroid/view/animation/LinearInterpolator;

.field public static final INFINITE:I = -0x1


# instance fields
.field private final animator:Landroid/animation/ValueAnimator;

.field private drawable:LL4/c;

.field private duration:J

.field private interpolator:Landroid/animation/TimeInterpolator;

.field private isStartImmediately:Z

.field private isStartRequested:Z

.field private listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LL4/d;",
            ">;"
        }
    .end annotation
.end field

.field private pauseListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LL4/e;",
            ">;"
        }
    .end annotation
.end field

.field private final proxyListener:LL4/h;

.field private final proxyPauseListener$delegate:Lm5/h;

.field private repeatCount:I

.field private repeatMode:LL4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LL4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->Companion:LL4/f;

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->DEFAULT_INTERPOLATOR:Landroid/view/animation/LinearInterpolator;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 10
    sget-object v1, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->DEFAULT_INTERPOLATOR:Landroid/view/animation/LinearInterpolator;

    .line 11
    sget-object v5, LL4/g;->r:LL4/g;

    const/4 v6, 0x1

    const-wide/16 v2, 0x12c

    const/4 v4, -0x1

    move-object v0, p0

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;-><init>(Landroid/animation/TimeInterpolator;JILL4/g;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/animation/TimeInterpolator;JILL4/g;Z)V
    .locals 1

    const-string v0, "interpolator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repeatMode"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->interpolator:Landroid/animation/TimeInterpolator;

    .line 3
    iput-wide p2, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->duration:J

    .line 4
    iput p4, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->repeatCount:I

    .line 5
    iput-object p5, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->repeatMode:LL4/g;

    .line 6
    iput-boolean p6, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->isStartImmediately:Z

    const/4 p1, 0x2

    .line 7
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-string p2, "ofFloat(0f, 100f)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 8
    new-instance p1, LL4/h;

    invoke-direct {p1, p0}, LL4/h;-><init>(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)V

    iput-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->proxyListener:LL4/h;

    .line 9
    new-instance p1, LA0/d;

    const/4 p2, 0x7

    invoke-direct {p1, p2, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, Lm5/a;->d(LB5/a;)Lm5/o;

    move-result-object p1

    iput-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->proxyPauseListener$delegate:Lm5/h;

    return-void

    :array_0
    .array-data 4
        0x0
        0x42c80000    # 100.0f
    .end array-data
.end method

.method public static final synthetic access$getListeners$p(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPauseListeners$p(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final addListener(LL4/d;)Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;
    .locals 2

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->proxyListener:LL4/h;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object p0
.end method

.method public final addPauseListener(LL4/e;)Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;
    .locals 2

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->proxyPauseListener$delegate:Lm5/h;

    .line 20
    .line 21
    invoke-interface {v1}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, LL4/i;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    return-object p0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->create(Landroid/content/Context;)V

    sget-object p1, Lm5/y;->a:Lm5/y;

    return-object p1
.end method

.method public create(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object p1, LK4/a;->a:Ljava/util/HashMap;

    .line 3
    sget-object p1, LK4/a;->a:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->getAnimationTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public dependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lm2/b;",
            ">;>;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/mikepenz/iconics/typeface/IconicsInitializer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final end()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getAnimatedPercent()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "null cannot be cast to non-null type kotlin.Float"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljava/lang/Float;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public abstract getAnimationTag()Ljava/lang/String;
.end method

.method public final getDrawableBounds()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->drawable:LL4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final getDrawableState()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->drawable:LL4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->duration:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getInterpolator()Landroid/animation/TimeInterpolator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->interpolator:Landroid/animation/TimeInterpolator;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRepeatCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->repeatCount:I

    .line 2
    .line 3
    return v0
.end method

.method public getRepeatMode()LL4/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->repeatMode:LL4/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isPaused()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/Animator;->isPaused()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final isRunning()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isStartImmediately()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->isStartImmediately:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isStarted()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onDrawableAttached()V
    .locals 0

    return-void
.end method

.method public onDrawableDetached()V
    .locals 0

    return-void
.end method

.method public final pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public processPostDraw(Landroid/graphics/Canvas;)V
    .locals 1

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public processPreDraw(Landroid/graphics/Canvas;LK4/b;LK4/b;LK4/b;LK4/b;)V
    .locals 0

    .line 1
    const-string p1, "iconBrush"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "iconContourBrush"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "backgroundBrush"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "backgroundContourBrush"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final removeAllListeners()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->proxyListener:LL4/h;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->proxyPauseListener$delegate:Lm5/h;

    .line 30
    .line 31
    invoke-interface {v1}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, LL4/i;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->removePauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final removeListener(LL4/d;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->listeners:Ljava/util/List;

    .line 25
    .line 26
    iget-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->proxyListener:LL4/h;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final removePauseListener(LL4/e;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->pauseListeners:Ljava/util/List;

    .line 25
    .line 26
    iget-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->proxyPauseListener$delegate:Lm5/h;

    .line 29
    .line 30
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, LL4/i;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->removePauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->resume()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final reverse()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->reverse()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setDrawable$iconics_core(LL4/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->drawable:LL4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->drawable:LL4/c;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->onDrawableDetached()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->drawable:LL4/c;

    .line 12
    .line 13
    if-eqz p1, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->onDrawableAttached()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->isStartImmediately()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_2

    .line 23
    .line 24
    iget-boolean p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->isStartRequested:Z

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->start()Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_3
    iget-object p1, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final start()Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->getInterpolator()Landroid/animation/TimeInterpolator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->getDuration()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->getRepeatCount()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->getRepeatMode()LL4/g;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v1, v1, LL4/g;->q:I

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->drawable:LL4/c;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->isStartRequested:Z

    .line 45
    .line 46
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->animator:Landroid/animation/ValueAnimator;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->isStartRequested:Z

    .line 54
    .line 55
    return-object p0
.end method
