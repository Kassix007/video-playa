.class public final LL4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;


# direct methods
.method public constructor <init>(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL4/h;->a:Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LL4/h;->a:Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->access$getListeners$p(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {p1}, Lk1/i;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    throw p1

    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, LL4/h;->a:Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    invoke-static {p1}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->access$getListeners$p(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p1}, Lk1/i;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    .line 12
    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0

    const-string p2, "animation"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, LL4/h;->a:Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    invoke-static {p1}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->access$getListeners$p(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    .line 2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Lk1/i;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    .line 4
    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LL4/h;->a:Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->access$getListeners$p(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {p1}, Lk1/i;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    throw p1

    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, LL4/h;->a:Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    invoke-static {p1}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->access$getListeners$p(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p1}, Lk1/i;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    .line 12
    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 0

    const-string p2, "animation"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, LL4/h;->a:Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    invoke-static {p1}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->access$getListeners$p(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    .line 2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Lk1/i;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    .line 4
    throw p1

    :cond_1
    :goto_0
    return-void
.end method
