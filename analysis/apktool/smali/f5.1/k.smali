.class public final Lf5/k;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;


# direct methods
.method public constructor <init>(LR4/k1;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf5/k;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, Lf5/k;->r:LP/W;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance p1, Lf5/k;

    .line 2
    .line 3
    iget-object v0, p0, Lf5/k;->q:LR4/k1;

    .line 4
    .line 5
    iget-object v1, p0, Lf5/k;->r:LP/W;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lf5/k;-><init>(LR4/k1;LP/W;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lf5/k;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lf5/k;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lf5/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lf5/k;->q:LR4/k1;

    .line 5
    .line 6
    iget-object v0, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 7
    .line 8
    invoke-virtual {v0}, Lh/h;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lf5/k;->r:LP/W;

    .line 29
    .line 30
    invoke-interface {v1, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p1, LR4/k1;->s:Lj5/c;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v2, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 42
    .line 43
    new-instance v3, LU4/f;

    .line 44
    .line 45
    const/4 v4, 0x3

    .line 46
    invoke-direct {v3, p1, v1, v4}, LU4/f;-><init>(LR4/k1;LP/W;I)V

    .line 47
    .line 48
    .line 49
    new-instance p1, LR4/N;

    .line 50
    .line 51
    const/16 v1, 0x9

    .line 52
    .line 53
    invoke-direct {p1, v3, v1}, LR4/N;-><init>(LB5/c;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 60
    .line 61
    return-object p1
.end method
