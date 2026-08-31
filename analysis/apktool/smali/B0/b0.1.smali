.class public final LB0/b0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB0/c0;


# direct methods
.method public synthetic constructor <init>(LB0/c0;I)V
    .locals 0

    .line 1
    iput p2, p0, LB0/b0;->q:I

    iput-object p1, p0, LB0/b0;->r:LB0/c0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LB0/b0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB0/b0;->r:LB0/c0;

    .line 7
    .line 8
    iget-object v1, v0, LB0/c0;->v:LB0/P;

    .line 9
    .line 10
    invoke-virtual {v1}, LB0/P;->a()LB0/n0;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v2, v2, LB0/n0;->D:LB0/n0;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, LB0/T;->y:Lz0/z;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object v2, v1, LB0/P;->a:LB0/L;

    .line 23
    .line 24
    invoke-static {v2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, LC0/A;

    .line 29
    .line 30
    invoke-virtual {v2}, LC0/A;->getPlacementScope()Lz0/I;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    iget-object v3, v0, LB0/c0;->V:LB5/c;

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, LB0/P;->a()LB0/n0;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-wide v3, v0, LB0/c0;->W:J

    .line 43
    .line 44
    iget v0, v0, LB0/c0;->X:F

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v1}, Lz0/I;->a(Lz0/I;Lz0/J;)V

    .line 50
    .line 51
    .line 52
    iget-wide v5, v1, Lz0/J;->u:J

    .line 53
    .line 54
    invoke-static {v3, v4, v5, v6}, LW0/i;->c(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {v1, v2, v3, v0, v4}, Lz0/J;->U(JFLB5/c;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v1}, LB0/P;->a()LB0/n0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-wide v4, v0, LB0/c0;->W:J

    .line 68
    .line 69
    iget v0, v0, LB0/c0;->X:F

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v1}, Lz0/I;->a(Lz0/I;Lz0/J;)V

    .line 75
    .line 76
    .line 77
    iget-wide v6, v1, Lz0/J;->u:J

    .line 78
    .line 79
    invoke-static {v4, v5, v6, v7}, LW0/i;->c(JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    invoke-virtual {v1, v4, v5, v0, v3}, Lz0/J;->U(JFLB5/c;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_0
    iget-object v0, p0, LB0/b0;->r:LB0/c0;

    .line 90
    .line 91
    iget-object v1, v0, LB0/c0;->v:LB0/P;

    .line 92
    .line 93
    invoke-virtual {v1}, LB0/P;->a()LB0/n0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-wide v2, v0, LB0/c0;->Q:J

    .line 98
    .line 99
    invoke-interface {v1, v2, v3}, Lz0/B;->a(J)Lz0/J;

    .line 100
    .line 101
    .line 102
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_1
    iget-object v0, p0, LB0/b0;->r:LB0/c0;

    .line 106
    .line 107
    iget-object v1, v0, LB0/c0;->v:LB0/P;

    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    iput v2, v1, LB0/P;->i:I

    .line 111
    .line 112
    iget-object v3, v1, LB0/P;->a:LB0/L;

    .line 113
    .line 114
    invoke-virtual {v3}, LB0/L;->w()LR/e;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    iget-object v4, v3, LR/e;->q:[Ljava/lang/Object;

    .line 119
    .line 120
    iget v3, v3, LR/e;->s:I

    .line 121
    .line 122
    move v5, v2

    .line 123
    :goto_1
    const v6, 0x7fffffff

    .line 124
    .line 125
    .line 126
    if-ge v5, v3, :cond_4

    .line 127
    .line 128
    aget-object v7, v4, v5

    .line 129
    .line 130
    check-cast v7, LB0/L;

    .line 131
    .line 132
    iget-object v7, v7, LB0/L;->V:LB0/P;

    .line 133
    .line 134
    iget-object v7, v7, LB0/P;->p:LB0/c0;

    .line 135
    .line 136
    iget v8, v7, LB0/c0;->y:I

    .line 137
    .line 138
    iput v8, v7, LB0/c0;->x:I

    .line 139
    .line 140
    iput v6, v7, LB0/c0;->y:I

    .line 141
    .line 142
    iput-boolean v2, v7, LB0/c0;->I:Z

    .line 143
    .line 144
    iget-object v6, v7, LB0/c0;->B:LB0/I;

    .line 145
    .line 146
    sget-object v8, LB0/I;->r:LB0/I;

    .line 147
    .line 148
    if-ne v6, v8, :cond_3

    .line 149
    .line 150
    sget-object v6, LB0/I;->s:LB0/I;

    .line 151
    .line 152
    iput-object v6, v7, LB0/c0;->B:LB0/I;

    .line 153
    .line 154
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_4
    iget-object v3, v1, LB0/P;->a:LB0/L;

    .line 158
    .line 159
    iget-object v1, v1, LB0/P;->a:LB0/L;

    .line 160
    .line 161
    invoke-virtual {v3}, LB0/L;->w()LR/e;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    iget-object v4, v3, LR/e;->q:[Ljava/lang/Object;

    .line 166
    .line 167
    iget v3, v3, LR/e;->s:I

    .line 168
    .line 169
    move v5, v2

    .line 170
    :goto_2
    if-ge v5, v3, :cond_5

    .line 171
    .line 172
    aget-object v7, v4, v5

    .line 173
    .line 174
    check-cast v7, LB0/L;

    .line 175
    .line 176
    iget-object v7, v7, LB0/L;->V:LB0/P;

    .line 177
    .line 178
    iget-object v7, v7, LB0/P;->p:LB0/c0;

    .line 179
    .line 180
    iget-object v7, v7, LB0/c0;->M:LB0/M;

    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    add-int/lit8 v5, v5, 0x1

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    invoke-virtual {v0}, LB0/c0;->n()LB0/v;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, LB0/n0;->j0()Lz0/D;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-interface {v0}, Lz0/D;->d()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, LB0/L;->w()LR/e;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v3, v0, LR/e;->q:[Ljava/lang/Object;

    .line 204
    .line 205
    iget v0, v0, LR/e;->s:I

    .line 206
    .line 207
    move v4, v2

    .line 208
    :goto_3
    if-ge v4, v0, :cond_8

    .line 209
    .line 210
    aget-object v5, v3, v4

    .line 211
    .line 212
    check-cast v5, LB0/L;

    .line 213
    .line 214
    iget-object v7, v5, LB0/L;->V:LB0/P;

    .line 215
    .line 216
    iget-object v8, v7, LB0/P;->p:LB0/c0;

    .line 217
    .line 218
    iget v8, v8, LB0/c0;->x:I

    .line 219
    .line 220
    invoke-virtual {v5}, LB0/L;->t()I

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    if-eq v8, v9, :cond_7

    .line 225
    .line 226
    invoke-virtual {v1}, LB0/L;->L()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, LB0/L;->A()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5}, LB0/L;->t()I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-ne v5, v6, :cond_7

    .line 237
    .line 238
    iget-boolean v5, v7, LB0/P;->c:Z

    .line 239
    .line 240
    if-eqz v5, :cond_6

    .line 241
    .line 242
    iget-object v5, v7, LB0/P;->q:LB0/Y;

    .line 243
    .line 244
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v2}, LB0/Y;->Y(Z)V

    .line 248
    .line 249
    .line 250
    :cond_6
    iget-object v5, v7, LB0/P;->p:LB0/c0;

    .line 251
    .line 252
    invoke-virtual {v5}, LB0/c0;->b0()V

    .line 253
    .line 254
    .line 255
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_8
    invoke-virtual {v1}, LB0/L;->w()LR/e;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v1, v0, LR/e;->q:[Ljava/lang/Object;

    .line 263
    .line 264
    iget v0, v0, LR/e;->s:I

    .line 265
    .line 266
    move v3, v2

    .line 267
    :goto_4
    if-ge v3, v0, :cond_9

    .line 268
    .line 269
    aget-object v4, v1, v3

    .line 270
    .line 271
    check-cast v4, LB0/L;

    .line 272
    .line 273
    iget-object v4, v4, LB0/L;->V:LB0/P;

    .line 274
    .line 275
    iget-object v4, v4, LB0/P;->p:LB0/c0;

    .line 276
    .line 277
    iget-object v4, v4, LB0/c0;->M:LB0/M;

    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    iput-boolean v2, v4, LB0/M;->c:Z

    .line 283
    .line 284
    add-int/lit8 v3, v3, 0x1

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 288
    .line 289
    return-object v0

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
