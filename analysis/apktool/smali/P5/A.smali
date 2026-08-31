.class public final LP5/A;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LP5/O;

.field public final synthetic s:LP5/h;

.field public final synthetic t:LP5/S;

.field public final synthetic u:Ljava/lang/Float;


# direct methods
.method public constructor <init>(LP5/O;LP5/h;LP5/S;Ljava/lang/Float;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP5/A;->r:LP5/O;

    .line 2
    .line 3
    iput-object p2, p0, LP5/A;->s:LP5/h;

    .line 4
    .line 5
    iput-object p3, p0, LP5/A;->t:LP5/S;

    .line 6
    .line 7
    iput-object p4, p0, LP5/A;->u:Ljava/lang/Float;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, LP5/A;

    .line 2
    .line 3
    iget-object v3, p0, LP5/A;->t:LP5/S;

    .line 4
    .line 5
    iget-object v4, p0, LP5/A;->u:Ljava/lang/Float;

    .line 6
    .line 7
    iget-object v1, p0, LP5/A;->r:LP5/O;

    .line 8
    .line 9
    iget-object v2, p0, LP5/A;->s:LP5/h;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LP5/A;-><init>(LP5/O;LP5/h;LP5/S;Ljava/lang/Float;Lq5/c;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, LP5/A;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LP5/A;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LP5/A;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LP5/A;->q:I

    .line 4
    .line 5
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, LP5/A;->s:LP5/h;

    .line 11
    .line 12
    const/4 v7, 0x2

    .line 13
    iget-object v8, v0, LP5/A;->t:LP5/S;

    .line 14
    .line 15
    sget-object v9, Lr5/a;->q:Lr5/a;

    .line 16
    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    if-eq v1, v5, :cond_3

    .line 20
    .line 21
    if-eq v1, v7, :cond_2

    .line 22
    .line 23
    if-eq v1, v4, :cond_1

    .line 24
    .line 25
    if-ne v1, v3, :cond_0

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_2
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_4
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v1, LP5/K;->a:LP5/L;

    .line 55
    .line 56
    iget-object v10, v0, LP5/A;->r:LP5/O;

    .line 57
    .line 58
    if-ne v10, v1, :cond_5

    .line 59
    .line 60
    iput v5, v0, LP5/A;->q:I

    .line 61
    .line 62
    invoke-interface {v6, v8, v0}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-ne v1, v9, :cond_a

    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_5
    sget-object v1, LP5/K;->b:LP5/L;

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    if-ne v10, v1, :cond_7

    .line 74
    .line 75
    invoke-virtual {v8}, LQ5/b;->f()LQ5/D;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v3, LP5/y;

    .line 80
    .line 81
    invoke-direct {v3, v7, v11}, Ls5/i;-><init>(ILq5/c;)V

    .line 82
    .line 83
    .line 84
    iput v7, v0, LP5/A;->q:I

    .line 85
    .line 86
    invoke-static {v1, v3, v0}, LP5/H;->i(LP5/h;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-ne v1, v9, :cond_6

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    :goto_0
    iput v4, v0, LP5/A;->q:I

    .line 94
    .line 95
    invoke-interface {v6, v8, v0}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-ne v1, v9, :cond_a

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    invoke-virtual {v8}, LQ5/b;->f()LQ5/D;

    .line 103
    .line 104
    .line 105
    move-result-object v14

    .line 106
    new-instance v13, LP5/M;

    .line 107
    .line 108
    invoke-direct {v13, v10, v11}, LP5/M;-><init>(LP5/O;Lq5/c;)V

    .line 109
    .line 110
    .line 111
    sget v1, LP5/u;->a:I

    .line 112
    .line 113
    new-instance v12, LQ5/o;

    .line 114
    .line 115
    sget-object v15, Lq5/i;->q:Lq5/i;

    .line 116
    .line 117
    const/16 v16, -0x2

    .line 118
    .line 119
    sget-object v17, LO5/a;->q:LO5/a;

    .line 120
    .line 121
    invoke-direct/range {v12 .. v17}, LQ5/o;-><init>(LB5/f;LP5/h;Lq5/h;ILO5/a;)V

    .line 122
    .line 123
    .line 124
    new-instance v1, LP5/N;

    .line 125
    .line 126
    invoke-direct {v1, v7, v11}, Ls5/i;-><init>(ILq5/c;)V

    .line 127
    .line 128
    .line 129
    new-instance v4, LP5/r;

    .line 130
    .line 131
    invoke-direct {v4, v12, v1, v5}, LP5/r;-><init>(LP5/h;Lm5/e;I)V

    .line 132
    .line 133
    .line 134
    invoke-static {v4}, LP5/H;->g(LP5/h;)LP5/h;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v1}, LP5/H;->g(LP5/h;)LP5/h;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v4, LP5/z;

    .line 143
    .line 144
    iget-object v5, v0, LP5/A;->u:Ljava/lang/Float;

    .line 145
    .line 146
    invoke-direct {v4, v6, v8, v5, v11}, LP5/z;-><init>(LP5/h;LP5/S;Ljava/lang/Float;Lq5/c;)V

    .line 147
    .line 148
    .line 149
    iput v3, v0, LP5/A;->q:I

    .line 150
    .line 151
    new-instance v3, LP5/t;

    .line 152
    .line 153
    invoke-direct {v3, v4, v11}, LP5/t;-><init>(LB5/e;Lq5/c;)V

    .line 154
    .line 155
    .line 156
    move-object/from16 v18, v15

    .line 157
    .line 158
    new-instance v15, LQ5/o;

    .line 159
    .line 160
    const/16 v19, -0x2

    .line 161
    .line 162
    move-object/from16 v16, v3

    .line 163
    .line 164
    move-object/from16 v20, v17

    .line 165
    .line 166
    move-object/from16 v17, v1

    .line 167
    .line 168
    invoke-direct/range {v15 .. v20}, LQ5/o;-><init>(LB5/f;LP5/h;Lq5/h;ILO5/a;)V

    .line 169
    .line 170
    .line 171
    const/4 v1, 0x0

    .line 172
    invoke-static {v15, v1}, LP5/H;->e(LP5/h;I)LP5/h;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    sget-object v3, LQ5/x;->q:LQ5/x;

    .line 177
    .line 178
    invoke-interface {v1, v3, v0}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-ne v1, v9, :cond_8

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_8
    move-object v1, v2

    .line 186
    :goto_1
    if-ne v1, v9, :cond_9

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_9
    move-object v1, v2

    .line 190
    :goto_2
    if-ne v1, v9, :cond_a

    .line 191
    .line 192
    :goto_3
    return-object v9

    .line 193
    :cond_a
    return-object v2
.end method
