.class public final LU4/J;
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
    iput-object p1, p0, LU4/J;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, LU4/J;->r:LP/W;

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
    new-instance p1, LU4/J;

    .line 2
    .line 3
    iget-object v0, p0, LU4/J;->q:LR4/k1;

    .line 4
    .line 5
    iget-object v1, p0, LU4/J;->r:LP/W;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LU4/J;-><init>(LR4/k1;LP/W;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, LU4/J;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/J;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/J;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU4/J;->q:LR4/k1;

    .line 5
    .line 6
    iget-object v0, p1, LR4/k1;->Q:LR4/X1;

    .line 7
    .line 8
    iget-object v1, p0, LU4/J;->r:LP/W;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0, v2}, Lo2/m;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v1, p1, LR4/k1;->Q:LR4/X1;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-virtual {v1, v0}, Lo2/m;->setEnabled(Z)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {v1, v0}, Lo2/m;->setOnRefreshListener(Lo2/k;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, LU4/E;

    .line 50
    .line 51
    invoke-direct {v0, p1, v1}, LU4/E;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lo2/m;->setOnRefreshListener(Lo2/k;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lk3/c;

    .line 58
    .line 59
    invoke-direct {v0, p1}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, LR4/X1;->setCanChildScrollUpCallback(LR4/W1;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    if-eqz v1, :cond_2

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-virtual {v1, p1}, Lo2/m;->setEnabled(Z)V

    .line 70
    .line 71
    .line 72
    new-instance p1, LR4/L0;

    .line 73
    .line 74
    const/4 v0, 0x2

    .line 75
    invoke-direct {p1, v0, v1}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p1}, Lo2/m;->setOnRefreshListener(Lo2/k;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 82
    .line 83
    return-object p1
.end method
