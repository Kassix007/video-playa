.class public final LU1/A;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lu/d0;

.field public final synthetic t:LT1/d;

.field public final synthetic u:Lu/v0;


# direct methods
.method public constructor <init>(Lu/d0;LT1/d;Lu/v0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU1/A;->s:Lu/d0;

    .line 2
    .line 3
    iput-object p2, p0, LU1/A;->t:LT1/d;

    .line 4
    .line 5
    iput-object p3, p0, LU1/A;->u:Lu/v0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 4

    .line 1
    new-instance v0, LU1/A;

    .line 2
    .line 3
    iget-object v1, p0, LU1/A;->t:LT1/d;

    .line 4
    .line 5
    iget-object v2, p0, LU1/A;->u:Lu/v0;

    .line 6
    .line 7
    iget-object v3, p0, LU1/A;->s:Lu/d0;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, LU1/A;-><init>(Lu/d0;LT1/d;Lu/v0;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LU1/A;->r:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, LU1/A;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU1/A;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU1/A;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, LU1/A;->q:I

    .line 2
    .line 3
    sget-object v6, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v6

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v6

    .line 29
    :cond_2
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, LU1/A;->r:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LM5/w;

    .line 35
    .line 36
    iget-object v3, p0, LU1/A;->s:Lu/d0;

    .line 37
    .line 38
    iget-object v5, v3, Lu/d0;->t:LP/f0;

    .line 39
    .line 40
    iget-object v7, v3, Lu/d0;->y:LP/b0;

    .line 41
    .line 42
    invoke-virtual {v5}, LP/f0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v8, p0, LU1/A;->t:LT1/d;

    .line 47
    .line 48
    invoke-static {v5, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v9, 0x0

    .line 53
    sget-object v10, Lr5/a;->q:Lr5/a;

    .line 54
    .line 55
    if-nez v5, :cond_5

    .line 56
    .line 57
    iput v2, p0, LU1/A;->q:I

    .line 58
    .line 59
    iget-object v0, v3, Lu/d0;->v:Lu/v0;

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object v1, v3, Lu/d0;->B:Lu/O;

    .line 65
    .line 66
    new-instance v2, Lu/V;

    .line 67
    .line 68
    invoke-direct {v2, v8, v9, v3, v0}, Lu/V;-><init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v2, p0}, Lu/O;->a(Lu/O;LB5/c;Lq5/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-ne v0, v10, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    :goto_0
    move-object v0, v6

    .line 79
    :goto_1
    if-ne v0, v10, :cond_6

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    iget-object v2, p0, LU1/A;->u:Lu/v0;

    .line 83
    .line 84
    iget-object v2, v2, Lu/v0;->l:LP/C;

    .line 85
    .line 86
    invoke-virtual {v2}, LP/C;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide v11

    .line 96
    const v2, 0xf4240

    .line 97
    .line 98
    .line 99
    int-to-long v13, v2

    .line 100
    div-long/2addr v11, v13

    .line 101
    invoke-virtual {v7}, LP/b0;->e()F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {v7}, LP/b0;->e()F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    long-to-float v7, v11

    .line 110
    mul-float/2addr v5, v7

    .line 111
    float-to-int v5, v5

    .line 112
    const/4 v7, 0x6

    .line 113
    invoke-static {v5, v7, v9}, Lu/d;->p(IILu/x;)Lu/z0;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    new-instance v7, LU1/s;

    .line 118
    .line 119
    invoke-direct {v7, v0, v3, v8}, LU1/s;-><init>(LM5/w;Lu/d0;LT1/d;)V

    .line 120
    .line 121
    .line 122
    iput v1, p0, LU1/A;->q:I

    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    move v0, v2

    .line 126
    move-object v2, v5

    .line 127
    const/4 v5, 0x4

    .line 128
    move-object v4, p0

    .line 129
    move-object v3, v7

    .line 130
    invoke-static/range {v0 .. v5}, Lu/d;->d(FFLu/k;LB5/e;Ls5/i;I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-ne v0, v10, :cond_6

    .line 135
    .line 136
    :goto_2
    return-object v10

    .line 137
    :cond_6
    return-object v6
.end method
