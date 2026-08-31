.class public final Lw/O0;
.super Ls5/h;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public r:LM5/B;

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:LM5/w;

.field public final synthetic v:Lv/w;

.field public final synthetic w:Lm0/a;

.field public final synthetic x:Lw/g0;


# direct methods
.method public constructor <init>(LM5/w;Lv/w;Lm0/a;Lw/g0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/O0;->u:LM5/w;

    .line 2
    .line 3
    iput-object p2, p0, Lw/O0;->v:Lv/w;

    .line 4
    .line 5
    iput-object p3, p0, Lw/O0;->w:Lm0/a;

    .line 6
    .line 7
    iput-object p4, p0, Lw/O0;->x:Lw/g0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/h;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, Lw/O0;

    .line 2
    .line 3
    iget-object v3, p0, Lw/O0;->w:Lm0/a;

    .line 4
    .line 5
    iget-object v4, p0, Lw/O0;->x:Lw/g0;

    .line 6
    .line 7
    iget-object v1, p0, Lw/O0;->u:LM5/w;

    .line 8
    .line 9
    iget-object v2, p0, Lw/O0;->v:Lv/w;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lw/O0;-><init>(LM5/w;Lv/w;Lm0/a;Lw/g0;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lw/O0;->t:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lw/O0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/O0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/O0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lw/O0;->s:I

    .line 2
    .line 3
    iget-object v1, p0, Lw/O0;->u:LM5/w;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, Lw/O0;->x:Lw/g0;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v3, :cond_1

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lw/O0;->t:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LM5/b0;

    .line 21
    .line 22
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v0, p0, Lw/O0;->r:LM5/B;

    .line 35
    .line 36
    iget-object v3, p0, Lw/O0;->t:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lv0/y;

    .line 39
    .line 40
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lw/O0;->t:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lv0/y;

    .line 50
    .line 51
    sget-object v0, Lw/g1;->a:Le3/u;

    .line 52
    .line 53
    new-instance v0, Lw/N0;

    .line 54
    .line 55
    invoke-direct {v0, v4, v5}, Lw/N0;-><init>(Lw/g0;Lq5/c;)V

    .line 56
    .line 57
    .line 58
    sget-object v7, LM5/x;->t:LM5/x;

    .line 59
    .line 60
    invoke-static {v1, v5, v7, v0, v3}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object p1, p0, Lw/O0;->t:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v0, p0, Lw/O0;->r:LM5/B;

    .line 67
    .line 68
    iput v3, p0, Lw/O0;->s:I

    .line 69
    .line 70
    const/4 v3, 0x3

    .line 71
    invoke-static {p1, p0, v3}, Lw/g1;->c(Lv0/y;Ls5/h;I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    if-ne v3, v6, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move-object v9, v3

    .line 79
    move-object v3, p1

    .line 80
    move-object p1, v9

    .line 81
    :goto_0
    check-cast p1, Lv0/l;

    .line 82
    .line 83
    invoke-virtual {p1}, Lv0/l;->a()V

    .line 84
    .line 85
    .line 86
    sget-object v7, Lw/g1;->a:Le3/u;

    .line 87
    .line 88
    iget-object v8, p0, Lw/O0;->v:Lv/w;

    .line 89
    .line 90
    if-eq v8, v7, :cond_4

    .line 91
    .line 92
    new-instance v7, Lw/K0;

    .line 93
    .line 94
    invoke-direct {v7, v8, v4, p1, v5}, Lw/K0;-><init>(Lv/w;Lw/g0;Lv0/l;Lq5/c;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v0, v7}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 98
    .line 99
    .line 100
    :cond_4
    iput-object v0, p0, Lw/O0;->t:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v5, p0, Lw/O0;->r:LM5/B;

    .line 103
    .line 104
    iput v2, p0, Lw/O0;->s:I

    .line 105
    .line 106
    sget-object p1, Lv0/g;->r:Lv0/g;

    .line 107
    .line 108
    invoke-static {v3, p1, p0}, Lw/g1;->g(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v6, :cond_5

    .line 113
    .line 114
    :goto_1
    return-object v6

    .line 115
    :cond_5
    :goto_2
    check-cast p1, Lv0/l;

    .line 116
    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    new-instance p1, Lw/L0;

    .line 120
    .line 121
    invoke-direct {p1, v4, v5}, Lw/L0;-><init>(Lw/g0;Lq5/c;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v0, p1}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    invoke-virtual {p1}, Lv0/l;->a()V

    .line 129
    .line 130
    .line 131
    new-instance p1, Lw/M0;

    .line 132
    .line 133
    invoke-direct {p1, v4, v5}, Lw/M0;-><init>(Lw/g0;Lq5/c;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v0, p1}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lw/O0;->w:Lm0/a;

    .line 140
    .line 141
    iget-object p1, p1, Lm0/a;->r:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p1, Lv/x;

    .line 144
    .line 145
    iget-boolean v0, p1, Lv/x;->J:Z

    .line 146
    .line 147
    if-eqz v0, :cond_7

    .line 148
    .line 149
    iget-object p1, p1, Lv/x;->K:LB5/a;

    .line 150
    .line 151
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    :cond_7
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 155
    .line 156
    return-object p1
.end method
