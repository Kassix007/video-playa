.class public final Lw/K;
.super Ls5/h;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lq5/h;

.field public final synthetic u:Ls5/h;


# direct methods
.method public constructor <init>(Lq5/h;LB5/e;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/K;->t:Lq5/h;

    .line 2
    .line 3
    check-cast p2, Ls5/h;

    .line 4
    .line 5
    iput-object p2, p0, Lw/K;->u:Ls5/h;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Ls5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, Lw/K;

    .line 2
    .line 3
    iget-object v1, p0, Lw/K;->t:Lq5/h;

    .line 4
    .line 5
    iget-object v2, p0, Lw/K;->u:Ls5/h;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lw/K;-><init>(Lq5/h;LB5/e;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lw/K;->s:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv0/y;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/K;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/K;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/K;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lw/K;->r:I

    .line 2
    .line 3
    sget-object v1, Lv0/g;->s:Lv0/g;

    .line 4
    .line 5
    iget-object v2, p0, Lw/K;->t:Lq5/h;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 11
    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    if-eq v0, v5, :cond_3

    .line 15
    .line 16
    if-eq v0, v4, :cond_1

    .line 17
    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lw/K;->s:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lv0/y;

    .line 23
    .line 24
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
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
    :cond_1
    iget-object v0, p0, Lw/K;->s:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lv0/y;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    move-object p1, v0

    .line 44
    goto :goto_1

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    iget-object v0, p0, Lw/K;->s:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lv0/y;

    .line 50
    .line 51
    :try_start_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lw/K;->s:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lv0/y;

    .line 61
    .line 62
    :goto_1
    invoke-static {v2}, LM5/y;->s(Lq5/h;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_7

    .line 67
    .line 68
    :try_start_2
    iget-object v0, p0, Lw/K;->u:Ls5/h;

    .line 69
    .line 70
    iput-object p1, p0, Lw/K;->s:Ljava/lang/Object;

    .line 71
    .line 72
    iput v5, p0, Lw/K;->r:I

    .line 73
    .line 74
    invoke-interface {v0, p1, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 78
    if-ne v0, v6, :cond_5

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_5
    move-object v0, p1

    .line 82
    :goto_2
    :try_start_3
    iput-object v0, p0, Lw/K;->s:Ljava/lang/Object;

    .line 83
    .line 84
    iput v4, p0, Lw/K;->r:I

    .line 85
    .line 86
    invoke-static {v0, v1, p0}, Lw/p0;->b(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 90
    if-ne p1, v6, :cond_2

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :catch_1
    move-exception v0

    .line 94
    move-object v8, v0

    .line 95
    move-object v0, p1

    .line 96
    move-object p1, v8

    .line 97
    :goto_3
    invoke-static {v2}, LM5/y;->s(Lq5/h;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_6

    .line 102
    .line 103
    iput-object v0, p0, Lw/K;->s:Ljava/lang/Object;

    .line 104
    .line 105
    iput v3, p0, Lw/K;->r:I

    .line 106
    .line 107
    invoke-static {v0, v1, p0}, Lw/p0;->b(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v6, :cond_2

    .line 112
    .line 113
    :goto_4
    return-object v6

    .line 114
    :cond_6
    throw p1

    .line 115
    :cond_7
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 116
    .line 117
    return-object p1
.end method
