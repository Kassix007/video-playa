.class public final LR4/M0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LR4/s0;

.field public final synthetic s:Lw1/o0;


# direct methods
.method public constructor <init>(LR4/s0;Lw1/o0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/M0;->r:LR4/s0;

    .line 2
    .line 3
    iput-object p2, p0, LR4/M0;->s:Lw1/o0;

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
    new-instance p1, LR4/M0;

    .line 2
    .line 3
    iget-object v0, p0, LR4/M0;->r:LR4/s0;

    .line 4
    .line 5
    iget-object v1, p0, LR4/M0;->s:Lw1/o0;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LR4/M0;-><init>(LR4/s0;Lw1/o0;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, LR4/M0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/M0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/M0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LR4/M0;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput v1, p0, LR4/M0;->q:I

    .line 24
    .line 25
    const-wide/16 v0, 0x5dc

    .line 26
    .line 27
    invoke-static {v0, v1, p0}, LM5/y;->h(JLs5/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 32
    .line 33
    if-ne p1, v0, :cond_2

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    :goto_0
    iget-object p1, p0, LR4/M0;->r:LR4/s0;

    .line 37
    .line 38
    iget-object v0, p1, LR4/s0;->b:LR4/k1;

    .line 39
    .line 40
    iget-object v1, v0, LR4/k1;->t:Lj5/d;

    .line 41
    .line 42
    iget-object v1, v1, Lj5/d;->p:Landroidx/lifecycle/J;

    .line 43
    .line 44
    iget-object v0, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 45
    .line 46
    new-instance v2, LN5/d;

    .line 47
    .line 48
    const/4 v3, 0x2

    .line 49
    iget-object v4, p0, LR4/M0;->s:Lw1/o0;

    .line 50
    .line 51
    invoke-direct {v2, v3, p1, v4}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, LR4/N;

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-direct {p1, v2, v3}, LR4/N;-><init>(LB5/c;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 64
    .line 65
    return-object p1
.end method
