.class public final LU1/C;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lu/v0;

.field public final synthetic r:LT1/u;

.field public final synthetic s:Lr/A;

.field public final synthetic t:LP/S0;

.field public final synthetic u:LU1/i;


# direct methods
.method public constructor <init>(Lu/v0;LT1/u;Lr/A;LP/S0;LU1/i;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU1/C;->q:Lu/v0;

    .line 2
    .line 3
    iput-object p2, p0, LU1/C;->r:LT1/u;

    .line 4
    .line 5
    iput-object p3, p0, LU1/C;->s:Lr/A;

    .line 6
    .line 7
    iput-object p4, p0, LU1/C;->t:LP/S0;

    .line 8
    .line 9
    iput-object p5, p0, LU1/C;->u:LU1/i;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ls5/i;-><init>(ILq5/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 7

    .line 1
    new-instance v0, LU1/C;

    .line 2
    .line 3
    iget-object v4, p0, LU1/C;->t:LP/S0;

    .line 4
    .line 5
    iget-object v5, p0, LU1/C;->u:LU1/i;

    .line 6
    .line 7
    iget-object v1, p0, LU1/C;->q:Lu/v0;

    .line 8
    .line 9
    iget-object v2, p0, LU1/C;->r:LT1/u;

    .line 10
    .line 11
    iget-object v3, p0, LU1/C;->s:Lr/A;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, LU1/C;-><init>(Lu/v0;LT1/u;Lr/A;LP/S0;LU1/i;Lq5/c;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, LU1/C;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU1/C;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU1/C;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, LU1/C;->q:Lu/v0;

    .line 7
    .line 8
    iget-object v2, v1, Lu/v0;->a:LO3/D0;

    .line 9
    .line 10
    invoke-virtual {v2}, LO3/D0;->j()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v1, v1, Lu/v0;->d:LP/f0;

    .line 15
    .line 16
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_6

    .line 25
    .line 26
    iget-object v2, v0, LU1/C;->r:LT1/u;

    .line 27
    .line 28
    iget-object v3, v2, LT1/u;->b:LW1/j;

    .line 29
    .line 30
    iget-object v3, v3, LW1/j;->f:Ln5/j;

    .line 31
    .line 32
    invoke-virtual {v3}, Ln5/j;->l()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, LT1/d;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v2, v2, LT1/u;->b:LW1/j;

    .line 45
    .line 46
    iget-object v2, v2, LW1/j;->f:Ln5/j;

    .line 47
    .line 48
    invoke-virtual {v2}, Ln5/j;->l()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, LT1/d;

    .line 53
    .line 54
    invoke-static {v3, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_6

    .line 59
    .line 60
    :cond_0
    iget-object v2, v0, LU1/C;->t:LP/S0;

    .line 61
    .line 62
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/util/List;

    .line 67
    .line 68
    check-cast v2, Ljava/lang/Iterable;

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_1

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, LT1/d;

    .line 85
    .line 86
    iget-object v4, v0, LU1/C;->u:LU1/i;

    .line 87
    .line 88
    invoke-virtual {v4}, LT1/z;->b()LT1/h;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4, v3}, LT1/h;->c(LT1/d;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    iget-object v2, v0, LU1/C;->s:Lr/A;

    .line 97
    .line 98
    iget-object v3, v2, Lr/A;->a:[J

    .line 99
    .line 100
    array-length v4, v3

    .line 101
    add-int/lit8 v4, v4, -0x2

    .line 102
    .line 103
    if-ltz v4, :cond_6

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    :goto_1
    aget-wide v7, v3, v6

    .line 107
    .line 108
    not-long v9, v7

    .line 109
    const/4 v11, 0x7

    .line 110
    shl-long/2addr v9, v11

    .line 111
    and-long/2addr v9, v7

    .line 112
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    and-long/2addr v9, v12

    .line 118
    cmp-long v9, v9, v12

    .line 119
    .line 120
    if-eqz v9, :cond_5

    .line 121
    .line 122
    sub-int v9, v6, v4

    .line 123
    .line 124
    not-int v9, v9

    .line 125
    ushr-int/lit8 v9, v9, 0x1f

    .line 126
    .line 127
    const/16 v10, 0x8

    .line 128
    .line 129
    rsub-int/lit8 v9, v9, 0x8

    .line 130
    .line 131
    const/4 v12, 0x0

    .line 132
    :goto_2
    if-ge v12, v9, :cond_4

    .line 133
    .line 134
    const-wide/16 v13, 0xff

    .line 135
    .line 136
    and-long v15, v7, v13

    .line 137
    .line 138
    const-wide/16 v17, 0x80

    .line 139
    .line 140
    cmp-long v15, v15, v17

    .line 141
    .line 142
    if-gez v15, :cond_2

    .line 143
    .line 144
    shl-int/lit8 v15, v6, 0x3

    .line 145
    .line 146
    add-int/2addr v15, v12

    .line 147
    iget-object v5, v2, Lr/A;->b:[Ljava/lang/Object;

    .line 148
    .line 149
    aget-object v5, v5, v15

    .line 150
    .line 151
    move/from16 v16, v11

    .line 152
    .line 153
    iget-object v11, v2, Lr/A;->c:[F

    .line 154
    .line 155
    aget v11, v11, v15

    .line 156
    .line 157
    check-cast v5, Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    check-cast v11, LT1/d;

    .line 164
    .line 165
    iget-object v11, v11, LT1/d;->v:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v5, v11}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-nez v5, :cond_3

    .line 172
    .line 173
    iget v5, v2, Lr/A;->e:I

    .line 174
    .line 175
    add-int/lit8 v5, v5, -0x1

    .line 176
    .line 177
    iput v5, v2, Lr/A;->e:I

    .line 178
    .line 179
    iget-object v5, v2, Lr/A;->a:[J

    .line 180
    .line 181
    iget v11, v2, Lr/A;->d:I

    .line 182
    .line 183
    shr-int/lit8 v17, v15, 0x3

    .line 184
    .line 185
    and-int/lit8 v18, v15, 0x7

    .line 186
    .line 187
    shl-int/lit8 v18, v18, 0x3

    .line 188
    .line 189
    aget-wide v19, v5, v17

    .line 190
    .line 191
    shl-long v13, v13, v18

    .line 192
    .line 193
    not-long v13, v13

    .line 194
    and-long v13, v19, v13

    .line 195
    .line 196
    const-wide/16 v19, 0xfe

    .line 197
    .line 198
    shl-long v18, v19, v18

    .line 199
    .line 200
    or-long v13, v13, v18

    .line 201
    .line 202
    aput-wide v13, v5, v17

    .line 203
    .line 204
    add-int/lit8 v17, v15, -0x7

    .line 205
    .line 206
    and-int v17, v17, v11

    .line 207
    .line 208
    and-int/lit8 v11, v11, 0x7

    .line 209
    .line 210
    add-int v17, v17, v11

    .line 211
    .line 212
    shr-int/lit8 v11, v17, 0x3

    .line 213
    .line 214
    aput-wide v13, v5, v11

    .line 215
    .line 216
    iget-object v5, v2, Lr/A;->b:[Ljava/lang/Object;

    .line 217
    .line 218
    const/4 v11, 0x0

    .line 219
    aput-object v11, v5, v15

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_2
    move/from16 v16, v11

    .line 223
    .line 224
    :cond_3
    :goto_3
    shr-long/2addr v7, v10

    .line 225
    add-int/lit8 v12, v12, 0x1

    .line 226
    .line 227
    move/from16 v11, v16

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_4
    if-ne v9, v10, :cond_6

    .line 231
    .line 232
    :cond_5
    if-eq v6, v4, :cond_6

    .line 233
    .line 234
    add-int/lit8 v6, v6, 0x1

    .line 235
    .line 236
    goto/16 :goto_1

    .line 237
    .line 238
    :cond_6
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 239
    .line 240
    return-object v1
.end method
