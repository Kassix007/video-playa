.class public final LQ5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/i;


# instance fields
.field public final synthetic q:LO5/e;

.field public final synthetic r:I


# direct methods
.method public constructor <init>(LO5/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ5/r;->q:LO5/e;

    .line 5
    .line 6
    iput p2, p0, LQ5/r;->r:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, LQ5/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LQ5/q;

    .line 7
    .line 8
    iget v1, v0, LQ5/q;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LQ5/q;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LQ5/q;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LQ5/q;-><init>(LQ5/r;Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LQ5/q;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LQ5/q;->s:I

    .line 28
    .line 29
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v4, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_7

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Ln5/v;

    .line 61
    .line 62
    iget v1, p0, LQ5/r;->r:I

    .line 63
    .line 64
    invoke-direct {p2, v1, p1}, Ln5/v;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput v4, v0, LQ5/q;->s:I

    .line 68
    .line 69
    iget-object p1, p0, LQ5/r;->q:LO5/e;

    .line 70
    .line 71
    invoke-interface {p1, p2, v0}, LO5/w;->k(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v5, :cond_4

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_4
    :goto_1
    iput v3, v0, LQ5/q;->s:I

    .line 79
    .line 80
    invoke-interface {v0}, Lq5/c;->getContext()Lq5/h;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, LM5/y;->i(Lq5/h;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    instance-of v0, p2, LR5/g;

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    check-cast p2, LR5/g;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    const/4 p2, 0x0

    .line 99
    :goto_2
    if-nez p2, :cond_6

    .line 100
    .line 101
    move-object p1, v2

    .line 102
    goto :goto_4

    .line 103
    :cond_6
    iget-object v0, p2, LR5/g;->t:LM5/s;

    .line 104
    .line 105
    invoke-static {v0, p1}, LR5/b;->j(LM5/s;Lq5/h;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_7

    .line 110
    .line 111
    iput-object v2, p2, LR5/g;->v:Ljava/lang/Object;

    .line 112
    .line 113
    iput v4, p2, LM5/F;->s:I

    .line 114
    .line 115
    invoke-virtual {v0, p1, p2}, LM5/s;->dispatchYield(Lq5/h;Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    new-instance v1, LM5/B0;

    .line 120
    .line 121
    sget-object v3, LM5/B0;->q:LM5/t;

    .line 122
    .line 123
    invoke-direct {v1, v3}, Lq5/a;-><init>(Lq5/g;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, v1}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object v2, p2, LR5/g;->v:Ljava/lang/Object;

    .line 131
    .line 132
    iput v4, p2, LM5/F;->s:I

    .line 133
    .line 134
    invoke-virtual {v0, p1, p2}, LM5/s;->dispatchYield(Lq5/h;Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    :goto_3
    move-object p1, v5

    .line 138
    :goto_4
    if-ne p1, v5, :cond_8

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_8
    move-object p1, v2

    .line 142
    :goto_5
    if-ne p1, v5, :cond_9

    .line 143
    .line 144
    :goto_6
    return-object v5

    .line 145
    :cond_9
    :goto_7
    return-object v2
.end method
