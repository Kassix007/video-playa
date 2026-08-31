.class public final LM/K;
.super LC0/a;
.source "SourceFile"


# instance fields
.field public final A:Lu/c;

.field public final B:LM5/w;

.field public final C:LP/f0;

.field public D:Ljava/lang/Object;

.field public E:Z

.field public final y:Z

.field public final z:LB5/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLB5/a;Lu/c;LM5/w;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LC0/a;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, LM/K;->y:Z

    .line 5
    .line 6
    iput-object p3, p0, LM/K;->z:LB5/a;

    .line 7
    .line 8
    iput-object p4, p0, LM/K;->A:Lu/c;

    .line 9
    .line 10
    iput-object p5, p0, LM/K;->B:LM5/w;

    .line 11
    .line 12
    sget-object p1, LM/o;->a:LX/e;

    .line 13
    .line 14
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, LM/K;->C:LP/f0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(ILP/o;)V
    .locals 2

    .line 1
    const v0, 0x225fdedf

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p1

    .line 18
    and-int/lit8 v0, v0, 0x3

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p2}, LP/o;->x()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {p2}, LP/o;->N()V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    :goto_1
    iget-object v0, p0, LM/K;->C:LP/f0;

    .line 34
    .line 35
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, LB5/e;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v0, p2, v1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :goto_2
    invoke-virtual {p2}, LP/o;->r()LP/o0;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    new-instance v0, LA/e0;

    .line 56
    .line 57
    const/4 v1, 0x5

    .line 58
    invoke-direct {v0, p1, v1, p0}, LA/e0;-><init>(IILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p2, LP/o0;->d:LB5/e;

    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LM/K;->E:Z

    .line 2
    .line 3
    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, LC0/a;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LM/K;->y:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x21

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object v1, p0, LM/K;->D:Ljava/lang/Object;

    .line 16
    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    const/16 v1, 0x22

    .line 20
    .line 21
    iget-object v2, p0, LM/K;->z:LB5/a;

    .line 22
    .line 23
    if-lt v0, v1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, LM/K;->A:Lu/c;

    .line 26
    .line 27
    iget-object v1, p0, LM/K;->B:LM5/w;

    .line 28
    .line 29
    invoke-static {v2, v0, v1}, LM/J;->a(LB5/a;Lu/c;LM5/w;)Landroid/window/OnBackAnimationCallback;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, LM0/a;->i(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v2}, LM/E;->a(LB5/a;)Landroid/window/OnBackInvokedCallback;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    iput-object v0, p0, LM/K;->D:Ljava/lang/Object;

    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, LM/K;->D:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {p0, v0}, LM/E;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    :goto_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x21

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LM/K;->D:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p0, v0}, LM/E;->c(Landroid/view/View;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, LM/K;->D:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method
