.class public final LR4/I0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/c0;


# direct methods
.method public constructor <init>(LR4/k1;LP/c0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/I0;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, LR4/I0;->r:LP/c0;

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
    new-instance p1, LR4/I0;

    .line 2
    .line 3
    iget-object v0, p0, LR4/I0;->q:LR4/k1;

    .line 4
    .line 5
    iget-object v1, p0, LR4/I0;->r:LP/c0;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LR4/I0;-><init>(LR4/k1;LP/c0;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, LR4/I0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/I0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/I0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object p1, p0, LR4/I0;->q:LR4/k1;

    .line 5
    .line 6
    iget-object v0, p1, LR4/k1;->l:Lk5/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 15
    .line 16
    new-instance v2, LN5/d;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    iget-object v4, p0, LR4/I0;->r:LP/c0;

    .line 20
    .line 21
    invoke-direct {v2, v3, p1, v4}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, LR4/J0;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {p1, v2, v3}, LR4/J0;-><init>(LB5/c;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 34
    .line 35
    return-object p1
.end method
