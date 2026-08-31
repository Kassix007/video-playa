.class public final LU4/g0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LR4/k1;


# direct methods
.method public constructor <init>(LR4/k1;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/g0;->r:LR4/k1;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 1

    .line 1
    new-instance p1, LU4/g0;

    .line 2
    .line 3
    iget-object v0, p0, LU4/g0;->r:LR4/k1;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LU4/g0;-><init>(LR4/k1;Lq5/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, LU4/g0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/g0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, LU4/g0;->q:I

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
    iput v1, p0, LU4/g0;->q:I

    .line 24
    .line 25
    const-wide/16 v0, 0xc8

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
    iget-object p1, p0, LU4/g0;->r:LR4/k1;

    .line 37
    .line 38
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object v0, v0, LR4/i;->Q:Ljava/lang/Boolean;

    .line 44
    .line 45
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move v0, v1

    .line 53
    :goto_1
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    iget-object v0, p1, LR4/k1;->l:Lk5/b;

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    iget-object v0, v0, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 62
    .line 63
    if-eqz v0, :cond_6

    .line 64
    .line 65
    iget-object v1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 66
    .line 67
    new-instance v3, LU4/o;

    .line 68
    .line 69
    const/4 v4, 0x4

    .line 70
    invoke-direct {v3, p1, v4}, LU4/o;-><init>(LR4/k1;I)V

    .line 71
    .line 72
    .line 73
    new-instance p1, LR4/N;

    .line 74
    .line 75
    const/4 v4, 0x5

    .line 76
    invoke-direct {p1, v3, v4}, LR4/N;-><init>(LB5/c;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 80
    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_4
    iget v0, p1, LR4/k1;->f:I

    .line 84
    .line 85
    const/4 v3, -0x1

    .line 86
    if-eq v0, v3, :cond_5

    .line 87
    .line 88
    sget-boolean v0, LU4/a;->e:Z

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    sput-boolean v1, LU4/a;->e:Z

    .line 93
    .line 94
    invoke-static {p1}, LU4/a;->C(LR4/k1;)V

    .line 95
    .line 96
    .line 97
    return-object v2

    .line 98
    :cond_5
    iget-object v0, p1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/webkit/WebView;->getProgress()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/16 v3, 0x46

    .line 108
    .line 109
    if-lt v0, v3, :cond_7

    .line 110
    .line 111
    sget-boolean v0, LU4/a;->e:Z

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    sput-boolean v1, LU4/a;->e:Z

    .line 116
    .line 117
    invoke-static {p1}, LU4/a;->C(LR4/k1;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    return-object v2

    .line 121
    :cond_7
    :try_start_0
    invoke-static {p1}, LU4/a;->x(LR4/k1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    .line 123
    .line 124
    return-object v2

    .line 125
    :catch_0
    move-exception p1

    .line 126
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 127
    .line 128
    .line 129
    return-object v2
.end method
