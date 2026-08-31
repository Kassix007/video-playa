.class public final Lu2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/i;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LP5/i;


# direct methods
.method public synthetic constructor <init>(LP5/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu2/l;->q:I

    iput-object p1, p0, Lu2/l;->r:LP5/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lu2/l;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, LE2/b;->t:LE2/b;

    .line 7
    .line 8
    iget-object v4, p0, Lu2/l;->r:LP5/i;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 13
    .line 14
    const/high16 v7, -0x80000000

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v0, p2, Lu2/q;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p2

    .line 25
    check-cast v0, Lu2/q;

    .line 26
    .line 27
    iget v9, v0, Lu2/q;->r:I

    .line 28
    .line 29
    and-int v10, v9, v7

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v7

    .line 34
    iput v9, v0, Lu2/q;->r:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Lu2/q;

    .line 38
    .line 39
    invoke-direct {v0, p0, p2}, Lu2/q;-><init>(Lu2/l;Lq5/c;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p2, v0, Lu2/q;->q:Ljava/lang/Object;

    .line 43
    .line 44
    iget v7, v0, Lu2/q;->r:I

    .line 45
    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    if-ne v7, v8, :cond_1

    .line 49
    .line 50
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    check-cast p1, LW0/a;

    .line 64
    .line 65
    iget-wide p1, p1, LW0/a;->a:J

    .line 66
    .line 67
    sget-object v5, Lu2/w;->b:LE2/e;

    .line 68
    .line 69
    invoke-static {p1, p2}, LW0/a;->k(J)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {p1, p2}, LW0/a;->d(J)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    invoke-static {p1, p2}, LW0/a;->h(J)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    new-instance v5, LE2/a;

    .line 87
    .line 88
    invoke-direct {v5, v2}, LE2/a;-><init>(I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move-object v5, v3

    .line 93
    :goto_1
    invoke-static {p1, p2}, LW0/a;->c(J)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_5

    .line 98
    .line 99
    invoke-static {p1, p2}, LW0/a;->g(J)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    new-instance v3, LE2/a;

    .line 104
    .line 105
    invoke-direct {v3, p1}, LE2/a;-><init>(I)V

    .line 106
    .line 107
    .line 108
    :cond_5
    new-instance v2, LE2/h;

    .line 109
    .line 110
    invoke-direct {v2, v5, v3}, LE2/h;-><init>(LC3/a;LC3/a;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    if-eqz v2, :cond_6

    .line 114
    .line 115
    iput v8, v0, Lu2/q;->r:I

    .line 116
    .line 117
    invoke-interface {v4, v2, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v6, :cond_6

    .line 122
    .line 123
    move-object v1, v6

    .line 124
    :cond_6
    :goto_3
    return-object v1

    .line 125
    :pswitch_0
    instance-of v0, p2, Lu2/k;

    .line 126
    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    move-object v0, p2

    .line 130
    check-cast v0, Lu2/k;

    .line 131
    .line 132
    iget v9, v0, Lu2/k;->r:I

    .line 133
    .line 134
    and-int v10, v9, v7

    .line 135
    .line 136
    if-eqz v10, :cond_7

    .line 137
    .line 138
    sub-int/2addr v9, v7

    .line 139
    iput v9, v0, Lu2/k;->r:I

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    new-instance v0, Lu2/k;

    .line 143
    .line 144
    invoke-direct {v0, p0, p2}, Lu2/k;-><init>(Lu2/l;Lq5/c;)V

    .line 145
    .line 146
    .line 147
    :goto_4
    iget-object p2, v0, Lu2/k;->q:Ljava/lang/Object;

    .line 148
    .line 149
    iget v7, v0, Lu2/k;->r:I

    .line 150
    .line 151
    if-eqz v7, :cond_9

    .line 152
    .line 153
    if-ne v7, v8, :cond_8

    .line 154
    .line 155
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_7

    .line 159
    .line 160
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_9
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    check-cast p1, Li0/e;

    .line 170
    .line 171
    iget-wide p1, p1, Li0/e;->a:J

    .line 172
    .line 173
    const-wide v9, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    cmp-long v5, p1, v9

    .line 179
    .line 180
    if-nez v5, :cond_a

    .line 181
    .line 182
    sget-object v2, LE2/h;->c:LE2/h;

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_a
    sget-object v5, Lu2/w;->b:LE2/e;

    .line 186
    .line 187
    invoke-static {p1, p2}, Li0/e;->d(J)F

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    float-to-double v9, v5

    .line 192
    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    .line 193
    .line 194
    cmpl-double v5, v9, v11

    .line 195
    .line 196
    if-ltz v5, :cond_d

    .line 197
    .line 198
    invoke-static {p1, p2}, Li0/e;->b(J)F

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    float-to-double v9, v5

    .line 203
    cmpl-double v5, v9, v11

    .line 204
    .line 205
    if-ltz v5, :cond_d

    .line 206
    .line 207
    new-instance v2, LE2/h;

    .line 208
    .line 209
    invoke-static {p1, p2}, Li0/e;->d(J)F

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-nez v7, :cond_b

    .line 218
    .line 219
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-nez v5, :cond_b

    .line 224
    .line 225
    invoke-static {p1, p2}, Li0/e;->d(J)F

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    invoke-static {v5}, LD5/a;->G(F)I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    new-instance v7, LE2/a;

    .line 234
    .line 235
    invoke-direct {v7, v5}, LE2/a;-><init>(I)V

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_b
    move-object v7, v3

    .line 240
    :goto_5
    invoke-static {p1, p2}, Li0/e;->b(J)F

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-nez v9, :cond_c

    .line 249
    .line 250
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-nez v5, :cond_c

    .line 255
    .line 256
    invoke-static {p1, p2}, Li0/e;->b(J)F

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    invoke-static {p1}, LD5/a;->G(F)I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    new-instance v3, LE2/a;

    .line 265
    .line 266
    invoke-direct {v3, p1}, LE2/a;-><init>(I)V

    .line 267
    .line 268
    .line 269
    :cond_c
    invoke-direct {v2, v7, v3}, LE2/h;-><init>(LC3/a;LC3/a;)V

    .line 270
    .line 271
    .line 272
    :cond_d
    :goto_6
    if-eqz v2, :cond_e

    .line 273
    .line 274
    iput v8, v0, Lu2/k;->r:I

    .line 275
    .line 276
    invoke-interface {v4, v2, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    if-ne p1, v6, :cond_e

    .line 281
    .line 282
    move-object v1, v6

    .line 283
    :cond_e
    :goto_7
    return-object v1

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
