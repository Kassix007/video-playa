.class public final Lw/Z;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lb2/a;


# direct methods
.method public constructor <init>(Lb2/a;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/Z;->s:Lb2/a;

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
    .locals 2

    .line 1
    new-instance v0, Lw/Z;

    .line 2
    .line 3
    iget-object v1, p0, Lw/Z;->s:Lb2/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lw/Z;-><init>(Lb2/a;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lw/Z;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lw/Z;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/Z;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/Z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lw/Z;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, Lw/Z;->s:Lb2/a;

    .line 7
    .line 8
    sget-object v10, Lr5/a;->q:Lr5/a;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-eq v0, v3, :cond_2

    .line 13
    .line 14
    if-ne v0, v2, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lw/Z;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LM5/w;

    .line 19
    .line 20
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    :cond_0
    move-object p1, v0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object p1, v0

    .line 27
    goto :goto_3

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_2
    iget-object v0, p0, Lw/Z;->r:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LM5/w;

    .line 39
    .line 40
    :try_start_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lw/Z;->r:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, LM5/w;

    .line 50
    .line 51
    :goto_0
    :try_start_2
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, LM5/y;->s(Lq5/h;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-object v0, v4, Lb2/a;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LO5/e;

    .line 64
    .line 65
    iput-object p1, p0, Lw/Z;->r:Ljava/lang/Object;

    .line 66
    .line 67
    iput v3, p0, Lw/Z;->q:I

    .line 68
    .line 69
    invoke-virtual {v0, p0}, LO5/e;->h(Ls5/i;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-ne v0, v10, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v11, v0

    .line 77
    move-object v0, p1

    .line 78
    move-object p1, v11

    .line 79
    :goto_1
    move-object v6, p1

    .line 80
    check-cast v6, Lw/Q;

    .line 81
    .line 82
    iget-object p1, v4, Lb2/a;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, LW0/c;

    .line 85
    .line 86
    sget v5, Lw/P;->a:F

    .line 87
    .line 88
    invoke-interface {p1, v5}, LW0/c;->u(F)F

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    iget-object p1, v4, Lb2/a;->e:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, LW0/c;

    .line 95
    .line 96
    sget v5, Lw/P;->b:F

    .line 97
    .line 98
    invoke-interface {p1, v5}, LW0/c;->u(F)F

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    iget-object p1, v4, Lb2/a;->b:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v5, p1

    .line 105
    check-cast v5, Lw/H0;

    .line 106
    .line 107
    iput-object v0, p0, Lw/Z;->r:Ljava/lang/Object;

    .line 108
    .line 109
    iput v2, p0, Lw/Z;->q:I

    .line 110
    .line 111
    move-object v9, p0

    .line 112
    invoke-static/range {v4 .. v9}, Lb2/a;->b(Lb2/a;Lw/H0;Lw/Q;FFLs5/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    if-ne p1, v10, :cond_0

    .line 117
    .line 118
    :goto_2
    return-object v10

    .line 119
    :cond_5
    iput-object v1, v4, Lb2/a;->g:Ljava/lang/Object;

    .line 120
    .line 121
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 122
    .line 123
    return-object p1

    .line 124
    :goto_3
    iput-object v1, v4, Lb2/a;->g:Ljava/lang/Object;

    .line 125
    .line 126
    throw p1
.end method
