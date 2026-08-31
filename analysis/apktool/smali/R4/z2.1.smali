.class public final LR4/z2;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LB0/o;

.field public final synthetic r:LP/c0;


# direct methods
.method public constructor <init>(LB0/o;LP/c0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/z2;->q:LB0/o;

    .line 2
    .line 3
    iput-object p2, p0, LR4/z2;->r:LP/c0;

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
    new-instance p1, LR4/z2;

    .line 2
    .line 3
    iget-object v0, p0, LR4/z2;->q:LB0/o;

    .line 4
    .line 5
    iget-object v1, p0, LR4/z2;->r:LP/c0;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LR4/z2;-><init>(LB0/o;LP/c0;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, LR4/z2;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/z2;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/z2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LR4/z2;->q:LB0/o;

    .line 5
    .line 6
    iget-object v0, p1, LB0/o;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LR4/k1;

    .line 9
    .line 10
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-object v1, v1, LR4/i;->n:LR4/w2;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v3, v1, LR4/w2;->a:Ljava/util/List;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v3, v2

    .line 25
    :goto_0
    if-eqz v3, :cond_2

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget-object v1, v1, LR4/w2;->a:Ljava/util/List;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast v1, Ljava/util/Collection;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v3, 0x1

    .line 40
    xor-int/2addr v1, v3

    .line 41
    if-ne v1, v3, :cond_2

    .line 42
    .line 43
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v1, v1, LR4/i;->n:LR4/w2;

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    iget-object v2, v1, LR4/w2;->a:Ljava/util/List;

    .line 52
    .line 53
    :cond_1
    iget-object v1, v0, LR4/k1;->l:Lk5/b;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v1, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget-object v3, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 62
    .line 63
    new-instance v4, LR4/y2;

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    iget-object v6, p0, LR4/z2;->r:LP/c0;

    .line 67
    .line 68
    invoke-direct {v4, v2, p1, v6, v5}, LR4/y2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    new-instance v2, LR4/N;

    .line 72
    .line 73
    const/4 v5, 0x3

    .line 74
    invoke-direct {v2, v4, v5}, LR4/N;-><init>(LB5/c;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v3, v2}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-object v1, v0, LR4/k1;->s:Lj5/c;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    iget-object v1, v1, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    iget-object v0, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 89
    .line 90
    new-instance v2, LR4/x2;

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    invoke-direct {v2, v3, p1}, LR4/x2;-><init>(ILB0/o;)V

    .line 94
    .line 95
    .line 96
    new-instance p1, LR4/N;

    .line 97
    .line 98
    const/4 v3, 0x3

    .line 99
    invoke-direct {p1, v2, v3}, LR4/N;-><init>(LB5/c;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 106
    .line 107
    return-object p1
.end method
